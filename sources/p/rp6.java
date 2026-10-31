package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rp6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tp6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp6(tp6 tp6Var, byte b) {
        super(1);
        this.a = b;
        this.b = tp6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tp6 tp6Var = this.b;
        switch (b) {
            case 0:
                return new te1(d3p1.H(tp6Var.c, tp6Var.d, (wp6) obj), (byte) 4);
            default:
                ((qtr) obj).b(new lu(tp6Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
