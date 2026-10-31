package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pe31 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne31 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe31(ne31 ne31Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 0;
        this.b = ne31Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ne31 ne31Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    lyg.i(ne31Var, iu30Var, x340Var2, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                lyg.i(ne31Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                lyg.i(ne31Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe31(ne31 ne31Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ne31Var;
        this.c = iu30Var;
    }
}
