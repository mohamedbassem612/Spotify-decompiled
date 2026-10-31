package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vgz extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgz(Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        Function0 function0 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                nyn1.i(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                nyn1.j(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                nyn1.k(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                nyn1.l(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                nyn1.p(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    idx idxVar = new idx(4);
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ivw(function0, (byte) 21);
                        x340Var2.s0(objT);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT), idxVar, null, null, null, null, null, null, null, null, wmi.c, x340Var2, 0, 48, 2044);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    boolean zG2 = x340Var4.g(function0);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new ivw(function0, (byte) 22);
                        x340Var4.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), ldxVar, null, null, null, null, null, null, null, null, wmi.d, x340Var4, 48, 48, 2044);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                nyn1.v(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                nyn1.z(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                jzn1.e(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    guo1.x(cwl1.o0(x340Var6, 2131955911), cwl1.o0(x340Var6, 2131955910), true, "", this.b, x340Var6, 3456);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG3 = x340Var8.g(function0);
                    Object objT3 = x340Var8.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new in00(function0, (byte) 16);
                        x340Var8.s0(objT3);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT3), new idx(4), null, null, null, null, null, null, null, null, eoi.j, x340Var8, 0, 48, 2044);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG4 = x340Var10.g(function0);
                    Object objT4 = x340Var10.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new in00(function0, (byte) 17);
                        x340Var10.s0(objT4);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT4), ldx.c, null, null, null, null, null, null, null, null, eoi.k, x340Var10, 0, 48, 2044);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zG5 = x340Var12.g(function0);
                    Object objT5 = x340Var12.T();
                    if (zG5 || objT5 == fkj0.X) {
                        objT5 = new in00(function0, (byte) 26);
                        x340Var12.s0(objT5);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT5), new idx(4), null, null, null, null, null, null, null, null, goi.c, x340Var12, 0, 48, 2044);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                eyo1.f(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG6 = x340Var14.g(function0);
                    Object objT6 = x340Var14.T();
                    if (zG6 || objT6 == fkj0.X) {
                        objT6 = new in00(function0, (byte) 28);
                        x340Var14.s0(objT6);
                    }
                    h0p1.b(new gbx(z50Var, (Function0) objT6), anm1.N("filter_chip_row_clear_button", nim0Var), x340Var14, 48);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                dro.l(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                vby0.k(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                dem1.e(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    foo1.c(new gbx(z50Var, function0), new idx(4), null, null, null, null, null, null, null, null, sqi.a, x340Var16, 0, 48, 2044);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    foo1.c(new gbx(z50Var, function0), ldx.c, null, null, null, null, null, null, null, null, sqi.b, x340Var18, 0, 48, 2044);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                h7p1.d(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                h7p1.q(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                h7p1.r(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var20, 2131962320);
                    boolean zG7 = x340Var20.g(function0);
                    Object objT7 = x340Var20.T();
                    if (zG7 || objT7 == fkj0.X) {
                        objT7 = new j160(function0, (byte) 25);
                        x340Var20.s0(objT7);
                    }
                    Function0 function1 = (Function0) objT7;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strO0), function1), new idx(13), anm1.N("ShareLinkButton", nim0Var), null, null, null, null, null, qti.a, null, qti.b, x340Var20, 805306368, 48, 1528);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                iu90.a(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                iu90.e(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                vby0.j(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                xzo1.g(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var22, 2131963251);
                    boolean zG8 = x340Var22.g(function0);
                    Object objT8 = x340Var22.T();
                    if (zG8 || objT8 == fkj0.X) {
                        objT8 = new aba0(function0, (byte) 28);
                        x340Var22.s0(objT8);
                    }
                    Function0 function2 = (Function0) objT8;
                    if (ihc1.y0(strO1)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50(strO1), function2), ldx.c, null, null, null, null, false, null, null, mxi.c, x340Var22, 0, 6, 1020);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgz(Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
    }
}
