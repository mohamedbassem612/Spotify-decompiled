package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ew2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew2(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case 0:
                return new te1(d3p1.H(hw2Var.b, hw2Var.c, (pw2) obj), (byte) 2);
            default:
                ((qtr) obj).b(new gw2(hw2Var, (lnm) null));
                return rih1.a;
        }
    }
}
