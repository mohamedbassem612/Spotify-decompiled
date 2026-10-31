package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class leq0 implements xpw {
    public final jtl1 a;
    public final uyh1 b;
    public final uyh1 c;
    public final ceg1 d;
    public final rey0 e = new rey0(new qsn0(this, (byte) 21));
    public final ia00 f = n3o1.q(this).a(rmp0.b1, rmp0.c1);
    public final psw g;

    public leq0(jtl1 jtl1Var, uyh1 uyh1Var, uyh1 uyh1Var2, ceg1 ceg1Var) {
        this.a = jtl1Var;
        this.b = uyh1Var;
        this.c = uyh1Var2;
        this.d = ceg1Var;
        j2i j2iVar = new j2i(1478471657, new aso0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final void e(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2085050565);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(1924436631);
            g(iu30Var, x340Var, (i2 >> 3) & 126);
            x340Var.r(false);
        } else {
            x340Var.i0(1924480279);
            f(iu30Var, x340Var, (i2 >> 3) & 126);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(this, z, iu30Var, i, (byte) 10);
        }
    }

    public final void f(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1732614476);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.c));
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new tro0(iu30Var2, (byte) 25);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT), new idx(4), uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, a5j.c, x340Var, 0, 48, 2040);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new tro0(iu30Var, (byte) 26);
                x340Var.s0(objT2);
            }
            iu30Var2 = iu30Var;
            foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, a5j.d, x340Var, 0, 48, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new keq0(this, iu30Var2, i, (byte) 0);
        }
    }

    public final void g(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(459899317);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, cbx.b(x340Var).b.a, cbx.b(x340Var).b.c, cbx.b(x340Var).b.a, 0.0f, 8);
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            cvx cvxVar2 = cbx.b(x340Var).b;
            k5p1.d(qim0VarB, d36Var, new d36(16.0f, true, new um5(false)), (pl3) null, 0, 0, apo.r(631077104, new ipy(iu30Var, (byte) 26), x340Var), x340Var, 1572864, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new keq0(this, iu30Var, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
