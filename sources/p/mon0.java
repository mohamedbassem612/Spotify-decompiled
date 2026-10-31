package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mon0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gon0 b;
    public final /* synthetic */ don0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ tl3 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mon0(gon0 gon0Var, don0 don0Var, qim0 qim0Var, tl3 tl3Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, int i, byte b) {
        super(2);
        this.a = b;
        this.b = gon0Var;
        this.c = don0Var;
        this.d = qim0Var;
        this.e = tl3Var;
        this.f = iu30Var;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = iu30Var4;
        this.t = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                jhc1.k(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                jhc1.k(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                jhc1.k(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
