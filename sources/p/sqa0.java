package p;

import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sqa0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqa0(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        Object ys1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kaa0.j(((elb0) obj).O(0L), ven0Var);
                return rih1Var;
            case 1:
                long j = ((Offset) obj).a;
                ((iu30) ven0Var.getValue()).invoke(c251.b);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 3:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 4:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 5:
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case 6:
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case 7:
                if (((Number) obj).floatValue() >= 1.0f) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 8:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new vk1(ven0Var, (lnm) null, (byte) 13);
                abc0Var.a = new vk1(ven0Var, (lnm) null, (byte) 14);
                return rih1Var;
            case 9:
                ven0Var.setValue((Function0) obj);
                return rih1Var;
            case 10:
                ven0Var.setValue((Function0) obj);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((iu30) ven0Var.getValue()).invoke(new wif0((tv80) obj));
                return rih1Var;
            case grn1.d /* 12 */:
                ((iu30) ven0Var.getValue()).invoke(new xif0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 13:
                ((iu30) ven0Var.getValue()).invoke(new kjf0((xlk1) obj));
                return rih1Var;
            case 14:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 15:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 16:
                x3g0 x3g0Var = (x3g0) obj;
                iu30 iu30Var = (iu30) ven0Var.getValue();
                if (x3g0Var.equals(u3g0.a)) {
                    ys1Var = new ys1(1);
                } else if (x3g0Var.equals(t3g0.a)) {
                    ys1Var = new ys1(2);
                } else if (x3g0Var.equals(v3g0.a)) {
                    ys1Var = new ys1(3);
                } else {
                    if (!x3g0Var.equals(w3g0.a)) {
                        eg.o();
                        return null;
                    }
                    ys1Var = ms1.a;
                }
                iu30Var.invoke(ys1Var);
                return rih1Var;
            case 17:
                ((iu30) ven0Var.getValue()).invoke((liu0) obj);
                return rih1Var;
            case 18:
                ((iu30) ven0Var.getValue()).invoke(new g6g0((String) obj));
                return rih1Var;
            case 19:
                ((iu30) ven0Var.getValue()).invoke((String) obj);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 21:
                u7h u7hVar = new u7h(z4p1.e(((Number) obj).intValue()));
                ceo ceoVar = uvg0.a;
                ven0Var.setValue(u7hVar);
                return rih1Var;
            case 22:
                ((iu30) ven0Var.getValue()).invoke(new ryg0((lpk1) obj));
                return rih1Var;
            case 23:
                ven0Var.setValue((krm0) obj);
                return rih1Var;
            case 24:
                kaa0.j(((elb0) obj).O(0L), ven0Var);
                return rih1Var;
            case 25:
                lpk1 lpk1Var = (lpk1) obj;
                ((iu30) ven0Var.getValue()).invoke(new d4h0(lpk1Var.a, lpk1Var.b));
                return rih1Var;
            case 26:
                ((iu30) ven0Var.getValue()).invoke((String) obj);
                return rih1Var;
            case 27:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 28:
                ven0Var.setValue((bbh0) obj);
                return rih1Var;
            default:
                if (((bbh0) ven0Var.getValue()) == ((bbh0) obj)) {
                    ven0Var.setValue((Object) null);
                }
                return rih1Var;
        }
    }
}
