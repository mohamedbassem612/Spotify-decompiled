package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yu70 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aob1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ kly0 d;
    public final /* synthetic */ lu70 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu70(aob1 aob1Var, iu30 iu30Var, kly0 kly0Var, lu70 lu70Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = aob1Var;
        this.c = iu30Var;
        this.d = kly0Var;
        this.e = lu70Var;
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
                p1p1.g(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                p1p1.g(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
