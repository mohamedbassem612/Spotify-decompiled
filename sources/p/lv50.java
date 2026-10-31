package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lv50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv50(ov50 ov50Var) {
        super(2);
        this.a = (byte) 1;
        this.b = ov50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ov50 ov50Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ov50Var.d((b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ov50Var.d(x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ov50Var.c((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv50(ov50 ov50Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ov50Var;
    }
}
