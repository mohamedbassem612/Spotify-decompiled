package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t7d0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7d0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                return rqt0.u(new vvu(d3p1.F((d0r) nm1Var.b, (o3r) nm1Var.c, rih1Var), (byte) 28));
            case 1:
                ((qtr) obj).b(new cxl(nm1Var, null));
                return rih1Var;
            case 2:
                return new ouc0((String) nm1Var.f);
            default:
                return new g4d0((String) nm1Var.f);
        }
    }
}
