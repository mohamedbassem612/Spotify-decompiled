package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class viz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xiz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ viz0(xiz0 xiz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xiz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xiz0 xiz0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(xiz0Var.a, xiz0Var.e, (tiz0) obj);
            default:
                ((qtr) obj).b(new eri0(xiz0Var, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
