package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleDelay<T> extends Single<T> {
    public final Single a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public final class Delay implements SingleObserver<T> {
        public final SequentialDisposable a;
        public final SingleObserver b;

        public final class OnSuccess implements Runnable {
            public final Object a;

            public OnSuccess(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Delay.this.b.onSuccess(this.a);
            }
        }

        public Delay(SequentialDisposable sequentialDisposable, SingleObserver singleObserver) {
            this.a = sequentialDisposable;
            this.b = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            SingleDelay singleDelay = SingleDelay.this;
            DisposableHelper.c(this.a, singleDelay.d.d(new OnError(this, th), singleDelay.e ? singleDelay.b : 0L, singleDelay.c));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.a, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            SingleDelay singleDelay = SingleDelay.this;
            DisposableHelper.c(this.a, singleDelay.d.d(new OnSuccess(obj), singleDelay.b, singleDelay.c));
        }
    }

    public SingleDelay(Single single, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.a = single;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.a.subscribe(new Delay(sequentialDisposable, singleObserver));
    }
}
