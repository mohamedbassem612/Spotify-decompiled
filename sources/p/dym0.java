package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dym0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a680 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dym0(a680 a680Var, byte b) {
        super(1);
        this.a = b;
        this.b = a680Var;
    }

    public final Object invoke(Object obj) {
        lt20 lt20Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        a680 a680Var = this.b;
        switch (b) {
            case 0:
                xxm0 xxm0Var = (xxm0) obj;
                sxm0 sxm0Var = xxm0Var.d;
                if (sxm0Var instanceof sxm0) {
                    lt20Var = new lt20(new tu41(((b7n) a680Var.a).a(sxm0Var.a), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
                } else if (sxm0Var instanceof txm0) {
                    lt20Var = hu20.e(a680Var.p((txm0) sxm0Var).d, new an6(null, oa81.O0, (byte) 2));
                } else if (sxm0Var instanceof uxm0) {
                    lt20Var = new lt20(new tu41(((uxm0) sxm0Var).a, (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
                } else {
                    if (!(sxm0Var instanceof rxm0)) {
                        eg.o();
                        return null;
                    }
                    lt20Var = ((xv61) a680Var.c).a(((rxm0) sxm0Var).a, rih1Var).d;
                }
                return new dt61(lt20Var, new et61(new xkm0(xxm0Var, (byte) 8), (byte) 0), (byte) 0);
            case 1:
                rxm0 rxm0Var = ((xxm0) obj).d;
                huz huzVar = a680.i;
                if (!(rxm0Var instanceof sxm0)) {
                    if (rxm0Var instanceof txm0) {
                        return hu20.e(a680Var.p((txm0) rxm0Var).f, new zz90((lnm) null, rxm0Var, (byte) 25));
                    }
                    if (!(rxm0Var instanceof uxm0)) {
                        if (rxm0Var instanceof rxm0) {
                            return ((xv61) a680Var.c).a(rxm0Var.a, rih1Var).f;
                        }
                        eg.o();
                        return null;
                    }
                }
                return huzVar;
            default:
                return ((xxm0) obj).d instanceof txm0 ? ((pcl) a680Var.d).a() : new huz(iax.a, (byte) 10);
        }
    }
}
