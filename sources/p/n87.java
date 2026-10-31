package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n87 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q87 b;
    public final /* synthetic */ rb7 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ axq0 e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n87(q87 q87Var, rb7 rb7Var, iu30 iu30Var, axq0 axq0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = q87Var;
        this.c = rb7Var;
        this.d = iu30Var;
        this.e = axq0Var;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                int iP = czo1.p(1);
                this.b.c(this.c, this.d, this.e, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                int iP2 = czo1.p(1);
                this.b.c(this.c, this.d, this.e, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
