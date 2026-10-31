package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iui extends hab0 implements xu30 {
    public static final iui N0;
    public static final iui O0;
    public static final iui P0;
    public static final iui Q0;
    public static final iui R0;
    public static final iui S0;
    public static final iui T0;
    public static final iui U0;
    public static final iui V0;
    public static final iui W0;
    public static final iui X;
    public static final iui X0;
    public static final iui Y;
    public static final iui Y0;
    public static final iui Z;
    public static final iui Z0;
    public static final iui a1;
    public static final iui b;
    public static final iui b1;
    public static final iui c;
    public static final iui c1;
    public static final iui d;
    public static final iui d1;
    public static final iui e;
    public static final iui e1;
    public static final iui f;
    public static final iui g;
    public static final iui h;
    public static final iui i;
    public static final iui t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new iui(i2, (byte) 0);
        c = new iui(i2, (byte) 1);
        d = new iui(i2, (byte) 2);
        e = new iui(i2, (byte) 3);
        f = new iui(i2, (byte) 4);
        g = new iui(i2, (byte) 5);
        h = new iui(i2, (byte) 6);
        i = new iui(i2, (byte) 7);
        t = new iui(i2, (byte) 8);
        X = new iui(i2, (byte) 9);
        Y = new iui(i2, (byte) 10);
        Z = new iui(i2, (byte) 11);
        N0 = new iui(i2, (byte) 12);
        O0 = new iui(i2, (byte) 13);
        P0 = new iui(i2, (byte) 14);
        Q0 = new iui(i2, (byte) 15);
        R0 = new iui(i2, (byte) 16);
        S0 = new iui(i2, (byte) 17);
        T0 = new iui(i2, (byte) 18);
        U0 = new iui(i2, (byte) 19);
        V0 = new iui(i2, (byte) 20);
        W0 = new iui(i2, (byte) 21);
        X0 = new iui(i2, (byte) 22);
        Y0 = new iui(i2, (byte) 23);
        Z0 = new iui(i2, (byte) 24);
        a1 = new iui(i2, (byte) 25);
        b1 = new iui(i2, (byte) 26);
        c1 = new iui(i2, (byte) 27);
        d1 = new iui(i2, (byte) 28);
        e1 = new iui(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iui(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(3, (wux) null, apo.r(1705917629, new r6i((wr91) obj, (byte) 5), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 1:
                ((Boolean) obj).getClass();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nyx.a(0, (wux) null, oui.a, x340Var2, 3072, 7);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                ilx ilxVar = ilx.c;
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar2).c.c;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                w0h1.a(ilxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, b0kVar2, ilx.d | 48, 48);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, nim0Var);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                uwo1.e(cwl1.o0(x340Var3, 2131951854), new wnb0(1.0f, false), null, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var3, 0, 0, 1724);
                p9p1.b(null, 2, 1, x340Var3, 432, 1);
                x340Var5.r(true);
                return rih1Var;
            case 4:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar3, 2131951848), null, null, 0L, null, null, 2, false, new cjc0(2), 0, null, b0kVar3, 0, 0, 1726);
                return rih1Var;
            case 5:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t890.e((qim0) null, x340Var7, 0);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 6:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar = plx.c;
                uwr uwrVar3 = cbx.a;
                w0h1.a(plxVar, isl.a, (qim0) null, cbx.a(b0kVar4).b.b, 0L, false, b0kVar4, plx.d | 48, 52);
                return rih1Var;
            case 7:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                uwo1.e(cwl1.o0(b0kVar5, 2131960145), null, cbx.d(b0kVar5).h, 0L, null, null, 0, false, null, 0, null, b0kVar5, 0, 0, 2042);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                return rih1Var;
            case 9:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar6, 2131957476), null, null, 0L, null, null, 2, false, new zic0(1), 0, null, b0kVar6, 0, 0, 1726);
                return rih1Var;
            case 10:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    wtx wtxVar = wtx.c;
                    uwr uwrVar5 = cbx.a;
                    w0h1.a(wtxVar, isl.a, qim0VarD, ((wex) ((gmt) zex.a.c).c).b, 0L, true, x340Var9, wtx.d | 196656, 16);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var10 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var10.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var11 = x340Var10;
                if (!x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x340Var11.b0();
                } else if (zBooleanValue) {
                    x340Var11.i0(528312206);
                    nyx.a(0, (wux) null, mwi.a, x340Var11, 3072, 7);
                    x340Var11.r(false);
                } else {
                    x340Var11.i0(528552456);
                    x340Var11.r(false);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    wsx wsxVar = wsx.c;
                    uwr uwrVar6 = cbx.a;
                    long j2 = cbx.a(x340Var13).b.b;
                    qim0 qim0VarQ = i1p1.q(nim0Var, er31.a);
                    cvx cvxVar2 = cbx.b(x340Var13).b;
                    qim0 qim0VarX = uyn1.x(qim0VarQ, 12.0f);
                    zov0 zov0Var2 = cbx.b(x340Var13).g;
                    w0h1.a(wsxVar, isl.a, u291.r(qim0VarX, 32.0f), j2, 0L, false, x340Var13, wsx.d | 48, 48);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    i6p1.d(180.0f, 18.0f, 0.0f, null, x340Var15, 54, 12);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                m6p1.h(64.0f, 64.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                m6p1.h(80.0f, 16.0f, 4.0f, (b0k) obj2, 0, 0);
                return rih1Var;
            case 16:
                ((Number) obj3).intValue();
                m6p1.h(200.0f, 20.0f, 0.0f, (b0k) obj2, 0, 4);
                return rih1Var;
            case 17:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(x340Var16, 2131952885);
                uwr uwrVar7 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var16).h;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                float f2 = cbx.b(x340Var16).e.b;
                float f3 = cbx.b(x340Var16).b.b;
                float f4 = cbx.b(x340Var16).e.b;
                cvx cvxVar3 = cbx.b(x340Var16).b;
                qim0 qim0VarA = uyn1.A(qim0VarF, f2, f3, f4, 8.0f);
                x340 x340Var17 = x340Var16;
                Object objT = x340Var17.T();
                if (objT == fkj0.X) {
                    objT = oqi.f;
                    x340Var17.s0(objT);
                }
                uwo1.e(strO0, s161.b(qim0VarA, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var17, 0, 0, 2040);
                return rih1Var;
            case 18:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar7, 2131963258);
                uwr uwrVar8 = cbx.a;
                lee1 lee1Var2 = cbx.d(b0kVar7).e;
                cvx cvxVar4 = cbx.b(b0kVar7).b;
                cvx cvxVar5 = cbx.b(b0kVar7).b;
                uwo1.e(strO1, uyn1.y(nim0Var, 16.0f, 8.0f), lee1Var2, 0L, null, null, 0, false, null, 0, null, b0kVar7, 0, 0, 2040);
                return rih1Var;
            case 19:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO2 = cwl1.o0(b0kVar8, 2131963253);
                uwr uwrVar9 = cbx.a;
                uwo1.e(strO2, null, cbx.d(b0kVar8).j, cbx.a(b0kVar8).b.b, null, null, 0, false, null, 0, null, b0kVar8, 0, 0, 2034);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                dmx dmxVar = dmx.c;
                uwr uwrVar10 = cbx.a;
                zov0 zov0Var3 = cbx.b(b0kVar9).g;
                w0h1.a(dmxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, b0kVar9, dmx.d | 48, 56);
                return rih1Var;
            case 21:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar2 = plx.c;
                uwr uwrVar11 = cbx.a;
                zov0 zov0Var4 = cbx.b(b0kVar10).g;
                w0h1.a(plxVar2, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, b0kVar10, plx.d | 48, 56);
                return rih1Var;
            case 22:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar3 = plx.c;
                uwr uwrVar12 = cbx.a;
                zov0 zov0Var5 = cbx.b(b0kVar11).g;
                w0h1.a(plxVar3, isl.a, u291.r(nim0Var, 16.0f), cbx.a(b0kVar11).b.b, 0L, false, b0kVar11, plx.d | 48, 48);
                return rih1Var;
            case 23:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (!x340Var19.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x340Var19.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var20 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    plx plxVar4 = plx.c;
                    uwr uwrVar13 = cbx.a;
                    w0h1.a(plxVar4, isl.a, (qim0) null, cbx.a(x340Var21).b.a, 0L, false, x340Var21, plx.d | 48, 52);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var22 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    String strO3 = cwl1.o0(x340Var23, 2131957876);
                    uwr uwrVar14 = cbx.a;
                    uwo1.e(strO3, null, cbx.d(x340Var23).g, cbx.a(x340Var23).b.a, null, null, 0, false, null, 0, null, x340Var23, 0, 0, 2034);
                    op71.g(x340Var23, u291.h(nim0Var, cbx.b(x340Var23).b.b));
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    uwr uwrVar15 = cbx.a;
                    uwo1.e(ydh.g(cbx.b(x340Var25).b.c, 2131957875, x340Var25, x340Var25, nim0Var), null, cbx.d(x340Var25).h, cbx.a(x340Var25).b.a, null, null, 0, false, null, 0, null, x340Var25, 0, 0, 2034);
                    cvx cvxVar6 = cbx.b(x340Var25).b;
                    uwo1.e(ydh.g(16.0f, 2131957874, x340Var25, x340Var25, nim0Var), null, cbx.d(x340Var25).g, cbx.a(x340Var25).b.b, null, null, 0, false, null, 0, null, x340Var25, 0, 0, 2034);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 27:
                b0k b0kVar12 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar12, 2131953035), null, null, 0L, null, null, 0, false, null, 0, null, b0kVar12, 0, 0, 2046);
                return rih1Var;
            case 28:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    uwr uwrVar16 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var27).b;
                    op71.g(x340Var27, u291.h(nim0Var, 8.0f));
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            default:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    uwr uwrVar17 = cbx.a;
                    cvx cvxVar8 = cbx.b(x340Var29).b;
                    op71.g(x340Var29, u291.h(nim0Var, 8.0f));
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
        }
    }
}
