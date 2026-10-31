package p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yg50 {
    public final fo7 a;
    public final dh50 b;

    public yg50(fo7 fo7Var, dh50 dh50Var) {
        this.a = fo7Var;
        this.b = dh50Var;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1147561793);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131956470);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cjc0 cjc0Var = new cjc0(2);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("group-audience-selection-header-test-tag", u291.f(uyn1.x(nim0.a, 16.0f), 1.0f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = r850.W0;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarN, false, (iu30) objT), lee1Var, j, new a0e1(3), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, (byte) 0);
        }
    }

    public final void b(c380 c380Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1724702554);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = voo1.y(td6.o(lhc.g(x340Var).g, 32, nim0.a), voo1.f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            a(x340Var, (i2 >> 3) & 14);
            rqo1.g(0, 1, x340Var, (qim0) null);
            c(c380Var, x340Var, i2 & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vg50(this, c380Var, i, (byte) 0);
        }
    }

    public final void c(c380 c380Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-983259554);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new u830(this, (byte) 28);
                x340Var.s0(objT);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT);
            qim0 qim0VarN = anm1.N("group-audience-selection-list-test-tag", u291.z(u291.f(bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null), 1.0f), (fra) null, 3));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            boolean zI2 = x340Var.i(c380Var) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new fz40(c380Var, this, (byte) 6);
                x340Var.s0(objT2);
            }
            s3o1.d(qim0VarN, (xtb0) null, (vzq0) null, d36Var, (nl3) null, (iq20) null, false, h3h1Var, (iu30) objT2, x340Var, 0, 238);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vg50(this, c380Var, i, (byte) 1);
        }
    }
}
