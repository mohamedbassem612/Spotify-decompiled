package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l110 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g690 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l110(g690 g690Var, byte b) {
        super(1);
        this.a = b;
        this.b = g690Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g690 g690Var = this.b;
        switch (b) {
            case 0:
                w4f1 w4f1Var = g690Var.f;
                if (w4f1Var != null) {
                    w4f1Var.a();
                }
                break;
            default:
                w4f1 w4f1Var2 = g690Var.f;
                if (w4f1Var2 != null) {
                    w4f1Var2.c();
                }
                break;
        }
        return rih1Var;
    }
}
