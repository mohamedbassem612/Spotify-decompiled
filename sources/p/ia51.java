package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ia51 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mlr0 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ ia51(boolean z, mlr0 mlr0Var, Function0 function0, byte b) {
        this.a = b;
        this.b = z;
        this.c = mlr0Var;
        this.d = function0;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        mlr0 mlr0Var = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (((Boolean) obj).booleanValue() && z && !mlr0Var.a) {
                    function0.invoke();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue() && z && !mlr0Var.a && mlr0Var.b == null) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
