package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tyi extends hab0 implements xu30 {
    public static final tyi N0;
    public static final tyi O0;
    public static final tyi P0;
    public static final tyi Q0;
    public static final tyi R0;
    public static final tyi S0;
    public static final tyi T0;
    public static final tyi U0;
    public static final tyi V0;
    public static final tyi W0;
    public static final tyi X;
    public static final tyi X0;
    public static final tyi Y;
    public static final tyi Y0;
    public static final tyi Z;
    public static final tyi Z0;
    public static final tyi a1;
    public static final tyi b;
    public static final tyi b1;
    public static final tyi c;
    public static final tyi c1;
    public static final tyi d;
    public static final tyi d1;
    public static final tyi e;
    public static final tyi e1;
    public static final tyi f;
    public static final tyi g;
    public static final tyi h;
    public static final tyi i;
    public static final tyi t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new tyi(i2, (byte) 0);
        c = new tyi(i2, (byte) 1);
        d = new tyi(i2, (byte) 2);
        e = new tyi(i2, (byte) 3);
        f = new tyi(i2, (byte) 4);
        g = new tyi(i2, (byte) 5);
        h = new tyi(i2, (byte) 6);
        i = new tyi(i2, (byte) 7);
        t = new tyi(i2, (byte) 8);
        X = new tyi(i2, (byte) 9);
        Y = new tyi(i2, (byte) 10);
        Z = new tyi(i2, (byte) 11);
        N0 = new tyi(i2, (byte) 12);
        O0 = new tyi(i2, (byte) 13);
        P0 = new tyi(i2, (byte) 14);
        Q0 = new tyi(i2, (byte) 15);
        R0 = new tyi(i2, (byte) 16);
        S0 = new tyi(i2, (byte) 17);
        T0 = new tyi(i2, (byte) 18);
        U0 = new tyi(i2, (byte) 19);
        V0 = new tyi(i2, (byte) 20);
        W0 = new tyi(i2, (byte) 21);
        X0 = new tyi(i2, (byte) 22);
        Y0 = new tyi(i2, (byte) 23);
        Z0 = new tyi(i2, (byte) 24);
        a1 = new tyi(i2, (byte) 25);
        b1 = new tyi(i2, (byte) 26);
        c1 = new tyi(i2, (byte) 27);
        d1 = new tyi(i2, (byte) 28);
        e1 = new tyi(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyi(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        String strK;
        String strK2;
        String strK3;
        byte b2 = this.a;
        gex0 gex0Var = h36.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    plx plxVar = plx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(plxVar, isl.a, (qim0) null, cbx.a(x340Var2).c.b, 0L, false, x340Var2, plx.d | 48, 52);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    gra graVar = een.g;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    mta mtaVar = cbx.b(x340Var4).d;
                    qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarJ);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarZ);
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
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    String strO0 = cwl1.o0(x340Var4, 2131952315);
                    lee1 lee1Var = cbx.d(x340Var4).e;
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = oqi.h;
                        x340Var4.s0(objT);
                    }
                    uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2040);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    rqo1.g(0, 0, x340Var6, uyn1.z(0.0f, 16.0f, 1, nim0Var));
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    t890.e((qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    t890.e((qim0) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var12).b;
                    rqo1.g(0, 0, x340Var12, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var14).b;
                    rqo1.g(0, 0, x340Var14, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    uwr uwrVar6 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var16).b;
                    rqo1.g(0, 0, x340Var16, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    uwr uwrVar7 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var18).b;
                    cvx cvxVar7 = cbx.b(x340Var18).b;
                    cvx cvxVar8 = cbx.b(x340Var18).b;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var2, 16.0f, 0.0f, 16.0f, 8.0f, 2);
                    jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var18, 48);
                    int iHashCode2 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM2 = x340Var18.m();
                    qim0 qim0VarE2 = zr7.E(x340Var18, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(jw31VarA, x340Var18, y580.O0);
                    nko1.H(xos0VarM2, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE2, x340Var18, y580.Y);
                    eox eoxVar = eox.c;
                    long j = cbx.a(x340Var18).b.a;
                    cvx cvxVar9 = cbx.b(x340Var18).b;
                    qim0 qim0VarB2 = uyn1.B(nim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    zov0 zov0Var = cbx.b(x340Var18).g;
                    w0h1.a(eoxVar, isl.a, u291.r(qim0VarB2, 16.0f), j, 0L, false, x340Var18, eox.d | 48, 48);
                    uwo1.e(cwl1.o0(x340Var18, 2131958128), (qim0) null, cbx.d(x340Var18).j, cbx.a(x340Var18).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var18, 0, 0, 2034);
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    uwr uwrVar8 = cbx.a;
                    cvx cvxVar10 = cbx.b(x340Var20).b;
                    rqo1.g(0, 0, x340Var20, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    uwr uwrVar9 = cbx.a;
                    cvx cvxVar11 = cbx.b(x340Var22).b;
                    rqo1.g(0, 0, x340Var22, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar10 = cbx.a;
                cvx cvxVar12 = cbx.b(x340Var23).b;
                nim0 nim0Var3 = nim0.a;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var3);
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var23, 0);
                x340 x340Var24 = x340Var23;
                int iHashCode3 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM3 = x340Var24.m();
                qim0 qim0VarE3 = zr7.E(x340Var23, qim0VarZ2);
                hzj.A.getClass();
                x340 x340Var25 = x340Var23;
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
                nko1.H(jw31VarA2, x340Var23, y580.O0);
                nko1.H(xos0VarM3, x340Var23, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var23, y580.R0);
                nko1.F(x340Var23);
                nko1.H(qim0VarE3, x340Var23, y580.Y);
                eox eoxVar2 = eox.c;
                long j2 = cbx.a(x340Var23).b.a;
                cvx cvxVar13 = cbx.b(x340Var23).b;
                qim0 qim0VarB3 = uyn1.B(nim0Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                zov0 zov0Var2 = cbx.b(x340Var23).g;
                w0h1.a(eoxVar2, isl.a, u291.r(qim0VarB3, 16.0f), j2, 0L, false, x340Var23, eox.d | 48, 48);
                uwo1.e(cwl1.o0(x340Var23, 2131958155), (qim0) null, cbx.d(x340Var23).j, cbx.a(x340Var23).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var23, 0, 0, 2034);
                x340Var25.r(true);
                return rih1Var;
            case 12:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar, 2131958151);
                uwr uwrVar11 = cbx.a;
                lee1 lee1Var2 = cbx.d(b0kVar).j;
                long j3 = cbx.a(b0kVar).b.b;
                cvx cvxVar14 = cbx.b(b0kVar).b;
                cvx cvxVar15 = cbx.b(b0kVar).b;
                uwo1.e(strO1, uyn1.y(nim0Var, 16.0f, 12.0f), lee1Var2, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2032);
                return rih1Var;
            case 13:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    uwr uwrVar12 = cbx.a;
                    cvx cvxVar16 = cbx.b(x340Var27).b;
                    String strG = ydh.g(16.0f, 2131958169, x340Var27, x340Var27, nim0Var);
                    lee1 lee1Var3 = cbx.d(x340Var27).e;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    cvx cvxVar17 = cbx.b(x340Var27).b;
                    cvx cvxVar18 = cbx.b(x340Var27).b;
                    qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 4.0f);
                    Object objT2 = x340Var27.T();
                    if (objT2 == fkj0.X) {
                        objT2 = oqi.t;
                        x340Var27.s0(objT2);
                    }
                    uwo1.e(strG, s161.b(qim0VarY, false, (iu30) objT2), lee1Var3, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var27, 0, 0, 2040);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                return rih1Var;
            case 15:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(3, (wux) null, apo.r(313896451, new r6i((wr91) obj, (byte) 7), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case 16:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    uwr uwrVar13 = cbx.a;
                    cvx cvxVar19 = cbx.b(x340Var29).b;
                    hr80.d(uyn1.B(nim0.a, cbx.b(x340Var29).e.b, 12.0f, cbx.b(x340Var29).e.b, 0.0f, 8), 0.0f, cbx.a(x340Var29).a.b.c(), x340Var29, 0, 2);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 17:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                w0h1.a(gux.c, new jsl(cwl1.o0(b0kVar3, 2131958384)), u291.r(nim0Var, 22.0f), 0L, 0L, true, b0kVar3, gux.d | 196608, 24);
                return rih1Var;
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var30 = (b0k) obj2;
                int iIntValue14 = ((Number) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= x340Var30.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    nyx.a(2, (wux) null, apo.r(1034395743, new dr0((byte) 10, zBooleanValue), x340Var31), x340Var31, 3078, 6);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var32 = (b0k) obj2;
                int iIntValue15 = ((Number) obj3).intValue();
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    two1.f(x340Var33, 0);
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var34 = (b0k) obj2;
                int iIntValue16 = ((Number) obj3).intValue();
                x340 x340Var35 = x340Var34;
                if (x340Var35.Y(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    String strO2 = cwl1.o0(x340Var35, 2131958583);
                    uwr uwrVar14 = cbx.a;
                    lee1 lee1Var4 = cbx.d(x340Var35).e;
                    long j4 = cbx.a(x340Var35).b.a;
                    cvx cvxVar20 = cbx.b(x340Var35).b;
                    qim0 qim0VarZ3 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                    cvx cvxVar21 = cbx.b(x340Var35).b;
                    cvx cvxVar22 = cbx.b(x340Var35).b;
                    uwo1.e(strO2, uyn1.B(qim0VarZ3, 0.0f, 16.0f, 0.0f, 8.0f, 5), lee1Var4, j4, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var35, 0, 0, 2032);
                } else {
                    x340Var35.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var36 = (b0k) obj2;
                int iIntValue17 = ((Number) obj3).intValue();
                x340 x340Var37 = x340Var36;
                if (x340Var37.Y(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ilx ilxVar = ilx.c;
                    uwr uwrVar15 = cbx.a;
                    w0h1.a(ilxVar, isl.a, (qim0) null, cbx.a(x340Var37).b.f, 0L, false, x340Var37, ilx.d | 48, 52);
                } else {
                    x340Var37.b0();
                }
                return rih1Var;
            case 22:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strN0 = cwl1.n0(2131958684, new Object[]{obj}, b0kVar4);
                uwr uwrVar16 = cbx.a;
                uwo1.e(strN0, (qim0) null, cbx.d(b0kVar4).m, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2026);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var38 = (b0k) obj2;
                ((Number) obj3).intValue();
                yqk1 yqk1Var = (zqk1) obj;
                if (yqk1Var instanceof yqk1) {
                    x340 x340Var39 = x340Var38;
                    x340Var39.i0(-1848585655);
                    strK = cwl1.o0(x340Var39, si1.x(yqk1Var.a));
                    x340Var39.r(false);
                } else {
                    if (!(yqk1Var instanceof xqk1)) {
                        throw p3d1.k(x340Var38, -1848588218, false);
                    }
                    x340 x340Var40 = x340Var38;
                    strK = x0d.k(x340Var40, -1848582559, 2131958669, x340Var40, false);
                }
                String str = strK;
                uwr uwrVar17 = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(x340Var38).m, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var38, 0, 0, 2042);
                return rih1Var;
            case 24:
                x340 x340Var41 = (b0k) obj2;
                ((Number) obj3).intValue();
                eez eezVar = (fez) obj;
                if (eezVar instanceof eez) {
                    x340 x340Var42 = x340Var41;
                    x340Var42.i0(-1599307642);
                    strK2 = cwl1.o0(x340Var42, w0h1.M(eezVar.a));
                    x340Var42.r(false);
                } else {
                    if (!(eezVar instanceof cez)) {
                        throw p3d1.k(x340Var41, -1599309853, false);
                    }
                    x340 x340Var43 = x340Var41;
                    strK2 = x0d.k(x340Var43, -1599305310, 2131958669, x340Var43, false);
                }
                String str2 = strK2;
                uwr uwrVar18 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(x340Var41).m, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var41, 0, 0, 2042);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var44 = (b0k) obj2;
                ((Number) obj3).intValue();
                j820 j820Var = (j820) obj;
                if (j820Var instanceof i820) {
                    x340 x340Var45 = x340Var44;
                    x340Var45.i0(-1350028820);
                    strK3 = cwl1.o0(x340Var45, h1p1.n(((i820) j820Var).a));
                    x340Var45.r(false);
                } else {
                    if (!(j820Var instanceof h820)) {
                        throw p3d1.k(x340Var44, -1350031414, false);
                    }
                    x340 x340Var46 = x340Var44;
                    strK3 = x0d.k(x340Var46, -1350025693, 2131958669, x340Var46, false);
                }
                String str3 = strK3;
                uwr uwrVar19 = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(x340Var44).m, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var44, 0, 0, 2042);
                return rih1Var;
            case 26:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                x340 x340Var47 = (b0k) obj2;
                int iIntValue18 = ((Number) obj3).intValue();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= x340Var47.h(zBooleanValue2) ? 4 : 2;
                }
                x340 x340Var48 = x340Var47;
                if (!x340Var48.Y(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x340Var48.b0();
                } else if (zBooleanValue2) {
                    x340Var48.i0(1218006592);
                    nyx.a(2, (wux) null, r1j.a, x340Var48, 3078, 6);
                    x340Var48.r(false);
                } else {
                    x340Var48.i0(1218447691);
                    x340Var48.r(false);
                }
                return rih1Var;
            case 27:
                x340 x340Var49 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar20 = cbx.a;
                qim0 qim0VarF3 = dug.f(qim0VarD, u7h.b(cbx.a(x340Var49).a.c, 0.9f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                x340 x340Var50 = x340Var49;
                Object objT3 = x340Var50.T();
                if (objT3 == fkj0.X) {
                    objT3 = mia.f;
                    x340Var50.s0(objT3);
                }
                qim0 qim0VarB4 = f8d1.b(qim0VarF3, rih1Var, (PointerInputEventHandler) objT3);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode4 = Long.hashCode(x340Var50.T);
                xos0 xos0VarM4 = x340Var50.m();
                qim0 qim0VarE4 = zr7.E(x340Var50, qim0VarB4);
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
                nko1.H(gfh0VarC2, x340Var50, y580.O0);
                nko1.H(xos0VarM4, x340Var50, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var50, y580.R0);
                nko1.F(x340Var50);
                nko1.H(qim0VarE4, x340Var50, y580.Y);
                yto1.e(2, 48, 1, x340Var50, (qim0) null);
                x340Var50.r(true);
                return rih1Var;
            case 28:
                x340 x340Var51 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA3 = ew31.a(gex0Var, een.N0, x340Var51, 48);
                x340 x340Var52 = x340Var51;
                int iHashCode5 = Long.hashCode(x340Var52.T);
                xos0 xos0VarM5 = x340Var52.m();
                qim0 qim0VarE5 = zr7.E(x340Var51, nim0Var);
                hzj.A.getClass();
                x340 x340Var53 = x340Var51;
                if (x340Var53.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var53.m0();
                if (x340Var53.S) {
                    x340Var53.l(n4kVar);
                } else {
                    x340Var53.v0();
                }
                nko1.H(jw31VarA3, x340Var51, y580.O0);
                nko1.H(xos0VarM5, x340Var51, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var51, y580.R0);
                nko1.F(x340Var51);
                nko1.H(qim0VarE5, x340Var51, y580.Y);
                p9p1.b(anm1.N("mixing_header_beta_tag", nim0Var), 2, 2, x340Var51, 438, 0);
                uwr uwrVar21 = cbx.a;
                cvx cvxVar23 = cbx.b(x340Var51).b;
                op71.g(x340Var51, u291.v(nim0Var, 8.0f));
                x340Var53.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                return rih1Var;
        }
    }
}
