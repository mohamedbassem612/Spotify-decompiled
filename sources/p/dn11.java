package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dn11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ en11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn11(en11 en11Var, byte b) {
        super(1);
        this.a = b;
        this.b = en11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        en11 en11Var = this.b;
        switch (b) {
            case 0:
                return new h5y0(t5p1.i(en11Var.c), (byte) 19);
            default:
                ((qtr) obj).b(new k8y0(en11Var, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
