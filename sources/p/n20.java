package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n20 implements x40 {
    public final String a;
    public final hux b;
    public final max c;
    public final j2d0 d;

    public n20(String str, hux huxVar, max maxVar, j2d0 j2d0Var) {
        this.a = str;
        this.b = huxVar;
        this.c = maxVar;
        this.d = j2d0Var;
    }

    @Override // p.x40
    public final b50 a() {
        return y40.a;
    }

    @Override // p.x40
    public final iu30 b() {
        return this.d;
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
        if (obj instanceof n20) {
            n20 n20Var = (n20) obj;
            if (u890.j(this.a, n20Var.a) && this.b.equals(n20Var.b) && this.c.equals(n20Var.c)) {
                y40 y40Var = y40.a;
                return y40Var.equals(y40Var) && this.d == n20Var.d;
            }
        }
        return false;
    }

    @Override // p.x40
    public final String getId() {
        return "make-playlist";
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + eqq.k(cy30.d(37850959, 31, this.a), 31, this.b)) * 31) + 1668773986) * 31);
    }
}
