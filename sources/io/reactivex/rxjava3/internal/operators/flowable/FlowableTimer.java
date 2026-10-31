package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.hrt;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableTimer extends Flowable<Long> {
    public final Scheduler b;
    public final long c;
    public final TimeUnit d;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements pnc1, Runnable {
        public final gnc1 a;
        public volatile boolean b;

        public TimerSubscriber(gnc1 gnc1Var) {
            this.a = gnc1Var;
        }

        public final void cancel() {
            DisposableHelper.a(this);
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                this.b = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            EmptyDisposable emptyDisposable = EmptyDisposable.a;
            if (get() != DisposableHelper.a) {
                if (!this.b) {
                    lazySet(emptyDisposable);
                    this.a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.a.onNext(0L);
                    lazySet(emptyDisposable);
                    this.a.onComplete();
                }
            }
        }
    }

    public FlowableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.c = j;
        this.d = timeUnit;
        this.b = scheduler;
    }

    public final void V(gnc1 gnc1Var) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(gnc1Var);
        gnc1Var.onSubscribe(timerSubscriber);
        Disposable disposableD = this.b.d(timerSubscriber, this.c, this.d);
        if (hrt.r(timerSubscriber, disposableD) || timerSubscriber.get() != DisposableHelper.a) {
            return;
        }
        disposableD.dispose();
    }
}
