package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableWindowBoundary<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {
    public final ObservableSource b;
    public final int c;

    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {
        public final WindowBoundaryMainObserver b;
        public boolean c;

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver windowBoundaryMainObserver) {
            this.b = windowBoundaryMainObserver;
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.b;
            DisposableHelper.a(windowBoundaryMainObserver.d);
            windowBoundaryMainObserver.i = true;
            windowBoundaryMainObserver.a();
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
                return;
            }
            this.c = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.b;
            DisposableHelper.a(windowBoundaryMainObserver.d);
            if (windowBoundaryMainObserver.g.a(th)) {
                windowBoundaryMainObserver.i = true;
                windowBoundaryMainObserver.a();
            }
        }

        public final void onNext(Object obj) {
            if (this.c) {
                return;
            }
            this.b.b();
        }
    }

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final Object X = new Object();
        public final Observer a;
        public final int b;
        public final WindowBoundaryInnerObserver c = new WindowBoundaryInnerObserver(this);
        public final AtomicReference d = new AtomicReference();
        public final AtomicInteger e = new AtomicInteger(1);
        public final MpscLinkedQueue f = new MpscLinkedQueue();
        public final AtomicThrowable g = new AtomicThrowable();
        public final AtomicBoolean h = new AtomicBoolean();
        public volatile boolean i;
        public UnicastSubject t;

        public WindowBoundaryMainObserver(Observer observer, int i) {
            this.a = observer;
            this.b = i;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            MpscLinkedQueue mpscLinkedQueue = this.f;
            AtomicThrowable atomicThrowable = this.g;
            int iAddAndGet = 1;
            while (this.e.get() != 0) {
                UnicastSubject unicastSubject = this.t;
                boolean z = this.i;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thD = ExceptionHelper.d(atomicThrowable);
                    if (unicastSubject != null) {
                        this.t = null;
                        unicastSubject.onError(thD);
                    }
                    observer.onError(thD);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    atomicThrowable.getClass();
                    Throwable thD2 = ExceptionHelper.d(atomicThrowable);
                    if (thD2 == null) {
                        if (unicastSubject != null) {
                            this.t = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.t = null;
                        unicastSubject.onError(thD2);
                    }
                    observer.onError(thD2);
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != X) {
                    unicastSubject.onNext(objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.t = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.h.get()) {
                        UnicastSubject unicastSubjectF = UnicastSubject.f(this.b, this);
                        this.t = unicastSubjectF;
                        this.e.getAndIncrement();
                        ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
                        observer.onNext(observableWindowSubscribeIntercept);
                        if (observableWindowSubscribeIntercept.a()) {
                            unicastSubjectF.onComplete();
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.t = null;
        }

        public final void b() {
            this.f.offer(X);
            a();
        }

        public void dispose() {
            if (this.h.compareAndSet(false, true)) {
                this.c.dispose();
                if (this.e.decrementAndGet() == 0) {
                    DisposableHelper.a(this.d);
                }
            }
        }

        public boolean isDisposed() {
            return this.h.get();
        }

        public final void onComplete() {
            this.c.dispose();
            this.i = true;
            a();
        }

        public final void onError(Throwable th) {
            this.c.dispose();
            if (this.g.a(th)) {
                this.i = true;
                a();
            }
        }

        public final void onNext(Object obj) {
            this.f.offer(obj);
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this.d, disposable)) {
                b();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.e.decrementAndGet() == 0) {
                DisposableHelper.a(this.d);
            }
        }
    }

    public ObservableWindowBoundary(Observable observable, ObservableSource observableSource, int i) {
        super(observable);
        this.b = observableSource;
        this.c = i;
    }

    public final void subscribeActual(Observer observer) {
        WindowBoundaryMainObserver windowBoundaryMainObserver = new WindowBoundaryMainObserver(observer, this.c);
        observer.onSubscribe(windowBoundaryMainObserver);
        this.b.subscribe(windowBoundaryMainObserver.c);
        ((AbstractObservableWithUpstream) this).a.subscribe(windowBoundaryMainObserver);
    }
}
