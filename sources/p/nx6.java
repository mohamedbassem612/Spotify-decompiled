package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nx6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qx6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx6(qx6 qx6Var, byte b) {
        super(1);
        this.a = b;
        this.b = qx6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qx6 qx6Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(qx6Var.c, qx6Var.d, (gx6) obj);
            default:
                ((qtr) obj).b(new k1(qx6Var, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
