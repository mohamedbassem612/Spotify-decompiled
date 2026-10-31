package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xw20 {
    public final int a;
    public final int b;
    public final ww20 c;

    public xw20(int i, int i2, ww20 ww20Var) {
        this.a = i;
        this.b = i2;
        this.c = ww20Var;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw20)) {
            return false;
        }
        xw20 xw20Var = (xw20) obj;
        if (this.a != xw20Var.a || this.b != xw20Var.b || !this.c.equals(xw20Var.c)) {
            return false;
        }
        vw20 vw20Var = vw20.e;
        return vw20Var.equals(vw20Var);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31) + 1120738640;
    }
}
