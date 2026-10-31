package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bp9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp9(ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 1:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 3:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                return rih1Var;
            case 4:
                return (c380) ven0Var.getValue();
            case 5:
                return (String) ven0Var.getValue();
            case 6:
                return (Boolean) ven0Var.getValue();
            case 7:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 8:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 9:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 10:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (String) ven0Var.getValue();
            case grn1.d /* 12 */:
                return (String) ven0Var.getValue();
            case 13:
                return Float.valueOf(((Number) ven0Var.getValue()).floatValue());
            case 14:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 15:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 16:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 17:
                ((iu30) ven0Var.getValue()).invoke(epe.a);
                return rih1Var;
            case 18:
                ((iu30) ven0Var.getValue()).invoke(hpe.a);
                return rih1Var;
            case 19:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((iu30) ven0Var.getValue()).invoke(kpe.a);
                return rih1Var;
            case 21:
                return (aab1) ven0Var.getValue();
            case 22:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 23:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 24:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 25:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 26:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 27:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 28:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }
}
