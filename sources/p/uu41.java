package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uu41 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu41 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu41(vu41 vu41Var, byte b) {
        super(1);
        this.a = b;
        this.b = vu41Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        vu41 vu41Var = this.b;
        switch (b) {
            case 0:
                return new x010(new tu41(vu41Var.b.i(), (byte) 0), vu41Var.e, new lok0(3, (lnm) null, (byte) 27), (byte) 1);
            default:
                ((qtr) obj).b(new pnp0(vu41Var, lnmVar, (byte) 22));
                return rih1.a;
        }
    }
}
