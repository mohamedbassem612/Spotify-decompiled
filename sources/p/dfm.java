package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dfm implements wpw, cvl1 {
    public final /* synthetic */ byte a;
    public final mqw b;
    public final nsw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public final rqw t;

    public dfm(w9u0 w9u0Var, gn10 gn10Var, FlowableMap flowableMap, Flowable flowable, z6k0 z6k0Var, mnk0 mnk0Var, m4c m4cVar, Flowable flowable2, FlowableDistinctUntilChanged flowableDistinctUntilChanged, pe peVar, qmr qmrVar) {
        this.a = (byte) 2;
        this.d = w9u0Var;
        this.e = gn10Var;
        this.f = z6k0Var;
        this.g = m4cVar;
        this.h = peVar;
        this.i = qmrVar;
        this.b = y3o1.Y(Flowable.g(flowable2, flowableMap, (z6k0Var == null || mnk0Var == null) ? Flowable.I(Boolean.FALSE) : Flowable.h(flowableDistinctUntilChanged, yoi1.h(mnk0Var.a, o6x.a), new jkp0(this, (byte) 12)), flowable, fj10.X0), ent0.Y, new kpt0(this, (byte) 0), new fgs0(this, (byte) 19), 8);
        this.t = n3o1.q(this).a(e9t0.U0, e9t0.V0);
        this.c = jch0.j(new lpt0(this, (byte) 1));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.t;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    public void e(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1693516848);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            m4c m4cVar = (m4c) this.g;
            if (m4cVar == null) {
                x340Var.i0(-1420243632);
                x340Var.r(false);
            } else {
                x340Var.i0(-1420243631);
                d3p1.l(i, z, u291.r(nim0.a, 76.0f), 64.0f, function0, (String) null, false, m4cVar, x340Var, (i4 & 126) | ((i4 << 6) & 57344), 224);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj8(this, i, z, function0, i2);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    public dfm(hjc hjcVar, pp ppVar, hjc hjcVar2, lzn0 lzn0Var, z710 z710Var, epb1 epb1Var) {
        this.a = (byte) 1;
        this.d = hjcVar;
        this.e = ppVar;
        this.f = hjcVar2;
        this.g = lzn0Var;
        this.h = z710Var;
        this.i = epb1Var;
        this.t = n3o1.q(this).a(cnn.Y, cnn.Z);
        this.b = c2p1.o(new d2o(this, (byte) 0), new sqk(this, (byte) 12), new d2o(this, (byte) 1), 4);
        this.c = jch0.j(new cml(this, (byte) 17));
    }

    public dfm(Flowable flowable, Flowable flowable2, ugm ugmVar, iu30 iu30Var, Scheduler scheduler, qzh qzhVar) {
        this.a = (byte) 0;
        this.d = flowable;
        this.e = flowable2;
        this.f = ugmVar;
        this.g = iu30Var;
        this.h = scheduler;
        this.i = qzhVar;
        this.b = y3o1.Y(flowable.s(mpi1.S0), rbm.c1, new sqk(this, (byte) 3), new v7l(this, (byte) 14), 8);
        this.t = n3o1.r(this).c(fdm.c, fdm.e);
        this.c = jch0.j(new yem(this, (byte) 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dfm(w9u0 w9u0Var, gn10 gn10Var, FlowableMap flowableMap, Flowable flowable, Flowable flowable2, FlowableDistinctUntilChanged flowableDistinctUntilChanged, pe peVar, qmr qmrVar) {
        this(w9u0Var, gn10Var, flowableMap, flowable, null, null, null, flowable2, flowableDistinctUntilChanged, peVar, qmrVar);
        this.a = (byte) 2;
    }

    public dfm(zb91 zb91Var, fpq fpqVar, mcu0 mcu0Var, zuf zufVar, j4f1 j4f1Var, q8n q8nVar) {
        this.a = (byte) 3;
        this.d = zb91Var;
        this.e = fpqVar;
        this.f = mcu0Var;
        this.g = zufVar;
        this.h = us71.h(q8nVar);
        this.b = w3p1.q(new aee1(this, (byte) 0), vxd1.e1, ppd1.R0, (o8n) null, new aee1(this, (byte) 1), 8);
        this.t = new hy00(j4f1Var, xi81.c1, i6d1.a1);
        this.c = jch0.j(new nsb1(this, (byte) 15));
    }
}
