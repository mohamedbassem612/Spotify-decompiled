package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ime0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ime0(y7e1 y7e1Var, byte b) {
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
                h4e1 h4e1VarH = y7e1Var.h();
                try {
                    h4e1VarH.k(0, h4e1VarH.c.length(), "");
                    y7e1Var.a(h4e1VarH);
                    return rih1Var;
                } finally {
                    y7e1Var.c();
                }
            case 1:
                return y7e1Var.d().d.toString();
            case 2:
                c4p1.q(y7e1Var);
                return rih1Var;
            case 3:
                return y7e1Var.d().d.toString();
            case 4:
                c4p1.q(y7e1Var);
                return rih1Var;
            case 5:
                return y7e1Var.d().d.toString();
            case 6:
                return y7e1Var.d().d.toString();
            case 7:
                return y7e1Var.d().d.toString();
            case 8:
                return Boolean.valueOf(y7e1Var.d().d.length() > 0);
            case 9:
                return y7e1Var.d().d.toString();
            case 10:
                return y7e1Var.d().d.toString();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                c4p1.q(y7e1Var);
                return rih1Var;
            case grn1.d /* 12 */:
                return y7e1Var.d().d.toString();
            case 13:
                return y7e1Var.d().d.toString();
            case 14:
                return y7e1Var.d().d.toString();
            case 15:
                return y7e1Var.d().d.toString();
            case 16:
                return y7e1Var.d().d.toString();
            default:
                return y7e1Var.d().d.toString();
        }
    }
}
