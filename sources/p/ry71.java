package p;

import android.os.Parcelable;
import android.webkit.WebView;
import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ry71 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry71(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((iu30) ven0Var.getValue()).invoke((Parcelable) obj);
                return rih1Var;
            case 1:
                n511 n511VarN = nho1.n((elb0) obj, true);
                ven0Var.setValue(new m511(n511VarN.a, n511VarN.b, n511VarN.c, n511VarN.d));
                return rih1Var;
            case 2:
                if (((jad1) obj) != jad1.c) {
                    ven0Var.setValue((Object) null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                yr80 yr80Var = (yr80) obj;
                long j = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            case 4:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 5:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 7:
                ven0Var.setValue((WebView) obj);
                return rih1Var;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ven0Var.setValue(bool2);
                return rih1Var;
            case 9:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case 10:
                elb0 elb0Var = (elb0) obj;
                n511 n511VarM = nho1.v(elb0Var).M(elb0Var, true);
                if (!n511VarM.equals((n511) ven0Var.getValue())) {
                    ven0Var.setValue(n511VarM);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new vk1(ven0Var, (lnm) null, (byte) 28);
                abc0Var.d = new aya1(ven0Var, (byte) 3);
                return rih1Var;
            case grn1.d /* 12 */:
                ven0Var.setValue(Integer.valueOf((int) (((elb0) obj).b() & 4294967295L)));
                return rih1Var;
            case 13:
                ((iu30) ven0Var.getValue()).invoke((String) obj);
                return rih1Var;
            case 14:
                abc0 abc0Var2 = (abc0) obj;
                abc0Var2.c = new pad1(ven0Var, (lnm) null, (byte) 0);
                abc0Var2.a = new pad1(ven0Var, (lnm) null, (byte) 1);
                abc0Var2.d = new aya1(ven0Var, (byte) 4);
                return rih1Var;
            case 15:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 16:
                ((iu30) ven0Var.getValue()).invoke((String) obj);
                return rih1Var;
            case 17:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 18:
                ven0Var.setValue(new yr80(((elb0) obj).b()));
                return rih1Var;
            case 19:
                n511 n511VarN2 = nho1.n((elb0) obj, true);
                ven0Var.setValue(new m511(n511VarN2.a, n511VarN2.b, n511VarN2.c, n511VarN2.d));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ven0Var.setValue(rfv0.a((rfv0) ven0Var.getValue(), ((Number) obj).intValue()));
                return rih1Var;
            case 21:
                ven0Var.setValue(rfv0.a((rfv0) ven0Var.getValue(), ((Number) obj).intValue()));
                return rih1Var;
            case 22:
                ven0Var.setValue(rfv0.a((rfv0) ven0Var.getValue(), ((Number) obj).intValue()));
                return rih1Var;
            case 23:
                ven0Var.setValue(rfv0.a((rfv0) ven0Var.getValue(), ((Number) obj).intValue()));
                return rih1Var;
            case 24:
                ven0Var.setValue(rfv0.a((rfv0) ven0Var.getValue(), ((Number) obj).intValue()));
                return rih1Var;
            case 25:
                return new qr80(((long) ((int) (((Number) ven0Var.getValue()).floatValue() * ((wat) obj).X0(50.0f)))) & 4294967295L);
            case 26:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                ven0Var.setValue(bool3);
                return rih1Var;
            case 27:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                ven0Var.setValue(bool4);
                return rih1Var;
            case 28:
                kaa0.j(((elb0) obj).p(0L), ven0Var);
                return rih1Var;
            default:
                Offset offset = (Offset) obj;
                long j2 = offset.a;
                ven0Var.setValue(offset);
                return rih1Var;
        }
    }
}
