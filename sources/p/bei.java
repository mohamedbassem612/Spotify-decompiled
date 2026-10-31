package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bei extends hab0 implements vu30 {
    public static final bei N0;
    public static final bei O0;
    public static final bei P0;
    public static final bei Q0;
    public static final bei R0;
    public static final bei S0;
    public static final bei T0;
    public static final bei U0;
    public static final bei V0;
    public static final bei W0;
    public static final bei X;
    public static final bei X0;
    public static final bei Y;
    public static final bei Y0;
    public static final bei Z;
    public static final bei Z0;
    public static final bei a1;
    public static final bei b;
    public static final bei b1;
    public static final bei c;
    public static final bei c1;
    public static final bei d;
    public static final bei d1;
    public static final bei e;
    public static final bei e1;
    public static final bei f;
    public static final bei g;
    public static final bei h;
    public static final bei i;
    public static final bei t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new bei(i2, (byte) 0);
        c = new bei(i2, (byte) 1);
        d = new bei(i2, (byte) 2);
        e = new bei(i2, (byte) 3);
        f = new bei(i2, (byte) 4);
        g = new bei(i2, (byte) 5);
        h = new bei(i2, (byte) 6);
        i = new bei(i2, (byte) 7);
        t = new bei(i2, (byte) 8);
        X = new bei(i2, (byte) 9);
        Y = new bei(i2, (byte) 10);
        Z = new bei(i2, (byte) 11);
        N0 = new bei(i2, (byte) 12);
        O0 = new bei(i2, (byte) 13);
        P0 = new bei(i2, (byte) 14);
        Q0 = new bei(i2, (byte) 15);
        R0 = new bei(i2, (byte) 16);
        S0 = new bei(i2, (byte) 17);
        T0 = new bei(i2, (byte) 18);
        U0 = new bei(i2, (byte) 19);
        V0 = new bei(i2, (byte) 20);
        W0 = new bei(i2, (byte) 21);
        X0 = new bei(i2, (byte) 22);
        Y0 = new bei(i2, (byte) 23);
        Z0 = new bei(i2, (byte) 24);
        a1 = new bei(i2, (byte) 25);
        b1 = new bei(i2, (byte) 26);
        c1 = new bei(i2, (byte) 27);
        d1 = new bei(i2, (byte) 28);
        e1 = new bei(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bei(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vno1.c(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    klx klxVar = klx.c;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    w0h1.a(klxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var4, klx.d | 48, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fsx fsxVar = fsx.c;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var6).g;
                    w0h1.a(fsxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var6, fsx.d | 48, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dnx dnxVar = dnx.c;
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var8).g;
                    w0h1.a(dnxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var8, dnx.d | 48, 56);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var10, 2131953435), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2046);
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
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    gpx gpxVar = gpx.c;
                    uwr uwrVar4 = cbx.a;
                    w0h1.a(gpxVar, isl.a, (qim0) null, cbx.a(x340Var14).b.a, 0L, false, x340Var14, gpx.d | 48, 52);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    w0h1.a(bnx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var16, bnx.d | 48, 60);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var18, 2131961278);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var18).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 0, 0, 2042);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fsx fsxVar2 = fsx.c;
                    uwr uwrVar6 = cbx.a;
                    w0h1.a(fsxVar2, isl.a, (qim0) null, cbx.a(x340Var20).b.a, 0L, false, x340Var20, fsx.d | 48, 52);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (!x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                boolean zY = x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2);
                j06 j06Var = x340Var24.a;
                if (zY) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var24, 0);
                    int iHashCode = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM = x340Var24.m();
                    qim0 qim0VarE = zr7.E(x340Var24, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var24, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var24, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var24, lljVar3);
                    nko1.F(x340Var24);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var24, lljVar4);
                    uwr uwrVar7 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var24).b;
                    mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var24, 0);
                    int iHashCode2 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM2 = x340Var24.m();
                    qim0 qim0VarE2 = zr7.E(x340Var24, nim0Var);
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(mbhVarA, x340Var24, lljVar);
                    nko1.H(xos0VarM2, x340Var24, lljVar2);
                    x0d.q(iHashCode2, x340Var24, lljVar3, x340Var24);
                    nko1.H(qim0VarE2, x340Var24, lljVar4);
                    sbl.s(90.0f, 12.0f, (qim0) null, (cr31) null, x340Var24, 0, 12);
                    sbl.s(70.0f, 14.0f, (qim0) null, (cr31) null, x340Var24, 0, 12);
                    x340Var24.r(true);
                    sbl.s(100.0f, 32.0f, (qim0) null, er31.b(16.0f), x340Var24, 0, 4);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                boolean zY2 = x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2);
                j06 j06Var2 = x340Var26.a;
                if (zY2) {
                    sbl.s(100.0f, 14.0f, (qim0) null, (cr31) null, x340Var26, 0, 12);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    fra fraVar = een.N0;
                    uwr uwrVar8 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var26).b;
                    jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var26, 0);
                    int iHashCode3 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM3 = x340Var26.m();
                    qim0 qim0VarE3 = zr7.E(x340Var26, qim0VarF2);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(jw31VarA2, x340Var26, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM3, x340Var26, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, x340Var26, lljVar7);
                    nko1.F(x340Var26);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE3, x340Var26, lljVar8);
                    float f2 = rck.b;
                    sbl.t((qim0) null, x340Var26, 6);
                    cvx cvxVar3 = cbx.b(x340Var26).b;
                    mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var26, 0);
                    int iHashCode4 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM4 = x340Var26.m();
                    qim0 qim0VarE4 = zr7.E(x340Var26, nim0Var);
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(mbhVarA2, x340Var26, lljVar5);
                    nko1.H(xos0VarM4, x340Var26, lljVar6);
                    x0d.q(iHashCode4, x340Var26, lljVar7, x340Var26);
                    nko1.H(qim0VarE4, x340Var26, lljVar8);
                    sbl.s(160.0f, 20.0f, (qim0) null, (cr31) null, x340Var26, 0, 12);
                    sbl.s(120.0f, 14.0f, (qim0) null, (cr31) null, x340Var26, 0, 12);
                    x340Var26.r(true);
                    x340Var26.r(true);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    m6p1.c(0, 1, x340Var28, (qim0) null);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    m6p1.c(0, 1, x340Var30, (qim0) null);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    m6p1.c(0, 1, x340Var32, (qim0) null);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    m6p1.c(0, 1, x340Var34, (qim0) null);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    w0h1.a(fpx.c, isl.a, (qim0) null, u7h.f, 0L, false, x340Var36, fpx.d | 48, 52);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    w0h1.a(jkx.c, isl.a, (qim0) null, u7h.b, 0L, false, x340Var38, jkx.d | 48, 52);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var40, 2131963450), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var40, 0, 0, 2046);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var42, 2131963448), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var42, 0, 0, 2046);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var44, 2131963449), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var44, 0, 0, 2046);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var46, 2131963451), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var46, 0, 0, 2046);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarY = too1.y(qim0VarD, lhc.g(x340Var48).e);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode5 = Long.hashCode(x340Var48.T);
                    xos0 xos0VarM5 = x340Var48.m();
                    qim0 qim0VarE5 = zr7.E(x340Var48, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var48.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var48.m0();
                    if (x340Var48.S) {
                        x340Var48.l(n4kVar);
                    } else {
                        x340Var48.v0();
                    }
                    nko1.H(gfh0VarC, x340Var48, y580.O0);
                    nko1.H(xos0VarM5, x340Var48, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var48, y580.R0);
                    nko1.F(x340Var48);
                    nko1.H(qim0VarE5, x340Var48, y580.Y);
                    xto1.e((qim0) null, 6, 0L, 0L, x340Var48, 48, 13);
                    x340Var48.r(true);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var49 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (x340Var50.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    xrx xrxVar = xrx.c;
                    uwr uwrVar9 = cbx.a;
                    w0h1.a(xrxVar, isl.a, (qim0) null, cbx.a(x340Var50).b.a, 0L, false, x340Var50, xrx.d | 48, 52);
                } else {
                    x340Var50.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var51 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (x340Var52.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var52, 2131952781);
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(strO1, (qim0) null, cbx.d(x340Var52).k, cbx.a(x340Var52).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var52, 0, 0, 2034);
                } else {
                    x340Var52.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var53 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    dmx dmxVar = dmx.c;
                    uwr uwrVar11 = cbx.a;
                    w0h1.a(dmxVar, isl.a, (qim0) null, cbx.a(x340Var54).b.a, 0L, false, x340Var54, dmx.d | 48, 52);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var55 = (b0k) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                x340 x340Var56 = x340Var55;
                if (x340Var56.Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    xox xoxVar = xox.c;
                    uwr uwrVar12 = cbx.a;
                    w0h1.a(xoxVar, isl.a, (qim0) null, cbx.a(x340Var56).b.a, 0L, false, x340Var56, xox.d | 48, 52);
                } else {
                    x340Var56.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var57 = (b0k) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                x340 x340Var58 = x340Var57;
                if (x340Var58.Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    uwr uwrVar13 = cbx.a;
                    uwo1.e(cwl1.o0(x340Var58, 2131954215), (qim0) null, cbx.d(x340Var58).g, cbx.a(x340Var58).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var58, 0, 0, 2018);
                } else {
                    x340Var58.b0();
                }
                return rih1Var;
            default:
                x340 x340Var59 = (b0k) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                x340 x340Var60 = x340Var59;
                if (x340Var60.Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var60, 2131954216), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var60, 0, 0, 2046);
                } else {
                    x340Var60.b0();
                }
                return rih1Var;
        }
    }
}
