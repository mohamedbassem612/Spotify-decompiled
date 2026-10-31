package p;

import android.webkit.WebView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mek1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mek1(ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 1:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 3:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 4:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 5:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 6:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 7:
                WebView webView = (WebView) ven0Var.getValue();
                if (webView != null) {
                    webView.goBack();
                }
                return rih1Var;
            case 8:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 9:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 10:
                return (Boolean) ven0Var.getValue();
            case 11:
                return (Boolean) ven0Var.getValue();
            case 12:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }
}
