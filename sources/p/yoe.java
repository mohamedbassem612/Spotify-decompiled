package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yoe extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yoe(hdn0 hdn0Var, byte b) {
        super(2);
        this.a = b;
        this.b = hdn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                y9e1 y9e1Var = (y9e1) ((Function0) obj2).invoke();
                err0Var.t(y9e1Var != null ? y9e1Var.b.f : 1);
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fuo1.n(err0Var.s(), 0, x340Var2, null);
                }
                break;
            case 2:
                y9e1 y9e1Var2 = (y9e1) ((Function0) obj2).invoke();
                err0Var.t(y9e1Var2 != null ? y9e1Var2.b.f : 1);
                break;
            default:
                y9e1 y9e1Var3 = (y9e1) ((Function0) obj2).invoke();
                err0Var.t(y9e1Var3 != null ? y9e1Var3.b.f : 1);
                break;
        }
        return rih1Var;
    }
}
