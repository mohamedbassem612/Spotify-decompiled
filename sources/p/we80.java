package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class we80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af80 b;
    public final /* synthetic */ ksw c;
    public final /* synthetic */ lbj0 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we80(af80 af80Var, ksw kswVar, lbj0 lbj0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = af80Var;
        this.c = kswVar;
        this.d = lbj0Var;
        this.e = iu30Var;
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
                this.b.a(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.c(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                this.b.e(this.c, this.d, this.e, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
