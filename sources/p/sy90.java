package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sy90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ew90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy90(ew90 ew90Var) {
        super(2);
        this.b = ew90Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ew90 ew90Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    lmt0.k(ew90Var, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                lmt0.k(ew90Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy90(ew90 ew90Var, int i) {
        super(2);
        this.b = ew90Var;
    }
}
