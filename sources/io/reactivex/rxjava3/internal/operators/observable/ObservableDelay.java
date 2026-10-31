package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public static final class DelayObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public final boolean e;
        public Disposable f;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelayObserver delayObserver = DelayObserver.this;
                Scheduler.Worker worker = delayObserver.d;
                try {
                    delayObserver.a.onComplete();
                } finally {
                    worker.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {
            public final Object a;

            public OnNext(Object obj) {
                this.a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                DelayObserver.this.a.onNext(this.a);
            }
        }

        public DelayObserver(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.a = observer;
            this.b = j;
            this.c = timeUnit;
            this.d = worker;
            this.e = z;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f.dispose();
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.d.b(new OnComplete(), this.b, this.c);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.d.b(new OnError(this, th), this.e ? this.b : 0L, this.c);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.d.b(new OnNext(obj), this.b, this.c);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Observer serializedObserver = this.e ? observer : new SerializedObserver(observer);
        this.a.subscribe(new DelayObserver(serializedObserver, this.b, this.c, this.d.b(), this.e));
    }
}
