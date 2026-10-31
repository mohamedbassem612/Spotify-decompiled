package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y20 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7x0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y20(r7x0 r7x0Var, boolean z, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = r7x0Var;
        this.c = z;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                syo1.a(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                sgc1.k(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                j541.f(this.b, this.c, this.d, this.e, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                aqo1.n(this.b, this.c, this.d, this.e, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }
}
