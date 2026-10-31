package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tx1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx1(int i, int i2, Function0 function0, qim0 qim0Var) {
        super(2);
        this.a = (byte) 22;
        this.d = i;
        this.c = function0;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.b;
        Function0 function0 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                v9p1.k(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 1:
                ucp1.a(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 2:
                gyo1.g(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 3:
                gyo1.h(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 4:
                gyo1.w(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 5:
                l3p1.i(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 6:
                w2b.d(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 7:
                fqo1.g(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 8:
                qyo1.g(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 9:
                i9p1.i(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 10:
                l4p1.j(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                qxd0.c(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case grn1.d /* 12 */:
                szy.c(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 13:
                hw10.c(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 14:
                im80.b(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 15:
                nz80.g(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 16:
                a8o.d(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 17:
                tro1.i(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 18:
                zro1.k(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 19:
                cso1.t(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                dug.c(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 21:
                rwo1.h(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
            case 22:
                ton1.i(i, czo1.p(1), function0, b0kVar, qim0Var);
                break;
            default:
                u4p1.M(czo1.p(i | 1), function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx1(Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = function0;
        this.b = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx1(qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = function0;
        this.d = i;
    }
}
