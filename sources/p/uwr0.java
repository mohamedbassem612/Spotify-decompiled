package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uwr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hxa0 b;
    public final /* synthetic */ xk c;
    public final /* synthetic */ qwr0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uwr0(hxa0 hxa0Var, xk xkVar, qwr0 qwr0Var, qim0 qim0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hxa0Var;
        this.c = xkVar;
        this.d = qwr0Var;
        this.e = qim0Var;
        this.f = iu30Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                zko1.g(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                blo1.f(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
