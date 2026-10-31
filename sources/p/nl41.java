package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nl41 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl41(String str, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strK;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        String str = this.b;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    b3o1.f(cbx.d(x340Var4).k, apo.r(-1744749536, new nl41(str, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fux fuxVar = fux.c;
                    jsl jslVar = new jsl(str);
                    uwr uwrVar2 = cbx.a;
                    w0h1.a(fuxVar, jslVar, (qim0) null, cbx.a(x340Var6).b.a, 0L, false, x340Var6, fux.d, 52);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    fux fuxVar2 = fux.c;
                    uwr uwrVar3 = cbx.a;
                    w0h1.a(fuxVar2, new jsl(str), (qim0) null, cbx.a(x340Var8).b.b, 0L, false, x340Var8, fux.d, 52);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(this.b, uyn1.x(dug.f(nim0Var, cbx.a(x340Var10).a.c, er31.b(16.0f)), 8.0f), lee1.a(cbx.d(x340Var10).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), u7h.f, null, null, 2, false, new cjc0(1), 0, null, x340Var10, 1575936, 0, 1712);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else if (str != null) {
                    x340Var12.i0(585991808);
                    cmx cmxVar = cmx.c;
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var12).g;
                    w0h1.a(cmxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var12).b.b, 0L, false, x340Var12, cmx.d | 48, 48);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(586279860);
                    b180 b180VarB = t8p1.c;
                    if (b180VarB == null) {
                        a180 a180Var = new a180("LocationIcon", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
                        n6a1 n6a1Var = new n6a1(z4p1.g(4280211296L));
                        int i = bui1.a;
                        cwh0 cwh0VarG = lf51.g(8.5f, 1.52051f);
                        cwh0VarG.f(11.6911f, 1.76332f, 14.2367f, 4.30889f, 14.4795f, 7.5f);
                        cwh0VarG.h(16.0f);
                        cwh0VarG.u(8.5f);
                        cwh0VarG.h(14.4785f);
                        cwh0VarG.f(14.2357f, 11.691f, 11.691f, 14.2357f, 8.5f, 14.4785f);
                        cwh0VarG.u(16.0f);
                        cwh0VarG.h(7.5f);
                        cwh0VarG.u(14.4785f);
                        cwh0VarG.f(4.30895f, 14.2357f, 1.76433f, 11.691f, 1.52148f, 8.5f);
                        cwh0VarG.h(0.0f);
                        cwh0VarG.u(7.5f);
                        cwh0VarG.h(1.52051f);
                        cwh0VarG.f(1.76332f, 4.30889f, 4.30889f, 1.76332f, 7.5f, 1.52051f);
                        cwh0VarG.u(0.0f);
                        cwh0VarG.h(8.5f);
                        cwh0VarG.u(1.52051f);
                        cwh0VarG.e();
                        cwh0VarG.l(8.0f, 2.5f);
                        cwh0VarG.f(4.96243f, 2.5f, 2.5f, 4.96243f, 2.5f, 8.0f);
                        cwh0VarG.f(2.5f, 11.0376f, 4.96243f, 13.5f, 8.0f, 13.5f);
                        cwh0VarG.f(11.0376f, 13.5f, 13.5f, 11.0376f, 13.5f, 8.0f);
                        cwh0VarG.f(13.5f, 4.96243f, 11.0376f, 2.5f, 8.0f, 2.5f);
                        cwh0VarG.e();
                        cwh0VarG.l(8.0f, 5.0f);
                        cwh0VarG.f(9.65685f, 5.0f, 11.0f, 6.34315f, 11.0f, 8.0f);
                        cwh0VarG.f(11.0f, 9.65685f, 9.65685f, 11.0f, 8.0f, 11.0f);
                        cwh0VarG.f(6.34315f, 11.0f, 5.0f, 9.65685f, 5.0f, 8.0f);
                        cwh0VarG.f(5.0f, 6.34315f, 6.34315f, 5.0f, 8.0f, 5.0f);
                        cwh0VarG.e();
                        a180.a(a180Var, cwh0VarG.a, n6a1Var, 0.0f, 0, 4.0f);
                        b180VarB = a180Var.b();
                        t8p1.c = b180VarB;
                    }
                    b180 b180Var = b180VarB;
                    uwr uwrVar6 = cbx.a;
                    long j = cbx.a(x340Var12).b.c;
                    zov0 zov0Var2 = cbx.b(x340Var12).g;
                    nl70.b(b180Var, (String) null, u291.r(nim0Var, 16.0f), j, x340Var12, 48, 0);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2046);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    bzn1.e(null, apo.r(-2103033501, new nl41(str, (byte) 6), x340Var16), false, null, null, null, null, null, x340Var16, 48, 253);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var18, (qim0) null);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var20, 0, 0, 2046);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var22, 0, 0, 2046);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    fsx fsxVar = fsx.c;
                    uwr uwrVar7 = cbx.a;
                    w0h1.a(fsxVar, new jsl(cwl1.n0(2131962909, new Object[]{str}, x340Var24)), (qim0) null, cbx.a(x340Var24).b.b, 0L, false, x340Var24, fsx.d, 52);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var26, 0, 0, 2046);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(this.b, null, null, cbx.a(x340Var28).b.c, null, null, 0, false, null, 0, null, x340Var28, 0, 0, 2038);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var30).h, 0L, null, null, 0, false, null, 0, null, x340Var30, 0, 0, 2042);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var32).k, 0L, null, null, 0, false, null, 0, null, x340Var32, 0, 0, 2042);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var34, (qim0) null);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                crm0.p(str, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                return anm1.N(str, u291.f(nim0Var, 1.0f));
            case 19:
                ((Number) obj2).intValue();
                sjo0.d(str, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    uwo1.e(this.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var36, 0, 0, 2046);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    if (str != null) {
                        x340Var38.i0(298881737);
                        strK = cwl1.n0(2131962865, new Object[]{str}, x340Var38);
                        x340Var38.r(false);
                    } else {
                        strK = x0d.k(x340Var38, 299002203, 2131962864, x340Var38, false);
                    }
                    uwo1.e(strK, null, null, 0L, null, null, 0, false, null, 0, null, x340Var38, 0, 0, 2046);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ezn1.d(str, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    uwr uwrVar11 = cbx.a;
                    uwo1.e(this.b, null, null, cbx.a(x340Var40).b.b, null, null, 0, false, null, 0, null, x340Var40, 0, 0, 2038);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    uwo1.e(this.b, null, yla.r(x340Var42).f, 0L, null, null, 0, false, null, 0, null, x340Var42, 0, 0, 2042);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    uwr uwrVar12 = cbx.a;
                    uwo1.e(this.b, null, cbx.d(x340Var44).h, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var44, 0, 0, 1722);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var46.T);
                    xos0 xos0VarM = x340Var46.m();
                    qim0 qim0VarE = zr7.E(x340Var46, qim0VarC);
                    hzj.A.getClass();
                    if (x340Var46.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var46.m0();
                    if (x340Var46.S) {
                        x340Var46.l(hmb0.t1);
                    } else {
                        x340Var46.v0();
                    }
                    nko1.H(gfh0VarC, x340Var46, y580.O0);
                    nko1.H(xos0VarM, x340Var46, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var46, y580.R0);
                    nko1.F(x340Var46);
                    nko1.H(qim0VarE, x340Var46, y580.Y);
                    uwr uwrVar13 = cbx.a;
                    b6p1.b(0, f5p1.k(x340Var46, 2131104058), this.b, x340Var46, null, cbx.d(x340Var46).g);
                    x340Var46.r(true);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    uwr uwrVar14 = cbx.a;
                    uwo1.e(this.b, u291.f(nim0Var, 1.0f), cbx.d(x340Var48).h, 0L, new a0e1(3), null, 0, false, new cjc0(1), 0, null, x340Var48, 48, 0, 1768);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                g0p1.g(str, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                h1p1.e(str, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl41(String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }
}
