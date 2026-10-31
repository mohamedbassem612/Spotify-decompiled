package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vx1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx1(int i) {
        super(2);
        this.a = (byte) 17;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var2, i);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var2).k, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                f2d0 f2d0Var = (f2d0) obj2;
                int i2 = ((f2d0) obj).a;
                int i3 = f2d0Var.a;
                if (Math.abs(i3) < i && Math.abs(i2) < i) {
                    i3 += i2;
                }
                return new f2d0(i3, f2d0Var.b, false);
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var4, i);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO1, null, cbx.d(x340Var4).h, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2042);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                k5p1.g(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iC = l1d.C(i);
                    if (iC == 2) {
                        x340Var6.i0(284622641);
                        y1a1.c((qim0) null, x340Var6, 0);
                        x340Var6.r(false);
                    } else if (iC != 3) {
                        x340Var6.i0(284626502);
                        y1a1.d(x340Var6, 0);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(284624944);
                        y1a1.b((qim0) null, x340Var6, 0);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                k5p1.g(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    uwo1.e(String.valueOf(i), uyn1.z(4.0f, 0.0f, 2, qim0VarA), cbx.d(x340Var8).n, cbx.a(x340Var8).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var8, 0, 0, 1776);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                p6p1.c(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                p6p1.i(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var10, 0);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, nim0Var);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(hmb0.t1);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(jw31VarA, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE, x340Var10, y580.Y);
                    String strU = cwl1.U(2131820628, i, new Object[]{Integer.valueOf(i)}, x340Var10);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strU, anm1.N("replies_remaining_text", nim0Var), cbx.d(x340Var10).k, cbx.a(x340Var10).b.b, null, null, 0, false, null, 0, null, x340Var10, 0, 0, 2032);
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, nim0Var);
                    zov0 zov0Var = cbx.b(x340Var10).g;
                    w0h1.a(mlx.c, isl.a, u291.r(qim0VarZ, 16.0f), cbx.a(x340Var10).b.b, 0L, false, x340Var10, mlx.d | 48, 48);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 10:
                return Integer.valueOf(((Number) obj).intValue() + i);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var12, i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var12, 0, 0, 2046);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwo1.e(cwl1.n0(2131961683, new Object[]{Integer.valueOf(i)}, x340Var14), null, null, 0L, null, null, 0, false, null, 0, null, x340Var14, 0, 0, 2046);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(cwl1.U(2131820672, i, new Object[]{Integer.valueOf(i)}, x340Var16), null, cbx.d(x340Var16).e, cbx.a(x340Var16).b.a, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2034);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var18, i == 1 ? 2131955286 : 2131955287), null, null, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var18, 0, 0, 1726);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var20, i == 1 ? 2131955284 : 2131955285), null, null, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var20, 0, 0, 1726);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var22, i == 1 ? 2131955302 : 2131955303), null, null, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var22, 0, 0, 1726);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                rwq0.h((b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var24, i), anm1.N("list_page_error_screen_cta", nim0Var), null, 0L, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2044);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                cuo1.x(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                y3o1.c(i, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var26, i), nim0.a, null, 0L, null, null, 0, false, null, 0, null, x340Var26, 48, 0, 2044);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    String strO2 = cwl1.o0(x340Var28, i);
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(strO2, null, cbx.d(x340Var28).g, cbx.a(x340Var28).b.b, null, null, 0, false, null, 0, null, x340Var28, 0, 0, 2034);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    d0p1.c(i, 0, x340Var30, null);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    String strO3 = cwl1.o0(x340Var32, i);
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(strO3, null, cbx.d(x340Var32).k, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var32, 0, 0, 1722);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var34, i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var34, 0, 0, 2046);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var36, i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var36, 0, 0, 2046);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    String strO4 = cwl1.o0(x340Var38, i);
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(strO4, null, cbx.d(x340Var38).h, 0L, null, null, 0, false, null, 0, null, x340Var38, 0, 0, 2042);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var40, i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var40, 0, 0, 2046);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            default:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var42, i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var42, 0, 0, 2046);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx1(byte b, int i, int i2) {
        super(2);
        this.a = b;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx1(int i, byte b) {
        super(2);
        this.a = b;
        this.b = i;
    }
}
