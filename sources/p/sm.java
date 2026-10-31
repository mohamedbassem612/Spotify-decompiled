package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sm extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(iu30 iu30Var) {
        super(2);
        this.a = (byte) 5;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new p1(iu30Var, (byte) 6);
                        x340Var2.s0(objT);
                    }
                    byo1.a((Function0) objT, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                iu30Var.invoke(new xo0(((Number) obj).intValue(), (upk0) obj2));
                return rih1Var;
            case 2:
                iu30Var.invoke(new no0(new mmr0(Integer.valueOf(((Number) obj).intValue()), (upk0) obj2)));
                return rih1Var;
            case 3:
                iu30Var.invoke(new wo0(((Number) obj).intValue(), (upk0) obj2));
                return rih1Var;
            case 4:
                iu30Var.invoke(new oa1((String) obj, ((Boolean) obj2).booleanValue(), true));
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new cr0(iu30Var, (byte) 10);
                        x340Var4.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, nim0.a, (max) null, yla.p(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, y3i.f, x340Var4, 0, 48, 2008);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.r(nim0Var, 16.0f));
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new k52(iu30Var, (byte) 0);
                        x340Var6.s0(objT3);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT3), (qim0) null, (max) null, yla.r(x340Var6), (idn0) null, (vu30) null, (vu30) null, b5i.a, x340Var6, 12582912, 118);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var8).a.c, u5j1Var);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    boolean zG4 = x340Var8.g(iu30Var);
                    Object objT4 = x340Var8.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new ib2(iu30Var, (byte) 10);
                        x340Var8.s0(objT4);
                    }
                    ejo1.k(new ufd((iu30) objT4, new urk0((byte) 4)), "", (qim0) null, x340Var8, 48, 4);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 9:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG5 = x340Var10.g(iu30Var);
                    Object objT5 = x340Var10.T();
                    if (zG5 || objT5 == fkj0.X) {
                        objT5 = new ge3(iu30Var, (byte) 15);
                        x340Var10.s0(objT5);
                    }
                    wro1.h(new gbx(z50Var, (Function0) objT5), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, w6i.a, x340Var10, 0, 6, 1020);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 10:
                iu30Var.invoke(new qt6((String) obj, ((Number) obj2).intValue()));
                return rih1Var;
            case 11:
                iu30Var.invoke(new i77(((Number) obj).intValue(), ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 12:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zG6 = x340Var12.g(iu30Var);
                    Object objT6 = x340Var12.T();
                    if (zG6 || objT6 == fkj0.X) {
                        objT6 = new nc8(iu30Var, (byte) 22);
                        x340Var12.s0(objT6);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT6), new idx(), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k9i.c, x340Var12, 0, 48, 2044);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG7 = x340Var14.g(iu30Var);
                    Object objT7 = x340Var14.T();
                    if (zG7 || objT7 == fkj0.X) {
                        objT7 = new nc8(iu30Var, (byte) 23);
                        x340Var14.s0(objT7);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT7), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k9i.d, x340Var14, 0, 48, 2044);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zG8 = x340Var16.g(iu30Var);
                    Object objT8 = x340Var16.T();
                    if (zG8 || objT8 == fkj0.X) {
                        objT8 = new nc8(iu30Var, (byte) 25);
                        x340Var16.s0(objT8);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT8), new idx(), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k9i.g, x340Var16, 0, 48, 2044);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zG9 = x340Var18.g(iu30Var);
                    Object objT9 = x340Var18.T();
                    if (zG9 || objT9 == fkj0.X) {
                        objT9 = new nc8(iu30Var, (byte) 26);
                        x340Var18.s0(objT9);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT9), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k9i.h, x340Var18, 0, 48, 2044);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 16:
                tfd0 tfd0Var = (tfd0) obj;
                tv80 tv80Var = (tv80) obj2;
                if (tfd0Var.equals(sfd0.a)) {
                    iu30Var.invoke(new w1f(tv80Var));
                } else {
                    if (!tfd0Var.equals(rfd0.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(v1f.a);
                }
                return rih1Var;
            case 17:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zG10 = x340Var20.g(iu30Var);
                    Object objT10 = x340Var20.T();
                    if (zG10 || objT10 == fkj0.X) {
                        objT10 = new frf(iu30Var, (byte) 4);
                        x340Var20.s0(objT10);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT10), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, (vu30) null, hci.a, x340Var20, 12582912, 126);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var22).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    boolean zG11 = x340Var22.g(iu30Var);
                    Object objT11 = x340Var22.T();
                    if (zG11 || objT11 == fkj0.X) {
                        objT11 = new frf(iu30Var, (byte) 9);
                        x340Var22.s0(objT11);
                    }
                    foo1.f(new gbx(z50Var, (Function0) objT11), qim0VarB, (max) null, (gdx) null, (idn0) null, (vu30) null, (vu30) null, hci.b, x340Var22, 12582912, 124);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    float f = cbx.b(x340Var24).b.b;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarX = uyn1.x(nim0Var2, f);
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var24, 0);
                    int iHashCode2 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM2 = x340Var24.m();
                    qim0 qim0VarE2 = zr7.E(x340Var24, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var24.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(mbhVarA, x340Var24, y580.O0);
                    nko1.H(xos0VarM2, x340Var24, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var24, y580.R0);
                    nko1.F(x340Var24);
                    nko1.H(qim0VarE2, x340Var24, y580.Y);
                    String strO0 = cwl1.o0(x340Var24, 2131953836);
                    lee1 lee1Var = cbx.d(x340Var24).e;
                    long j = cbx.a(x340Var24).b.a;
                    qim0 qim0VarB2 = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, cbx.b(x340Var24).b.a, 7);
                    Object objT12 = x340Var24.T();
                    m4c m4cVar = fkj0.X;
                    if (objT12 == m4cVar) {
                        objT12 = tzf.c;
                        x340Var24.s0(objT12);
                    }
                    uwo1.e(strO0, s161.b(qim0VarB2, false, (iu30) objT12), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2016);
                    uwo1.e(cwl1.o0(x340Var24, 2131953833), uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, cbx.b(x340Var24).b.a, 7), cbx.d(x340Var24).j, cbx.a(x340Var24).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2016);
                    gfx.g(9, apo.r(1841800369, new sm(iu30Var, (byte) 18), x340Var24), x340Var24, 54);
                    boolean zG12 = x340Var24.g(iu30Var);
                    Object objT13 = x340Var24.T();
                    if (zG12 || objT13 == m4cVar) {
                        objT13 = new frf(iu30Var, (byte) 10);
                        x340Var24.s0(objT13);
                    }
                    foo1.h(new gbx(z50Var, (Function0) objT13), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, hci.c, x340Var24, 12582912, 126);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwr uwrVar5 = cbx.a;
                    qim0 qim0VarX2 = uyn1.x(nim0Var, cbx.b(x340Var26).b.b);
                    Object objT14 = x340Var26.T();
                    if (objT14 == fkj0.X) {
                        objT14 = nyf.c;
                        x340Var26.s0(objT14);
                    }
                    qim0 qim0VarX3 = bin.x(qim0VarX2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT14, 14);
                    long j2 = cbx.a(x340Var26).a.c;
                    cua cuaVar = cbx.b(x340Var26).f;
                    w3d1.a(qim0VarX3, er31.b(8.0f), j2, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-1225660940, new sm(iu30Var, (byte) 19), x340Var26), x340Var26, 12582912, 120);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 21:
                iu30Var.invoke(new ghh((String) obj, (kfi1) obj2));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                iu30Var.invoke(((s201) obj).a);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                iu30Var.invoke(new z17((f27) obj, ((Number) obj2).intValue()));
                return rih1Var;
            case 24:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    boolean zG13 = x340Var28.g(iu30Var);
                    Object objT15 = x340Var28.T();
                    if (zG13 || objT15 == fkj0.X) {
                        objT15 = new tbi(iu30Var, (byte) 27);
                        x340Var28.s0(objT15);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT15), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, gei.a, x340Var28, 0, 48, 2044);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                iu30Var.invoke(new oel((String) obj, ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 26:
                iu30Var.invoke(new qxm((String) obj, ((u7h) obj2).a));
                return rih1Var;
            case 27:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    boolean zG14 = x340Var30.g(iu30Var);
                    Object objT16 = x340Var30.T();
                    if (zG14 || objT16 == fkj0.X) {
                        objT16 = new xei(iu30Var, (byte) 14);
                        x340Var30.s0(objT16);
                    }
                    jto1.b(qim0VarF2, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT16), (gbx) null, vgi.b, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, vgi.c, x340Var30, 100663360, 196608, 32444);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 28:
                iu30Var.invoke(new q820((r620) obj, ((Number) obj2).intValue()));
                return rih1Var;
            default:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar6 = cbx.a;
                    qim0 qim0VarF4 = dug.f(qim0VarF3, cbx.a(x340Var32).a.c, u5j1Var);
                    cvx cvxVar3 = cbx.b(x340Var32).b;
                    qim0 qim0VarB3 = uyn1.B(qim0VarF4, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    cvx cvxVar4 = cbx.b(x340Var32).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var32, 0);
                    int iHashCode3 = Long.hashCode(x340Var32.T);
                    xos0 xos0VarM3 = x340Var32.m();
                    qim0 qim0VarE3 = zr7.E(x340Var32, qim0VarB3);
                    hzj.A.getClass();
                    if (x340Var32.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var32.m0();
                    if (x340Var32.S) {
                        x340Var32.l(n4kVar);
                    } else {
                        x340Var32.v0();
                    }
                    nko1.H(jw31VarA, x340Var32, y580.O0);
                    nko1.H(xos0VarM3, x340Var32, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var32, y580.R0);
                    nko1.F(x340Var32);
                    nko1.H(qim0VarE3, x340Var32, y580.Y);
                    uwo1.e(cwl1.o0(x340Var32, 2131957121), new wnb0(1.0f, true), cbx.d(x340Var32).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var32, 0, 0, 1720);
                    boolean zG15 = x340Var32.g(iu30Var);
                    Object objT17 = x340Var32.T();
                    if (zG15 || objT17 == fkj0.X) {
                        objT17 = new rri(iu30Var, (byte) 21);
                        x340Var32.s0(objT17);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT17);
                    ldx ldxVar2 = ldx.c;
                    gdx gdxVarS = yla.s(x340Var32);
                    cvx cvxVar5 = cbx.b(x340Var32).b;
                    cvx cvxVar6 = cbx.b(x340Var32).b;
                    cvx cvxVar7 = cbx.b(x340Var32).b;
                    cvx cvxVar8 = cbx.b(x340Var32).b;
                    foo1.c(gbxVar, ldxVar2, (qim0) null, (max) null, gdxVarS, new zzq0(8.0f, 4.0f, 16.0f, 4.0f), (idn0) null, (ga80) null, qui.a, (vu30) null, qui.b, x340Var32, 805306368, 48, 1436);
                    x340Var32.r(true);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm(iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
    }
}
