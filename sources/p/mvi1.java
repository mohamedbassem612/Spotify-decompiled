package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mvi1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ovi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvi1(ovi1 ovi1Var, byte b) {
        super(1);
        this.a = b;
        this.b = ovi1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ovi1 ovi1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(ovi1Var.c, ovi1Var.d, (kvi1) obj);
            default:
                ((qtr) obj).b(new k8y0(ovi1Var, (lnm) null, (byte) 28));
                return rih1.a;
        }
    }
}
