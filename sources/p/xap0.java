package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xap0(io80 io80Var, byte b) {
        super(0);
        this.a = b;
        this.b = io80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        io80 io80Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (vhg0) io80Var.a();
            case 1:
                return (kmn0) io80Var.a();
            case 2:
                return (n4f0) io80Var.a();
            case 3:
                return (tg8) io80Var.a();
            case 4:
                return (SharedCosmosRouterApi) io80Var.a();
            case 5:
                return (i420) io80Var.a();
            case 6:
                return (a8n) io80Var.a();
            case 7:
                return (c8n) io80Var.a();
            case 8:
                return (p5n) io80Var.a();
            case 9:
                return (e4g1) io80Var.a();
            case 10:
                return (exz0) io80Var.a();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (c8n) io80Var.a();
            case grn1.d /* 12 */:
                return (p5n) io80Var.a();
            case 13:
                return (SharedCosmosRouterApi) io80Var.a();
            case 14:
                return (i420) io80Var.a();
            case 15:
                return (a8n) io80Var.a();
            case 16:
                return (a8n) io80Var.a();
            case 17:
                return (obl) io80Var.a();
            case 18:
                return (b8n) io80Var.a();
            case 19:
                return (thg0) io80Var.a();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (mc00) io80Var.a();
            case 21:
                return (a8n) io80Var.a();
            case 22:
                return (SharedCosmosRouterApi) io80Var.a();
            case 23:
                return (p5n) io80Var.a();
            case 24:
                return (obl) io80Var.a();
            case 25:
                return (a8n) io80Var.a();
            case 26:
                return (a8n) io80Var.a();
            case 27:
                return (xz11) io80Var.a();
            case 28:
                return (zh8) io80Var.a();
            default:
                return (xz11) io80Var.a();
        }
    }
}
