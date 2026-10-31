package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uxc0 {
    public final xrc0 a;
    public final cp5 b;
    public final kly0 c;
    public final q8n d;

    public uxc0(xrc0 xrc0Var, cp5 cp5Var, caq caqVar, q8n q8nVar) {
        this.a = xrc0Var;
        this.b = cp5Var;
        this.c = caqVar;
        this.d = q8nVar;
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
    public final o67 a() {
        bdc1 bdc1Var = bdc1.a;
        if (bdc1Var.equals(bdc1Var)) {
            return new o67((byte) 4, this.b, this.d, this.a, ((xo4) this.c.get()).a());
        }
        if (bdc1Var.equals(adc1.a)) {
            hhg1.h("ListNumberOfFollowersSource does not support Strategy.MultiGet");
            return null;
        }
        eg.o();
        return null;
    }
}
