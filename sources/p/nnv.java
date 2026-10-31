package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nnv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnv(int i, boolean z, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = z;
        this.d = qim0Var;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        boolean z = this.c;
        int i2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                yon1.b(i2, czo1.p(i | 1), (b0k) obj, (qim0) obj3, z);
                break;
            case 1:
                ((Number) obj2).intValue();
                hlz0.d(i2, czo1.p(i | 1), (b0k) obj, (qim0) obj3, z);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z2 = this.c;
                int iP = czo1.p(1);
                ((b0i0) obj3).c(this.b, this.e, z2, (b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnv(b0i0 b0i0Var, int i, int i2, boolean z, int i3) {
        super(2);
        this.a = (byte) 2;
        this.d = b0i0Var;
        this.b = i;
        this.e = i2;
        this.c = z;
    }
}
