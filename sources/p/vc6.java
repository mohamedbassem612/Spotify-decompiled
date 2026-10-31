package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vc6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ wc6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc6(wc6 wc6Var) {
        super(2);
        this.b = wc6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wc6 wc6Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    xfo1.a(0, x340Var2, wc6Var.getOnLearnMoreClick(), (qim0) null, ((Boolean) wc6Var.N0.getValue()).booleanValue());
                }
                break;
            default:
                ((Number) obj2).intValue();
                wc6Var.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc6(wc6 wc6Var, int i) {
        super(2);
        this.b = wc6Var;
    }
}
