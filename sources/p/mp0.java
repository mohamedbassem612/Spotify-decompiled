package p;

import android.webkit.WebView;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mp0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ mp0(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((iu30) ven0Var.getValue()).invoke((xx10) obj);
                break;
            case 1:
                ven0Var.setValue((String) obj);
                break;
            case 2:
                ((iu30) ven0Var.getValue()).invoke((kq9) obj);
                break;
            case 3:
                ven0Var.setValue((cj31) obj);
                break;
            case 4:
                ven0Var.setValue((String) obj);
                break;
            case 5:
                ((iu30) ven0Var.getValue()).invoke((vcv) obj);
                break;
            case 6:
                ((iu30) ven0Var.getValue()).invoke(new ay80((String) obj));
                break;
            case 7:
                ((iu30) ven0Var.getValue()).invoke(new vx80((jy80) obj));
                break;
            case 8:
                ven0Var.setValue((op80) obj);
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ven0Var.setValue(bool);
                break;
            case 10:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ven0Var.setValue(bool2);
                break;
            case 11:
                ((Boolean) obj).getClass();
                ((Function0) ven0Var.getValue()).invoke();
                break;
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    ((Function0) ven0Var.getValue()).invoke();
                }
                break;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ven0Var.setValue(bool3);
                break;
            case 14:
                ((iu30) ven0Var.getValue()).invoke((String) obj);
                break;
            case 15:
                ven0Var.setValue(((i091) obj).i);
                break;
            case 16:
                if (!((Boolean) obj).booleanValue()) {
                    r091 r091Var = (r091) ven0Var.getValue();
                    if (r091Var != null) {
                        r091Var.k();
                    }
                } else {
                    r091 r091Var2 = (r091) ven0Var.getValue();
                    if (r091Var2 != null) {
                        r091Var2.c();
                    }
                }
                break;
            case 17:
                Float f = (Float) obj;
                r091 r091Var3 = (r091) ven0Var.getValue();
                if (r091Var3 != null) {
                    f.getClass();
                    float fFloatValue = f.floatValue();
                    w590 w590VarA = r091Var3.a();
                    if (w590VarA != null) {
                        w590VarA.t(fFloatValue);
                    }
                }
                break;
            case 18:
                ven0Var.setValue((dbr0) obj);
                break;
            case 19:
                WebView webView = (WebView) ven0Var.getValue();
                if (webView != null) {
                    webView.evaluateJavascript("window.PciBridge.submit();", null);
                }
                break;
            case 20:
                ven0Var.setValue((mbl1) obj);
                break;
            case 21:
                ven0Var.setValue((edl1) obj);
                break;
            case 22:
                if (((Boolean) obj).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
            case 23:
                ven0Var.setValue((jfv) obj);
                break;
            case 24:
                ((iu30) ven0Var.getValue()).invoke(Boolean.valueOf(((xy71) obj) == xy71.b));
                break;
            case 25:
                yvg1 yvg1Var = (yvg1) obj;
                boolean zBooleanValue = ((Boolean) yvg1Var.a).booleanValue();
                int iIntValue = ((Number) yvg1Var.b).intValue();
                int iIntValue2 = ((Number) yvg1Var.c).intValue();
                if (!zBooleanValue) {
                    ((vu30) ven0Var.getValue()).invoke(new Integer(iIntValue), new Integer(iIntValue2));
                }
                break;
            case 26:
                if (((qt80) obj) instanceof o5v) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
            case 27:
                ven0Var.setValue(obj);
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ven0Var.setValue((wt91) obj);
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                boolean zBooleanValue2 = ((Boolean) mmr0Var.a).booleanValue();
                if (((Boolean) mmr0Var.b).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                } else if (zBooleanValue2) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }
}
