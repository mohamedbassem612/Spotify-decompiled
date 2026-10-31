package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class di01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ci01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di01(ci01 ci01Var, byte b) {
        super(2);
        this.a = b;
        this.b = ci01Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strK;
        String strK2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xh01 xh01Var = xh01.a;
        ai01 ai01Var = ai01.a;
        zh01 zh01Var = zh01.a;
        ci01 ci01Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    bi01 bi01Var = ci01Var.a;
                    if (bi01Var instanceof yh01) {
                        strK = x0d.k(x340Var2, 803723304, 2131960913, x340Var2, false);
                    } else if (bi01Var.equals(zh01Var)) {
                        strK = x0d.k(x340Var2, 803727718, 2131960915, x340Var2, false);
                    } else if (bi01Var.equals(ai01Var)) {
                        strK = x0d.k(x340Var2, 803732104, 2131960917, x340Var2, false);
                    } else {
                        if (!bi01Var.equals(xh01Var)) {
                            throw p3d1.k(x340Var2, 803720788, false);
                        }
                        strK = x0d.k(x340Var2, 803736584, 2131960912, x340Var2, false);
                    }
                    uwo1.e(strK, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    yh01 yh01Var = ci01Var.a;
                    if (yh01Var instanceof yh01) {
                        x340Var4.i0(-2000675091);
                        long j = yh01Var.a;
                        ngv ngvVar = ngv.f;
                        strK2 = cwl1.U(2131820872, (int) jfv.u(j, ngvVar), new Object[]{Integer.valueOf((int) jfv.u(j, ngvVar))}, x340Var4);
                        x340Var4.r(false);
                    } else if (yh01Var.equals(zh01Var)) {
                        strK2 = x0d.k(x340Var4, -2000664599, 2131960914, x340Var4, false);
                    } else if (yh01Var.equals(ai01Var)) {
                        strK2 = x0d.k(x340Var4, -2000660149, 2131960916, x340Var4, false);
                    } else {
                        if (!yh01Var.equals(xh01Var)) {
                            throw p3d1.k(x340Var4, -2000677601, false);
                        }
                        strK2 = x0d.k(x340Var4, -2000655605, 2131960911, x340Var4, false);
                    }
                    uwo1.e(strK2, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
