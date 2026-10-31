package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g22 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ znb0 b;

    public /* synthetic */ g22(znb0 znb0Var, byte b) {
        this.a = b;
        this.b = znb0Var;
    }

    public final Object invoke() {
        ot50 ot50Var;
        byte b = this.a;
        znb0 znb0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((sck1) znb0Var.getValue()).o();
            case 1:
                sck1 sck1Var = (sck1) znb0Var.getValue();
                ot50Var = sck1Var instanceof ot50 ? (ot50) sck1Var : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 2:
                return ((sck1) znb0Var.getValue()).o();
            case 3:
                sck1 sck1Var2 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var2 instanceof ot50 ? (ot50) sck1Var2 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 4:
                return ((sck1) znb0Var.getValue()).o();
            case 5:
                sck1 sck1Var3 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var3 instanceof ot50 ? (ot50) sck1Var3 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 6:
                return ((sck1) znb0Var.getValue()).o();
            case 7:
                sck1 sck1Var4 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var4 instanceof ot50 ? (ot50) sck1Var4 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 8:
                return ((sck1) znb0Var.getValue()).o();
            case 9:
                sck1 sck1Var5 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var5 instanceof ot50 ? (ot50) sck1Var5 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 10:
                sck1 sck1Var6 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var6 instanceof ot50 ? (ot50) sck1Var6 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return ((sck1) znb0Var.getValue()).o();
            case grn1.d /* 12 */:
                sck1 sck1Var7 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var7 instanceof ot50 ? (ot50) sck1Var7 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 13:
                return ((sck1) znb0Var.getValue()).o();
            case 14:
                sck1 sck1Var8 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var8 instanceof ot50 ? (ot50) sck1Var8 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
            case 15:
                return ((sck1) znb0Var.getValue()).o();
            default:
                sck1 sck1Var9 = (sck1) znb0Var.getValue();
                ot50Var = sck1Var9 instanceof ot50 ? (ot50) sck1Var9 : null;
                return ot50Var != null ? ot50Var.O() : csn.b;
        }
    }
}
