package p;

import androidx.compose.ui.platform.ComposeView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zt6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt6(ymd0 ymd0Var, j2i j2iVar, Function0 function0) {
        super(2);
        this.a = (byte) 27;
        this.b = ymd0Var;
        this.d = j2iVar;
        this.c = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        k4m k4mVar;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj10 = this.d;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                mmo1.i((au6) obj12, (Function0) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                zmo1.i((String) obj12, (u7h) obj11, (tob1) obj10, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((b87) obj12).h((String) obj11, (yud) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((q87) obj12).e(czo1.p(1), (Function0) obj11, (b0k) obj, (qim0) obj10);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((fp7) obj12).h((c380) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                puo1.a((pw50) obj12, (qim0) obj10, (Function0) obj11, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ve8 ve8Var = (ve8) obj12;
                    wxo1.i((wj31) ve8Var.c, (List) ve8Var.d, ((rk41) obj11).a, (Map) obj10, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                vuk vukVar = (vuk) obj;
                Logger.g("Build Authenticated scope called", new Object[0]);
                tif1.a((tif1) obj12, "authenticated_scope", (String) null, 2);
                return yoi1.g(vukVar.f().c.filter(y580.f).map(new zwg((tif1) obj12, (lxg) obj11, vukVar, (dn41) obj2, (kly0) obj10)));
            case 8:
                ((Number) obj2).intValue();
                gyo1.a((lj8) obj12, (Function0) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                qyo1.c((cn8) obj12, (iu30) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ryo1.c((qn8) obj12, (iu30) obj11, (qim0) null, (yqg) obj10, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ix7 ix7Var = (ix7) obj10;
                    tyo1.a((ep8) obj12, (iu30) obj11, (yqg) ix7Var.c, ((di4) ix7Var.d).g0(), (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((ob9) obj12).e((td10) obj11, (qim0) obj10, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 13:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    qim0 qim0VarI = zr7.i(nim0Var, new qr9((Function0) obj11, (or9) obj12, (byte) 1));
                    h72 h72Var = (h72) obj10;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarI);
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
                    nko1.H(mbhVarA, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    otw.c((nl9) h72Var.c, rih1Var2, (qim0) null, (ipb1) null, x340Var8, 56, 12);
                    h72Var.c((qim0) null, x340Var8, 0);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 14:
                ((Number) obj2).intValue();
                ((h72) obj12).l((ds9) obj11, (qim0) obj10, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 15:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                hn9 hn9Var = (hn9) obj12;
                iu30 iu30Var = (iu30) obj10;
                fn9 fn9Var = (fn9) obj11;
                List list = fn9Var.c;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int iC = l1d.C(hn9Var.i);
                    if (iC == 0) {
                        x340Var10.i0(-1928724646);
                        c380 c380VarA = mqo1.A(list);
                        u7h u7hVar = fn9Var.d;
                        boolean z = hn9Var.g;
                        j2i j2iVarR = apo.r(-734994316, new t20(hn9Var, fn9Var, (byte) 4), x340Var10);
                        boolean zG = x340Var10.g(iu30Var);
                        Object objT = x340Var10.T();
                        if (zG || objT == m4cVar) {
                            obj3 = objT;
                            nc8 nc8Var = new nc8(iu30Var, (byte) 4);
                            x340Var10.s0(nc8Var);
                            obj3 = nc8Var;
                        }
                        o2p1.a(c380VarA, j2iVarR, (Function0) obj3, z, (qim0) null, u7hVar, x340Var10, 48);
                        x340Var10.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var10, 76328917, false);
                        }
                        x340Var10.i0(-1927675575);
                        c380 c380VarA2 = mqo1.A(list);
                        u7h u7hVar2 = fn9Var.d;
                        boolean z2 = hn9Var.t;
                        boolean zG2 = x340Var10.g(iu30Var);
                        Object objT2 = x340Var10.T();
                        if (zG2 || objT2 == m4cVar) {
                            obj4 = objT2;
                            nc8 nc8Var2 = new nc8(iu30Var, (byte) 5);
                            x340Var10.s0(nc8Var2);
                            obj4 = nc8Var2;
                        }
                        l2p1.b(c380VarA2, (Function0) obj4, (qim0) null, u7hVar2, z2, x340Var10, 0);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj11;
                nl9 nl9Var = (nl9) obj10;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    wn9 wn9Var = (wn9) obj12;
                    j2i j2iVarR2 = apo.r(944739582, new zn9(nl9Var, (byte) 0), x340Var12);
                    j2i j2iVarR3 = apo.r(386755519, new zn9(nl9Var, (byte) 1), x340Var12);
                    j2i j2iVarR4 = apo.r(-171228544, new zn9(nl9Var, (byte) 2), x340Var12);
                    boolean zG3 = x340Var12.g(iu30Var2);
                    Object objT3 = x340Var12.T();
                    if (zG3 || objT3 == fkj0.X) {
                        obj5 = objT3;
                        nc8 nc8Var3 = new nc8(iu30Var2, (byte) 6);
                        x340Var12.s0(nc8Var3);
                        obj5 = nc8Var3;
                    }
                    obj5 = objT3;
                    u2p1.c(wn9Var, j2iVarR2, j2iVarR3, j2iVarR4, (Function0) obj5, (qim0) null, x340Var12, 3504);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ro9 ro9Var = (ro9) obj11;
                m4c m4cVar2 = fkj0.X;
                ComposeView composeView = (ComposeView) obj12;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI = x340Var14.i(composeView);
                    Object objT4 = x340Var14.T();
                    if (zI || objT4 == m4cVar2) {
                        obj6 = objT4;
                        it1 it1Var = new it1(composeView, (byte) 1);
                        x340Var14.s0(it1Var);
                        obj6 = it1Var;
                    }
                    op80 op80VarK = j6p1.k(new jp80((Function0) obj6), new eq80(ro9Var.d));
                    Object objT5 = x340Var14.T();
                    Object obj13 = objT5;
                    if (objT5 == m4cVar2) {
                        fm9 fm9Var = fm9.b1;
                        x340Var14.s0(fm9Var);
                        obj13 = fm9Var;
                    }
                    op80 op80VarK2 = j6p1.k(op80VarK, new h3h1((iu30) obj13));
                    kiv kivVar = gfe0.a;
                    boolean zI2 = x340Var14.i(op80VarK2);
                    Object objT6 = x340Var14.T();
                    Object obj14 = objT6;
                    if (zI2 || objT6 == m4cVar2) {
                        gt1 gt1Var = new gt1(op80VarK2, (byte) 1);
                        x340Var14.s0(gt1Var);
                        obj14 = gt1Var;
                    }
                    mod.b(gfe0.d((Function0) obj14, x340Var14), apo.r(-136770225, new po9(ro9Var, (tm) obj10, (byte) 1), x340Var14), x340Var14, 56);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                o4p1.a((w8d1) obj12, (qim0) obj10, (Function0) obj11, (b0k) obj, czo1.p(1));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                ((l8a) obj12).a(czo1.p(1), (Function0) obj11, (b0k) obj, (qim0) obj10);
                return rih1Var;
            case 20:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj11;
                m4c m4cVar3 = fkj0.X;
                ula ulaVar = (ula) obj12;
                rla rlaVar = ulaVar.a;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zI3 = x340Var16.i(ulaVar);
                    Object objT7 = x340Var16.T();
                    if (zI3 || objT7 == m4cVar3) {
                        obj7 = objT7;
                        tla tlaVar = new tla(ulaVar, false ? (byte) 1 : (byte) 0);
                        x340Var16.s0(tlaVar);
                        obj7 = tlaVar;
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) obj7);
                    boolean zG4 = x340Var16.g(tob1Var);
                    Object objT8 = x340Var16.T();
                    Object obj15 = objT8;
                    if (zG4 || objT8 == m4cVar3) {
                        lq2 lq2Var = new lq2(tob1Var, (byte) 20);
                        x340Var16.s0(lq2Var);
                        obj15 = lq2Var;
                    }
                    qim0 qim0VarC = i541.C(qim0VarA, (iu30) obj15);
                    rk41 rk41Var = (rk41) obj10;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM2 = x340Var16.m();
                    qim0 qim0VarE2 = zr7.E(x340Var16, qim0VarC);
                    hzj.A.getClass();
                    if (x340Var16.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC, x340Var16, y580.O0);
                    nko1.H(xos0VarM2, x340Var16, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var16, y580.R0);
                    nko1.F(x340Var16);
                    nko1.H(qim0VarE2, x340Var16, y580.Y);
                    x340Var16.i0(-1990412530);
                    rlaVar.d.b(new jj31(rk41Var.a, 0, u291.d(nim0Var, 1.0f), 2, (jfe) null, rlaVar.e, (Map) null, false, false, (Function0) null, (iu30) null, 4048), x340Var16, 8);
                    x340Var16.r(false);
                    x340Var16.r(true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                ea61 ea61Var = (ea61) obj10;
                iu30 iu30Var3 = (iu30) obj11;
                ic9 ic9Var = (ic9) obj12;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zI4 = x340Var18.i(ic9Var) | x340Var18.g(iu30Var3) | x340Var18.i(ea61Var);
                    Object objT9 = x340Var18.T();
                    if (zI4 || objT9 == fkj0.X) {
                        obj8 = objT9;
                        hh hhVar = new hh(ic9Var, iu30Var3, ea61Var, (byte) 29);
                        x340Var18.s0(hhVar);
                        obj8 = hhVar;
                    }
                    obj8 = objT9;
                    m3b.b(0, (Function0) obj8, x340Var18, (qim0) null);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 22:
                crb crbVar = (crb) obj10;
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    it8 it8Var = (it8) ((yxb0) obj12).f;
                    ta0 ta0Var = (ta0) obj11;
                    String id = crbVar.getId();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) it8Var.c;
                    String str = (String) it8Var.b;
                    String str2 = ta0Var.a;
                    if (!u890.j(str, str2)) {
                        it8Var.b = str2;
                        linkedHashMap.clear();
                    }
                    Object obj16 = linkedHashMap.get(id);
                    Object obj17 = obj16;
                    if (obj16 == null) {
                        maa maaVar = (maa) ta0Var.c.p().invoke(id);
                        linkedHashMap.put(id, maaVar);
                        obj17 = maaVar;
                    }
                    otw.c((maa) obj17, crbVar, (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    h7w.n(((qsb) obj12) instanceof psb, apo.r(-818937647, new hj8(obj11, obj10, (byte) 17), x340Var22), x340Var22, 48);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                x760.b((swb) obj12, (qim0) obj10, (iu30) obj11, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 25:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj12;
                swb swbVar = (swb) obj11;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    gdx gdxVarR = yla.r(x340Var24);
                    boolean zG5 = x340Var24.g(iu30Var4) | x340Var24.i(swbVar);
                    Object objT10 = x340Var24.T();
                    if (zG5 || objT10 == fkj0.X) {
                        obj9 = objT10;
                        wvb wvbVar = new wvb(iu30Var4, swbVar, (byte) 2);
                        x340Var24.s0(wvbVar);
                        obj9 = wvbVar;
                    }
                    obj9 = objT10;
                    foo1.c(new gbx(z50.c, (Function0) obj9), ldx.c, (qim0) null, (max) null, gdxVarR, (vzq0) null, (idn0) obj10, (ga80) null, (vu30) null, swbVar.h ? v9i.b : null, apo.r(-866585349, new xvb(swbVar, (byte) 2), x340Var24), x340Var24, 100663296, 48, 604);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                l2c l2cVar = (l2c) obj12;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String str3 = l2cVar.a;
                    String str4 = l2cVar.b;
                    String str5 = l2cVar.g;
                    String str6 = l2cVar.i;
                    if (l2cVar.d) {
                        k4mVar = k4m.a;
                    } else {
                        k4mVar = l2cVar.c ? k4m.b : k4m.d;
                    }
                    k4m k4mVar2 = k4mVar;
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var26).b;
                    rqg0.d(str3, str4, str5, str6, k4mVar2, uyn1.B(wnb0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), x340Var26, 0);
                    z0i z0iVar = l2cVar.t;
                    if (z0iVar == null) {
                        x340Var26.i0(-1619808089);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(-1619808088);
                        ((cce) obj11).a(8, (o0i) obj10, z0iVar, x340Var26, new i5j1(een.N0));
                        x340Var26.r(false);
                    }
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ((j2i) obj10).J((o5e0) b2p1.B((ymd0) obj12, h5e0.a, x340Var28, 0).getValue(), (Function0) obj11, x340Var28, 0);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                hqq0.d((m7c) obj12, (qim0) obj10, (Function0) obj11, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((cab) obj12).g((emt) obj11, (qim0) obj10, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt6(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt6(Object obj, qim0 qim0Var, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = qim0Var;
        this.c = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt6(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
