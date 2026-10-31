package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class emr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emr0(ug3 ug3Var, byte b) {
        super(1);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                return (epb1) ug3Var.e;
            default:
                ((qtr) obj).b(new pnp0(ug3Var, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
