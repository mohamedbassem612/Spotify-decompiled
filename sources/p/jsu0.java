package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jsu0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsu0 b;
    public final /* synthetic */ dsu0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jsu0(rsu0 rsu0Var, dsu0 dsu0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = rsu0Var;
        this.c = dsu0Var;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        dsu0 dsu0Var = this.c;
        rsu0 rsu0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                rsu0Var.h(dsu0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                rsu0Var.m(dsu0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                rsu0Var.n(dsu0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
