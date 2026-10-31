package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sxc1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ txc1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxc1(txc1 txc1Var, byte b) {
        super(1);
        this.a = b;
        this.b = txc1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        txc1 txc1Var = this.b;
        switch (b) {
            case 0:
                return txc1Var.b.a;
            default:
                return new rxc1((qxc1) obj, txc1Var.b.b());
        }
    }
}
