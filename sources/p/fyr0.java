package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fyr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyr0(xxr0 xxr0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xxr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xxr0 xxr0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hyr0.a(xxr0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                hyr0.e(xxr0Var, b0kVar, czo1.p(1));
                break;
            default:
                hyr0.f(xxr0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
