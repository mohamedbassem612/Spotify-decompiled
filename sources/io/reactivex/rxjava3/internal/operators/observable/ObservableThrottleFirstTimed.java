package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableThrottleFirstTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public static final class DebounceTimedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {
        public final SerializedObserver a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public Disposable e;
        public volatile boolean f;

        public DebounceTimedObserver(SerializedObserver serializedObserver, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.a = serializedObserver;
            this.b = j;
            this.c = timeUnit;
            this.d = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.e.dispose();
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.a.onComplete();
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.a.onError(th);
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.a.onNext(obj);
            Disposable disposable = get();
            if (disposable != null) {
                disposable.dispose();
            }
            DisposableHelper.c(this, this.d.b(this, this.b, this.c));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f = false;
        }
    }

    public ObservableThrottleFirstTimed(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new DebounceTimedObserver(new SerializedObserver(observer), this.b, this.c, this.d.b()));
    }
}
