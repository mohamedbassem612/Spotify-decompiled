package p;

import androidx.compose.ui.graphics.ColorFilter;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h621 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h621(Function0 function0) {
        super(2);
        this.a = (byte) 5;
        this.b = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        byte b2 = 24;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        Function0 function0 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    foo1.c(new gbx(z50Var, function0), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, adj.c, x340Var2, 0, 48, 2044);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                s9p1.u(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                s9p1.u(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                rzn1.b(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fux fuxVar = fux.c;
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var4).b.b;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                    String strO0 = cwl1.o0(x340Var4, 2131953570);
                    boolean zG = x340Var4.g(function0);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new us21(function0, (byte) 24);
                        x340Var4.s0(objT);
                    }
                    w0h1.a(fuxVar, isl.a, bin.x(qim0VarR, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13), j, 0L, false, x340Var4, fux.d | 48, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var6).g, 32, qim0VarF);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, cbx.b(x340Var6).b.a, 5);
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var6, 0);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    qim0 qim0VarB2 = u291.B(nim0Var, (gra) null, 3);
                    era eraVar = een.Q0;
                    eso1.h(i3o1.n(2131233906, x340Var6, 0), isl.a, ktd.m(eraVar, qim0VarB2), (p3v) null, (zvx) null, (ecx) null, mif1.R0, (tl3) null, (ColorFilter) null, x340Var6, 199736, 400);
                    uwo1.e(cwl1.o0(x340Var6, 2131962296), u291.f(nim0Var, 1.0f), cbx.d(x340Var6).e, cbx.a(x340Var6).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2016);
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.r(nim0Var, 16.0f));
                    cua cuaVar = cbx.b(x340Var6).f;
                    w3d1.a((qim0) null, er31.b(16.0f), cbx.a(x340Var6).a.a.b(), 0L, 0.0f, 0.0f, (qqb) null, bhj.a, x340Var6, 12582912, 121);
                    cvx cvxVar4 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.r(nim0Var, 16.0f));
                    boolean zG2 = x340Var6.g(function0);
                    Object objT2 = x340Var6.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new pt61(function0, (byte) 7);
                        x340Var6.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), new tq60(eraVar), (max) null, yla.r(x340Var6), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, bhj.b, x340Var6, 0, 48, 2008);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                u4p1.g(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ybx0.N0.b(function0, x340Var8, 48);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ybx0.N0.b(function0, x340Var10, 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                c97.d(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strO1 = cwl1.o0(x340Var12, 2131956004);
                    fux fuxVar2 = fux.c;
                    boolean zG3 = x340Var12.g(function0);
                    Object objT3 = x340Var12.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new pt61(function0, (byte) 18);
                        x340Var12.s0(objT3);
                    }
                    cuo1.k(fuxVar2, new gbx(z50Var, (Function0) objT3), new jsl(strO1), (qim0) null, (idn0) null, x340Var12, fux.d, 24);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY = x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var = x340Var14.a;
                if (zY) {
                    mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(z4p1.g(4282450165L)), new u7h(z4p1.g(4283472885L))}), 0.0f, 0.0f, 14);
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var14).f;
                    qim0 qim0VarE2 = dug.e(nim0Var, mic0VarS, er31.b(4.0f), 0.0f, 4);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM2 = x340Var14.m();
                    qim0 qim0VarE3 = zr7.E(x340Var14, qim0VarE2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var14, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM2, x340Var14, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var14, lljVar3);
                    nko1.F(x340Var14);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE3, x340Var14, lljVar4);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    cvx cvxVar5 = cbx.b(x340Var14).b;
                    qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, cbx.b(x340Var14).b.d);
                    mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var14, 0);
                    int iHashCode3 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM3 = x340Var14.m();
                    qim0 qim0VarE4 = zr7.E(x340Var14, qim0VarY);
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(mbhVarA2, x340Var14, lljVar);
                    nko1.H(xos0VarM3, x340Var14, lljVar2);
                    x0d.q(iHashCode3, x340Var14, lljVar3, x340Var14);
                    nko1.H(qim0VarE4, x340Var14, lljVar4);
                    hsx hsxVar = hsx.c;
                    zov0 zov0Var2 = cbx.b(x340Var14).g;
                    w0h1.a(hsxVar, isl.a, u291.r(nim0Var, 88.0f), cbx.a(x340Var14).c.c, 0L, true, x340Var14, hsx.d | 196656, 16);
                    uwo1.e(ydh.g(cbx.b(x340Var14).b.b, 2131959817, x340Var14, x340Var14, nim0Var), (qim0) null, cbx.d(x340Var14).c, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2042);
                    cvx cvxVar6 = cbx.b(x340Var14).b;
                    uwo1.e(ydh.g(12.0f, 2131959816, x340Var14, x340Var14, nim0Var), (qim0) null, cbx.d(x340Var14).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2042);
                    op71.g(x340Var14, u291.h(nim0Var, cbx.b(x340Var14).b.b));
                    foo1.c(new gbx(z50Var, function0), new idx(), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ejj.a, x340Var14, 0, 48, 2044);
                    x340Var14.r(true);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                cx91.a(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                vvm1.e(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    gbx gbxVar = new gbx(z50Var, function0);
                    ldx ldxVar = ldx.c;
                    gdx gdxVarS = yla.s(x340Var16);
                    qim0 qim0VarA = h2c.a.a(nim0Var, een.f);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var16).b;
                    wro1.h(gbxVar, ldxVar, dug.f(u291.r(uyn1.x(qim0VarA, 16.0f), cbx.b(x340Var16).b.d), cbx.a(x340Var16).a.c, er31.a), (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, tkj.a, x340Var16, 0, 6, 984);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    gdx gdxVarS2 = yla.s(x340Var18);
                    String strO2 = cwl1.o0(x340Var18, 2131952699);
                    if (ihc1.y0(strO2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.h(new gbx(new y50(strO2), function0), (qim0) null, (max) null, gdxVarS2, (idn0) null, (vu30) null, clj.a, x340Var18, 12582912, 118);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    gdx gdxVarS3 = yla.s(x340Var20);
                    String strO3 = cwl1.o0(x340Var20, 2131952699);
                    if (ihc1.y0(strO3)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.h(new gbx(new y50(strO3), function0), (qim0) null, (max) null, gdxVarS3, (idn0) null, (vu30) null, lnj.a, x340Var20, 12582912, 118);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    sqe.n(function0, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                sqe.n(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                uah1.b(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                uah1.f(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                vno1.g(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                vno1.g(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                boo1.s(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zG4 = x340Var24.g(function0);
                    Object objT4 = x340Var24.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new tpj1(function0, (byte) 6);
                        x340Var24.s0(objT4);
                    }
                    wro1.h(new gbx(z50Var, (Function0) objT4), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, zqj.b, x340Var24, 0, 6, 1020);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    j2i j2iVar = zqj.a;
                    j2i j2iVarR = apo.r(1336507910, new h621(function0, b2), x340Var26);
                    long j2 = u7h.j;
                    uwr uwrVar5 = cbx.a;
                    ti5.d(j2iVar, (qim0) null, j2iVarR, (xu30) null, 0.0f, (erl1) null, kkn.C(j2, 0L, cbx.a(x340Var26).b.a, cbx.a(x340Var26).b.a, 0L, x340Var26, 50), (a8f1) null, x340Var26, 390, 186);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                rc2.b(function0, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    String strO4 = cwl1.o0(x340Var28, 2131963893);
                    uwr uwrVar6 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var28).k;
                    long j3 = cbx.a(x340Var28).b.a;
                    cvx cvxVar8 = cbx.b(x340Var28).b;
                    qim0 qim0VarB3 = uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    mta mtaVar = cbx.b(x340Var28).d;
                    qim0 qim0VarX = u291.x(56.0f, 0.0f, 2, qim0VarB3);
                    Object objT5 = x340Var28.T();
                    if (objT5 == fkj0.X) {
                        objT5 = ktd.n(x340Var28);
                    }
                    uwo1.e(strO4, bin.v(qim0VarX, (idn0) objT5, (ga80) null, false, (String) null, (pm31) null, this.b, 28), lee1Var, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var28, 0, 0, 2032);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h621(Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h621(Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
    }
}
