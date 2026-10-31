package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w260 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uu0 b;
    public final /* synthetic */ v260 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w260(uu0 uu0Var, v260 v260Var) {
        super(2);
        this.a = (byte) 1;
        this.b = uu0Var;
        this.c = v260Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v260 v260Var = this.c;
        uu0 uu0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                uu0Var.a(v260Var, (b0k) obj, czo1.p(9));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uu0Var.a(v260Var, x340Var2, 8);
                }
                break;
            default:
                ((Number) obj2).intValue();
                uu0Var.d(v260Var, (b0k) obj, czo1.p(9));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w260(uu0 uu0Var, v260 v260Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = uu0Var;
        this.c = v260Var;
    }
}
