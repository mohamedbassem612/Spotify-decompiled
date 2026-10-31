package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wfe1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfe1(qim0 qim0Var) {
        super(2);
        this.a = (byte) 11;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                n8p1.e(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                roe1.a(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                roe1.b(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                tgp1.f(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 4:
                ((Number) obj2).intValue();
                j82.u(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 5:
                ((Number) obj2).intValue();
                odf1.c(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 6:
                ((Number) obj2).intValue();
                odf1.e(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 7:
                ((Number) obj2).intValue();
                cev0.m(qim0Var, (b0k) obj, czo1.p(55));
                break;
            case 8:
                ((Number) obj2).intValue();
                oon1.i(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 9:
                ((Number) obj2).intValue();
                qon1.g(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 10:
                ((Number) obj2).intValue();
                h4o1.j(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    tkx tkxVar = tkx.c;
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var2).d.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(tkxVar, isl.a, u291.r(qim0Var, 24.0f), j, 0L, false, x340Var2, tkx.d | 48, 48);
                }
                break;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ilo1.h(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 13:
                ((Number) obj2).intValue();
                ilo1.o(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 14:
                ((Number) obj2).intValue();
                epo1.d(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 15:
                ((Number) obj2).intValue();
                o1p1.j(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 16:
                ((Number) obj2).intValue();
                s1p1.d(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 17:
                ((Number) obj2).intValue();
                s1p1.m(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 18:
                ((Number) obj2).intValue();
                f5p1.a(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 19:
                ((Number) obj2).intValue();
                h5p1.g(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                h5p1.k(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 21:
                ((Number) obj2).intValue();
                lcc.b(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 22:
                ((Number) obj2).intValue();
                lcc.f(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 23:
                ((Number) obj2).intValue();
                lcc.n(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 24:
                ((Number) obj2).intValue();
                lcc.p(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 25:
                ((Number) obj2).intValue();
                lcc.t(qim0Var, (b0k) obj, czo1.p(1));
                break;
            case 26:
                ((Number) obj2).intValue();
                brl.g(qim0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                irn1.E(qim0Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wfe1(qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
    }
}
