package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m7x extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gt40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7x(gt40 gt40Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = gt40Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gt40 gt40Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ljo1.f(gt40Var, b0kVar, czo1.p(1));
                break;
            case 1:
                fq7.w(gt40Var, b0kVar, czo1.p(1));
                break;
            case 2:
                fc11.g(gt40Var, b0kVar, 1);
                break;
            default:
                xpn1.j(gt40Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
