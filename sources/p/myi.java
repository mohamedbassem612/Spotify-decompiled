package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class myi extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ y3g0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myi(y3g0 y3g0Var, iu30 iu30Var) {
        super(2);
        this.b = y3g0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        y3g0 y3g0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w2g0.i(y3g0Var, iu30Var, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                w2g0.i(y3g0Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myi(y3g0 y3g0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = y3g0Var;
        this.c = iu30Var;
    }
}
