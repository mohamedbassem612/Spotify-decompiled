package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tr1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr1(y7e1 y7e1Var, byte b) {
        super(0);
        this.a = b;
        this.b = y7e1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y7e1 y7e1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return y7e1Var.d().d;
            case 1:
                c4p1.q(y7e1Var);
                return rih1Var;
            case 2:
                return y7e1Var.d().d.toString();
            case 3:
                return Boolean.valueOf(!ihc1.y0(y7e1Var.d().d));
            case 4:
                return Integer.valueOf(y7e1Var.d().d.length());
            case 5:
                return y7e1Var.d().d.toString();
            case 6:
                return y7e1Var.d().d.toString();
            case 7:
                return y7e1Var.d().d.toString();
            case 8:
                return y7e1Var.d().d.toString();
            case 9:
                return y7e1Var.d().d.toString();
            case 10:
                return y7e1Var.d().d.toString();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf(y7e1Var.d().d.length() > 0);
            case grn1.d /* 12 */:
                return y7e1Var.d().d.toString();
            case 13:
                return y7e1Var.d().d.toString();
            case 14:
                return y7e1Var.d().d.toString();
            case 15:
                return Integer.valueOf(y7e1Var.d().d.length());
            case 16:
                return y7e1Var.d().d.toString();
            case 17:
                return Integer.valueOf(500 - y7e1Var.d().d.length());
            case 18:
                return y7e1Var.d().d.toString();
            case 19:
                return y7e1Var.d().d.toString();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return y7e1Var.d().d;
            case 21:
                return y7e1Var.d().d.toString();
            case 22:
                return y7e1Var.d().d.toString();
            case 23:
                return y7e1Var.d().d.toString();
            case 24:
                return y7e1Var.d().d.toString();
            case 25:
                return y7e1Var.d().d.toString();
            case 26:
                c4p1.q(y7e1Var);
                return rih1Var;
            case 27:
                return y7e1Var.d().d.toString();
            case 28:
                return y7e1Var.d().d.toString();
            default:
                return y7e1Var.d().d.toString();
        }
    }
}
