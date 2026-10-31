package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class afb0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afb0(ng20 ng20Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ng20 ng20Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ng20Var.f(b0kVar, czo1.p(1));
                break;
            case 1:
                ng20Var.i(b0kVar, czo1.p(1));
                break;
            default:
                ng20Var.j(b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
