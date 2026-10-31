package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w791 implements r791 {
    public final Flowable a;
    public final ruz b;
    public final Scheduler c;
    public final yqg d;
    public final ao0 e;
    public final g0l f;
    public final qq0 g;

    public w791(Flowable flowable, ruz ruzVar, Scheduler scheduler, yqg yqgVar, ao0 ao0Var, g0l g0lVar, qq0 qq0Var) {
        this.a = flowable;
        this.b = ruzVar;
        this.c = scheduler;
        this.d = yqgVar;
        this.e = ao0Var;
        this.f = g0lVar;
        this.g = qq0Var;
    }

    public final g891 a(q791 q791Var) {
        u791 u791Var = q791Var.b;
        if (u890.j(u791Var, s791.a)) {
            lm61 lm61Var = new lm61(this, (lnm) null, (byte) 29);
            vbm[] vbmVarArr = q601.a;
            Flowable flowable = this.a;
            return new g891(q791Var, lm61Var, new tu41(rqt0.u(new h801(new kge((moy0) flowable), (byte) 11)), (byte) 25), new xy0(new kge((moy0) flowable.j(weu0.a)), (byte) 12), f3o1.t(flowable, this.c, this.d), new xy0(new kge((moy0) flowable.j(mo9.Z)), (byte) 13), new tu41(acq0.B(this.f, flowable, this.g), (byte) 23), gr81.h);
        }
        if (!(u791Var instanceof t791)) {
            eg.o();
            return null;
        }
        uk71 uk71Var = new uk71(this, u791Var, (lnm) null, (byte) 15);
        t791 t791Var = (t791) u791Var;
        huz huzVar = t791Var.d;
        u70 u70Var = t791Var.b;
        lt0 lt0Var = t791Var.c;
        ji0 ji0Var = t791Var.a;
        return new g891(q791Var, uk71Var, huzVar, u70Var, lt0Var, new huz(ji0Var.b, (byte) 10), new huz(p2o1.r(ji0Var), (byte) 10), new fe81(u791Var, (byte) 12));
    }
}
