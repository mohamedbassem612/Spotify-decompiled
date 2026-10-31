package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ez2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(kp5 kp5Var, float f) {
        super(2);
        this.a = (byte) 0;
        this.b = kp5Var;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        kp5 kp5Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fz2.e(kp5Var, f, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    fz2.d(kp5Var, f, x340Var4, 0);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                fz2.d(kp5Var, f, (b0k) obj, czo1.p(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                fz2.d(kp5Var, f, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                fz2.e(kp5Var, f, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez2(kp5 kp5Var, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = kp5Var;
        this.c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(jb30 jb30Var, kp5 kp5Var, float f) {
        super(2);
        this.a = (byte) 1;
        this.b = kp5Var;
        this.c = f;
    }
}
