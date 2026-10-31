package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bg5 implements iu30 {
    public final /* synthetic */ byte a;
    public final g6b0 b;

    public /* synthetic */ bg5(g6b0 g6b0Var, byte b) {
        this.a = b;
        this.b = g6b0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g6b0 g6b0Var = this.b;
        switch (b) {
            case 0:
                return ((zim0) obj).e().j(g6b0Var.v());
            default:
                ajn0 ajn0Var = (ajn0) obj;
                ajm0 ajm0VarM = g6b0Var.m();
                kf30 kf30Var = sfb1.l;
                iub0 iub0Var = ajm0VarM.D(kf30Var).h;
                if (iub0Var == null) {
                    g6b0.a(11);
                    throw null;
                }
                jfg jfgVarG = iub0Var.g(ajn0Var, 4);
                if (jfgVarG == null) {
                    throw new AssertionError("Built-in class " + kf30Var.a(ajn0Var) + " is not found");
                }
                if (jfgVarG instanceof beg) {
                    return (beg) jfgVarG;
                }
                throw new AssertionError("Must be a class descriptor " + ajn0Var + ", but was " + jfgVarG);
        }
    }
}
