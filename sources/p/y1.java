package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                function0.invoke();
                return Boolean.TRUE;
            case 1:
                function0.invoke();
                return Boolean.TRUE;
            case 2:
                function0.invoke();
                return rih1Var;
            case 3:
                function0.invoke();
                return rih1Var;
            case 4:
                function0.invoke();
                return rih1Var;
            case 5:
                function0.invoke();
                return rih1Var;
            case 6:
                function0.invoke();
                return rih1Var;
            case 7:
                function0.invoke();
                return rih1Var;
            case 8:
                function0.invoke();
                return rih1Var;
            case 9:
                function0.invoke();
                return rih1Var;
            case 10:
                function0.invoke();
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                function0.invoke();
                return rih1Var;
            case grn1.d /* 12 */:
                function0.invoke();
                return rih1Var;
            case 13:
                function0.invoke();
                return rih1Var;
            case 14:
                function0.invoke();
                return rih1Var;
            case 15:
                function0.invoke();
                return rih1Var;
            case 16:
                function0.invoke();
                return rih1Var;
            case 17:
                function0.invoke();
                return rih1Var;
            case 18:
                function0.invoke();
                return rih1Var;
            case 19:
                function0.invoke();
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                function0.invoke();
                return rih1Var;
            case 21:
                function0.invoke();
                return rih1Var;
            case 22:
                function0.invoke();
                return rih1Var;
            case 23:
                function0.invoke();
                return rih1Var;
            case 24:
                function0.invoke();
                return rih1Var;
            case 25:
                function0.invoke();
                return rih1Var;
            case 26:
                function0.invoke();
                return rih1Var;
            case 27:
                function0.invoke();
                return rih1Var;
            case 28:
                function0.invoke();
                return rih1Var;
            default:
                function0.invoke();
                return rih1Var;
        }
    }
}
