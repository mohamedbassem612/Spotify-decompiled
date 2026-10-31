package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wi11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xi11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi11(xi11 xi11Var, byte b) {
        super(1);
        this.a = b;
        this.b = xi11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xi11 xi11Var = this.b;
        switch (b) {
            case 0:
                rwq0.z((qtr) obj, new g001(xi11Var, (byte) 20));
                return rih1.a;
            default:
                return xi11Var.e;
        }
    }
}
