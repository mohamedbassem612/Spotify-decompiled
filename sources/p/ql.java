package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ql extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(int i, String str, Function0 function0) {
        super(2);
        this.a = (byte) 23;
        this.c = function0;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        Function0 function0 = this.c;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fra fraVar = een.N0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarF = u291.f(uyn1.x(nim0Var, 16.0f), 1.0f);
                    long j = cbx.a(x340Var2).a.c;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarX = bin.x(dug.f(qim0VarF, j, er31.b(8.0f)), false, null, new pm31(0), null, this.c, 11);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = h3.Z0;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarN = anm1.N("account-details-request-banner", s161.b(qim0VarX2, true, (iu30) objT));
                    jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    uwo1.e(this.b, new wnb0(1.0f, true), cbx.d(x340Var2).k, cbx.a(x340Var2).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                    plx plxVar = plx.c;
                    long j2 = cbx.a(x340Var2).b.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var2, plx.d | 48, 48);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                qyo1.a(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(d7e.r(1.0f, nim0Var, false), 1.0f);
                    Uri uri = Uri.parse(str);
                    boolean zG = x340Var4.g(function0);
                    Object objT2 = x340Var4.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new vj0(function0, (byte) 0);
                        x340Var4.s0(objT2);
                    }
                    eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT2, (iu30) null, (iu30) null, 0L, x340Var4, 0, 0, 126974), isl.a, qim0VarD, (p3v) null, (zvx) null, (ecx) null, mif1.V0, (tl3) null, (ColorFilter) null, x340Var4, 48, 440);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ero1.a(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                z8p1.f(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function0), qim0VarF2, null, null, null, null, null, apo.r(-710203652, new j3b(str, (byte) 14), x340Var6), x340Var6, 12582912, 124);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ukv.a(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    gdx gdxVarS = yla.s(x340Var8);
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function0), anm1.N("ctaButton", nim0Var), null, gdxVarS, null, null, null, apo.r(1360106687, new ps00(str, (byte) 24), x340Var8), x340Var8, 12582912, 116);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                op71.b(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                j9k1.e(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var10).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function0), qim0VarB, null, yla.s(x340Var10), null, null, null, apo.r(1313447981, new dz40(str, (byte) 17), x340Var10), x340Var10, 12582912, 116);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                s110.e(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else if (str.length() > 0) {
                    x340Var12.i0(-561941118);
                    y251.d(6, function0, x340Var12, false);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(-561850784);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 13:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else {
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function0), null, null, null, null, null, null, apo.r(978429450, new y5d0(str, (byte) 0), x340Var14), x340Var14, 12582912, 126);
                }
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var16.b0();
                } else {
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function0), null, null, null, null, null, null, apo.r(1908632027, new y5d0(str, (byte) 2), x340Var16), x340Var16, 12582912, 126);
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                xzo1.a(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 16:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    i1p1.d(this.b, anm1.N("CtaLockedButton", nim0Var), this.c, hwi.b, null, x340Var18, 3072, 16);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    i1p1.d(this.b, anm1.N("CtaLockedButton", nim0Var), this.c, hwi.c, null, x340Var20, 3072, 16);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i1p1.d(this.b, anm1.N("CtaButton", nim0Var), this.c, null, null, x340Var22, 0, 24);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    i1p1.d(this.b, anm1.N("CtaButton", nim0Var), this.c, null, null, x340Var24, 0, 24);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                rwo1.f(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                y3o1.f(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                y3o1.j(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                yoo1.c(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 24:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    foo1.c(new gbx(z50Var, function0), new idx(4), null, null, yla.s(x340Var26), null, null, null, null, null, apo.r(989778754, new psr0(str, (byte) 4), x340Var26), x340Var26, 0, 48, 2012);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    lrn1.h(0, 4, this.b, this.c, x340Var28, null);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                epo1.p(czo1.p(1), str, function0, (b0k) obj);
                return rih1Var;
            case 27:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (!x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x340Var30.b0();
                } else {
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(str), function0), null, null, null, null, null, null, apo.r(-711661211, new psr0(str, (byte) 10), x340Var30), x340Var30, 12582912, 126);
                }
                return rih1Var;
            case 28:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    boolean zG2 = x340Var32.g(function0);
                    Object objT3 = x340Var32.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new lpx0(function0, (byte) 5);
                        x340Var32.s0(objT3);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT3), null, null, null, null, null, null, apo.r(100151147, new p9y0(str, (byte) 2), x340Var32), x340Var32, 12582912, 126);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            default:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    idx idxVar = new idx(8);
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str), function0), idxVar, null, null, null, null, null, null, null, null, apo.r(-908569973, new p9y0(str, (byte) 20), x340Var34), x340Var34, 0, 48, 2044);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(String str, Function0 function0) {
        super(2);
        this.a = (byte) 0;
        this.c = function0;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(String str, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(String str, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql(Function0 function0, String str, byte b) {
        super(2);
        this.a = b;
        this.c = function0;
        this.b = str;
    }
}
