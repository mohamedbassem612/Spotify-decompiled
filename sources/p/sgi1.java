package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sgi1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgi1(ck41 ck41Var, rk41 rk41Var, vkj1 vkj1Var) {
        super(3);
        this.a = (byte) 9;
        this.b = ck41Var;
        this.c = rk41Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        String str;
        float f;
        float f2;
        bsx bsxVar;
        Function0 function0;
        qim0 qim0Var;
        boolean z;
        byte b = this.a;
        gex0 gex0Var = h36.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarL0 = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mod.b(oi7.a.a((gw70) obj5), apo.r(621065409, new muh1((rgi1) obj4, (byte) 6), x340Var2), x340Var2, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                hhz hhzVar = (hhz) obj5;
                wsb1 wsb1Var = ((thi1) obj4).a;
                qim0 qim0VarW = uyn1.w(qim0VarL0, (vzq0) obj);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                otw.c(hhzVar, wsb1Var, uyn1.z(8.0f, 0.0f, 2, qim0VarW), (ipb1) null, b0kVar, 8, 8);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                b5i1 b5i1Var = (b5i1) obj5;
                q4i1 q4i1Var = b5i1Var instanceof q4i1 ? (q4i1) b5i1Var : null;
                if (q4i1Var == null || (str = q4i1Var.b.b) == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                bmq0.a(uri, (qim0) null, (hcx) null, b5i1Var.getUsername(), (String) obj4, 0L, 0L, false, b0kVar2, 0, 230);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (((aod0) obj5) != null) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-1236285724);
                    aod0 aod0Var = (aod0) obj5;
                    String str2 = ((tvi1) obj4).a;
                    otw.c(aod0Var, new uho(str2, str2, (tho) null, lho.a, (String) null, (Function0) null, 244), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-1235998385);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 4:
                qyi1 qyi1Var = (qyi1) obj;
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                fsv0 fsv0Var = (fsv0) obj5;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var6.g(qyi1Var) ? 4 : 2;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    Object objT = x340Var7.T();
                    if (objT == fkj0.X) {
                        objT = ((u9u0) fsv0Var.g).a();
                        x340Var7.s0(objT);
                    }
                    ven0 ven0VarG = rwq.g((mr20) objT, "", (o8n) null, x340Var7, 48, 2);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var7).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarL0);
                    nm1 nm1Var = (nm1) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM = x340Var7.m();
                    qim0 qim0VarE = zr7.E(x340Var7, qim0VarZ);
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
                    nko1.H(gfh0VarC, x340Var7, y580.O0);
                    nko1.H(xos0VarM, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE, x340Var7, y580.Y);
                    String str3 = qyi1Var.k;
                    i1o1.e(nm1Var, new lvt0(str3, qyi1Var.i, str3.equals((String) ven0VarG.getValue())), cwl1.C((q7r0) fsv0Var.h), (qim0) null, (ipb1) null, wpj.a, (xu30) null, 0, (xu30) null, x340Var7, 196616, 236);
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 5:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                uwo1.e(((zxi1) obj5).a, (qim0) null, (lee1) obj4, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                ((y2j1) obj5).e((iu30) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 7:
                uwr uwrVar4 = cbx.a;
                i2c i2cVar = (i2c) obj;
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var8.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean z2 = p3v.b(i2cVar.d(), 240.0f) <= 0;
                    if (z2) {
                        x340Var9.i0(-1890801397);
                        cvx cvxVar3 = cbx.b(x340Var9).b;
                        x340Var9.r(false);
                        f = 8.0f;
                    } else {
                        x340Var9.i0(-1890800089);
                        cvx cvxVar4 = cbx.b(x340Var9).b;
                        x340Var9.r(false);
                        f = 16.0f;
                    }
                    if (z2) {
                        x340Var9.i0(-1890798431);
                        zov0 zov0Var = cbx.b(x340Var9).g;
                        f2 = zjy.j(32.0f, new p3v(32.0f)).a;
                        x340Var9.r(false);
                    } else {
                        x340Var9.i0(-1890795084);
                        zov0 zov0Var2 = cbx.b(x340Var9).g;
                        x340Var9.r(false);
                        f2 = 40.0f;
                    }
                    float f3 = f2;
                    int i = z2 ? 1 : 2;
                    int i2 = z2 ? 2 : 1;
                    qim0 qim0VarX = uyn1.x(u291.d(qim0VarL0, 1.0f), f);
                    vu30 vu30Var = (vu30) obj5;
                    qij1 qij1Var = (qij1) obj4;
                    mbh mbhVarA = jbh.a(z2 ? h36.g : h36.c, een.P0, x340Var9, 0);
                    int iHashCode2 = Long.hashCode(x340Var9.T);
                    xos0 xos0VarM2 = x340Var9.m();
                    qim0 qim0VarE2 = zr7.E(x340Var9, qim0VarX);
                    hzj.A.getClass();
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
                    nko1.H(mbhVarA, x340Var9, y580.O0);
                    nko1.H(xos0VarM2, x340Var9, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var9, y580.R0);
                    nko1.F(x340Var9);
                    nko1.H(qim0VarE2, x340Var9, y580.Y);
                    vu30Var.invoke(x340Var9, 0);
                    if (z2) {
                        x340Var9.i0(-1176275179);
                        x340Var9.r(false);
                    } else {
                        x340Var9.i0(1763168756);
                        cvx cvxVar5 = cbx.b(x340Var9).b;
                        x0d.s(qim0VarL0, 8.0f, x340Var9, false);
                    }
                    int i3 = i2;
                    n9p1.j(qij1Var.b, f3, qij1Var.e, qij1Var.f, i, new wnb0(1.0f, !z2), i3, x340Var9, 0, 0);
                    if (z2) {
                        x340Var9.i0(-1175871435);
                        x340Var9.r(false);
                    } else {
                        x340Var9.i0(1763181780);
                        cvx cvxVar6 = cbx.b(x340Var9).b;
                        x0d.s(qim0VarL0, 8.0f, x340Var9, false);
                    }
                    sbl.o(qij1Var.g, (qim0) null, i3, x340Var9, 0, 2);
                    x340Var9.r(true);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarD = u291.d(qim0VarL0, 1.0f);
                uwr uwrVar5 = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(x340Var10).a.c, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                bdj1 bdj1Var = (adj1) obj5;
                iu30 iu30Var = (iu30) obj4;
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var11 = x340Var10;
                int iHashCode3 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM3 = x340Var11.m();
                qim0 qim0VarE3 = zr7.E(x340Var10, qim0VarF);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(gfh0VarC2, x340Var10, y580.O0);
                nko1.H(xos0VarM3, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE3, x340Var10, y580.Y);
                boolean z3 = bdj1Var instanceof ycj1;
                if (z3) {
                    bsxVar = bsx.c;
                } else {
                    bsxVar = ((bdj1Var instanceof bdj1) && bdj1Var.e) ? xpx.c : spx.c;
                }
                bsx bsxVar2 = bsxVar;
                if (z3) {
                    x340Var12.i0(404536039);
                    boolean zG = x340Var12.g(iu30Var);
                    Object objT2 = x340Var12.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new y0j1(iu30Var, (byte) 24);
                        x340Var12.s0(objT2);
                    }
                    function0 = (Function0) objT2;
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(404625009);
                    boolean zG2 = x340Var12.g(iu30Var);
                    Object objT3 = x340Var12.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new y0j1(iu30Var, (byte) 25);
                        x340Var12.s0(objT3);
                    }
                    function0 = (Function0) objT3;
                    x340Var12.r(false);
                }
                w0h1.a(bsxVar2, isl.a, bin.x(u291.r(qim0VarL0, cbx.b(x340Var10).b.b), false, (String) null, (pm31) null, (idn0) null, function0, 15), cbx.a(x340Var10).c.a, 0L, false, x340Var10, 56, 48);
                x340Var12.r(true);
                return rih1Var;
            case 9:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var13.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ((ck41) obj5).a.c1(i2cVar2, Boolean.valueOf(((rk41) obj4).a), Boolean.TRUE, x340Var14, Integer.valueOf(iIntValue4 & 14));
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                otw.c(((hmk1) obj5).b, (px2) obj4, uyn1.w(l6o1.H(u291.d(qim0VarL0, 1.0f), l6o1.C(0, 0, 1, b0kVar4), false, 14), (vzq0) obj), (ipb1) null, b0kVar4, 0, 8);
                return rih1Var;
            case 11:
                wdo0 wdo0Var = (wdo0) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                fwk1 fwk1Var = (fwk1) obj4;
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var15.g(wdo0Var) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ng20 ng20Var = (ng20) obj5;
                    String str4 = wdo0Var.a;
                    String str5 = wdo0Var.b;
                    String str6 = wdo0Var.c;
                    String str7 = wdo0Var.d;
                    int i4 = wdo0Var.e;
                    int iG = fwk1Var.d - fwk1Var.g();
                    boolean z4 = fwk1Var.i;
                    i260 i260Var = fwk1Var.e;
                    otw.c(ng20Var, new beo0(str4, str5, str6, str7, i4, iG, z4, i260Var.e, i260Var.f, i260Var.h, i260Var.i), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 12:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var17 = (b0k) obj2;
                ((Number) obj3).intValue();
                qwk1 qwk1Var = (qwk1) obj5;
                String str8 = qwk1Var.b;
                String str9 = qwk1Var.a;
                int length = str8.length();
                qim0 qim0Var2 = nim0.a;
                if (length <= 0 || str9.length() <= 0) {
                    qim0Var = qim0Var2;
                    z = true;
                    x340 x340Var18 = x340Var17;
                    x340Var18.i0(1497029110);
                    x340Var18.r(false);
                } else {
                    x340 x340Var19 = x340Var17;
                    x340Var19.i0(1496014108);
                    j06 j06Var = x340Var19.a;
                    b620 b620Var = new b620();
                    Object objT4 = x340Var19.T();
                    if (objT4 == fkj0.X) {
                        objT4 = eak1.Y0;
                        x340Var19.s0(objT4);
                    }
                    qim0 qim0VarB = s161.b(b620Var, true, (iu30) objT4);
                    mbh mbhVarA2 = jbh.a(h36.e, een.P0, x340Var19, 0);
                    int iHashCode4 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM4 = x340Var19.m();
                    qim0 qim0VarE4 = zr7.E(x340Var19, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(n4kVar);
                    } else {
                        x340Var19.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA2, x340Var19, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM4, x340Var19, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var19, lljVar3);
                    nko1.F(x340Var19);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE4, x340Var19, lljVar4);
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(str9, (qim0) null, cbx.d(x340Var19).m, cbx.a(x340Var19).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2034);
                    cvx cvxVar7 = cbx.b(x340Var19).b;
                    qim0 qim0VarB2 = uyn1.B(qim0Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var19, 0);
                    int iHashCode5 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM5 = x340Var19.m();
                    qim0 qim0VarE5 = zr7.E(x340Var19, qim0VarB2);
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(n4kVar);
                    } else {
                        x340Var19.v0();
                    }
                    nko1.H(jw31VarA, x340Var19, lljVar);
                    nko1.H(xos0VarM5, x340Var19, lljVar2);
                    x0d.q(iHashCode5, x340Var19, lljVar3, x340Var19);
                    nko1.H(qim0VarE5, x340Var19, lljVar4);
                    qim0Var = qim0Var2;
                    w0h1.a(xrx.c, isl.a, u291.s(uyn1.B(qim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11), 14.0f, 15.75f), cbx.a(x340Var19).b.c, 0L, false, x340Var19, xrx.d | 48, 48);
                    uwo1.e(qwk1Var.b, (qim0) null, cbx.d(x340Var19).h, cbx.a(x340Var19).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2034);
                    z = true;
                    us71.m(x340Var19, true, true, false);
                }
                op71.g(x340Var17, ew20Var.a(1.0f, qim0Var, z));
                if (qwk1Var.e) {
                    x340 x340Var20 = x340Var17;
                    x340Var20.i0(1497132805);
                    gfx.g(8, apo.r(-199688435, new eii1((iu30) obj4, qwk1Var, (byte) 25), x340Var17), x340Var17, 54);
                    x340Var20.r(false);
                } else {
                    x340 x340Var21 = x340Var17;
                    x340Var21.i0(1497548918);
                    x340Var21.r(false);
                }
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                Float f4 = (Float) obj5;
                x340 x340Var22 = (b0k) obj2;
                Object objT5 = x340Var22.T();
                m4c m4cVar2 = fkj0.X;
                if (objT5 == m4cVar2) {
                    objT5 = lcl1.d;
                    x340Var22.s0(objT5);
                }
                iu30 iu30Var3 = (iu30) objT5;
                boolean zG3 = x340Var22.g(f4) | x340Var22.g(iu30Var2);
                Object objT6 = x340Var22.T();
                if (zG3 || objT6 == m4cVar2) {
                    objT6 = new hij1(f4, iu30Var2, (byte) 22);
                    x340Var22.s0(objT6);
                }
                dm5.a(iu30Var3, (qim0) null, (iu30) objT6, x340Var22, 6, 2);
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                mml1 mml1Var = (mml1) obj5;
                x340 x340Var23 = (b0k) obj2;
                iu30 iu30Var4 = (iu30) obj4;
                boolean zI = x340Var23.i(mml1Var) | x340Var23.g(iu30Var4);
                Object objT7 = x340Var23.T();
                if (zI || objT7 == fkj0.X) {
                    objT7 = new g4k1(mml1Var, iu30Var4, (byte) 9);
                    x340Var23.s0(objT7);
                }
                wro1.h(new gbx(z50.c, (Function0) objT7), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, esj.c, x340Var23, 0, 6, 1020);
                return rih1Var;
            case 15:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                cjc0 cjc0Var = new cjc0(1);
                if (((gym1) obj5).e) {
                    qim0VarL0 = cwl1.l0(u291.f(qim0VarL0, 1.0f), 0L, (hw61) null, 15);
                }
                uwo1.e((String) obj4, qim0VarL0, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, b0kVar5, 0, 0, 1788);
                return rih1Var;
            default:
                x340 x340Var24 = (b0k) obj2;
                ((Number) obj3).intValue();
                kjo0 kjo0Var = (kjo0) obj5;
                Function0 function1 = (Function0) obj4;
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var24, 0);
                x340 x340Var25 = x340Var24;
                int iHashCode6 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM6 = x340Var25.m();
                qim0 qim0VarE6 = zr7.E(x340Var24, qim0VarL0);
                hzj.A.getClass();
                x340 x340Var26 = x340Var24;
                if (x340Var26.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var26.m0();
                if (x340Var26.S) {
                    x340Var26.l(n4kVar);
                } else {
                    x340Var26.v0();
                }
                nko1.H(jw31VarA2, x340Var24, y580.O0);
                nko1.H(xos0VarM6, x340Var24, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var24, y580.R0);
                nko1.F(x340Var24);
                nko1.H(qim0VarE6, x340Var24, y580.Y);
                if (kjo0Var.f) {
                    x340Var26.i0(324346635);
                    irn1.E((qim0) null, x340Var24, 0);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(324387958);
                    x340Var26.r(false);
                }
                Object objT8 = x340Var26.T();
                if (objT8 == fkj0.X) {
                    objT8 = tsm1.O0;
                    x340Var26.s0(objT8);
                }
                irn1.h(0, function1, x340Var24, s161.a(qim0VarL0, (iu30) objT8));
                x340Var26.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sgi1(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
