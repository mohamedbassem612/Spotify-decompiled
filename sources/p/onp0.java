package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class onp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onp0(op20 op20Var, byte b) {
        super(1);
        this.a = b;
        this.b = op20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        op20 op20Var = this.b;
        switch (b) {
            case 0:
                return op20Var.b;
            case 1:
                nnp0 nnp0Var = (nnp0) obj;
                Integer num = (Integer) op20Var.b.e();
                return new mnp0(nnp0Var, num != null ? num.intValue() : 0);
            default:
                ((qtr) obj).b(new pnp0(op20Var, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
