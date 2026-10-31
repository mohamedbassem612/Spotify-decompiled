package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ekr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ekr(Object obj, Object obj2, qim0 qim0Var, float f, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.b = qim0Var;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                float f = this.c;
                ((hkr) obj4).c(f, iP, b2, (j2i) obj3, (b0k) obj, this.b);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.e;
                ((lqc) obj4).i((tst) obj3, this.b, this.c, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
