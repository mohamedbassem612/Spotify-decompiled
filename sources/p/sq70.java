package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sq70 {
    public static final xq70 a;

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
    static {
        Object size = new Size(640, 480);
        Object ft21Var = new ft21(bbn.h, new gt21(d391.b), 0);
        xdn0 xdn0Var = (xdn0) new fey((byte) 22).b;
        xdn0Var.r(cx70.R, size);
        xdn0Var.r(i4i1.E0, 1);
        xdn0Var.r(cx70.M, 0);
        xdn0Var.r(cx70.U, ft21Var);
        liv livVar = liv.d;
        if (!livVar.equals(livVar)) {
            hhg1.h("ImageAnalysis currently only supports SDR");
        } else {
            xdn0Var.r(st70.L, livVar);
            a = new xq70(eqq0.b(xdn0Var));
        }
    }
}
