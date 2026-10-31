package p;

import android.os.Handler;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vqb1 {
    public final grb1 a;
    public final arb1 b;
    public final crb1 c;
    public final loc1 d;
    public final Scheduler e;

    public vqb1(cyp cypVar, Flowable flowable, loc1 loc1Var, Scheduler scheduler, yqg yqgVar) {
        grb1 grb1Var = new grb1(flowable.L(scheduler), yqgVar, new erb1(yqgVar), new frb1(yqgVar), new Handler());
        this.a = grb1Var;
        this.b = new arb1(cypVar.a(), grb1Var);
        this.c = new crb1(cypVar.c(), grb1Var);
        this.d = loc1Var;
        this.e = scheduler;
    }

    public final FlowableObserveOn a() {
        FlowableRefCount flowableRefCount = this.a.l;
        loc1 loc1Var = this.d;
        loc1Var.getClass();
        r2a1 r2a1Var = new r2a1(loc1Var, flowableRefCount, (byte) 22);
        int i = Flowable.a;
        return new FlowableCreate(r2a1Var, BackpressureStrategy.d).L(this.e);
    }
}
