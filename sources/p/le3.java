package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class le3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le3(int i, Function0 function0, qim0 qim0Var, boolean z) {
        super(2);
        this.a = (byte) 21;
        this.c = function0;
        this.b = z;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        boolean z = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                c680.o(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 1:
                cto1.a(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 2:
                w2b.a(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 3:
                m3b.f(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 4:
                m1p1.p(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 5:
                x2g0.a(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 6:
                m1l.a(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 7:
                lmt0.d(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 8:
                itu.c(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 9:
                hqn1.c(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 10:
                rwq0.i(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                gm50.e(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case grn1.d /* 12 */:
                rrn1.m(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 13:
                bno1.b(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 14:
                fn31.k(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 15:
                ybn0.c(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 16:
                k1p1.e(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 17:
                n1p1.f(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 18:
                a8o.k(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 19:
                iy71.a(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                htd1.a(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            case 21:
                rpo1.o(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
            default:
                k5p1.j(czo1.p(1), function0, b0kVar, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le3(Function0 function0, qim0 qim0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = function0;
        this.d = qim0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le3(qim0 qim0Var, boolean z, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.d = qim0Var;
        this.b = z;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le3(boolean z, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le3(boolean z, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.d = qim0Var;
        this.c = function0;
    }
}
