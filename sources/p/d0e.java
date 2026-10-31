package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d0e extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0e(vu30 vu30Var, hdn0 hdn0Var) {
        super(2);
        this.b = vu30Var;
        this.c = hdn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.b;
        err0 err0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                err0Var.t(iIntValue2);
                vu30Var.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                break;
            default:
                wat watVar = (wat) obj;
                Function0 function0 = (Function0) obj2;
                y9e1 y9e1Var = (y9e1) function0.invoke();
                if (y9e1Var != null) {
                    zrm0 zrm0Var = y9e1Var.b;
                    err0 err0Var2 = err0Var;
                    err0Var2.t(jch0.U(((zrm0Var.b(0) - zrm0Var.f(0)) / 2.0f) + zrm0Var.f(0)));
                }
                if (vu30Var != null) {
                    vu30Var.invoke(watVar, function0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0e(hdn0 hdn0Var, vu30 vu30Var) {
        super(2);
        this.c = hdn0Var;
        this.b = vu30Var;
    }
}
