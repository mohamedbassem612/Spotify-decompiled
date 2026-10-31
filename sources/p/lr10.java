package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lr10 extends hab0 implements bv30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Mode b;
    public final /* synthetic */ mr10 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr10(boolean z, Mode mode, mr10 mr10Var) {
        super(5);
        this.a = z;
        this.b = mode;
        this.c = mr10Var;
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
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        long jB;
        ve01 ve01Var;
        hr10 hr10Var = (hr10) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        fr10 fr10Var = hr10Var.a;
        String str = fr10Var.a;
        String str2 = fr10Var.b;
        boolean z2 = fr10Var.c;
        cy10 cy10Var = fr10Var.d;
        boolean z3 = hr10Var.b;
        boolean z4 = this.a;
        qim0 qim0VarB = nim0.a;
        if (z4) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1689877990);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0VarB = uyn1.B(qim0VarB, 8.0f, 0.0f, 16.0f, 0.0f, 10);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1689685635);
            x340Var3.r(false);
        }
        boolean z5 = fr10Var.g;
        boolean z6 = hr10Var.c;
        if (this.b == Mode.TOP_STORIES) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-1689493063);
            uwr uwrVar2 = cbx.a;
            jB = u7h.b(cbx.a(x340Var4).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14);
            z = false;
            x340Var4.r(false);
        } else {
            z = false;
            x340 x340Var5 = x340Var;
            x340Var5.i0(-1689422135);
            uwr uwrVar3 = cbx.a;
            long j = cbx.a(x340Var5).b.b;
            x340Var5.r(false);
            jB = j;
        }
        boolean z7 = z;
        zxo1.k(str, str2, z2, cy10Var, z3, iu30Var, qim0VarB, z5, z6, jB, x340Var, (iIntValue << 9) & 458752);
        mr10 mr10Var = this.c;
        ve01 ve01VarG = d5p1.g((sen0) mr10Var.a.a.computeIfAbsent(str, azt.d));
        if (mr10Var.e == blc0.mb) {
            x340 x340Var6 = x340Var;
            x340Var6.i0(-1689149862);
            mr10Var.e(ve01VarG, str, x340Var6, z7 ? 1 : 0);
            x340Var6.r(z7);
        } else {
            x340 x340Var7 = x340Var;
            x340Var7.i0(-1688883758);
            boolean zI = x340Var7.i(ve01VarG) | x340Var7.i(hr10Var) | x340Var7.i(mr10Var);
            Object objT = x340Var7.T();
            if (zI || objT == fkj0.X) {
                objT = new l2w(ve01VarG, hr10Var, mr10Var, (lnm) null, (byte) 24);
                ve01Var = ve01VarG;
                x340Var7.s0(objT);
            } else {
                ve01Var = ve01VarG;
            }
            qxd0.t(ve01Var, x340Var7, (vu30) objT);
            x340Var7.r(z7);
        }
        return rih1.a;
    }
}
