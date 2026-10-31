package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mua1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oua1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mua1(oua1 oua1Var, byte b) {
        super(1);
        this.a = b;
        this.b = oua1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        oua1 oua1Var = this.b;
        switch (b) {
            case 0:
                return oua1Var.c;
            default:
                return new gua1(oua1Var.a.a, true);
        }
    }
}
