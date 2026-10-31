package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wk10 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xk10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk10(xk10 xk10Var, byte b) {
        super(1);
        this.a = b;
        this.b = xk10Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xk10 xk10Var = this.b;
        switch (b) {
            case 0:
                return xk10Var.c;
            default:
                ((qtr) obj).b(new skv(xk10Var, null, (byte) 3));
                return rih1.a;
        }
    }
}
