package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w7m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7m1(w7m1 w7m1Var, byte b) {
        super(1);
        this.a = b;
        this.b = w7m1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w7m1 w7m1Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(w7m1Var.a);
            default:
                return new qvc0(w7m1Var.a, null, null, null, 14);
        }
    }
}
