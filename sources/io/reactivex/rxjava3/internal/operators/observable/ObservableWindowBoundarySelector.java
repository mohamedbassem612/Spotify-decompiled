package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractObservableWithUpstream<T, Observable<T>> {
    public final ObservableSource b;
    public final Function c;
    public final int d;

    public static final class WindowBoundaryMainObserver<T, B, V> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public Disposable O0;
        public volatile boolean X;
        public volatile boolean Y;
        public volatile boolean Z;
        public final Observer a;
        public final ObservableSource b;
        public final Function c;
        public final int d;
        public final MpscLinkedQueue h = new MpscLinkedQueue();
        public final CompositeDisposable e = new CompositeDisposable();
        public final ArrayList g = new ArrayList();
        public final AtomicLong i = new AtomicLong(1);
        public final AtomicBoolean t = new AtomicBoolean();
        public final AtomicThrowable N0 = new AtomicThrowable();
        public final WindowStartObserver f = new WindowStartObserver(this);

        public static final class WindowEndObserverIntercept<T, V> extends Observable<T> implements Observer<V>, Disposable {
            public final WindowBoundaryMainObserver a;
            public final UnicastSubject b;
            public final AtomicReference c = new AtomicReference();
            public final AtomicBoolean d = new AtomicBoolean();

            public WindowEndObserverIntercept(WindowBoundaryMainObserver windowBoundaryMainObserver, UnicastSubject unicastSubject) {
                this.a = windowBoundaryMainObserver;
                this.b = unicastSubject;
            }

            public void dispose() {
                DisposableHelper.a(this.c);
            }

            public boolean isDisposed() {
                return this.c.get() == DisposableHelper.a;
            }

            public final void onComplete() {
                WindowBoundaryMainObserver windowBoundaryMainObserver = this.a;
                windowBoundaryMainObserver.h.offer(this);
                windowBoundaryMainObserver.a();
            }

            public final void onError(Throwable th) {
                if (isDisposed()) {
                    RxJavaPlugins.b(th);
                    return;
                }
                WindowBoundaryMainObserver windowBoundaryMainObserver = this.a;
                windowBoundaryMainObserver.O0.dispose();
                WindowStartObserver windowStartObserver = windowBoundaryMainObserver.f;
                windowStartObserver.getClass();
                DisposableHelper.a(windowStartObserver);
                windowBoundaryMainObserver.e.dispose();
                if (windowBoundaryMainObserver.N0.a(th)) {
                    windowBoundaryMainObserver.Y = true;
                    windowBoundaryMainObserver.a();
                }
            }

            public final void onNext(Object obj) {
                if (DisposableHelper.a(this.c)) {
                    WindowBoundaryMainObserver windowBoundaryMainObserver = this.a;
                    windowBoundaryMainObserver.h.offer(this);
                    windowBoundaryMainObserver.a();
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this.c, disposable);
            }

            public final void subscribeActual(Observer observer) {
                this.b.subscribe(observer);
                this.d.set(true);
            }
        }

        public static final class WindowStartItem<B> {
            public final Object a;

            public WindowStartItem(Object obj) {
                this.a = obj;
            }
        }

        public static final class WindowStartObserver<B> extends AtomicReference<Disposable> implements Observer<B> {
            public final WindowBoundaryMainObserver a;

            public WindowStartObserver(WindowBoundaryMainObserver windowBoundaryMainObserver) {
                this.a = windowBoundaryMainObserver;
            }

            public final void onComplete() {
                WindowBoundaryMainObserver windowBoundaryMainObserver = this.a;
                windowBoundaryMainObserver.Z = true;
                windowBoundaryMainObserver.a();
            }

            public final void onError(Throwable th) {
                WindowBoundaryMainObserver windowBoundaryMainObserver = this.a;
                windowBoundaryMainObserver.O0.dispose();
                windowBoundaryMainObserver.e.dispose();
                if (windowBoundaryMainObserver.N0.a(th)) {
                    windowBoundaryMainObserver.Y = true;
                    windowBoundaryMainObserver.a();
                }
            }

            public final void onNext(Object obj) {
                WindowBoundaryMainObserver windowBoundaryMainObserver = this.a;
                windowBoundaryMainObserver.h.offer(new WindowStartItem(obj));
                windowBoundaryMainObserver.a();
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public WindowBoundaryMainObserver(Observer observer, ObservableSource observableSource, Function function, int i) {
            this.a = observer;
            this.b = observableSource;
            this.c = function;
            this.d = i;
            new AtomicLong();
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            MpscLinkedQueue mpscLinkedQueue = this.h;
            ArrayList arrayList = this.g;
            int iAddAndGet = 1;
            while (true) {
                if (this.X) {
                    mpscLinkedQueue.clear();
                    arrayList.clear();
                } else {
                    boolean z = this.Y;
                    Object objPoll = mpscLinkedQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && (z2 || this.N0.get() != null)) {
                        b(observer);
                        this.X = true;
                    } else if (z2) {
                        if (this.Z && arrayList.size() == 0) {
                            this.O0.dispose();
                            WindowStartObserver windowStartObserver = this.f;
                            windowStartObserver.getClass();
                            DisposableHelper.a(windowStartObserver);
                            this.e.dispose();
                            b(observer);
                            this.X = true;
                        }
                    } else if (objPoll instanceof WindowStartItem) {
                        if (!this.t.get()) {
                            try {
                                Object objApply = this.c.apply(((WindowStartItem) objPoll).a);
                                Objects.requireNonNull(objApply, "The closingIndicator returned a null ObservableSource");
                                ObservableSource observableSource = (ObservableSource) objApply;
                                this.i.getAndIncrement();
                                UnicastSubject unicastSubjectF = UnicastSubject.f(this.d, this);
                                WindowEndObserverIntercept windowEndObserverIntercept = new WindowEndObserverIntercept(this, unicastSubjectF);
                                observer.onNext(windowEndObserverIntercept);
                                AtomicBoolean atomicBoolean = windowEndObserverIntercept.d;
                                if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                                    arrayList.add(unicastSubjectF);
                                    this.e.b(windowEndObserverIntercept);
                                    observableSource.subscribe(windowEndObserverIntercept);
                                } else {
                                    unicastSubjectF.onComplete();
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                this.O0.dispose();
                                WindowStartObserver windowStartObserver2 = this.f;
                                windowStartObserver2.getClass();
                                DisposableHelper.a(windowStartObserver2);
                                this.e.dispose();
                                Exceptions.a(th);
                                this.N0.a(th);
                                this.Y = true;
                            }
                        }
                    } else if (objPoll instanceof WindowEndObserverIntercept) {
                        UnicastSubject unicastSubject = ((WindowEndObserverIntercept) objPoll).b;
                        arrayList.remove(unicastSubject);
                        this.e.c((Disposable) objPoll);
                        unicastSubject.onComplete();
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastSubject) it.next()).onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final void b(Observer observer) {
            AtomicThrowable atomicThrowable = this.N0;
            atomicThrowable.getClass();
            Throwable thD = ExceptionHelper.d(atomicThrowable);
            ArrayList arrayList = this.g;
            if (thD == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((UnicastSubject) it.next()).onComplete();
                }
                observer.onComplete();
                return;
            }
            if (thD != ExceptionHelper.a) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((UnicastSubject) it2.next()).onError(thD);
                }
                observer.onError(thD);
            }
        }

        public void dispose() {
            if (this.t.compareAndSet(false, true)) {
                if (this.i.decrementAndGet() != 0) {
                    WindowStartObserver windowStartObserver = this.f;
                    windowStartObserver.getClass();
                    DisposableHelper.a(windowStartObserver);
                    return;
                }
                this.O0.dispose();
                WindowStartObserver windowStartObserver2 = this.f;
                windowStartObserver2.getClass();
                DisposableHelper.a(windowStartObserver2);
                this.e.dispose();
                this.N0.b();
                this.X = true;
                a();
            }
        }

        public boolean isDisposed() {
            return this.t.get();
        }

        public final void onComplete() {
            WindowStartObserver windowStartObserver = this.f;
            windowStartObserver.getClass();
            DisposableHelper.a(windowStartObserver);
            this.e.dispose();
            this.Y = true;
            a();
        }

        public final void onError(Throwable th) {
            WindowStartObserver windowStartObserver = this.f;
            windowStartObserver.getClass();
            DisposableHelper.a(windowStartObserver);
            this.e.dispose();
            if (this.N0.a(th)) {
                this.Y = true;
                a();
            }
        }

        public final void onNext(Object obj) {
            this.h.offer(obj);
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.O0, disposable)) {
                this.O0 = disposable;
                this.a.onSubscribe(this);
                this.b.subscribe(this.f);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.i.decrementAndGet() == 0) {
                this.O0.dispose();
                WindowStartObserver windowStartObserver = this.f;
                windowStartObserver.getClass();
                DisposableHelper.a(windowStartObserver);
                this.e.dispose();
                this.N0.b();
                this.X = true;
                a();
            }
        }
    }

    public ObservableWindowBoundarySelector(Observable observable, ObservableSource observableSource, Function function, int i) {
        super(observable);
        this.b = observableSource;
        this.c = function;
        this.d = i;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new WindowBoundaryMainObserver(observer, this.b, this.c, this.d));
    }
}
