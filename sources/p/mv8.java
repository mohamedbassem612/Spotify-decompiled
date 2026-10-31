package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mv8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv8(String str, int i, boolean z) {
        super(2);
        this.a = (byte) 6;
        this.b = z;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0VarR;
        lee1 lee1Var;
        float f;
        String strN0;
        long j;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarF = nim0.a;
        String str = this.c;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ptx ptxVar = ptx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(ptxVar, new jsl(str), (qim0) null, cbx.a(x340Var2).b.b, cbx.a(x340Var2).b.c, this.b, x340Var2, ptx.d, 4);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    t4n1.f(0, x340Var4, (qim0) null, z);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(this.c, null, cbx.d(x340Var4).k, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2042);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ztx ztxVar = z ? ztx.c : aux.c;
                    jsl jslVar = new jsl(str);
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var6).g;
                    w0h1.a(ztxVar, jslVar, u291.r(qim0VarF, 16.0f), 0L, 0L, false, x340Var6, 8, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ztx ztxVar2 = z ? ztx.c : aux.c;
                    jsl jslVar2 = new jsl(str);
                    uwr uwrVar4 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var8).g;
                    w0h1.a(ztxVar2, jslVar2, u291.r(qim0VarF, 16.0f), 0L, 0L, false, x340Var8, 8, 56);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qtx qtxVar = qtx.c;
                    jsl jslVar3 = new jsl(str);
                    if (z) {
                        x340Var10.i0(668613521);
                        uwr uwrVar5 = cbx.a;
                        zov0 zov0Var3 = cbx.b(x340Var10).g;
                        qim0VarR = i541.D(u291.r(qim0VarF, 16.0f), -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048574);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(668702925);
                        uwr uwrVar6 = cbx.a;
                        zov0 zov0Var4 = cbx.b(x340Var10).g;
                        qim0VarR = u291.r(qim0VarF, 16.0f);
                        x340Var10.r(false);
                    }
                    w0h1.a(qtxVar, jslVar3, qim0VarR, 0L, 0L, false, x340Var10, qtx.d, 56);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (z) {
                        x340Var12.i0(1826288605);
                        uwr uwrVar7 = cbx.a;
                        lee1Var = cbx.d(x340Var12).j;
                    } else {
                        x340Var12.i0(1826289662);
                        uwr uwrVar8 = cbx.a;
                        lee1Var = cbx.d(x340Var12).g;
                    }
                    x340Var12.r(false);
                    uwo1.e(this.c, null, lee1Var, 0L, new a0e1(5), null, 2, false, new cjc0(3), 0, null, x340Var12, 0, 0, 1706);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ybn0.f(czo1.p(1), str, (b0k) obj, z);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                dem1.j(czo1.p(7), str, (b0k) obj, z);
                return rih1Var;
            case 8:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(qim0VarF, 1.0f);
                    yla.r(x340Var14);
                    jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var14, 0);
                    int iHashCode2 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM2 = x340Var14.m();
                    qim0 qim0VarE2 = zr7.E(x340Var14, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(jw31VarA2, x340Var14, y580.O0);
                    nko1.H(xos0VarM2, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE2, x340Var14, y580.Y);
                    if (z) {
                        x340Var14.i0(-1668139534);
                        uwr uwrVar9 = cbx.a;
                        xto1.e(null, 2, cbx.a(x340Var14).b.a, 0L, x340Var14, 48, 9);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-1667972320);
                        x340Var14.r(false);
                    }
                    uwo1.e(this.c, null, null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var14, 0, 0, 2030);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (z) {
                        x340Var16.i0(-1553166910);
                        uwr uwrVar10 = cbx.a;
                        zov0 zov0Var5 = cbx.b(x340Var16).g;
                        x340Var16.r(false);
                        f = 24.0f;
                    } else {
                        x340Var16.i0(-1553089472);
                        uwr uwrVar11 = cbx.a;
                        zov0 zov0Var6 = cbx.b(x340Var16).g;
                        x340Var16.r(false);
                        f = 32.0f;
                    }
                    eso1.e(Uri.parse(str), isl.a, u291.r(qim0VarF, f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var16, 48, 0, 4088);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                m1p1.e(czo1.p(1), str, (b0k) obj, z);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    if (z) {
                        strN0 = x0d.k(x340Var18, 1618457214, 2131961081, x340Var18, false);
                    } else {
                        x340Var18.i0(1618564319);
                        strN0 = cwl1.n0(2131961080, new Object[]{str}, x340Var18);
                        x340Var18.r(false);
                    }
                    uwo1.e(strN0, null, null, 0L, null, null, 0, false, null, 0, null, x340Var18, 0, 0, 2046);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Object objT = x340Var20.T();
                    if (objT == fkj0.X) {
                        objT = s861.d1;
                        x340Var20.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    if (z) {
                        qim0VarF = (qim0) iu30Var.invoke(qim0VarF);
                    }
                    eqr0.b(0, 0, str, x340Var20, qim0VarF);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    w0h1.a(z ? spx.c : xpx.c, new jsl(str), (qim0) null, 0L, 0L, false, x340Var22, 8, 60);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                g0p1.l(czo1.p(1), str, (b0k) obj, z);
                return rih1Var;
            case 15:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwr uwrVar12 = cbx.a;
                    lee1 lee1Var2 = cbx.d(x340Var24).k;
                    if (z) {
                        x340Var24.i0(316410367);
                        j = cbx.a(x340Var24).b.b;
                    } else {
                        x340Var24.i0(316411452);
                        j = cbx.a(x340Var24).b.a;
                    }
                    x340Var24.r(false);
                    uwo1.e(this.c, null, lee1Var2, j, null, null, 2, false, new cjc0(1), 0, null, x340Var24, 0, 0, 1714);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwr uwrVar13 = cbx.a;
                    lee1 lee1Var3 = cbx.d(x340Var26).h;
                    if (z) {
                        qim0VarF = u291.f(qim0VarF, 1.0f);
                    }
                    uwo1.e(this.c, qim0VarF, lee1Var3, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var26, 0, 0, 2024);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    uwr uwrVar14 = cbx.a;
                    zov0 zov0Var7 = cbx.b(x340Var28).g;
                    w0h1.a(z ? aux.c : ztx.c, new jsl(str), u291.r(qim0VarF, 16.0f), cbx.a(x340Var28).c.a, 0L, true, x340Var28, 196616, 16);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                qej1.j(czo1.p(1), str, (b0k) obj, z);
                return rih1Var;
            default:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    w0h1.a(z ? ztx.c : aux.c, new jsl(str), (qim0) null, 0L, 0L, false, x340Var30, 8, 60);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv8(byte b, int i, String str, boolean z) {
        super(2);
        this.a = b;
        this.c = str;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv8(String str, boolean z, byte b) {
        super(2);
        this.a = b;
        this.c = str;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv8(boolean z, String str, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = str;
    }
}
