package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fgi extends hab0 implements xu30 {
    public static final fgi N0;
    public static final fgi O0;
    public static final fgi P0;
    public static final fgi Q0;
    public static final fgi R0;
    public static final fgi S0;
    public static final fgi T0;
    public static final fgi U0;
    public static final fgi V0;
    public static final fgi W0;
    public static final fgi X;
    public static final fgi X0;
    public static final fgi Y;
    public static final fgi Y0;
    public static final fgi Z;
    public static final fgi Z0;
    public static final fgi a1;
    public static final fgi b;
    public static final fgi b1;
    public static final fgi c;
    public static final fgi c1;
    public static final fgi d;
    public static final fgi d1;
    public static final fgi e;
    public static final fgi e1;
    public static final fgi f;
    public static final fgi g;
    public static final fgi h;
    public static final fgi i;
    public static final fgi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new fgi(i2, (byte) 0);
        c = new fgi(i2, (byte) 1);
        d = new fgi(i2, (byte) 2);
        e = new fgi(i2, (byte) 3);
        f = new fgi(i2, (byte) 4);
        g = new fgi(i2, (byte) 5);
        h = new fgi(i2, (byte) 6);
        i = new fgi(i2, (byte) 7);
        t = new fgi(i2, (byte) 8);
        X = new fgi(i2, (byte) 9);
        Y = new fgi(i2, (byte) 10);
        Z = new fgi(i2, (byte) 11);
        N0 = new fgi(i2, (byte) 12);
        O0 = new fgi(i2, (byte) 13);
        P0 = new fgi(i2, (byte) 14);
        Q0 = new fgi(i2, (byte) 15);
        R0 = new fgi(i2, (byte) 16);
        S0 = new fgi(i2, (byte) 17);
        T0 = new fgi(i2, (byte) 18);
        U0 = new fgi(i2, (byte) 19);
        V0 = new fgi(i2, (byte) 20);
        W0 = new fgi(i2, (byte) 21);
        X0 = new fgi(i2, (byte) 22);
        Y0 = new fgi(i2, (byte) 23);
        Z0 = new fgi(i2, (byte) 24);
        a1 = new fgi(i2, (byte) 25);
        b1 = new fgi(i2, (byte) 26);
        c1 = new fgi(i2, (byte) 27);
        d1 = new fgi(i2, (byte) 28);
        e1 = new fgi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                bpx bpxVar = bpx.c;
                uwr uwrVar = cbx.a;
                w0h1.a(bpxVar, isl.a, (qim0) null, cbx.a(b0kVar).b.a, 0L, false, b0kVar, bpx.d | 48, 52);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dym.b(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else if (zBooleanValue) {
                    x340Var4.i0(-593291078);
                    nyx.a(2, (wux) null, tgi.a, x340Var4, 3078, 6);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-592930703);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strO0 = cwl1.o0(x340Var6, 2131953776);
                    uwr uwrVar2 = cbx.a;
                    long j = cbx.a(x340Var6).b.a;
                    lee1 lee1Var = cbx.d(x340Var6).e;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    uwo1.e(strO0, uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5), lee1Var, j, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2016);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                cr31 cr31Var = er31.a;
                ogx ogxVar = ogx.e;
                gra graVar = een.h;
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                cwl1.b((qim0) null, graVar, cr31Var, ogxVar, new zzq0(12.0f, 12.0f, 12.0f, 12.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, vgi.a, b0kVar2, 0, 48, 2017);
                return rih1Var;
            case 5:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                rnx rnxVar = rnx.c;
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                w0h1.a(rnxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar3).b.a, 0L, false, b0kVar3, rnx.d | 48, 48);
                return rih1Var;
            case 6:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar4, 2131959381);
                uwr uwrVar5 = cbx.a;
                uwo1.e(strO1, (qim0) null, cbx.d(b0kVar4).g, cbx.a(b0kVar4).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2034);
                return rih1Var;
            case 7:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO2 = cwl1.o0(b0kVar5, 2131952231);
                cjc0 cjc0Var = new cjc0(1);
                uwr uwrVar6 = cbx.a;
                uwo1.e(strO2, u291.f(nim0Var, 1.0f), (lee1) null, cbx.a(b0kVar5).b.a, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar5, 0, 0, 1716);
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar7 = cbx.a;
                long jC = cbx.a(x340Var7).a.a.c();
                cua cuaVar = cbx.b(x340Var7).f;
                qim0 qim0VarF = dug.f(qim0VarD, jC, er31.b(4.0f));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var8 = x340Var7;
                int iHashCode = Long.hashCode(x340Var8.T);
                xos0 xos0VarM = x340Var8.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarF);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                w0h1.a(hrx.c, isl.a, anm1.N("CreatePlaylistElementMediaTestTag", h2c.a.a(nim0Var, een.h)), cbx.a(x340Var7).b.b, 0L, false, x340Var7, hrx.d | 48, 48);
                x340Var9.r(true);
                return rih1Var;
            case 9:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO3 = cwl1.o0(b0kVar6, 2131954722);
                uwr uwrVar8 = cbx.a;
                lee1 lee1Var2 = cbx.d(b0kVar6).e;
                cvx cvxVar5 = cbx.b(b0kVar6).b;
                uwo1.e(strO3, uyn1.x(nim0Var, 16.0f), lee1Var2, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar6, 0, 0, 1720);
                return rih1Var;
            case 10:
                x340 x340Var10 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    era eraVar = een.Q0;
                    uwr uwrVar9 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var11).b;
                    mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var11, 48);
                    int iHashCode2 = Long.hashCode(x340Var11.T);
                    xos0 xos0VarM2 = x340Var11.m();
                    qim0 qim0VarE2 = zr7.E(x340Var11, nim0Var);
                    hzj.A.getClass();
                    if (x340Var11.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var11.m0();
                    if (x340Var11.S) {
                        x340Var11.l(n4kVar);
                    } else {
                        x340Var11.v0();
                    }
                    nko1.H(mbhVarA, x340Var11, y580.O0);
                    nko1.H(xos0VarM2, x340Var11, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var11, y580.R0);
                    nko1.F(x340Var11);
                    nko1.H(qim0VarE2, x340Var11, y580.Y);
                    tmx tmxVar = tmx.c;
                    zov0 zov0Var2 = cbx.b(x340Var11).g;
                    qim0 qim0VarV = u291.v(nim0Var, 24.0f);
                    zov0 zov0Var3 = cbx.b(x340Var11).g;
                    w0h1.a(tmxVar, isl.a, u291.h(qim0VarV, 24.0f), cbx.a(x340Var11).b.a, 0L, false, x340Var11, tmx.d | 48, 48);
                    uwo1.e("Install on device", (qim0) null, cbx.d(x340Var11).m, cbx.a(x340Var11).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var11, 1572870, 0, 1714);
                    x340Var11.r(true);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 11:
                long j2 = ((Offset) obj2).a;
                long j3 = ((u7h) obj3).a;
                return rih1Var;
            case 12:
                tb91 tb91Var = (tb91) obj;
                x340 x340Var12 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? x340Var12.g(tb91Var) : x340Var12.i(tb91Var) ? 4 : 2;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    lb91 lb91Var = lb91.a;
                    int i2 = iIntValue5;
                    qim0 qim0VarH = u291.h(nim0Var, 4.0f);
                    fb91 fb91VarT = fuo1.t(x340Var13);
                    Object objT = x340Var13.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = zgi.e;
                        x340Var13.s0(objT);
                    }
                    vu30 vu30Var = (vu30) objT;
                    Object objT2 = x340Var13.T();
                    if (objT2 == m4cVar) {
                        objT2 = Z;
                        x340Var13.s0(objT2);
                    }
                    lb91Var.b(tb91Var, qim0VarH, false, fb91VarT, vu30Var, (xu30) objT2, 0.0f, 0.0f, x340Var13, 221192 | (i2 & 14), 132);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ilx ilxVar = ilx.c;
                    uwr uwrVar10 = cbx.a;
                    zov0 zov0Var4 = cbx.b(x340Var15).g;
                    w0h1.a(ilxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var15).c.c, 0L, false, x340Var15, ilx.d | 48, 48);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    cvx cvxVar7 = cbx.b(x340Var17).b;
                    op71.g(x340Var17, u291.h(nim0Var, 8.0f));
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.g, false);
                    int iHashCode3 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM3 = x340Var19.m();
                    qim0 qim0VarE3 = zr7.E(x340Var19, qim0VarD2);
                    hzj.A.getClass();
                    if (x340Var19.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(n4kVar);
                    } else {
                        x340Var19.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var19, y580.O0);
                    nko1.H(xos0VarM3, x340Var19, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var19, y580.R0);
                    nko1.F(x340Var19);
                    nko1.H(qim0VarE3, x340Var19, y580.Y);
                    k1u.a((qim0) null, 2, 0, (Function0) null, x340Var19, 48, 13);
                    x340Var19.r(true);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj3).intValue();
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                gfx.b(6, apo.r(1472829374, new l8i((xr91) obj, (byte) 7), b0kVar7), b0kVar7, 54);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                itu.b((b0k) obj2, 0);
                return rih1Var;
            case 20:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar11 = cbx.a;
                long jC2 = cbx.a(b0kVar8).a.b.c();
                qim0 qim0VarN = anm1.N("dsl_curated_divider", nim0Var);
                cvx cvxVar8 = cbx.b(b0kVar8).b;
                hr80.d(uyn1.z(0.0f, 4.0f, 1, qim0VarN), 0.5f, jC2, b0kVar8, 0, 0);
                return rih1Var;
            case 21:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar12 = cbx.a;
                uwo1.e(cwl1.o0(b0kVar9, 2131955159), (qim0) null, cbx.d(b0kVar9).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar9, 0, 0, 2042);
                return rih1Var;
            case 22:
                x340 x340Var20 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    w0h1.a(xmx.c, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var21, xmx.d | 432, 56);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var22 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    xmx xmxVar = xmx.c;
                    uwr uwrVar13 = cbx.a;
                    zov0 zov0Var5 = cbx.b(x340Var23).g;
                    w0h1.a(xmxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var23, xmx.d | 48, 56);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    String strO4 = cwl1.o0(x340Var25, 2131955191);
                    uwr uwrVar14 = cbx.a;
                    uwo1.e(strO4, (qim0) null, cbx.d(x340Var25).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var25, 0, 0, 2042);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 25:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar = plx.c;
                uwr uwrVar15 = cbx.a;
                zov0 zov0Var6 = cbx.b(b0kVar10).g;
                w0h1.a(plxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar10, plx.d | 48, 56);
                return rih1Var;
            case 26:
                String str = (String) obj;
                x340 x340Var26 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= x340Var26.g(str) ? 4 : 2;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    uwo1.e(str, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var27, iIntValue12 & 14, 0, 2046);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 27:
                zgx zgxVar = (zgx) obj;
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                foo1.c(zgxVar.b, ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1998752708, new pji(zgxVar.a, (byte) 1), b0kVar11), b0kVar11, 0, 48, 2044);
                return rih1Var;
            case 28:
                String str2 = (String) obj;
                x340 x340Var28 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= x340Var28.g(str2) ? 4 : 2;
                }
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    uwo1.e(str2, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var29, iIntValue13 & 14, 0, 2046);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            default:
                zgx zgxVar2 = (zgx) obj;
                b0k b0kVar12 = (b0k) obj2;
                ((Number) obj3).intValue();
                foo1.c(zgxVar2.b, new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1419986563, new pji(zgxVar2.a, (byte) 2), b0kVar12), b0kVar12, 0, 48, 2044);
                return rih1Var;
        }
    }
}
