package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ou31 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ru31 b;
    public final /* synthetic */ fu31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou31(ru31 ru31Var, fu31 fu31Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ru31Var;
        this.c = fu31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fu31 fu31Var = this.c;
        ru31 ru31Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ru31Var.j(fu31Var, b0kVar, czo1.p(1));
                break;
            default:
                ru31Var.k(fu31Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
