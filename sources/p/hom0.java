package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hom0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iom0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hom0(iom0 iom0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iom0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iom0 iom0Var = this.b;
        switch (b) {
            case 0:
                bsm1 bsm1Var = (bsm1) iom0Var.a((esm1) obj);
                return new yom0(bsm1Var.a, bsm1Var.b);
            default:
                bsm1 bsm1Var2 = (bsm1) iom0Var.a((esm1) obj);
                return new eom0(bsm1Var2.a, bsm1Var2.b);
        }
    }
}
