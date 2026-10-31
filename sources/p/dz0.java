package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dz0 {
    public final Flowable a;
    public final qq0 b;
    public final ruz c;
    public final g0l d;
    public final Scheduler e;
    public final yqg f;
    public final i44 g;

    public dz0(Flowable flowable, qq0 qq0Var, ruz ruzVar, g0l g0lVar, Scheduler scheduler, yqg yqgVar, i44 i44Var) {
        this.a = flowable;
        this.b = qq0Var;
        this.c = ruzVar;
        this.d = g0lVar;
        this.e = scheduler;
        this.f = yqgVar;
        this.g = i44Var;
    }

    public final iz0 a(ry0 ry0Var) {
        qy0 qy0Var = ry0Var.a;
        if (!(qy0Var instanceof oy0)) {
            if (!(qy0Var instanceof py0)) {
                eg.o();
                return null;
            }
            py0 py0Var = (py0) qy0Var;
            ji0 ji0Var = py0Var.a;
            return new iz0(new huz(ji0Var.b, (byte) 10), new x010(py0Var.b, py0Var.c, new az0(3, null), (byte) 1), new huz(Boolean.FALSE, (byte) 10), new huz(p2o1.r(ji0Var), (byte) 10), new huz((Object) null, (byte) 10), new bz0(3, (lnm) null, (byte) 0));
        }
        mo9 mo9Var = mo9.Z;
        Flowable flowable = this.a;
        Flowable flowableJ = flowable.j(mo9Var);
        vbm[] vbmVarArr = q601.a;
        return new iz0(new xy0(new kge((moy0) flowableJ), (byte) 13), hu20.e(new xy0(new kge((moy0) flowable.j(mo9Var)), (byte) 13), new qd0((lnm) null, f3o1.t(flowable, this.e, this.f), new xy0(new kge((moy0) flowable.j(weu0.a)), (byte) 12), (byte) 11)), rqt0.u(new xy0(new kge((moy0) flowable), (byte) 0)), new u70(acq0.B(this.d, flowable, this.b), (byte) 5), this.g.d() ? rqt0.u(new xy0(new kge((moy0) flowable), (byte) 1)) : new huz((Object) null, (byte) 10), new zy0(this, null));
    }
}
