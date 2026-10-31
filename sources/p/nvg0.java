package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nvg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fwg0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ u7h f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvg0(fwg0 fwg0Var, iu30 iu30Var, qim0 qim0Var, vu30 vu30Var, u7h u7hVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = fwg0Var;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = vu30Var;
        this.f = u7hVar;
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
                uvg0.d(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                uvg0.e(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
