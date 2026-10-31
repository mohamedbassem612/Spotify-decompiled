package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sva1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tva1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sva1(tva1 tva1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tva1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        tva1 tva1Var = this.b;
        switch (b) {
            case 0:
                if (((ixb) obj) == ixb.c) {
                    fns fnsVar = igu.a;
                    bs50 bs50Var = pyf0.a;
                    geo0 geo0Var = geo0.b;
                    bs50Var.getClass();
                    fn31.T(smo1.e(flo1.l(bs50Var, geo0Var)), (o8n) null, 0, new xba1(tva1Var, (lnm) null, (byte) 1), 3);
                }
                return rih1.a;
            default:
                return new j5r0(((los) tva1Var.g).d(new sva1(tva1Var, b2)), (byte) 1);
        }
    }
}
