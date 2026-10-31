package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableTimer extends Completable {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final CompletableObserver a;

        public TimerDisposable(CompletableObserver completableObserver) {
            this.a = completableObserver;
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
            this.a.onComplete();
        }
    }

    public CompletableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(completableObserver);
        completableObserver.onSubscribe(timerDisposable);
        DisposableHelper.c(timerDisposable, this.c.d(timerDisposable, this.a, this.b));
    }
}
