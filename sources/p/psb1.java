package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class psb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lsb1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psb1(lsb1 lsb1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = lsb1Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        lsb1 lsb1Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ksb1 ksb1Var = lsb1Var.a;
                    zsb1 zsb1Var = ksb1Var.a;
                    if (zsb1Var instanceof zsb1) {
                        x340Var2.i0(-2106285050);
                        y2o1.n(zsb1Var, ksb1Var.d, this.c, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (!(zsb1Var instanceof atb1)) {
                            throw p3d1.k(x340Var2, -2106287305, false);
                        }
                        x340Var2.i0(-870115750);
                        if (osb1.a[ksb1Var.b.ordinal()] == 1) {
                            x340Var2.i0(-2106274949);
                            s110.g((atb1) zsb1Var, iu30Var, (qim0) null, x340Var2, 0);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(-2106271116);
                            up30.f((atb1) zsb1Var, this.c, (qim0) null, ksb1Var.f, lsb1Var.b, x340Var2, 0);
                            x340Var2 = x340Var2;
                            x340Var2.r(false);
                        }
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1906186001, new psb1(lsb1Var, iu30Var, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
