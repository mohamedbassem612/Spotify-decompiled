package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.encoreconsumermobile.elements.settings.SettingsButton;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cci extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cci(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new ulf(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 1:
                iu30Var.invoke(new wfh((String) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(new vfh((String) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke(new fdl(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 4:
                iu30Var.invoke(new jel((String) obj));
                return rih1Var;
            case 5:
                iu30Var.invoke(new jel((String) obj));
                return rih1Var;
            case 6:
                iu30Var.invoke((okl) obj);
                return rih1Var;
            case 7:
                iu30Var.invoke(new c9m((String) obj));
                return rih1Var;
            case 8:
                iu30Var.invoke(new kgm((vim) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new j3o((String) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new e9o(((Number) obj).intValue()));
                return rih1Var;
            case 11:
                iu30Var.invoke(new hat(((Number) obj).intValue()));
                return rih1Var;
            case 12:
                iu30Var.invoke(new qmv((String) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke(new xmv((ova) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new wov((String) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(new upy((String) obj));
                return rih1Var;
            case 16:
                iu30Var.invoke(((Boolean) obj).booleanValue() ? fq00.a : eq00.a);
                return rih1Var;
            case 17:
                iu30Var.invoke(new gq00((String) obj));
                return rih1Var;
            case 18:
                jyz0 jyz0Var = (kyz0) obj;
                if (jyz0Var instanceof jyz0) {
                    iu30Var.invoke(new u630(new w630(jyz0Var.a.a)));
                } else if (!(jyz0Var instanceof iyz0)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 19:
                iu30Var.invoke(new tc50((Integer) obj));
                return rih1Var;
            case 20:
                iu30Var.invoke(dp50.a);
                return rih1Var;
            case 21:
                p60 p60Var = (p60) obj;
                iu30Var.invoke(new hb80(p60Var.l, p60Var.e));
                return rih1Var;
            case 22:
                iu30Var.invoke(new c6a0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 23:
                iu30Var.invoke(rih1Var);
                return rih1Var;
            case 24:
                SettingsButton settingsButton = new SettingsButton((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                int dimensionPixelSize = settingsButton.getResources().getDimensionPixelSize(2131166109);
                int dimensionPixelSize2 = settingsButton.getResources().getDimensionPixelSize(2131166108);
                settingsButton.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                settingsButton.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                settingsButton.n(new cci(iu30Var, (byte) 23));
                return settingsButton;
            case 25:
                iu30Var.invoke(new jhd0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 26:
                ltf0 ltf0Var = (mtf0) obj;
                if (ltf0Var instanceof ltf0) {
                    iu30Var.invoke(new wqf0(ltf0Var.a));
                } else if (ltf0Var instanceof ktf0) {
                    iu30Var.invoke(new tqf0(((ktf0) ltf0Var).a));
                } else {
                    if (!(ltf0Var instanceof jtf0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new sqf0(((jtf0) ltf0Var).a));
                }
                return rih1Var;
            case 27:
                iu30Var.invoke(new s7j0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                iu30Var.invoke(new aym0((gax) obj));
                return rih1Var;
            default:
                iu30Var.invoke((gmm1) obj);
                return rih1Var;
        }
    }
}
