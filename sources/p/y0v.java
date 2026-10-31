package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y0v extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0v(float f, long j) {
        super(2);
        this.c = f;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.c;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qxy0.n(f, czo1.p(7), j, (b0k) obj);
                break;
            case 1:
                ((Number) obj2).intValue();
                buo1.m(f, czo1.p(1), j, (b0k) obj);
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    o4p1.b(true, this.b, u291.r(nim0.a, f), 0.0f, x340Var2, 6, 8);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    b6j0.Z0.c(this.c, (j + 500) / 1000, 0L, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0v(float f, long j, int i) {
        super(2);
        this.c = f;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0v(long j, float f) {
        super(2);
        this.b = j;
        this.c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0v(long j, float f, int i) {
        super(2);
        this.b = j;
        this.c = f;
    }
}
