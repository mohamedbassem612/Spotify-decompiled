package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        dm0 dm0Var = dm0.a;
        hrg hrgVar = hrg.a;
        tr70 tr70Var = tr70.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(d1.a);
                return rih1Var;
            case 1:
                iu30Var.invoke(e1.a);
                return rih1Var;
            case 2:
                iu30Var.invoke(a3.a);
                return rih1Var;
            case 3:
                iu30Var.invoke(q071.a);
                return Boolean.TRUE;
            case 4:
                iu30Var.invoke(fj.a);
                return rih1Var;
            case 5:
                iu30Var.invoke(jj.a);
                return rih1Var;
            case 6:
                iu30Var.invoke(um.a);
                return rih1Var;
            case 7:
                iu30Var.invoke(lp.a);
                return rih1Var;
            case 8:
                iu30Var.invoke(q7x0.b);
                return rih1Var;
            case 9:
                iu30Var.invoke(q7x0.c);
                return rih1Var;
            case 10:
                iu30Var.invoke(a40.a);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                iu30Var.invoke(z30.a);
                return rih1Var;
            case grn1.d /* 12 */:
                iu30Var.invoke(b70.a);
                return rih1Var;
            case 13:
                iu30Var.invoke(xc0.a);
                return rih1Var;
            case 14:
                iu30Var.invoke(new dkk1(1));
                return rih1Var;
            case 15:
                iu30Var.invoke(mk20.a);
                return rih1Var;
            case 16:
                iu30Var.invoke(dm0Var);
                return rih1Var;
            case 17:
                iu30Var.invoke(dm0Var);
                return rih1Var;
            case 18:
                iu30Var.invoke(vo0.a);
                return rih1Var;
            case 19:
                iu30Var.invoke(so0.a);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(uo0.a);
                return rih1Var;
            case 21:
                iu30Var.invoke(lp0.a);
                return rih1Var;
            case 22:
                iu30Var.invoke(tr70Var);
                return rih1Var;
            case 23:
                iu30Var.invoke(hrgVar);
                return rih1Var;
            case 24:
                iu30Var.invoke(tr70Var);
                return rih1Var;
            case 25:
                iu30Var.invoke(hrgVar);
                return rih1Var;
            case 26:
                iu30Var.invoke(tr70Var);
                return rih1Var;
            case 27:
                iu30Var.invoke(ys21.a);
                return rih1Var;
            case 28:
                iu30Var.invoke(tr70Var);
                return rih1Var;
            default:
                iu30Var.invoke(hrgVar);
                return rih1Var;
        }
    }
}
