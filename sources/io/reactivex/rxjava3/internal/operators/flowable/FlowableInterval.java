package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableInterval extends Flowable<Long> {
    public final Scheduler b;
    public final long c;
    public final long d;
    public final TimeUnit e;

    public FlowableInterval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(gnc1Var);
        gnc1Var.onSubscribe(intervalSubscriber);
        Scheduler scheduler = this.b;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalSubscriber.a(scheduler.e(intervalSubscriber, this.c, this.d, this.e));
        } else {
            Scheduler.Worker workerB = scheduler.b();
            intervalSubscriber.a(workerB);
            workerB.c(intervalSubscriber, this.c, this.d, this.e);
        }
    }
}
