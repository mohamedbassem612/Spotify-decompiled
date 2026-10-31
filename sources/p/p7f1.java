package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p7f1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ce6 b;
    public final /* synthetic */ nbh c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7f1(ce6 ce6Var, nbh nbhVar, c380 c380Var, float f, boolean z, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ce6Var;
        this.c = nbhVar;
        this.d = c380Var;
        this.e = f;
        this.f = z;
        this.g = iu30Var;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.e(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.e(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
