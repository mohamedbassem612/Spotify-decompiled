package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rpf extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpf(int i, int i2, int i3, boolean z) {
        super(2);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ouo1.b(i2, czo1.p(i | 1), (b0k) obj, z);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                int i3 = i2 + 65;
                if (i3 < 0 || i3 > 65535) {
                    hhg1.n(f4i1.c(i3, "Invalid Char code: "));
                    return null;
                }
                ot11.c((char) i3, i, z, x340Var2, 0);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                hlz0.b(i2, i, z, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpf(int i, int i2, boolean z) {
        super(2);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpf(int i, boolean z, int i2) {
        super(2);
        this.b = i;
        this.d = z;
        this.c = i2;
    }
}
