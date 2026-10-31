package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uc0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(qim0 qim0Var, boolean z) {
        super(2);
        this.a = (byte) 11;
        this.b = z;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        qim0 qim0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j1p1.b(czo1.p(1), z ? 1 : 0, (b0k) obj, qim0Var);
                break;
            case 1:
                ((Number) obj2).intValue();
                sjo0.b(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 2:
                ((Number) obj2).intValue();
                zmo1.f(czo1.p(7), (b0k) obj, qim0Var, z);
                break;
            case 3:
                ((Number) obj2).intValue();
                luo1.a(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 4:
                ((Number) obj2).intValue();
                wwo1.d(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 5:
                ((Number) obj2).intValue();
                i3p1.e(czo1.p(7), (b0k) obj, qim0Var, z);
                break;
            case 6:
                ((Number) obj2).intValue();
                bth.j(czo1.p(7), (b0k) obj, qim0Var, z);
                break;
            case 7:
                ((Number) obj2).intValue();
                s9p1.g(czo1.p(7), (b0k) obj, qim0Var, z);
                break;
            case 8:
                ((Number) obj2).intValue();
                ijo1.c(czo1.p(7), (b0k) obj, qim0Var, z);
                break;
            case 9:
                ((Number) obj2).intValue();
                eko1.f(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 10:
                ((Number) obj2).intValue();
                rwq0.g(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (!z) {
                    x340Var2.i0(969217790);
                    irx irxVar = irx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(irxVar, new jsl(cwl1.o0(x340Var2, 2131951922)), anm1.N("addButton", qim0Var), ((vex) zex.a.b).b, 0L, false, x340Var2, irx.d, 48);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(968919198);
                    klx klxVar = klx.c;
                    uwr uwrVar2 = cbx.a;
                    w0h1.a(klxVar, new jsl(cwl1.o0(x340Var2, 2131951922)), anm1.N("addedButton", qim0Var), cbx.a(x340Var2).a.c, 0L, false, x340Var2, klx.d, 48);
                    x340Var2.r(false);
                }
                break;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                j541.b(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 13:
                ((Number) obj2).intValue();
                obg1.d(czo1.p(7), (b0k) obj, qim0Var, z);
                break;
            case 14:
                ((Number) obj2).intValue();
                t890.f(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 15:
                ((Number) obj2).intValue();
                tf40.b(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 16:
                ((Number) obj2).intValue();
                dsa0.d(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 17:
                ((Number) obj2).intValue();
                mth1.f(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 18:
                ((Number) obj2).intValue();
                t4n1.f(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 19:
                ((Number) obj2).intValue();
                i1k0.e(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                mue1.h(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 21:
                ((Number) obj2).intValue();
                m6p1.c(czo1.p(1), z ? 1 : 0, (b0k) obj, qim0Var);
                break;
            case 22:
                ((Number) obj2).intValue();
                xap1.f(czo1.p(1), z ? 1 : 0, (b0k) obj, qim0Var);
                break;
            case 23:
                ((Number) obj2).intValue();
                iko1.j(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 24:
                ((Number) obj2).intValue();
                m1p1.n(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 25:
                ((Number) obj2).intValue();
                s3o1.h(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 26:
                ((Number) obj2).intValue();
                no80.f(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            case 27:
                ((Number) obj2).intValue();
                no80.h(czo1.p(1), z ? 1 : 0, (b0k) obj, qim0Var);
                break;
            case 28:
                ((Number) obj2).intValue();
                yap1.c(czo1.p(1), (b0k) obj, qim0Var, z);
                break;
            default:
                ((Number) obj2).intValue();
                d7e.g(czo1.p(1), z ? 1 : 0, (b0k) obj, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ uc0(byte b, int i, int i2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc0(qim0 qim0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc0(boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = qim0Var;
    }
}
