package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l7s0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7s0(ng20 ng20Var, byte b) {
        super(1);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ng20 ng20Var = this.b;
        switch (b) {
            case 0:
                k7s0 k7s0Var = (k7s0) obj;
                return ((fg60) ng20Var.c).b() ? k7s0Var : ng20.l(k7s0Var);
            default:
                ((qtr) obj).b(new pnp0(ng20Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
