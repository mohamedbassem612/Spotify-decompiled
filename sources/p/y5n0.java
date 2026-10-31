package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5n0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ b6n0 b;
    public final /* synthetic */ u5n0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5n0(b6n0 b6n0Var, u5n0 u5n0Var, iu30 iu30Var) {
        super(2);
        this.b = b6n0Var;
        this.c = u5n0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        u5n0 u5n0Var = this.c;
        b6n0 b6n0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                b6n0Var.i(u5n0Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    b6n0Var.i(u5n0Var, iu30Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5n0(b6n0 b6n0Var, u5n0 u5n0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = b6n0Var;
        this.c = u5n0Var;
        this.d = iu30Var;
    }
}
