package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nt implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;

    public /* synthetic */ nt(c380 c380Var, byte b) {
        this.a = b;
        this.b = c380Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c380 c380Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((ev) c380Var.get(((Number) obj).intValue())).a;
            case 1:
                c380Var.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((jwm) c380Var.get(((Number) obj).intValue())).a.a;
            case 3:
                c380Var.get(((Number) obj).intValue());
                return null;
            case 4:
                return ((oe90) c380Var.get(((Number) obj).intValue())).a;
            case 5:
                c380Var.get(((Number) obj).intValue());
                return null;
            case 6:
                c380Var.get(((Number) obj).intValue());
                return null;
            case 7:
                c380Var.get(((Number) obj).intValue());
                return null;
            case 8:
                nhe0 nhe0Var = (nhe0) c380Var.get(((Number) obj).intValue());
                Integer num = nhe0Var.c;
                return num == null ? nhe0Var.a : num;
            case 9:
                c380Var.get(((Number) obj).intValue());
                return null;
            case 10:
                c380Var.get(((Number) obj).intValue());
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return String.valueOf(((b6q0) c380Var.get(((Number) obj).intValue())).b().a);
            default:
                c380Var.get(((Number) obj).intValue());
                return null;
        }
    }
}
