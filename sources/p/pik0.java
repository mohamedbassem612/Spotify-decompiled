package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pik0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pik0(t4h1 t4h1Var, byte b) {
        super(1);
        this.a = b;
        this.b = t4h1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t4h1 t4h1Var = this.b;
        switch (b) {
            case 0:
                t4h1Var.a((ijf1) obj).G(2000L);
                break;
            case 1:
                ijf1 ijf1Var = (ijf1) obj;
                if (t4h1Var != null) {
                    if (t4h1Var.r) {
                        t4h1Var.e();
                    }
                    if (((Boolean) t4h1Var.v.getValue()).booleanValue()) {
                        if (!((Boolean) ((hrr0) t4h1Var.a(ijf1Var).a).getValue()).booleanValue()) {
                            t4h1Var.a(ijf1Var).G(5000L);
                        } else {
                            t4h1Var.a(ijf1Var).o();
                        }
                    }
                }
                break;
            default:
                ijf1 ijf1Var2 = (ijf1) obj;
                if (t4h1Var != null) {
                    t4h1Var.a(ijf1Var2).G(2000L);
                }
                break;
        }
        return rih1Var;
    }
}
