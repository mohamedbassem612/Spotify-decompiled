package p;

import android.webkit.WebView;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aya1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aya1(ven0 ven0Var, byte b) {
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
                WebView webView = (WebView) ven0Var.getValue();
                if (webView != null) {
                    webView.goBack();
                }
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 3:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 4:
                ven0Var.setValue(nad1.a((nad1) ven0Var.getValue(), true, false, 55));
                return rih1Var;
            case 5:
                ven0Var.setValue(Integer.valueOf(((Number) ven0Var.getValue()).intValue() + 1));
                return rih1Var;
            case 6:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 7:
                return (m511) ven0Var.getValue();
            case 8:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 9:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 10:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 11:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 12:
                ven0Var.setValue(d3k.b);
                return rih1Var;
            case 13:
                ven0Var.setValue(Boolean.FALSE);
                return Boolean.TRUE;
            case 14:
                Boolean bool = Boolean.TRUE;
                ven0Var.setValue(bool);
                return bool;
            case 15:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 16:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 17:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 18:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 19:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 20:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 21:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 22:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 23:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 24:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 25:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 26:
                Boolean bool2 = (Boolean) ven0Var.getValue();
                bool2.booleanValue();
                return bool2;
            case 27:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }
}
