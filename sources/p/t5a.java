package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t5a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5a b;
    public final /* synthetic */ o8j0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ h8a f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5a(x5a x5aVar, o8j0 o8j0Var, iu30 iu30Var, qim0 qim0Var, h8a h8aVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = x5aVar;
        this.c = o8j0Var;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = h8aVar;
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
                this.b.d(this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.f(this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                this.b.h(this.c, this.d, this.e, this.f, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                this.b.i(this.c, this.d, this.e, this.f, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }
}
