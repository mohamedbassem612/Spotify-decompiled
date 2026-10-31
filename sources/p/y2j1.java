package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2j1 implements xpw {
    public final jtl1 a;
    public final Function0 b;
    public final iu30 c;
    public final rey0 d = new rey0(new g2j1(this, (byte) 2));
    public final ia00 e = n3o1.q(this).a(ruh1.a1, ruh1.b1);
    public final psw f;

    public y2j1(jtl1 jtl1Var, Function0 function0, iu30 iu30Var) {
        this.a = jtl1Var;
        this.b = function0;
        this.c = iu30Var;
        j2i j2iVar = new j2i(1983632249, new l6i1(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final void e(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1485673535);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
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
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y0j1(iu30Var, (byte) 7);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fqj.a, x340Var, 0, 48, 2040);
            x0d.s(nim0Var, cbx.b(x340Var).b.c, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(this, iu30Var, i, (byte) 5);
        }
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
