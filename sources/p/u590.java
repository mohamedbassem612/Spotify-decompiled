package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u590 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x590 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u590(x590 x590Var, byte b) {
        super(1);
        this.a = b;
        this.b = x590Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x590 x590Var = this.b;
        switch (b) {
            case 0:
                g0g1 g0g1Var = (g0g1) obj;
                if (x590Var.f) {
                    x590Var.S0.add(g0g1Var);
                    x590Var.H0();
                }
                break;
            default:
                g0g1 g0g1Var2 = (g0g1) obj;
                if (x590Var.f) {
                    x590Var.S0.remove(g0g1Var2);
                }
                break;
        }
        return rih1Var;
    }
}
