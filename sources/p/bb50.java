package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bb50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb50(Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = function0;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.b;
        Function0 function0 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lnn1.c(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 1:
                bzn1.d(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 2:
                sto1.e(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 3:
                xto.c(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 4:
                w2g0.f(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 5:
                rqg0.s(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 6:
                cev0.a(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 7:
                cev0.d(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 8:
                cev0.f(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 9:
                cev0.k(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 10:
                uvg0.c(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                n3o1.i(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case grn1.d /* 12 */:
                d4o1.b(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 13:
                ulo1.d(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 14:
                who1.i(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 15:
                x2g0.e(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 16:
                qxy0.h(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 17:
                no80.g(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 18:
                lro1.j(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 19:
                gto1.h(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                t0c.b(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 21:
                pqo.e(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 22:
                j1e1.e(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 23:
                xpn1.e(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 24:
                xio1.g(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 25:
                epo1.f(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 26:
                iqo1.b(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 27:
                oto1.f(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            case 28:
                n1p1.g(czo1.p(1), function0, b0kVar, qim0Var);
                break;
            default:
                f2p1.l(czo1.p(1), function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb50(qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = function0;
    }
}
