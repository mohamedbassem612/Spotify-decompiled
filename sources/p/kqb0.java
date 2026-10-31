package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kqb0 implements iu30 {
    public final /* synthetic */ byte a;
    public final lqb0 b;

    public /* synthetic */ kqb0(lqb0 lqb0Var, byte b) {
        this.a = b;
        this.b = lqb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lqb0 lqb0Var = this.b;
        ajn0 ajn0Var = (ajn0) obj;
        switch (b) {
            case 0:
                return lqb0Var.K(ajn0Var);
            default:
                return lqb0Var.L(ajn0Var);
        }
    }
}
