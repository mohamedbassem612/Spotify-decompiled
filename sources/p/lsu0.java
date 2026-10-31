package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lsu0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsu0 b;
    public final /* synthetic */ dsu0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lsu0(rsu0 rsu0Var, dsu0 dsu0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = rsu0Var;
        this.c = dsu0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dsu0 dsu0Var = this.c;
        rsu0 rsu0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                rsu0Var.j(dsu0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                rsu0Var.k(dsu0Var, b0kVar, czo1.p(1));
                break;
            default:
                rsu0Var.l(dsu0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
