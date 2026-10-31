package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xqr extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oyn b;
    public final /* synthetic */ tn30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqr(oyn oynVar, tn30 tn30Var, byte b) {
        super(2);
        this.a = b;
        this.b = oynVar;
        this.c = tn30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tn30 tn30Var = this.c;
        oyn oynVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (oynVar.f27p == null) {
                    x340Var2.i0(-310665246);
                    rc2.e(tn30Var, (qim0) null, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-310843527);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = new dyn();
                        x340Var2.s0(objT);
                    }
                    otw.c((dyn) objT, oynVar.f27p, (qim0) null, (ipb1) null, x340Var2, 72, 12);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(1595086008, new xqr(oynVar, tn30Var, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
