package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class urf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tva1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ urf1(tva1 tva1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tva1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tva1 tva1Var = this.b;
        switch (b) {
            case 0:
                joy joyVar = (joy) obj;
                if (joyVar instanceof hoy) {
                    ((q4h0) tva1Var.O0).invoke(((hoy) joyVar).a);
                }
                return rih1Var;
            case 1:
                return d3p1.F(tva1Var.b, ysf.a, ((trf1) obj).a);
            default:
                ((qtr) obj).b(new eri0(tva1Var, (lnm) null, (byte) 18));
                return rih1Var;
        }
    }
}
