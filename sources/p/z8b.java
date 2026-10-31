package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z8b extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dok0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ pmg1 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ g7f0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8b(dok0 dok0Var, float f, pmg1 pmg1Var, qim0 qim0Var, boolean z, g7f0 g7f0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = dok0Var;
        this.c = f;
        this.d = pmg1Var;
        this.e = qim0Var;
        this.f = z;
        this.g = g7f0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                g7f0 g7f0Var = this.g;
                int iP = czo1.p(7);
                kbb.d(this.b, this.c, this.d, this.e, this.f, g7f0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                g7f0 g7f0Var2 = this.g;
                int iP2 = czo1.p(7);
                kbb.d(this.b, this.c, this.d, this.e, this.f, g7f0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
