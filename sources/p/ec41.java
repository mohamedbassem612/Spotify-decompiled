package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ec41 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc41 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec41(hc41 hc41Var, byte b) {
        super(1);
        this.a = b;
        this.b = hc41Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hc41 hc41Var = this.b;
        switch (b) {
            case 0:
                return new ypg0(dc41.a, d3p1.H(hc41Var.g, hc41Var.t, (bc41) obj));
            default:
                ((qtr) obj).b(new js(hc41Var, (lnm) null, (byte) 19));
                return rih1.a;
        }
    }
}
