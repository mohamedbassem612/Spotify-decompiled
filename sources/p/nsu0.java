package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nsu0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsu0 b;
    public final /* synthetic */ dsu0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsu0(rsu0 rsu0Var, dsu0 dsu0Var, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = rsu0Var;
        this.c = dsu0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        dsu0 dsu0Var = this.c;
        rsu0 rsu0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                rsu0Var.f(dsu0Var, iu30Var, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                rsu0Var.g(dsu0Var, iu30Var, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
