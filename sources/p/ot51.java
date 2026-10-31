package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ot51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ngs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot51(ngs0 ngs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ngs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ngs0 ngs0Var = this.b;
        switch (b) {
            case 0:
                s061 s061Var = (s061) ngs0Var.d;
                return rqt0.u(new x010(s061Var.b, s061Var.e, new lok0(3, (lnm) null, (byte) 29), (byte) 1));
            default:
                ((qtr) obj).b(new eri0(ngs0Var, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
