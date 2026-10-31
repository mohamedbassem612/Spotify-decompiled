package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kci extends hab0 implements xu30 {
    public static final kci N0;
    public static final kci O0;
    public static final kci P0;
    public static final kci Q0;
    public static final kci R0;
    public static final kci S0;
    public static final kci T0;
    public static final kci U0;
    public static final kci V0;
    public static final kci W0;
    public static final kci X;
    public static final kci X0;
    public static final kci Y;
    public static final kci Y0;
    public static final kci Z;
    public static final kci Z0;
    public static final kci a1;
    public static final kci b;
    public static final kci b1;
    public static final kci c;
    public static final kci c1;
    public static final kci d;
    public static final kci d1;
    public static final kci e;
    public static final kci e1;
    public static final kci f;
    public static final kci g;
    public static final kci h;
    public static final kci i;
    public static final kci t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new kci(i2, (byte) 0);
        c = new kci(i2, (byte) 1);
        d = new kci(i2, (byte) 2);
        e = new kci(i2, (byte) 3);
        f = new kci(i2, (byte) 4);
        g = new kci(i2, (byte) 5);
        h = new kci(i2, (byte) 6);
        i = new kci(i2, (byte) 7);
        t = new kci(i2, (byte) 8);
        X = new kci(i2, (byte) 9);
        Y = new kci(i2, (byte) 10);
        Z = new kci(i2, (byte) 11);
        N0 = new kci(i2, (byte) 12);
        O0 = new kci(i2, (byte) 13);
        P0 = new kci(i2, (byte) 14);
        Q0 = new kci(i2, (byte) 15);
        R0 = new kci(i2, (byte) 16);
        S0 = new kci(i2, (byte) 17);
        T0 = new kci(i2, (byte) 18);
        U0 = new kci(i2, (byte) 19);
        V0 = new kci(i2, (byte) 20);
        W0 = new kci(i2, (byte) 21);
        X0 = new kci(i2, (byte) 22);
        Y0 = new kci(i2, (byte) 23);
        Z0 = new kci(i2, (byte) 24);
        a1 = new kci(i2, (byte) 25);
        b1 = new kci(i2, (byte) 26);
        c1 = new kci(i2, (byte) 27);
        d1 = new kci(i2, (byte) 28);
        e1 = new kci(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kci(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar = plx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, b0kVar, plx.d | 48, 56);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    wpx wpxVar = wpx.c;
                    uwr uwrVar2 = cbx.a;
                    long j = cbx.a(x340Var2).b.b;
                    zov0 zov0Var2 = cbx.b(x340Var2).g;
                    w0h1.a(wpxVar, isl.a, u291.m(nim0Var, 16.0f), j, 0L, true, x340Var2, wpx.d | 196656, 16);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarX);
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
                xto1.e((qim0) null, 2, 0L, 0L, x340Var3, 48, 13);
                x340Var5.r(true);
                return rih1Var;
            case 3:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(b0kVar2, 2131954128);
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar2).j;
                long j2 = cbx.a(b0kVar2).b.a;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                uwo1.e(strO0, uyn1.y(qim0VarF2, 16.0f, cbx.b(b0kVar2).b.b), lee1Var, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                n8p1.b(((wr91) obj).a.a, (b0k) obj2, 0);
                return rih1Var;
            case 5:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar3, 2131960939);
                uwr uwrVar5 = cbx.a;
                uwo1.e(strO1, uyn1.z(16.0f, 0.0f, 2, nim0Var), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2032);
                return rih1Var;
            case 6:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM2 = x340Var7.m();
                    qim0 qim0VarE2 = zr7.E(x340Var7, nim0Var);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(n4kVar);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var7, y580.O0);
                    nko1.H(xos0VarM2, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE2, x340Var7, y580.Y);
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                gra graVar = een.e;
                qim0 qim0VarN = anm1.N("list_ux_platform_lazy_column_loading_indicator", uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, 64.0f, 0.0f, 0.0f, 13));
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                x340 x340Var9 = x340Var8;
                int iHashCode3 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM3 = x340Var9.m();
                qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarN);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(gfh0VarC3, x340Var8, y580.O0);
                nko1.H(xos0VarM3, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE3, x340Var8, y580.Y);
                xto1.e((qim0) null, 5, 0L, 0L, x340Var8, 48, 13);
                x340Var10.r(true);
                return rih1Var;
            case 8:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO2 = cwl1.o0(b0kVar4, 2131955762);
                uwr uwrVar6 = cbx.a;
                lee1 lee1Var2 = cbx.d(b0kVar4).h;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                cvx cvxVar3 = cbx.b(b0kVar4).b;
                cvx cvxVar4 = cbx.b(b0kVar4).b;
                uwo1.e(strO2, uyn1.B(qim0VarF3, 0.0f, 16.0f, 0.0f, 12.0f, 5), lee1Var2, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2024);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                return rih1Var;
            case 11:
                ((Number) obj3).intValue();
                return rih1Var;
            case 12:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                jkx jkxVar = jkx.c;
                uwr uwrVar7 = cbx.a;
                zov0 zov0Var3 = cbx.b(b0kVar5).g;
                w0h1.a(jkxVar, isl.a, anm1.N("navigation_arrow", u291.r(nim0Var, 16.0f)), cbx.a(b0kVar5).b.b, 0L, false, b0kVar5, jkx.d | 48, 48);
                return rih1Var;
            case 13:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar8 = cbx.a;
                brl.i(null, null, null, null, cbx.a(b0kVar6).b.a, cbx.a(b0kVar6).a.c, 0L, 0L, apo.r(-1232138449, new r6i((wr91) obj, z ? (byte) 1 : (byte) 0), b0kVar6), b0kVar6, 805306368, 415);
                return rih1Var;
            case 14:
                ((Boolean) obj).getClass();
                x340 x340Var11 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nyx.a(2, (wux) null, tei.a, x340Var12, 3078, 6);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO3 = cwl1.o0(x340Var13, 2131952812);
                uwr uwrVar9 = cbx.a;
                lee1 lee1Var3 = cbx.d(x340Var13).h;
                long j3 = cbx.a(x340Var13).b.a;
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                cvx cvxVar5 = cbx.b(x340Var13).b;
                qim0 qim0VarB = uyn1.B(qim0VarF4, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                x340 x340Var14 = x340Var13;
                Object objT = x340Var14.T();
                Object obj4 = objT;
                if (objT == fkj0.X) {
                    ovh ovhVar = ovh.W0;
                    x340Var14.s0(ovhVar);
                    obj4 = ovhVar;
                }
                uwo1.e(strO3, anm1.N("connector-apps-connected-header", s161.b(qim0VarB, false, (iu30) obj4)), lee1Var3, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2032);
                return rih1Var;
            case 16:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var15.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    vu30Var.invoke(x340Var16, Integer.valueOf(iIntValue4 & 14));
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 17:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var17.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    xpn1.g(vu30Var2, x340Var18, iIntValue5 & 14);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 18:
                vu30 vu30Var3 = (vu30) obj;
                x340 x340Var19 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var19.i(vu30Var3) ? 4 : 2;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    vu30Var3.invoke(x340Var20, Integer.valueOf(iIntValue6 & 14));
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var21 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                uwr uwrVar10 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var21).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF5);
                gfh0 gfh0VarC4 = t1c.c(een.h, false);
                x340 x340Var22 = x340Var21;
                int iHashCode4 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM4 = x340Var22.m();
                qim0 qim0VarE4 = zr7.E(x340Var21, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var23 = x340Var21;
                if (x340Var23.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                nko1.H(gfh0VarC4, x340Var21, y580.O0);
                nko1.H(xos0VarM4, x340Var21, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var21, y580.R0);
                nko1.F(x340Var21);
                nko1.H(qim0VarE4, x340Var21, y580.Y);
                xto1.e((qim0) null, 0, 0L, 0L, x340Var21, 0, 15);
                x340Var23.r(true);
                return rih1Var;
            case 20:
                ((Number) obj3).intValue();
                return rih1Var;
            case 21:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    d7e.g(0, 1, x340Var25, (qim0) null);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    d7e.g(0, 1, x340Var27, (qim0) null);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (!x340Var29.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x340Var29.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var30 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var31 = x340Var30;
                if (!x340Var31.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x340Var31.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO4 = cwl1.o0(b0kVar7, 2131954569);
                uwr uwrVar11 = cbx.a;
                uwo1.e(strO4, (qim0) null, cbx.d(b0kVar7).g, cbx.a(b0kVar7).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar7, 0, 0, 2034);
                return rih1Var;
            case 26:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                csx csxVar = csx.c;
                uwr uwrVar12 = cbx.a;
                w0h1.a(csxVar, isl.a, (qim0) null, cbx.a(b0kVar8).b.a, 0L, false, b0kVar8, csx.d | 48, 52);
                return rih1Var;
            case 27:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                xmx xmxVar = xmx.c;
                uwr uwrVar13 = cbx.a;
                w0h1.a(xmxVar, isl.a, (qim0) null, cbx.a(b0kVar9).b.a, 0L, false, b0kVar9, xmx.d | 48, 52);
                return rih1Var;
            case 28:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO5 = cwl1.o0(b0kVar10, 2131954561);
                uwr uwrVar14 = cbx.a;
                uwo1.e(strO5, (qim0) null, cbx.d(b0kVar10).g, cbx.a(b0kVar10).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar10, 0, 0, 2034);
                return rih1Var;
            default:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO6 = cwl1.o0(b0kVar11, 2131954559);
                uwr uwrVar15 = cbx.a;
                uwo1.e(strO6, (qim0) null, cbx.d(b0kVar11).g, cbx.a(b0kVar11).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar11, 0, 0, 2034);
                return rih1Var;
        }
    }
}
