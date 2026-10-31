package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cry0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ jtl1 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cry0(iu30 iu30Var, jtl1 jtl1Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = jtl1Var;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        jtl1 jtl1Var = this.c;
        iu30 iu30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                y4o1.i(iu30Var, jtl1Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                f6o1.f(iu30Var, jtl1Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                ago1.g(iu30Var, jtl1Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
