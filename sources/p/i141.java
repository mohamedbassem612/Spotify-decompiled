package p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class i141 {
    public static final heg a = mka.n(new kf30("java.lang.Void"));

    public static dja0 a(ov30 ov30Var) {
        String strW = wpb1.w(ov30Var);
        if (strW == null) {
            if (ov30Var instanceof zdy0) {
                strW = dia0.a(kht.i(ov30Var).getName().b());
            } else {
                strW = ov30Var instanceof fey0 ? dia0.b(kht.i(ov30Var).getName().b()) : ((o9r) ov30Var).getName().b();
            }
        }
        return new dja0(new fja0(strW, h0p1.m(ov30Var, 1)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static ton1 b(tdy0 tdy0Var) throws i9n {
        hit hitVarA = iht.q(tdy0Var).a();
        if (hitVarA instanceof hit) {
            hit hitVar = hitVarA;
            ggy0 ggy0VarF1 = hitVar.F1();
            yja0 yja0Var = (yja0) z0o1.l(ggy0VarF1, eka0.d);
            if (yja0Var != null) {
                return new rja0(hitVarA, ggy0VarF1, yja0Var, hitVar.G(), hitVar.C());
            }
        } else if (hitVarA instanceof f8a0) {
            f8a0 f8a0Var = (f8a0) hitVarA;
            g141 source = f8a0Var.getSource();
            g141 g141Var = source instanceof g141 ? source : null;
            qb11 qb11VarA = g141Var != null ? g141Var.a() : null;
            if (qb11VarA instanceof sb11) {
                return new pja0(((sb11) qb11VarA).f());
            }
            if (!(qb11VarA instanceof vb11)) {
                throw new i9n("Incorrect resolution sequence for Java field " + hitVarA + " (source = " + qb11VarA + ')');
            }
            Method methodF = ((vb11) qb11VarA).f();
            fey0 fey0VarC = f8a0Var.c();
            mka1 source2 = fey0VarC != null ? fey0VarC.getSource() : null;
            g141 g141Var2 = source2 instanceof g141 ? (g141) source2 : null;
            qb11 qb11VarA2 = g141Var2 != null ? g141Var2.a() : null;
            vb11 vb11Var = qb11VarA2 instanceof vb11 ? (vb11) qb11VarA2 : null;
            return new qja0(methodF, vb11Var != null ? vb11Var.f() : null);
        }
        zdy0 zdy0VarB = hitVarA.b();
        zdy0VarB.getClass();
        dja0 dja0VarA = a(zdy0VarB);
        fey0 fey0VarC2 = hitVarA.c();
        return new sja0(dja0VarA, fey0VarC2 != null ? a(fey0VarC2) : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static jon1 c(ov30 ov30Var) throws i9n {
        ait aitVarA = iht.q(ov30Var).a();
        if (aitVarA instanceof oht) {
            ait aitVar = aitVarA;
            yfy0 yfy0VarX = aitVar.X();
            if (yfy0VarX instanceof yfy0) {
                vz00 vz00Var = fka0.a;
                fja0 fja0VarD = fka0.d(yfy0VarX, aitVar.G(), aitVar.C());
                if (fja0VarD != null) {
                    return new dja0(fja0VarD);
                }
            }
            if (yfy0VarX instanceof kfy0) {
                vz00 vz00Var2 = fka0.a;
                fja0 fja0VarA = fka0.a((kfy0) yfy0VarX, aitVar.G(), aitVar.C());
                if (fja0VarA != null) {
                    return vf80.a(ov30Var.k()) ? new dja0(fja0VarA) : new cja0(fja0VarA);
                }
            }
            return a(aitVarA);
        }
        if (aitVarA instanceof c8a0) {
            g141 source = ((c8a0) aitVarA).getSource();
            g141 g141Var = source instanceof g141 ? source : null;
            qb11 qb11VarA = g141Var != null ? g141Var.a() : null;
            vb11 vb11Var = qb11VarA instanceof vb11 ? (vb11) qb11VarA : null;
            if (vb11Var != null) {
                return new bja0(vb11Var.f());
            }
            tw20.y(aitVarA, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(aitVarA instanceof p7a0)) {
            return a(aitVarA);
        }
        g141 source2 = ((p7a0) aitVarA).getSource();
        g141 g141Var2 = source2 instanceof g141 ? source2 : null;
        qb11 qb11VarA2 = g141Var2 != null ? g141Var2.a() : null;
        if (qb11VarA2 instanceof pb11) {
            return new aja0(((pb11) qb11VarA2).f());
        }
        if (qb11VarA2 instanceof mb11) {
            mb11 mb11Var = (mb11) qb11VarA2;
            if (mb11Var.h()) {
                return new zia0(mb11Var.b());
            }
        }
        throw new i9n("Incorrect resolution sequence for Java constructor " + aitVarA + " (" + qb11VarA2 + ')');
    }
}
