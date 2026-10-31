package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vap0(nx9 nx9Var, byte b) {
        super(0);
        this.a = b;
        this.b = nx9Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nx9 nx9Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return nx9Var.p();
            case 1:
                return nx9Var.b();
            case 2:
                return nx9Var.u();
            case 3:
                return nx9Var.a();
            case 4:
                return nx9Var.d();
            case 5:
                return nx9Var.g();
            case 6:
                return nx9Var.p();
            case 7:
                return nx9Var.b();
            case 8:
                return nx9Var.b();
            case 9:
                return nx9Var.p();
            case 10:
                return nx9Var.p();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return nx9Var.t();
            case grn1.d /* 12 */:
                return nx9Var.a();
            case 13:
                return nx9Var.u();
            case 14:
                return nx9Var.b();
            case 15:
                return nx9Var.o();
            case 16:
                return nx9Var.f();
            case 17:
                return nx9Var.a();
            case 18:
                return nx9Var.o();
            case 19:
                return nx9Var.d();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return nx9Var.u();
            case 21:
                return nx9Var.r();
            case 22:
                return nx9Var.b();
            case 23:
                return nx9Var.k();
            case 24:
                return nx9Var.a();
            case 25:
                return nx9Var.b();
            case 26:
                return nx9Var.d();
            case 27:
                return nx9Var.a();
            case 28:
                return nx9Var.d();
            default:
                return nx9Var.m();
        }
    }
}
