package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableWindow<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    public final long b;
    public final long c;
    public final int d;

    public static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public final Observer a;
        public final long b;
        public final int c;
        public final AtomicBoolean d = new AtomicBoolean();
        public long e;
        public Disposable f;
        public UnicastSubject g;

        public WindowExactObserver(Observer observer, long j, int i) {
            this.a = observer;
            this.b = j;
            this.c = i;
            lazySet(1);
        }

        public void dispose() {
            if (this.d.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean isDisposed() {
            return this.d.get();
        }

        public final void onComplete() {
            UnicastSubject unicastSubject = this.g;
            if (unicastSubject != null) {
                this.g = null;
                unicastSubject.onComplete();
            }
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            UnicastSubject unicastSubject = this.g;
            if (unicastSubject != null) {
                this.g = null;
                unicastSubject.onError(th);
            }
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept;
            UnicastSubject unicastSubjectF = this.g;
            if (unicastSubjectF != null || this.d.get()) {
                observableWindowSubscribeIntercept = null;
            } else {
                getAndIncrement();
                unicastSubjectF = UnicastSubject.f(this.c, this);
                this.g = unicastSubjectF;
                observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
                this.a.onNext(observableWindowSubscribeIntercept);
            }
            if (unicastSubjectF != null) {
                unicastSubjectF.onNext(obj);
                long j = this.e + 1;
                this.e = j;
                if (j >= this.b) {
                    this.e = 0L;
                    this.g = null;
                    unicastSubjectF.onComplete();
                }
                if (observableWindowSubscribeIntercept == null || !observableWindowSubscribeIntercept.a()) {
                    return;
                }
                this.g = null;
                unicastSubjectF.onComplete();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f.dispose();
            }
        }
    }

    public static final class WindowSkipObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public final Observer a;
        public final long b;
        public final long c;
        public final int d;
        public final ArrayDeque e = new ArrayDeque();
        public final AtomicBoolean f = new AtomicBoolean();
        public long g;
        public long h;
        public Disposable i;

        public WindowSkipObserver(Observer observer, long j, long j2, int i) {
            this.a = observer;
            this.b = j;
            this.c = j2;
            this.d = i;
            lazySet(1);
        }

        public void dispose() {
            if (this.f.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean isDisposed() {
            return this.f.get();
        }

        public final void onComplete() {
            while (true) {
                ArrayDeque arrayDeque = this.e;
                if (arrayDeque.isEmpty()) {
                    this.a.onComplete();
                    return;
                }
                ((UnicastSubject) arrayDeque.poll()).onComplete();
            }
        }

        public final void onError(Throwable th) {
            while (true) {
                ArrayDeque arrayDeque = this.e;
                if (arrayDeque.isEmpty()) {
                    this.a.onError(th);
                    return;
                }
                ((UnicastSubject) arrayDeque.poll()).onError(th);
            }
        }

        public final void onNext(Object obj) {
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept;
            long j = this.g;
            long j2 = this.c;
            long j3 = j % j2;
            AtomicBoolean atomicBoolean = this.f;
            ArrayDeque arrayDeque = this.e;
            if (j3 != 0 || atomicBoolean.get()) {
                observableWindowSubscribeIntercept = null;
            } else {
                getAndIncrement();
                UnicastSubject unicastSubjectF = UnicastSubject.f(this.d, this);
                observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
                arrayDeque.offer(unicastSubjectF);
                this.a.onNext(observableWindowSubscribeIntercept);
            }
            long j4 = this.h + 1;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((UnicastSubject) it.next()).onNext(obj);
            }
            if (j4 >= this.b) {
                ((UnicastSubject) arrayDeque.poll()).onComplete();
                if (arrayDeque.isEmpty() && atomicBoolean.get()) {
                    return;
                } else {
                    this.h = j4 - j2;
                }
            } else {
                this.h = j4;
            }
            this.g = j + 1;
            if (observableWindowSubscribeIntercept == null || !observableWindowSubscribeIntercept.a()) {
                return;
            }
            observableWindowSubscribeIntercept.a.onComplete();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.i, disposable)) {
                this.i = disposable;
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.i.dispose();
            }
        }
    }

    public ObservableWindow(Observable observable, long j, long j2, int i) {
        super(observable);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public final void subscribeActual(Observer observer) {
        long j = this.c;
        long j2 = this.b;
        ObservableSource observableSource = ((AbstractObservableWithUpstream) this).a;
        if (j2 == j) {
            observableSource.subscribe(new WindowExactObserver(observer, j2, this.d));
            return;
        }
        observableSource.subscribe(new WindowSkipObserver(observer, this.b, this.c, this.d));
    }
}
