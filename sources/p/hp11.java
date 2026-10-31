package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hp11 {
    public final t90 a;
    public final d5g1 b;
    public final y441 c;
    public final ajq0 d;
    public final lap e;
    public final Context f;
    public final vun g;
    public final aod h;
    public final m640 i;
    public final w6e0 j;
    public final d0r k;
    public final boolean l;
    public final boolean m;

    public hp11(t90 t90Var, d5g1 d5g1Var, y441 y441Var, ajq0 ajq0Var, lap lapVar, Context context, mta mtaVar, omd1 omd1Var, n6r0 n6r0Var, boolean z, vun vunVar, aod aodVar, m640 m640Var, w6e0 w6e0Var, cp5 cp5Var, y441 y441Var2, d0r d0rVar, boolean z2, boolean z3) {
        this.a = t90Var;
        this.b = d5g1Var;
        this.c = y441Var;
        this.d = ajq0Var;
        this.e = lapVar;
        this.f = context;
        this.g = vunVar;
        this.h = aodVar;
        this.i = m640Var;
        this.j = w6e0Var;
        this.k = d0rVar;
        this.l = z2;
        this.m = z3;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1684242168);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            pox poxVar = pox.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(poxVar, isl.a, u291.r(nim0Var, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, pox.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 6.0f));
            uwo1.e(cwl1.o0(x340Var, 2131962434), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ep11(this, i);
        }
    }
}
