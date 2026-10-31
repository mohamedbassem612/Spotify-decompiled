package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ij50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kj50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij50(kj50 kj50Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = kj50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kj50 kj50Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                kj50Var.a(b0kVar, czo1.p(1));
                break;
            default:
                kj50Var.b(b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
