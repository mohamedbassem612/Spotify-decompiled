package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sca1 implements xpw {
    public static final sca1 a;
    public static final rey0 b;
    public static final ia00 c;
    public static final psw d;

    static {
        sca1 sca1Var = new sca1();
        a = sca1Var;
        b = k1o1.p();
        c = n3o1.q(sca1Var).a(r8a1.Y, r8a1.Z);
        d = new psw(wjj.a, (byte) 0);
    }

    public final rqw a() {
        return c;
    }

    public final jsw c() {
        return d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(qca1 qca1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(114632356);
        int i2 = (x340Var.g(qca1Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (qca1Var.equals(lca1.a)) {
            x340Var.i0(-1507451964);
            acq0.x(x340Var, 0);
            x340Var.r(false);
        } else if (qca1Var.equals(pca1.a)) {
            x340Var.i0(-1507449437);
            acq0.w(x340Var, 0);
            x340Var.r(false);
        } else if (qca1Var.equals(nca1.a)) {
            x340Var.i0(-1507446816);
            sjo0.e(x340Var, 0);
            x340Var.r(false);
        } else if (qca1Var.equals(oca1.a)) {
            x340Var.i0(-1507444156);
            sjo0.f(x340Var, 0);
            x340Var.r(false);
        } else {
            if (!(qca1Var instanceof mca1)) {
                throw p3d1.k(x340Var, -1507453481, false);
            }
            x340Var.i0(-1507441428);
            sjo0.d(((mca1) qca1Var).a, x340Var, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, qca1Var, i, (byte) 23);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(rca1 rca1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        sca1 sca1Var;
        rca1 rca1Var2;
        ezl0 ezl0Var;
        qca1 qca1Var = rca1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1161777093);
        int i2 = (x340Var.i(rca1Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            r6h1 r6h1Var = rca1Var.a;
            if (r6h1Var != null) {
                ezl0Var = qca1Var.a() ? new ezl0(r6h1Var, (byte) 2) : new ezl0(r6h1Var, (byte) 3);
            } else {
                ezl0Var = null;
            }
            if (ezl0Var == null) {
                x340Var.i0(-1654846842);
                e(qca1Var, x340Var, i2 & 112);
                x340Var.r(false);
                sca1Var = this;
                rca1Var2 = rca1Var;
            } else {
                x340Var.i0(-1654807441);
                sca1Var = this;
                rca1Var2 = rca1Var;
                otw.c(sca1Var, rca1Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
                x340Var.r(false);
            }
        } else {
            sca1Var = this;
            rca1Var2 = rca1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(sca1Var, rca1Var2, i, (byte) 24);
        }
    }

    public final mqw getBehavior() {
        return b;
    }
}
