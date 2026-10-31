package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zup0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ avp0 b;
    public final /* synthetic */ xup0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ksw e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zup0(avp0 avp0Var, xup0 xup0Var, iu30 iu30Var, ksw kswVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = avp0Var;
        this.c = xup0Var;
        this.d = iu30Var;
        this.e = kswVar;
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
                this.b.c(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.c(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
