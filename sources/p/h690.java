package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInterval;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h690 extends Flowable {
    public final yqg b;
    public final FlowableInterval c;
    public final FlowableOnBackpressureLatest d;

    public h690(Flowable flowable, Scheduler scheduler, yqg yqgVar) {
        this.b = yqgVar;
        this.c = Flowable.G(0L, 256L, TimeUnit.MILLISECONDS, scheduler);
        this.d = new FlowableOnBackpressureLatest(flowable.X(new h0y(this, (byte) 26)).J(dj10.g));
    }

    public final void V(gnc1 gnc1Var) {
        this.d.subscribe(gnc1Var);
    }
}
