package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ddo {
    public final pxc a;
    public final Flowable b;
    public final Scheduler c;
    public final yqg d;
    public final qq0 e;
    public final g0l f;
    public final gw70 g;
    public final q8n h;
    public final u13 i;

    public ddo(pxc pxcVar, Flowable flowable, Scheduler scheduler, yqg yqgVar, qq0 qq0Var, g0l g0lVar, gw70 gw70Var, q8n q8nVar, u13 u13Var) {
        this.a = pxcVar;
        this.b = flowable;
        this.c = scheduler;
        this.d = yqgVar;
        this.e = qq0Var;
        this.f = g0lVar;
        this.g = gw70Var;
        this.h = q8nVar;
        this.i = u13Var;
    }

    public final ldo a(ado adoVar) {
        pxc pxcVar = adoVar.b;
        zco zcoVar = adoVar.a;
        boolean z = zcoVar instanceof xco;
        pxc pxcVar2 = this.a;
        if (z) {
            g0l g0lVar = this.f;
            qq0 qq0Var = this.e;
            Flowable flowable = this.b;
            return new ldo(this.g, this.h, new qbk(acq0.B(g0lVar, flowable, qq0Var), this, (byte) 22), f3o1.t(flowable, this.c, this.d), pxcVar == null ? pxcVar2 : pxcVar);
        }
        if (!(zcoVar instanceof yco)) {
            eg.o();
            return null;
        }
        yco ycoVar = (yco) zcoVar;
        ji0 ji0Var = ycoVar.a;
        return new ldo(this.g, this.h, new huz(new edo(ji0Var.S0, (String) null, ji0Var.R0, ji0Var.U0, ji0Var, p2o1.r(ji0Var)), (byte) 10), ycoVar.b, pxcVar == null ? pxcVar2 : pxcVar);
    }
}
