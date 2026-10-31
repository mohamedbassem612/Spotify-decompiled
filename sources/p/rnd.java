package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rnd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xwa b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rnd(xwa xwaVar, qim0 qim0Var, float f, vu30 vu30Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = xwaVar;
        this.c = qim0Var;
        this.d = f;
        this.e = vu30Var;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                und.a(this.b, this.c, this.d, this.e, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                und.a(this.b, this.c, this.d, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
