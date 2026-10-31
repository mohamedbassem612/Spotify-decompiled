package p;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ue0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue0(String str, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 19:
                this.c = str;
                this.b = i;
                super(2);
                break;
            default:
                this.c = str;
                this.b = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        hux huxVar;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        String str = this.c;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sok.l(str, dm5.J(et40.a), i, x340Var2, 0);
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
                    uwo1.e(this.c, (qim0) null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.a, new a0e1(3), (iu30) null, 2, false, new zic0(i), 0, (qx8) null, x340Var4, 0, 0, 1698);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var6, i);
                    boolean zG = x340Var6.g(str);
                    Object objT = x340Var6.T();
                    if (zG || objT == fkj0.X) {
                        objT = new w8c(str, (byte) 21);
                        x340Var6.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO0, qim0VarA, cbx.d(x340Var6).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2040);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                e130.a(i, czo1.p(1), str, (b0k) obj);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                qxy0.a(i, czo1.p(1), str, (b0k) obj);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                xyn1.f(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                g0p1.i(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else if (i == 1) {
                    x340Var8.i0(657123744);
                    ikx ikxVar = ikx.c;
                    jsl jslVar = new jsl(str);
                    uwr uwrVar3 = cbx.a;
                    long j = cbx.a(x340Var8).b.a;
                    zov0 zov0Var = cbx.b(x340Var8).g;
                    w0h1.a(ikxVar, jslVar, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var8, ikx.d, 48);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(657347657);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(this.c, (qim0) null, cbx.d(x340Var8).j, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2034);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                xto1.d(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                sgc1.s(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var10).b;
                    uwo1.e(this.c, anm1.N("lyrics-translation-label-" + i, uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13)), cbx.d(x340Var10).j, cbx.a(x340Var10).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2032);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                bof0.a(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                bof0.a(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strN0 = cwl1.n0(i, new Object[]{str}, x340Var12);
                    Object objT2 = x340Var12.T();
                    if (objT2 == fkj0.X) {
                        objT2 = j2g0.i;
                        x340Var12.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT2);
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(strN0, qim0VarB, cbx.d(x340Var12).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var12, 1572864, 0, 1720);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar7 = cbx.a;
                    qim0 qim0VarF2 = dug.f(u291.a(nim0Var, cbx.b(x340Var14).b.a, cbx.b(x340Var14).b.a), cbx.a(x340Var14).a.c, er31.a);
                    boolean zG2 = x340Var14.g(str);
                    Object objT3 = x340Var14.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new z9b0(str, (byte) 26);
                        x340Var14.s0(objT3);
                    }
                    qim0 qim0VarA2 = s161.a(qim0VarF2, (iu30) objT3);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarA2);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(hmb0.t1);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    uwo1.e(String.valueOf(i), (qim0) null, cbx.d(x340Var14).n, cbx.a(x340Var14).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2034);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        huxVar = hrx.c;
                    } else if (iC == 1) {
                        huxVar = irx.c;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        huxVar = pjx.c;
                    }
                    hux huxVar2 = huxVar;
                    jsl jslVar2 = new jsl(str);
                    uwr uwrVar8 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var16).g;
                    w0h1.a(huxVar2, jslVar2, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var16, 8, 56);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ejo1.j(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                zj01.c(i, czo1.p(1), str, (b0k) obj);
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String strConcat = str.concat(MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.NARROW).format(new Measure(Integer.valueOf(i), MeasureUnit.SECOND)));
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(strConcat, nim0.a, cbx.d(x340Var18).k, cbx.a(x340Var18).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 0, 0, 2032);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    gfx.b(1, apo.r(763777109, new ue0(str, i, (byte) 18), x340Var20), x340Var20, 54);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                sj1.d(i, czo1.p(391), str, (b0k) obj);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                zro1.h(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                hyo1.b(str, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue0(int i, String str, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue0(byte b, int i, String str, boolean z) {
        super(2);
        this.a = b;
        this.c = str;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue0(String str, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = str;
        this.b = i;
    }
}
