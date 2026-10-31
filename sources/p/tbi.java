package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tbi extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbi(iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        m9k m9kVar = m9k.a;
        xzg xzgVar = xzg.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(mpi1.O0);
                break;
            case 1:
                iu30Var.invoke(vlf.a);
                break;
            case 2:
                iu30Var.invoke(nlf.a);
                break;
            case 3:
                iu30Var.invoke(ylf.a);
                break;
            case 4:
                iu30Var.invoke(rlf.a);
                break;
            case 5:
                iu30Var.invoke(olf.a);
                break;
            case 6:
                iu30Var.invoke(qlf.a);
                break;
            case 7:
                iu30Var.invoke(mlf.a);
                break;
            case 8:
                iu30Var.invoke(amf.a);
                break;
            case 9:
                iu30Var.invoke(bmf.a);
                break;
            case 10:
                iu30Var.invoke(zlf.a);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                iu30Var.invoke(wlf.a);
                break;
            case grn1.d /* 12 */:
                iu30Var.invoke(xlf.a);
                break;
            case 13:
                iu30Var.invoke(plf.a);
                break;
            case 14:
                iu30Var.invoke(tlf.a);
                break;
            case 15:
                iu30Var.invoke(slf.a);
                break;
            case 16:
                iu30Var.invoke(v560.O0);
                break;
            case 17:
                iu30Var.invoke(p9g.a);
                break;
            case 18:
                iu30Var.invoke(frg.a);
                break;
            case 19:
                iu30Var.invoke(dzg.a);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(lzg.a);
                break;
            case 21:
                iu30Var.invoke(xzgVar);
                break;
            case 22:
                iu30Var.invoke(xzgVar);
                break;
            case 23:
                iu30Var.invoke(xzgVar);
                break;
            case 24:
                iu30Var.invoke(cuh.a);
                break;
            case 25:
                iu30Var.invoke(m9kVar);
                break;
            case 26:
                iu30Var.invoke(l9k.a);
                break;
            case 27:
                iu30Var.invoke(m9kVar);
                break;
            case 28:
                iu30Var.invoke(yuk.a);
                break;
            default:
                iu30Var.invoke(yuk.b);
                break;
        }
        return rih1Var;
    }
}
