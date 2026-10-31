package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oij extends hab0 implements vu30 {
    public static final oij N0;
    public static final oij O0;
    public static final oij P0;
    public static final oij Q0;
    public static final oij R0;
    public static final oij S0;
    public static final oij T0;
    public static final oij U0;
    public static final oij V0;
    public static final oij W0;
    public static final oij X;
    public static final oij X0;
    public static final oij Y;
    public static final oij Y0;
    public static final oij Z;
    public static final oij Z0;
    public static final oij a1;
    public static final oij b;
    public static final oij b1;
    public static final oij c;
    public static final oij c1;
    public static final oij d;
    public static final oij d1;
    public static final oij e;
    public static final oij e1;
    public static final oij f;
    public static final oij g;
    public static final oij h;
    public static final oij i;
    public static final oij t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new oij(i2, (byte) 0);
        c = new oij(i2, (byte) 1);
        d = new oij(i2, (byte) 2);
        e = new oij(i2, (byte) 3);
        f = new oij(i2, (byte) 4);
        g = new oij(i2, (byte) 5);
        h = new oij(i2, (byte) 6);
        i = new oij(i2, (byte) 7);
        t = new oij(i2, (byte) 8);
        X = new oij(i2, (byte) 9);
        Y = new oij(i2, (byte) 10);
        Z = new oij(i2, (byte) 11);
        N0 = new oij(i2, (byte) 12);
        O0 = new oij(i2, (byte) 13);
        P0 = new oij(i2, (byte) 14);
        Q0 = new oij(i2, (byte) 15);
        R0 = new oij(i2, (byte) 16);
        S0 = new oij(i2, (byte) 17);
        T0 = new oij(i2, (byte) 18);
        U0 = new oij(i2, (byte) 19);
        V0 = new oij(i2, (byte) 20);
        W0 = new oij(i2, (byte) 21);
        X0 = new oij(i2, (byte) 22);
        Y0 = new oij(i2, (byte) 23);
        Z0 = new oij(i2, (byte) 24);
        a1 = new oij(i2, (byte) 25);
        b1 = new oij(i2, (byte) 26);
        c1 = new oij(i2, (byte) 27);
        d1 = new oij(i2, (byte) 28);
        e1 = new oij(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oij(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        long jC;
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
                    uwo1.e(cwl1.o0(x340Var2, 2131962562), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ybx0.N0.c(x340Var4, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ybx0.N0.c(x340Var6, 6);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var8, 2131962572);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var8).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2042);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    o4p1.g(((Context) x340Var10.k(p4k.b)).getString(2131954793), (gt40) null, oee1.a, 0, x340Var10, 0, 10);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objT = x340Var12.T();
                    if (objT == fkj0.X) {
                        objT = oqi.e1;
                        x340Var12.s0(objT);
                    }
                    cxm.g(iko1.x(et40.a, (iu30) objT), 29.0f, 4.0f, 0, x340Var12, 432, 8);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var14, 2131962574);
                    boolean zG = x340Var14.g(strO1);
                    Object objT2 = x340Var14.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new irf(strO1, (byte) 27);
                        x340Var14.s0(objT2);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT2);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarA);
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
                    nko1.H(gfh0VarC, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    Object objT3 = x340Var14.T();
                    if (objT3 == m4cVar) {
                        objT3 = cjj.b;
                        x340Var14.s0(objT3);
                    }
                    poo1.g(true, (iu30) objT3, new nex(4), yoo1.z(x340Var14), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(2084244419, new pji(strO1, (byte) 11), x340Var14), x340Var14, 54, 196608, 32752);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var16, 2131959815), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dpx dpxVar = dpx.c;
                    uwr uwrVar2 = cbx.a;
                    w0h1.a(dpxVar, isl.a, anm1.N("SNOOZE_RECOMMENDATIONS_BUTTON_ELEMENT_ICON_TEST_TAG", nim0Var), cbx.a(x340Var18).b.b, 0L, false, x340Var18, dpx.d | 48, 48);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(cwl1.o0(x340Var20, 2131954004), u291.B(nim0Var, (gra) null, 3), cbx.d(x340Var20).k, cbx.a(x340Var20).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2016);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String strO2 = cwl1.o0(x340Var22, 2131962705);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(strO2, (qim0) null, cbx.d(x340Var22).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2042);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var24, 2131962691), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var24, 12582912, 0, 1662);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var26).g;
                    w0h1.a(osx.c, isl.a, u291.r(nim0Var, 24.0f), u7h.k, 0L, false, x340Var26, osx.d | 196656, 16);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    w0h1.a(osx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var28, osx.d | 48, 60);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    c680.q((qim0) null, (vzq0) null, x340Var30, 0, 3);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    w0h1.a(esx.c, new jsl(cwl1.o0(x340Var32, 2131962737)), (qim0) null, 0L, 0L, false, x340Var32, esx.d, 60);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar6 = cbx.a;
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var34).b.a, 0.0f, 2, qim0VarF);
                    era eraVar = een.Q0;
                    cvx cvxVar = cbx.b(x340Var34).b;
                    mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var34, 0);
                    int iHashCode2 = Long.hashCode(x340Var34.T);
                    xos0 xos0VarM2 = x340Var34.m();
                    qim0 qim0VarE2 = zr7.E(x340Var34, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var34.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var34.m0();
                    if (x340Var34.S) {
                        x340Var34.l(n4kVar);
                    } else {
                        x340Var34.v0();
                    }
                    nko1.H(mbhVarA, x340Var34, y580.O0);
                    nko1.H(xos0VarM2, x340Var34, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var34, y580.R0);
                    nko1.F(x340Var34);
                    nko1.H(qim0VarE2, x340Var34, y580.Y);
                    String strO3 = cwl1.o0(x340Var34, 2131962749);
                    lee1 lee1Var = cbx.d(x340Var34).h;
                    long j = cbx.a(x340Var34).b.a;
                    a0e1 a0e1Var = new a0e1(3);
                    bjc0 bjc0Var = bjc0.a;
                    uwo1.e(strO3, (qim0) null, lee1Var, j, a0e1Var, (iu30) null, 0, false, bjc0Var, 0, (qx8) null, x340Var34, 0, 0, 1762);
                    uwo1.e(cwl1.o0(x340Var34, 2131962748), (qim0) null, cbx.d(x340Var34).g, cbx.a(x340Var34).b.b, new a0e1(3), (iu30) null, 0, false, bjc0Var, 0, (qx8) null, x340Var34, 0, 0, 1762);
                    x340Var34.r(true);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    esx esxVar = esx.c;
                    uwr uwrVar7 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var36).g;
                    w0h1.a(esxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var36).b.a, 0L, false, x340Var36, esx.d | 48, 48);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    fux fuxVar = fux.c;
                    uwr uwrVar8 = cbx.a;
                    w0h1.a(fuxVar, new jsl(cwl1.o0(x340Var38, 2131962744)), (qim0) null, cbx.a(x340Var38).b.b, 0L, false, x340Var38, fux.d, 52);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    olx olxVar = olx.c;
                    uwr uwrVar9 = cbx.a;
                    w0h1.a(olxVar, new jsl(cwl1.o0(x340Var40, 2131962736)), (qim0) null, cbx.a(x340Var40).b.a, 0L, false, x340Var40, olx.d, 52);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    rqt0.l(0, 6, cwl1.o0(x340Var42, 2131962750), (Function0) null, x340Var42, (qim0) null);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    y7y0.i((String) null, x340Var44, 6);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    w0h1.a(fsx.c, new jsl(cwl1.o0(x340Var46, 2131962761)), (qim0) null, 0L, 0L, false, x340Var46, fsx.d, 60);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var48, 2131962768), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var48, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var49 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (x340Var50.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    s1q0 s1q0VarA = vfe0.a(x340Var50);
                    r1q0 r1q0VarJ = s1q0VarA != null ? s1q0VarA.J() : null;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar10 = cbx.a;
                    qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var50).e.b, 0.0f, 2, qim0VarF2);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var50).g, 32, qim0VarZ2);
                    era eraVar2 = een.Q0;
                    cvx cvxVar2 = cbx.b(x340Var50).b;
                    mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar2, x340Var50, 0);
                    int iHashCode3 = Long.hashCode(x340Var50.T);
                    xos0 xos0VarM3 = x340Var50.m();
                    qim0 qim0VarE3 = zr7.E(x340Var50, qim0VarP);
                    hzj.A.getClass();
                    if (x340Var50.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var50.m0();
                    if (x340Var50.S) {
                        x340Var50.l(n4kVar);
                    } else {
                        x340Var50.v0();
                    }
                    nko1.H(mbhVarA2, x340Var50, y580.O0);
                    nko1.H(xos0VarM3, x340Var50, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var50, y580.R0);
                    nko1.F(x340Var50);
                    nko1.H(qim0VarE3, x340Var50, y580.Y);
                    c680.q((qim0) null, (vzq0) null, x340Var50, 0, 3);
                    uwo1.e(cwl1.o0(x340Var50, 2131962770), (qim0) null, cbx.d(x340Var50).c, cbx.a(x340Var50).b.c, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var50, 0, 0, 2018);
                    uwo1.e(cwl1.o0(x340Var50, 2131962769), (qim0) null, cbx.d(x340Var50).j, cbx.a(x340Var50).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var50, 0, 0, 2018);
                    boolean zI = x340Var50.i(r1q0VarJ);
                    Object objT4 = x340Var50.T();
                    if (zI || objT4 == fkj0.X) {
                        objT4 = new ckj(r1q0VarJ, (byte) 0);
                        x340Var50.s0(objT4);
                    }
                    foo1.c(new gbx(z50.c, (Function0) objT4), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dkj.a, x340Var50, 0, 48, 2044);
                    x340Var50.r(true);
                } else {
                    x340Var50.b0();
                }
                return rih1Var;
            case 25:
                yxx yxxVar = ((afx) obj).b;
                long j2 = yxxVar.a;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        j2 = yxxVar.b;
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(j2);
            case 26:
                ixx ixxVar = ((afx) obj).a.b;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    jC = ixxVar.c();
                } else if (iOrdinal2 == 1) {
                    jC = ixxVar.b();
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    jC = ixxVar.a();
                }
                return new u7h(jC);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                x340 x340Var51 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (x340Var52.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    uwr uwrVar11 = cbx.a;
                    uwo1.e(cwl1.o0(x340Var52, 2131955159), (qim0) null, cbx.d(x340Var52).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var52, 0, 0, 2042);
                } else {
                    x340Var52.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var53 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var54, 2131957320), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var54, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
            default:
                x340 x340Var55 = (b0k) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                x340 x340Var56 = x340Var55;
                if (x340Var56.Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    w0h1.a(rsx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var56, rsx.d | 48, 60);
                } else {
                    x340Var56.b0();
                }
                return rih1Var;
        }
    }
}
