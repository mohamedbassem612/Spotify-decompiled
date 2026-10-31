package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pu11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ su11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu11(su11 su11Var, byte b) {
        super(1);
        this.a = b;
        this.b = su11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        su11 su11Var = this.b;
        switch (b) {
            case 0:
                return su11Var.f41p.b;
            case 1:
                return su11Var.q;
            case 2:
                return (zob1) su11Var.r.d.getValue();
            case 3:
                return su11Var.s;
            case 4:
                return su11Var.t;
            case 5:
                return su11Var.u;
            case 6:
                return new ypg0(ou11.c, su11Var.w.b);
            default:
                return t5p1.j(new ld2(su11Var.w.b, (String) obj, (byte) 27), 3);
        }
    }
}
