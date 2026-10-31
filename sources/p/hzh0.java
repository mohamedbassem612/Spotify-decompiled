package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hzh0 implements d0i0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0i0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ hzh0(e0i0 e0i0Var, int i, byte b) {
        this.a = b;
        this.b = e0i0Var;
        this.c = i;
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
    public final void a(ixh0 ixh0Var) {
        byte b = this.a;
        boolean z = true;
        int i = 1;
        z = true;
        int i2 = this.c;
        e0i0 e0i0Var = this.b;
        switch (b) {
            case 0:
                fzh0 fzh0Var = e0i0Var.d;
                fzh0Var.C();
                ffu0 ffu0Var = fzh0Var.t;
                int i3 = yzb0.a;
                if (i2 == -1 || i2 == 0) {
                    z = false;
                } else if (i2 != 1 && i2 != 2) {
                    hhg1.n(f4i1.c(i2, "Unrecognized ShuffleMode: "));
                }
                ffu0Var.o0(z);
                break;
            default:
                fzh0 fzh0Var2 = e0i0Var.d;
                fzh0Var2.C();
                ffu0 ffu0Var2 = fzh0Var2.t;
                int i4 = yzb0.a;
                if (i2 == -1 || i2 == 0) {
                    i = 0;
                } else if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        i = 2;
                    } else {
                        oon1.H("Unrecognized PlaybackStateCompat.RepeatMode: " + i2 + " was converted to `Player.REPEAT_MODE_OFF`");
                        i = 0;
                    }
                }
                ffu0Var2.setRepeatMode(i);
                break;
        }
    }
}
