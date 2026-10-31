package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g9t0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a9t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9t0(a9t0 a9t0Var, byte b) {
        super(3);
        this.a = b;
        this.b = a9t0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        a9t0 a9t0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    zxo1.m(a9t0Var.e, a9t0Var.a, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str = a9t0Var.c;
                    if (str == null) {
                        str = a9t0Var.b;
                    }
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, null, cbx.d(x340Var4).g, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2042);
                }
                break;
        }
        return rih1Var;
    }
}
