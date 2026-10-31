package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class foe implements al90 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final n381 c;

    public foe(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yd91(3, new pdp0(this, (byte) 13));
                this.c = p381.a;
                break;
            default:
                this.b = new yd91(3, new ptb(this, (byte) 28));
                this.c = p381.a;
                break;
        }
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public void e(String str, zkt0 zkt0Var, b0k b0kVar, int i) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-892819171);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.e(zkt0Var.ordinal()) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
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
            if (zkt0Var != zkt0.c) {
                x340Var.i0(-1713801101);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                wkt0.a(zkt0Var, u291.r(nim0Var, 12.0f), (ksl) null, 0L, false, x340Var, (i2 >> 3) & 14, 28);
                cvx cvxVar = cbx.b(x340Var).b;
                ab80.p(nim0Var, 4.0f, x340Var, false);
            } else {
                x340Var.i0(-1713572383);
                x340Var.r(false);
            }
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            if (ppp0.a[zkt0Var.ordinal()] == 1) {
                x340Var.i0(1607298949);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(1607300429);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            uwo1.e(str, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1714);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(this, str, zkt0Var, i, (byte) 14);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void f(eoe eoeVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1656565730);
        int i2 = (x340Var.g(eoeVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = eoeVar.a;
            cjc0 cjc0Var = new cjc0(1);
            int iC = l1d.C(eoeVar.b);
            if (iC == 0) {
                x340Var.i0(1473207970);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1473209962);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1473205641, false);
                }
                x340Var.i0(1473212234);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            uwo1.e(str, (qim0) null, (lee1) null, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1718);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, eoeVar, i, (byte) 4);
        }
    }
}
