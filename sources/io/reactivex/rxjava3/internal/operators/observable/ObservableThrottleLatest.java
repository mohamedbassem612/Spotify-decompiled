package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableThrottleLatest<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public volatile boolean X;
        public boolean Y;
        public final Observer a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public final boolean e;
        public final AtomicReference f = new AtomicReference();
        public Disposable g;
        public volatile boolean h;
        public Throwable i;
        public volatile boolean t;

        public ThrottleLatestObserver(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.a = observer;
            this.b = j;
            this.c = timeUnit;
            this.d = worker;
            this.e = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.f;
            Observer observer = this.a;
            int iAddAndGet = 1;
            while (!this.t) {
                boolean z = this.h;
                if (z && this.i != null) {
                    atomicReference.lazySet(null);
                    observer.onError(this.i);
                    this.d.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    Object andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.e) {
                        observer.onNext(andSet);
                    }
                    observer.onComplete();
                    this.d.dispose();
                    return;
                }
                if (z2) {
                    if (this.X) {
                        this.Y = false;
                        this.X = false;
                    }
                } else if (!this.Y || this.X) {
                    observer.onNext(atomicReference.getAndSet(null));
                    this.X = false;
                    this.Y = true;
                    this.d.b(this, this.b, this.c);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.t = true;
            this.g.dispose();
            this.d.dispose();
            if (getAndIncrement() == 0) {
                this.f.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.t;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.h = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.i = th;
            this.h = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f.set(obj);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.g, disposable)) {
                this.g = disposable;
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X = true;
            a();
        }
    }

    public ObservableThrottleLatest(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new ThrottleLatestObserver(observer, this.b, this.c, this.d.b(), this.e));
    }
}
