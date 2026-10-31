package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gvb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hvb1 b;
    public final /* synthetic */ fvb1 c;
    public final /* synthetic */ ya30 d;
    public final /* synthetic */ xm10 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvb1(hvb1 hvb1Var, fvb1 fvb1Var, ya30 ya30Var, xm10 xm10Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hvb1Var;
        this.c = fvb1Var;
        this.d = ya30Var;
        this.e = xm10Var;
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
                this.b.f(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.h(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
