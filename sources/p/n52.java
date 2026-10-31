package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n52 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n52(int i, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.d = i;
        this.b = iu30Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        iu30 iu30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                pap1.n(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 1:
                pro1.b(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 2:
                i8p1.b(i, czo1.p(1), b0kVar, iu30Var, qim0Var);
                break;
            case 3:
                c8o.a(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 4:
                uyn1.a(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 5:
                wyo1.c(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 6:
                azo1.b(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 7:
                l4p1.e(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 8:
                b5p1.c(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 9:
                vzn1.b(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 10:
                rjo1.h(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ulo1.e(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case grn1.d /* 12 */:
                xzn1.e(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            default:
                i0p1.o(czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n52(iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n52(qim0 qim0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = iu30Var;
        this.d = i;
    }
}
