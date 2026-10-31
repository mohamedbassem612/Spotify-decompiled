package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb1(bc1 bc1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = bc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bc1 bc1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                bc1Var.e(b0kVar, czo1.p(1));
                break;
            case 1:
                bc1Var.f(b0kVar, czo1.p(1));
                break;
            default:
                bc1Var.j(b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
