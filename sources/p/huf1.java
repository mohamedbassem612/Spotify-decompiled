package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class huf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ quf1 b;
    public final /* synthetic */ abu0 c;
    public final /* synthetic */ iac0 d;
    public final /* synthetic */ yqg e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ huf1(quf1 quf1Var, abu0 abu0Var, iac0 iac0Var, yqg yqgVar, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = quf1Var;
        this.c = abu0Var;
        this.d = iac0Var;
        this.e = yqgVar;
        this.f = iu30Var;
        this.g = qim0Var;
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
                hqq0.m(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                hqq0.u(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
