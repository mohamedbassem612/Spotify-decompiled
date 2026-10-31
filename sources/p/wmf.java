package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wmf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmf(Function0 function0, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.c = function0;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(ymf.a);
                function0.invoke();
                break;
            case 1:
                iu30Var.invoke(xmf.a);
                function0.invoke();
                break;
            case 2:
                iu30Var.invoke(anf.a);
                function0.invoke();
                break;
            case 3:
                iu30Var.invoke(flg0.a);
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 4:
                iu30Var.invoke(cmg0.a);
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 5:
                iu30Var.invoke(Boolean.FALSE);
                function0.invoke();
                break;
            case 6:
                iu30Var.invoke(Boolean.FALSE);
                function0.invoke();
                break;
            case 7:
                iu30Var.invoke(Boolean.FALSE);
                function0.invoke();
                break;
            case 8:
                function0.invoke();
                iu30Var.invoke(ilv0.b);
                break;
            case 9:
                function0.invoke();
                iu30Var.invoke(ilv0.a);
                break;
            default:
                iu30Var.invoke(buj1.a);
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmf(iu30 iu30Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = function0;
    }
}
