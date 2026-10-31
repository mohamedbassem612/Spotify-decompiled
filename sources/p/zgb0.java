package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zgb0 {
    public final iib0 a;
    public final rxj0 b;
    public final d0r c;
    public final mlp d;
    public final qlb e;
    public final kfq f;
    public final nib0 g;
    public final haa0 h;

    public zgb0(iib0 iib0Var, rxj0 rxj0Var, d0r d0rVar, mlp mlpVar, qlb qlbVar, kfq kfqVar, nib0 nib0Var, haa0 haa0Var) {
        this.a = iib0Var;
        this.b = rxj0Var;
        this.c = d0rVar;
        this.d = mlpVar;
        this.e = qlbVar;
        this.f = kfqVar;
        this.g = nib0Var;
        this.h = haa0Var;
    }

    public final void a(int i, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-874179287);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 16.0f, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            uwo1.e(cwl1.o0(x340Var, 2131957182), (qim0) null, cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(1288994437);
                foo1.c(new gbx(z50.c, function0), new idx(2), (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, avi.b, (vu30) null, avi.c, x340Var, 805306368, 48, 1500);
                x340Var.r(false);
            } else {
                x340Var.i0(1289509533);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(this, z, function0, i, (byte) 26);
        }
    }
}
