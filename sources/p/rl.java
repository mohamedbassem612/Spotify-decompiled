package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl(String str, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vxo1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 1:
                ryo1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 2:
                yoi1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 3:
                pap1.p(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 4:
                m3b.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 5:
                m3b.d(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 6:
                sio1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 7:
                gio1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 8:
                fyo1.g(czo1.p(49), str, function0, b0kVar, qim0Var);
                break;
            case 9:
                rrn1.q(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 10:
                jhc1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                nz80.h(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case grn1.d /* 12 */:
                iu90.f(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 13:
                ejo1.h(czo1.p(7), str, function0, b0kVar, qim0Var);
                break;
            case 14:
                eqn1.i(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 15:
                irn1.x(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 16:
                epo1.h(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 17:
                tro1.b(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 18:
                ezn1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 19:
                jzn1.a(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                zk51.a(czo1.p(49), str, function0, b0kVar, qim0Var);
                break;
            case 21:
                wyo1.e(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 22:
                j2p1.n(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 23:
                i541.g(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 24:
                lro1.k(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 25:
                vbe.t(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            case 26:
                epo1.b(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
            default:
                zro1.o(czo1.p(1), str, function0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl(String str, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.d = qim0Var;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl(Function0 function0, String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = function0;
        this.b = str;
        this.d = qim0Var;
    }
}
