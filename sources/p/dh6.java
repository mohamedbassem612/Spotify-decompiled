package p;

import android.webkit.WebView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dh6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh6(Function0 function0, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.d;
        ven0 ven0Var2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ven0Var2.setValue(Boolean.FALSE);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
            case 1:
                ven0Var2.setValue(Boolean.TRUE);
                ((iu30) ven0Var.getValue()).invoke(lpe.a);
                function0.invoke();
                break;
            case 2:
                ven0Var2.setValue(Boolean.TRUE);
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 3:
                ((iu30) ven0Var2.getValue()).invoke(ira0.a);
                ven0Var.setValue(krm0.b);
                function0.invoke();
                break;
            default:
                WebView webView = (WebView) ven0Var2.getValue();
                if (webView != null && ((Boolean) ven0Var.getValue()).booleanValue()) {
                    webView.goBack();
                } else {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
