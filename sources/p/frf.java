package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class frf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ frf(iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        prf prfVar = prf.a;
        g1g g1gVar = g1g.a;
        vlg vlgVar = vlg.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(prfVar);
                break;
            case 1:
                iu30Var.invoke(qrf.a);
                break;
            case 2:
                iu30Var.invoke(prfVar);
                break;
            case 3:
                iu30Var.invoke(bv51.a);
                break;
            case 4:
                iu30Var.invoke(mzf.a);
                break;
            case 5:
                iu30Var.invoke(mzf.f);
                break;
            case 6:
                iu30Var.invoke(mzf.g);
                break;
            case 7:
                iu30Var.invoke(mzf.h);
                break;
            case 8:
                iu30Var.invoke(mzf.d);
                break;
            case 9:
                iu30Var.invoke(mzf.e);
                break;
            case 10:
                iu30Var.invoke(mzf.d);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                iu30Var.invoke(g1gVar);
                break;
            case grn1.d /* 12 */:
                iu30Var.invoke(g1gVar);
                break;
            case 13:
                iu30Var.invoke(f1g.a);
                break;
            case 14:
                iu30Var.invoke(h1g.a);
                break;
            case 15:
                iu30Var.invoke(i1g.a);
                break;
            case 16:
                iu30Var.invoke(j1g.a);
                break;
            case 17:
                iu30Var.invoke(u4g.a);
                break;
            case 18:
                iu30Var.invoke(jkg.a);
                break;
            case 19:
                iu30Var.invoke(lkg.a);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(vlgVar);
                break;
            case 21:
                iu30Var.invoke(wlg.a);
                break;
            case 22:
                iu30Var.invoke(xlg.a);
                break;
            case 23:
                iu30Var.invoke(vlgVar);
                break;
            case 24:
                iu30Var.invoke(ylg.a);
                break;
            case 25:
                iu30Var.invoke(jng.a);
                break;
            case 26:
                iu30Var.invoke(gng.a);
                break;
            case 27:
                iu30Var.invoke(k6h.a);
                break;
            case 28:
                iu30Var.invoke(ehh.a);
                break;
            default:
                iu30Var.invoke(hhh.a);
                break;
        }
        return rih1Var;
    }
}
