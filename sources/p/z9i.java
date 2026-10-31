package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z9i extends hab0 implements vu30 {
    public static final z9i N0;
    public static final z9i O0;
    public static final z9i P0;
    public static final z9i Q0;
    public static final z9i R0;
    public static final z9i S0;
    public static final z9i T0;
    public static final z9i U0;
    public static final z9i V0;
    public static final z9i W0;
    public static final z9i X;
    public static final z9i X0;
    public static final z9i Y;
    public static final z9i Y0;
    public static final z9i Z;
    public static final z9i Z0;
    public static final z9i a1;
    public static final z9i b;
    public static final z9i b1;
    public static final z9i c;
    public static final z9i c1;
    public static final z9i d;
    public static final z9i d1;
    public static final z9i e;
    public static final z9i e1;
    public static final z9i f;
    public static final z9i g;
    public static final z9i h;
    public static final z9i i;
    public static final z9i t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new z9i(i2, (byte) 0);
        c = new z9i(i2, (byte) 1);
        d = new z9i(i2, (byte) 2);
        e = new z9i(i2, (byte) 3);
        f = new z9i(i2, (byte) 4);
        g = new z9i(i2, (byte) 5);
        h = new z9i(i2, (byte) 6);
        i = new z9i(i2, (byte) 7);
        t = new z9i(i2, (byte) 8);
        X = new z9i(i2, (byte) 9);
        Y = new z9i(i2, (byte) 10);
        Z = new z9i(i2, (byte) 11);
        N0 = new z9i(i2, (byte) 12);
        O0 = new z9i(i2, (byte) 13);
        P0 = new z9i(i2, (byte) 14);
        Q0 = new z9i(i2, (byte) 15);
        R0 = new z9i(i2, (byte) 16);
        S0 = new z9i(i2, (byte) 17);
        T0 = new z9i(i2, (byte) 18);
        U0 = new z9i(i2, (byte) 19);
        V0 = new z9i(i2, (byte) 20);
        W0 = new z9i(i2, (byte) 21);
        X0 = new z9i(i2, (byte) 22);
        Y0 = new z9i(i2, (byte) 23);
        Z0 = new z9i(i2, (byte) 24);
        a1 = new z9i(i2, (byte) 25);
        b1 = new z9i(i2, (byte) 26);
        c1 = new z9i(i2, (byte) 27);
        d1 = new z9i(i2, (byte) 28);
        e1 = new z9i(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9i(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w0h1.a(ikx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var4, ikx.d | 48, 60);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    w0h1.a(fsx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var6, fsx.d | 48, 60);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var8, 2131952052);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var8).h, 0L, null, null, 0, false, null, 0, null, x340Var8, 0, 0, 2042);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var10, 2131952053);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO1, null, cbx.d(x340Var10).h, 0L, null, null, 0, false, null, 0, null, x340Var10, 0, 0, 2042);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    w0h1.a(fux.c, new jsl(cwl1.o0(x340Var12, 2131956217)), (qim0) null, 0L, 0L, false, x340Var12, fux.d, 60);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var14, 2131956659), null, null, 0L, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2046);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var16, 2131956660), null, null, 0L, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2046);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var18, 2131961753), null, null, 0L, null, null, 0, false, null, 0, null, x340Var18, 0, 0, 2046);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var20, 2131961754), null, null, 0L, null, null, 0, false, null, 0, null, x340Var20, 0, 0, 2046);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String strO2 = cwl1.o0(x340Var22, 2131961761);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strO2, u291.f(nim0Var, 1.0f), null, cbx.a(x340Var22).b.c, new a0e1(6), null, 2, false, new cjc0(1), 0, null, x340Var22, 0, 0, 1700);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var24).b;
                    mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var24, 0);
                    int iHashCode = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM = x340Var24.m();
                    qim0 qim0VarE = zr7.E(x340Var24, nim0Var);
                    hzj.A.getClass();
                    if (x340Var24.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(hmb0.t1);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(mbhVarA, x340Var24, y580.O0);
                    nko1.H(xos0VarM, x340Var24, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var24, y580.R0);
                    nko1.F(x340Var24);
                    nko1.H(qim0VarE, x340Var24, y580.Y);
                    t4n1.c(tmx.c, cwl1.o0(x340Var24, 2131961759), x340Var24, tmx.d);
                    t4n1.c(hmx.c, cwl1.o0(x340Var24, 2131961758), x340Var24, hmx.d);
                    t4n1.c(ssx.c, cwl1.o0(x340Var24, 2131961757), x340Var24, ssx.d);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String strO3 = cwl1.o0(x340Var26, 2131959724);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(strO3, null, cbx.d(x340Var26).e, 0L, null, null, 0, false, null, 0, null, x340Var26, 0, 0, 2042);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    esx esxVar = esx.c;
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var28).g;
                    w0h1.a(esxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var28).b.b, 0L, false, x340Var28, esx.d | 48, 48);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fux fuxVar = fux.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var30, 2131959643));
                    uwr uwrVar7 = cbx.a;
                    w0h1.a(fuxVar, jslVar, (qim0) null, cbx.a(x340Var30).b.b, 0L, false, x340Var30, fux.d, 52);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    String strO4 = cwl1.o0(x340Var32, 2131962945);
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(strO4, qim0VarZ, cbx.d(x340Var32).g, cbx.a(x340Var32).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var32, 48, 0, 2016);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    String strO5 = cwl1.o0(x340Var34, 2131953447);
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(strO5, null, cbx.d(x340Var34).h, 0L, null, null, 0, false, null, 0, null, x340Var34, 0, 0, 2042);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    String strO6 = cwl1.o0(x340Var36, 2131953519);
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(strO6, null, null, cbx.a(x340Var36).b.c, null, null, 0, false, null, 0, null, x340Var36, 0, 0, 2038);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    String strO7 = cwl1.o0(x340Var38, 2131952588);
                    uwr uwrVar11 = cbx.a;
                    uwo1.e(strO7, null, cbx.d(x340Var38).k, 0L, null, null, 0, false, null, 0, null, x340Var38, 0, 0, 2042);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    w0h1.a(nox.c, isl.a, (qim0) null, 0L, 0L, false, x340Var40, nox.d | 48, 60);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    String strO8 = cwl1.o0(x340Var42, 2131953536);
                    uwr uwrVar12 = cbx.a;
                    uwo1.e(strO8, null, cbx.d(x340Var42).h, 0L, null, null, 0, false, null, 0, null, x340Var42, 0, 0, 2042);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    w0h1.a(lsx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var44, lsx.d | 48, 60);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    w0h1.a(qpx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var46, qpx.d | 48, 60);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    w0h1.a(inx.c, new jsl(cwl1.o0(x340Var48, 2131952116)), (qim0) null, 0L, 0L, false, x340Var48, inx.d, 60);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var49 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (x340Var50.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    w0h1.a(ctx.c, new jsl(cwl1.o0(x340Var50, 2131952119)), (qim0) null, 0L, 0L, false, x340Var50, ctx.d, 60);
                } else {
                    x340Var50.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var51 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (!x340Var52.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x340Var52.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var53 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var54, 2131952120), null, null, 0L, null, null, 0, false, null, 0, null, x340Var54, 0, 0, 2046);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var55 = (b0k) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                x340 x340Var56 = x340Var55;
                if (x340Var56.Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    wox woxVar = wox.c;
                    jsl jslVar2 = new jsl(cwl1.o0(x340Var56, 2131952117));
                    uwr uwrVar13 = cbx.a;
                    w0h1.a(woxVar, jslVar2, (qim0) null, cbx.a(x340Var56).b.b, 0L, false, x340Var56, wox.d, 52);
                } else {
                    x340Var56.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var57 = (b0k) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                x340 x340Var58 = x340Var57;
                if (!x340Var58.Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x340Var58.b0();
                }
                return rih1Var;
            default:
                x340 x340Var59 = (b0k) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                x340 x340Var60 = x340Var59;
                if (x340Var60.Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    w0h1.a(inx.c, new jsl(cwl1.o0(x340Var60, 2131953707)), (qim0) null, 0L, 0L, false, x340Var60, inx.d, 60);
                } else {
                    x340Var60.b0();
                }
                return rih1Var;
        }
    }
}
