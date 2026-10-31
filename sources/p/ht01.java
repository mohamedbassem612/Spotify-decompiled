package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ht01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht01(kt01 kt01Var, byte b) {
        super(1);
        this.a = b;
        this.b = kt01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        kt01 kt01Var = this.b;
        switch (b) {
            case 0:
                ay8 ay8VarF = d3p1.F(kt01Var.a, kt01Var.P0, (aw01) obj);
                if (!kt01Var.t.a()) {
                    return ay8VarF;
                }
                n5f0 n5f0Var = new n5f0(1000L, 4000L);
                cqz0 cqz0Var = dqz0.a;
                return new mt01(yoi1.I(n5f0Var), ay8VarF);
            case 1:
                ((qtr) obj).b(new k8y0(kt01Var, lnmVar, (byte) 3));
                return rih1.a;
            default:
                aw01 aw01Var = (aw01) obj;
                if (!kt01Var.t.d()) {
                    return null;
                }
                String strS = zxo1.s(aw01Var.b);
                if (eyo1.t(strS)) {
                    return strS;
                }
                return null;
        }
    }
}
