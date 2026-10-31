package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vp0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(wp0 wp0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = wp0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wp0 wp0Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                wp0Var.c((b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    wp0Var.c(x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = vvx.a;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    mod.b(kivVar.a(new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495)), apo.r(-404401144, new vp0(wp0Var, b2), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp0(wp0 wp0Var, byte b) {
        super(2);
        this.a = b;
        this.b = wp0Var;
    }
}
