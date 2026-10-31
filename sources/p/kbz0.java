package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kbz0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lbz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbz0(lbz0 lbz0Var) {
        super(2);
        this.a = (byte) 0;
        this.b = lbz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lbz0 lbz0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    lbz0Var.y(x340Var2, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                lbz0Var.a((b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                lbz0Var.y((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbz0(lbz0 lbz0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = lbz0Var;
    }
}
