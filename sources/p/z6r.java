package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z6r extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6r(int i, p811 p811Var, long j) {
        super(2);
        this.b = i;
        this.d = p811Var;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    u4p1.f(this.b, (lee1) ((p811) obj3).a, this.c, x340Var2, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                long j = this.c;
                int iP = czo1.p(1);
                u4p1.f(this.b, (lee1) obj3, j, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                dgd0.a((vfd0) obj3, this.c, (b0k) obj, czo1.p(this.b | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6r(int i, lee1 lee1Var, long j, int i2) {
        super(2);
        this.b = i;
        this.d = lee1Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6r(vfd0 vfd0Var, long j, int i) {
        super(2);
        this.d = vfd0Var;
        this.c = j;
        this.b = i;
    }
}
