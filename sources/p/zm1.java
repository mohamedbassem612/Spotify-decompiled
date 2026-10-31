package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bn1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm1(bn1 bn1Var, byte b) {
        super(1);
        this.a = b;
        this.b = bn1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bn1 bn1Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(bn1Var.b);
            case 1:
                return bn1Var.b;
            default:
                return bn1Var.b;
        }
    }
}
