package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gl11 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yup0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl11(yup0 yup0Var, byte b) {
        super(5);
        this.a = b;
        this.b = yup0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yup0 yup0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                ((Number) obj5).intValue();
                otw.c((xpw) yup0Var.d, new lk11((String) obj2, iIntValue, true), (qim0) null, (ipb1) null, (b0k) obj4, 0, 12);
                return rih1Var;
            default:
                cl11 cl11Var = (cl11) obj2;
                x340 x340Var = (b0k) obj4;
                ((Number) obj5).intValue();
                c9 c9VarF = mqo1.F(cl11Var.b);
                fl11 fl11Var = cl11Var.c;
                byte b2 = 0;
                if (fl11Var instanceof el11) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-134867242);
                    x340Var2.r(false);
                    strK = ((el11) fl11Var).a;
                } else {
                    if (!(fl11Var instanceof dl11)) {
                        throw p3d1.k(x340Var, -134869904, false);
                    }
                    x340 x340Var3 = x340Var;
                    strK = x0d.k(x340Var3, -134865667, 2131961030, x340Var3, false);
                }
                x2p1.e(c9VarF, strK, apo.r(1560202035, new gl11(yup0Var, b2), x340Var), x340Var, 384);
                return rih1Var;
        }
    }
}
