package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ucp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ucp0(pd61 pd61Var, byte b) {
        super(0);
        this.a = b;
        this.b = pd61Var;
    }

    public final Object invoke() {
        byte b = this.a;
        pd61 pd61Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return pd61Var.r0;
            case 1:
                return pd61Var.q0;
            case 2:
                return pd61Var.t0;
            case 3:
                return pd61Var.w;
            case 4:
                return pd61Var.T0;
            case 5:
                return pd61Var.L0;
            case 6:
                return pd61Var.R0;
            case 7:
                return pd61Var.M0;
            case 8:
                return pd61Var.K0;
            case 9:
                return pd61Var.N0;
            case 10:
                return pd61Var.O0;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return pd61Var.P0;
            case grn1.d /* 12 */:
                return pd61Var.Q0;
            case 13:
                return pd61Var.f1;
            case 14:
                return pd61Var.c;
            case 15:
                return pd61Var.c;
            case 16:
                return pd61Var.E2;
            case 17:
                return pd61Var.t;
            case 18:
                return pd61Var.x;
            case 19:
                return pd61Var.n;
            default:
                return pd61Var.l;
        }
    }
}
