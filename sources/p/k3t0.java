package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k3t0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yup0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3t0(yup0 yup0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yup0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yup0 yup0Var = this.b;
        switch (b) {
            case 0:
                gvs0 gvs0Var = (gvs0) yup0Var.c;
                return new x010(new ht20(new iib(gvs0Var.b.q(hvs0.a), gvs0Var, (byte) 9), new cto0(gvs0Var, (lnm) null, (byte) 29)), new m441(new f3t0(yup0Var, (lnm) null, (byte) 1)), new irp0(3, null, (byte) 6), (byte) 1);
            default:
                ((qtr) obj).b(new pnp0(yup0Var, null, (byte) 8));
                return rih1.a;
        }
    }
}
