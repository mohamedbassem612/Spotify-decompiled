package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iua1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ze21 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iua1(int i, ze21 ze21Var, boolean z) {
        super(2);
        this.b = ze21Var;
        this.c = i;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        int i = this.c;
        ze21 ze21Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ze21Var.a(i, czo1.p(1), (b0k) obj, z);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ze21Var.a(i, 0, x340Var2, z);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iua1(ze21 ze21Var, int i, boolean z, int i2) {
        super(2);
        this.b = ze21Var;
        this.c = i;
        this.d = z;
    }
}
