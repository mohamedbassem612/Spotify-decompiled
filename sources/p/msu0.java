package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class msu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsu0 b;
    public final /* synthetic */ dsu0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ msu0(rsu0 rsu0Var, dsu0 dsu0Var, byte b) {
        super(3);
        this.a = b;
        this.b = rsu0Var;
        this.c = dsu0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dsu0 dsu0Var = this.c;
        rsu0 rsu0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                rsu0Var.j(dsu0Var, (b0k) obj2, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                rsu0Var.k(dsu0Var, (b0k) obj2, 0);
                break;
            case 2:
                ((Number) obj3).intValue();
                rsu0Var.l(dsu0Var, (b0k) obj2, 0);
                break;
            case 3:
                ((Number) obj3).intValue();
                rsu0Var.j(dsu0Var, (b0k) obj2, 0);
                break;
            case 4:
                ((Number) obj3).intValue();
                rsu0Var.k(dsu0Var, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                rsu0Var.l(dsu0Var, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
