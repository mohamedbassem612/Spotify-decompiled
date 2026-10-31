package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oij1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qij1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oij1(qij1 qij1Var, byte b) {
        super(2);
        this.a = b;
        this.b = qij1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qij1 qij1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                b2p1.g(qij1Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                b2p1.k(qij1Var, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    b2p1.g(qij1Var, x340Var2, 0);
                }
                break;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    b2p1.k(qij1Var, x340Var4, 0);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    b2p1.g(qij1Var, x340Var6, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oij1(qij1 qij1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qij1Var;
    }
}
