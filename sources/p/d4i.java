package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.io.IOException;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d4i extends hab0 implements xu30 {
    public static final d4i N0;
    public static final d4i O0;
    public static final d4i P0;
    public static final d4i Q0;
    public static final d4i R0;
    public static final d4i S0;
    public static final d4i T0;
    public static final d4i U0;
    public static final d4i V0;
    public static final d4i W0;
    public static final d4i X;
    public static final d4i X0;
    public static final d4i Y;
    public static final d4i Y0;
    public static final d4i Z;
    public static final d4i Z0;
    public static final d4i a1;
    public static final d4i b;
    public static final d4i b1;
    public static final d4i c;
    public static final d4i c1;
    public static final d4i d;
    public static final d4i d1;
    public static final d4i e;
    public static final d4i e1;
    public static final d4i f;
    public static final d4i g;
    public static final d4i h;
    public static final d4i i;
    public static final d4i t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new d4i(i2, (byte) 0);
        c = new d4i(i2, (byte) 1);
        d = new d4i(i2, (byte) 2);
        e = new d4i(i2, (byte) 3);
        f = new d4i(i2, (byte) 4);
        g = new d4i(i2, (byte) 5);
        h = new d4i(i2, (byte) 6);
        i = new d4i(i2, (byte) 7);
        t = new d4i(i2, (byte) 8);
        X = new d4i(i2, (byte) 9);
        Y = new d4i(i2, (byte) 10);
        Z = new d4i(i2, (byte) 11);
        N0 = new d4i(i2, (byte) 12);
        O0 = new d4i(i2, (byte) 13);
        P0 = new d4i(i2, (byte) 14);
        Q0 = new d4i(i2, (byte) 15);
        R0 = new d4i(i2, (byte) 16);
        S0 = new d4i(i2, (byte) 17);
        T0 = new d4i(i2, (byte) 18);
        U0 = new d4i(i2, (byte) 19);
        V0 = new d4i(i2, (byte) 20);
        W0 = new d4i(i2, (byte) 21);
        X0 = new d4i(i2, (byte) 22);
        Y0 = new d4i(i2, (byte) 23);
        Z0 = new d4i(i2, (byte) 24);
        a1 = new d4i(i2, (byte) 25);
        b1 = new d4i(i2, (byte) 26);
        c1 = new d4i(i2, (byte) 27);
        d1 = new d4i(i2, (byte) 28);
        e1 = new d4i(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4i(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strO0 = cwl1.o0(x340Var2, 2131951910);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var2).g, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarD);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(gfh0VarC, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var3).g;
                t5p1.b(null, new p3v(48.0f), 0.0f, false, x340Var3, 24582);
                x340Var5.r(true);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                cr31 cr31Var = er31.a;
                ogx ogxVar = ogx.e;
                gra graVar = een.h;
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                cwl1.b((qim0) null, graVar, cr31Var, ogxVar, new zzq0(12.0f, 12.0f, 12.0f, 12.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, h4i.a, b0kVar, 0, 48, 2017);
                return rih1Var;
            case 3:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                hrx hrxVar = hrx.c;
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                w0h1.a(hrxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, hrx.d | 48, 48);
                return rih1Var;
            case 4:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar3, 2131953304);
                uwr uwrVar5 = cbx.a;
                uwo1.e(strO1, null, cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2034);
                return rih1Var;
            case 5:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar4, 2131959897), null, null, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar4, 0, 0, 1726);
                return rih1Var;
            case 6:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.EMPTY;
                fwx fwxVarG = hso1.G(hrx.c, 0L, 0L, b0kVar5, hrx.d, 30);
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, b0kVar5, 1073766448, 0, 3564);
                return rih1Var;
            case 7:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                hr80.d(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f, cbx.a(b0kVar6).a.b.c(), b0kVar6, 0, 0);
                return rih1Var;
            case 8:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                hr80.d(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f, cbx.a(b0kVar7).a.b.c(), b0kVar7, 0, 0);
                return rih1Var;
            case 9:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strO2 = cwl1.o0(x340Var7, 2131953776);
                    uwr uwrVar8 = cbx.a;
                    long j = cbx.a(x340Var7).b.a;
                    lee1 lee1Var = cbx.d(x340Var7).e;
                    cvx cvxVar2 = cbx.b(x340Var7).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                    cvx cvxVar3 = cbx.b(x340Var7).b;
                    cvx cvxVar4 = cbx.b(x340Var7).b;
                    uwo1.e(strO2, uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5), lee1Var, j, new a0e1(5), null, 0, false, null, 0, null, x340Var7, 0, 0, 2016);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwr uwrVar9 = cbx.a;
                    long jC = cbx.a(x340Var9).a.b.c();
                    qim0 qim0VarN = anm1.N("curated_divider", nim0Var);
                    cvx cvxVar5 = cbx.b(x340Var9).b;
                    hr80.d(uyn1.z(0.0f, 4.0f, 1, qim0VarN), 0.5f, jC, x340Var9, 48, 0);
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
                if (x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    isl islVar = isl.a;
                    if (zBooleanValue) {
                        x340Var11.i0(842824697);
                        klx klxVar = klx.c;
                        uwr uwrVar10 = cbx.a;
                        w0h1.a(klxVar, islVar, (qim0) null, cbx.a(x340Var11).b.c, 0L, false, x340Var11, klx.d | 48, 52);
                        x340Var11.r(false);
                    } else {
                        x340Var11.i0(843037667);
                        irx irxVar = irx.c;
                        uwr uwrVar11 = cbx.a;
                        w0h1.a(irxVar, islVar, (qim0) null, cbx.a(x340Var11).b.b, 0L, false, x340Var11, irx.d | 48, 52);
                        x340Var11.r(false);
                    }
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var12 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    g9p1.l(cwl1.o0(x340Var13, 2131951942), x340Var13, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    uwo1.e(cwl1.o0(x340Var15, 2131951962), null, null, 0L, null, null, 0, false, null, 0, null, x340Var15, 0, 0, 2046);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    eso1.h(hso1.G(hrx.c, 0L, 0L, x340Var17, hrx.d, 30), new jsl(cwl1.o0(x340Var17, 2131951943)), (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var17, 8, 508);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    eso1.h(hso1.G(gnx.c, 0L, 0L, x340Var19, gnx.d, 30), new jsl(cwl1.o0(x340Var19, 2131951943)), (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var19, 8, 508);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var20 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    mth1.i((Integer) null, 1, anm1.N("adjusted-speed-disclosure-speed-up-indicator", nim0Var), x340Var21, 54, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var22 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    mth1.i((Integer) null, 2, anm1.N("adjusted-speed-disclosure-speed-down-indicator", nim0Var), x340Var23, 54, 0);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    qim0 qim0VarZ2 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    fra fraVar = een.N0;
                    uwr uwrVar12 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var25).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var25, 48);
                    int iHashCode2 = Long.hashCode(x340Var25.T);
                    xos0 xos0VarM2 = x340Var25.m();
                    qim0 qim0VarE2 = zr7.E(x340Var25, qim0VarZ2);
                    hzj.A.getClass();
                    if (x340Var25.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var25.m0();
                    if (x340Var25.S) {
                        x340Var25.l(n4kVar);
                    } else {
                        x340Var25.v0();
                    }
                    nko1.H(jw31VarA, x340Var25, y580.O0);
                    nko1.H(xos0VarM2, x340Var25, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var25, y580.R0);
                    nko1.F(x340Var25);
                    nko1.H(qim0VarE2, x340Var25, y580.Y);
                    zov0 zov0Var3 = cbx.b(x340Var25).g;
                    w0h1.a(cnx.c, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var25).b.e, 0L, true, x340Var25, cnx.d | 196656, 16);
                    uwo1.e(cwl1.o0(x340Var25, 2131962332), null, cbx.d(x340Var25).j, 0L, null, null, 0, false, null, 0, null, x340Var25, 0, 0, 2042);
                    x340Var25.r(true);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 19:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                b180 b180VarX = cyo1.x(b0kVar8, 2131231208);
                uwr uwrVar13 = cbx.a;
                zov0 zov0Var4 = cbx.b(b0kVar8).g;
                qim0 qim0VarC = ((nbh) obj).c(een.Q0, u291.r(nim0Var, 48.0f));
                cvx cvxVar7 = cbx.b(b0kVar8).b;
                eso1.g(b180VarX, isl.a, uyn1.B(qim0VarC, 0.0f, 0.0f, 0.0f, 8.0f, 7), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar8, 48, 504);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                cnx cnxVar = cnx.c;
                uwr uwrVar14 = cbx.a;
                w0h1.a(cnxVar, isl.a, (qim0) null, cbx.a(b0kVar9).b.e, 0L, true, b0kVar9, cnx.d | 196656, 20);
                return rih1Var;
            case 21:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO3 = cwl1.o0(b0kVar10, 2131962457);
                uwr uwrVar15 = cbx.a;
                uwo1.e(strO3, null, cbx.d(b0kVar10).j, 0L, null, null, 0, false, null, 0, null, b0kVar10, 0, 0, 2042);
                return rih1Var;
            case 22:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var26 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= x340Var26.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    fra fraVar2 = een.N0;
                    qim0 qim0VarZ3 = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                    jw31 jw31VarA2 = ew31.a(h36.g, fraVar2, x340Var27, 0);
                    int iHashCode3 = Long.hashCode(x340Var27.T);
                    xos0 xos0VarM3 = x340Var27.m();
                    qim0 qim0VarE3 = zr7.E(x340Var27, qim0VarZ3);
                    hzj.A.getClass();
                    if (x340Var27.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var27.m0();
                    if (x340Var27.S) {
                        x340Var27.l(n4kVar);
                    } else {
                        x340Var27.v0();
                    }
                    nko1.H(jw31VarA2, x340Var27, y580.O0);
                    nko1.H(xos0VarM3, x340Var27, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var27, y580.R0);
                    nko1.F(x340Var27);
                    nko1.H(qim0VarE3, x340Var27, y580.Y);
                    vu30Var.invoke(x340Var27, Integer.valueOf(iIntValue12 & 14));
                    nl70.c(i3o1.n(2131233197, x340Var27, 0), (String) null, (qim0) null, 0L, x340Var27, 56, 12);
                    x340Var27.r(true);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj3).intValue();
                w0h1.a(plx.c, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, plx.d | 48, 60);
                return rih1Var;
            case 24:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar11, 2131952257), null, null, 0L, null, null, 0, false, null, 0, null, b0kVar11, 0, 0, 2046);
                return rih1Var;
            case 25:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                x340 x340Var28 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= x340Var28.h(zBooleanValue2) ? 4 : 2;
                }
                x340 x340Var29 = x340Var28;
                if (!x340Var29.Y(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x340Var29.b0();
                } else if (zBooleanValue2) {
                    x340Var29.i0(685058738);
                    Object objT = x340Var29.T();
                    if (objT == fkj0.X) {
                        objT = nyf.a1;
                        x340Var29.s0(objT);
                    }
                    otw.c(new cac((Function0) objT), afx0.a, (qim0) null, (ipb1) null, x340Var29, 48, 12);
                    x340Var29.r(false);
                } else {
                    x340Var29.i0(685251899);
                    x340Var29.r(false);
                }
                return rih1Var;
            case 26:
                ((Boolean) obj).booleanValue();
                x340 x340Var30 = (b0k) obj2;
                int iIntValue14 = ((Number) obj3).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    lmt0.h(x340Var31, 0);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 27:
                b0k b0kVar12 = (b0k) obj2;
                ((Number) obj3).intValue();
                gfx.f(6, apo.r(-713247320, new r6i((wr91) obj, (byte) 0), b0kVar12), b0kVar12);
                return rih1Var;
            case 28:
                b0k b0kVar13 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO4 = cwl1.o0(b0kVar13, 2131954684);
                uwr uwrVar16 = cbx.a;
                uwo1.e(strO4, null, null, cbx.a(b0kVar13).b.a, null, null, 0, false, null, 0, null, b0kVar13, 0, 0, 2038);
                return rih1Var;
            default:
                b0k b0kVar14 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                t1c.a(too1.y(qim0VarF, new bgc0(lhc.g(b0kVar14).g, 32)), b0kVar14, 0);
                return rih1Var;
        }
    }
}
