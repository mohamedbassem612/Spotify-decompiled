package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b4g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ixo b;
    public final /* synthetic */ fu1 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4g0(ixo ixoVar, fu1 fu1Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ixoVar;
        this.c = fu1Var;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        fu1 fu1Var = this.c;
        ixo ixoVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                vvm1.i(ixoVar, fu1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                vvm1.i(ixoVar, fu1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                vvm1.i(ixoVar, fu1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
