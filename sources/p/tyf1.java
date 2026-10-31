package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tyf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tva1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyf1(tva1 tva1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tva1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tva1 tva1Var = this.b;
        switch (b) {
            case 0:
                return h4p1.g(new bfb1(tva1Var, (hyf1) obj, (lnm) null, (byte) 24));
            case 1:
                return tva1Var.j((hyf1) obj, j1r.a);
            default:
                ((qtr) obj).b(new k8y0(tva1Var, (lnm) null, (byte) 24));
                return rih1.a;
        }
    }
}
