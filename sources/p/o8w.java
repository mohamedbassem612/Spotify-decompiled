package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o8w extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8w(yxa0 yxa0Var, byte b) {
        super(2);
        this.a = b;
        this.b = yxa0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yxa0 yxa0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                if (u890.j(yxa0Var, txa0.a) || (yxa0Var instanceof vxa0)) {
                    strK = x0d.k(x340Var2, 230871568, 2131957015, x340Var2, false);
                } else {
                    if (!(yxa0Var instanceof uxa0)) {
                        if (!(yxa0Var instanceof wxa0)) {
                            throw p3d1.k(x340Var2, 145991052, false);
                        }
                        x340Var2.i0(146009080);
                        x340Var2.r(false);
                        eg.m("ParentalConsentTransition should not reach the Education page");
                        return null;
                    }
                    strK = x0d.k(x340Var2, 231024646, 2131957046, x340Var2, false);
                }
                uwo1.e(strK, null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    uwo1.e(yxa0Var instanceof xxa0 ? x0d.k(x340Var4, -1421389656, 2131959745, x340Var4, false) : x0d.k(x340Var4, -1421308498, 2131957046, x340Var4, false), null, null, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2046);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
