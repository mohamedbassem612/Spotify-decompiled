package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t1c {
    public static final nen0 a = b(true);
    public static final nen0 b = b(false);
    public static final w1c c = new w1c(een.d, false);
    public static final td4 d = td4.g;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-211209833);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            xos0 xos0VarM = x340Var.m();
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
            nko1.H(d, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r1c(qim0Var, i, (byte) 0);
        }
    }

    public static final nen0 b(boolean z) {
        nen0 nen0Var = new nen0(9);
        gra graVar = een.d;
        nen0Var.m(graVar, new w1c(graVar, z));
        gra graVar2 = een.e;
        nen0Var.m(graVar2, new w1c(graVar2, z));
        gra graVar3 = een.f;
        nen0Var.m(graVar3, new w1c(graVar3, z));
        gra graVar4 = een.g;
        nen0Var.m(graVar4, new w1c(graVar4, z));
        gra graVar5 = een.h;
        nen0Var.m(graVar5, new w1c(graVar5, z));
        gra graVar6 = een.i;
        nen0Var.m(graVar6, new w1c(graVar6, z));
        gra graVar7 = een.t;
        nen0Var.m(graVar7, new w1c(graVar7, z));
        gra graVar8 = een.X;
        nen0Var.m(graVar8, new w1c(graVar8, z));
        gra graVar9 = een.Y;
        nen0Var.m(graVar9, new w1c(graVar9, z));
        return nen0Var;
    }

    public static final gfh0 c(tl3 tl3Var, boolean z) {
        gfh0 gfh0Var = (gfh0) (z ? a : b).g(tl3Var);
        return gfh0Var == null ? new w1c(tl3Var, z) : gfh0Var;
    }

    public static final void d(p5t0 p5t0Var, q5t0 q5t0Var, afh0 afh0Var, flb0 flb0Var, int i, int i2, tl3 tl3Var) {
        tl3 tl3Var2;
        Object objG = afh0Var.g();
        p1c p1cVar = objG instanceof p1c ? (p1c) objG : null;
        p5t0.i(p5t0Var, q5t0Var, ((p1cVar == null || (tl3Var2 = p1cVar.O0) == null) ? tl3Var : tl3Var2).a((((long) q5t0Var.a) << 32) | (((long) q5t0Var.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), flb0Var));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final w1c e(x340 x340Var) {
        gra graVar = een.d;
        if (graVar.equals(graVar)) {
            x340Var.i0(244332343);
            x340Var.r(false);
            return c;
        }
        x340Var.i0(244380021);
        boolean zG = x340Var.g(graVar) | x340Var.h(false);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new w1c(graVar, false);
            x340Var.s0(objT);
        }
        w1c w1cVar = (w1c) objT;
        x340Var.r(false);
        return w1cVar;
    }
}
