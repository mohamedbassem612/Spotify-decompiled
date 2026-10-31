package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ns30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ns30(qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zr7.c(qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                c680.h(qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                tf40.a(qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                dsa0.a(qim0Var, b0kVar, czo1.p(1));
                break;
            case 4:
                i541.c(qim0Var, b0kVar, czo1.p(1));
                break;
            case 5:
                mth1.e(qim0Var, b0kVar, czo1.p(1));
                break;
            case 6:
                u2o1.a(qim0Var, b0kVar, czo1.p(1));
                break;
            case 7:
                i3o1.d(qim0Var, b0kVar, czo1.p(1));
                break;
            case 8:
                lc60.d(qim0Var, b0kVar, czo1.p(1));
                break;
            case 9:
                eso1.i(qim0Var, b0kVar, czo1.p(1));
                break;
            case 10:
                f4p1.a(qim0Var, b0kVar, czo1.p(1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                p9p1.d(qim0Var, b0kVar, czo1.p(1));
                break;
            case grn1.d /* 12 */:
                t9p1.b(qim0Var, b0kVar, czo1.p(1));
                break;
            case 13:
                e9k.i(qim0Var, b0kVar, czo1.p(1));
                break;
            case 14:
                rqg0.c(qim0Var, b0kVar, czo1.p(1));
                break;
            case 15:
                rqg0.f(qim0Var, b0kVar, czo1.p(1));
                break;
            case 16:
                rqt0.d(qim0Var, b0kVar, czo1.p(1));
                break;
            case 17:
                sgc1.o(qim0Var, b0kVar, czo1.p(1));
                break;
            case 18:
                ltn1.o(qim0Var, b0kVar, czo1.p(1));
                break;
            case 19:
                jzn1.h(qim0Var, b0kVar, czo1.p(1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                dgd0.f(qim0Var, b0kVar, czo1.p(1));
                break;
            case 21:
                dgd0.h(qim0Var, b0kVar, czo1.p(1));
                break;
            case 22:
                g3p1.h(qim0Var, b0kVar, czo1.p(1));
                break;
            case 23:
                u4p1.i(qim0Var, b0kVar, czo1.p(1));
                break;
            case 24:
                h5p1.e(qim0Var, b0kVar, czo1.p(1));
                break;
            case 25:
                k5p1.f(qim0Var, b0kVar, czo1.p(1));
                break;
            case 26:
                w5p1.d(qim0Var, b0kVar, czo1.p(1));
                break;
            case 27:
                l6p1.e(qim0Var, b0kVar, czo1.p(1));
                break;
            case 28:
                r6p1.g(qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                t6p1.d(qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
