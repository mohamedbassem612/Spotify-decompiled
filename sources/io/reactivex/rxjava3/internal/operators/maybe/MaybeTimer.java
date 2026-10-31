package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeTimer extends Maybe<Long> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final MaybeObserver a;

        public TimerDisposable(MaybeObserver maybeObserver) {
            this.a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.onSuccess(0L);
        }
    }

    public MaybeTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void i(MaybeObserver maybeObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(maybeObserver);
        maybeObserver.onSubscribe(timerDisposable);
        DisposableHelper.c(timerDisposable, this.c.d(timerDisposable, this.a, this.b));
    }
}
