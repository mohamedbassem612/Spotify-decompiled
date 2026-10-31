package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ib1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib1(bb1 bb1Var, byte b) {
        super(2);
        this.a = b;
        this.b = bb1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bb1 bb1Var = this.b;
        byte b2 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = bb1Var.b.ordinal();
                    if (iOrdinal == 0) {
                        strK = x0d.k(x340Var2, 1373986860, 2131951912, x340Var2, false);
                    } else {
                        if (iOrdinal != 1) {
                            throw p3d1.k(x340Var2, 1373984175, false);
                        }
                        strK = x0d.k(x340Var2, 1373990700, 2131951914, x340Var2, false);
                    }
                    String str = strK;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, null, cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    bzn1.e(null, apo.r(-79017096, new ib1(bb1Var, b2), x340Var4), false, null, null, null, null, null, x340Var4, 48, 253);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
