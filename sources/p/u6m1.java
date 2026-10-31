package p;

import android.graphics.PorterDuff;
import android.os.Build;
import com.spotify.accountswitching.v1.Account;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u6m1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c7m1 b;
    public final /* synthetic */ lk31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6m1(c7m1 c7m1Var, lk31 lk31Var, byte b) {
        super(2);
        this.a = b;
        this.b = c7m1Var;
        this.c = lk31Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c7m1 c7m1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j9k1.h(c7m1Var.c, c7m1Var.o, this.c, null, 0, 3, null, x340Var2, 196608, 88);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    j9k1.h(c7m1Var.d, c7m1Var.o, this.c, null, 0, 1, null, x340Var4, 196608, 88);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    j9k1.h(c7m1Var.e, c7m1Var.o, this.c, null, 3, 0, null, x340Var6, 24576, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    wsk wskVar = s6m1.a;
                    if (Build.VERSION.SDK_INT < 29 && x74.w0(21) == PorterDuff.Mode.SRC_OVER) {
                        x340Var8.i0(1113526813);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(1112858918);
                        String str = c7m1Var.h;
                        ik31 ik31Var = null;
                        if (str != null) {
                            bj31 bj31Var = c7m1Var.g;
                            bj31 bj31Var2 = bj31Var instanceof bj31 ? bj31Var : null;
                            if (bj31Var2 != null) {
                                ik31Var = new ik31(str, bj31Var2.a);
                            }
                        }
                        ik31 ik31Var2 = ik31Var;
                        cj31 cj31Var = c7m1Var.f;
                        if (cj31Var == null || (str != null && ik31Var2 == null)) {
                            x340Var8.i0(1113516893);
                            x340Var8.r(false);
                        } else {
                            x340Var8.i0(1113067734);
                            boolean z = c7m1Var.o;
                            Object objT = x340Var8.T();
                            if (objT == fkj0.X) {
                                objT = m5m1.i;
                                x340Var8.s0(objT);
                            }
                            j9k1.h(cj31Var, z, this.c, i541.C(nim0.a, (iu30) objT), 3, 0, ik31Var2, x340Var8, 27648, 32);
                            x340Var8.r(false);
                        }
                        x340Var8.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
