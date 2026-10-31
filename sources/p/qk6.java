package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qk6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk6(cj6 cj6Var, long j, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = cj6Var;
        this.c = j;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = iu30Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.f;
                int iP = czo1.p(1);
                rk6.d(this.b, this.c, this.d, this.e, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.f;
                int iP2 = czo1.p(1);
                rk6.d(this.b, this.c, this.d, this.e, iu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
