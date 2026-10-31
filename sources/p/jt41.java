package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jt41 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt41(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        f4r f4rVarB;
        wul1 wul1Var;
        int i;
        Object obj3;
        Object obj4;
        Object objI;
        Object obj5;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        byte b2 = 7;
        nim0 nim0Var = nim0.a;
        String strU = null;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                rrn1.r((es41) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                snc0 snc0Var = (snc0) obj;
                rzq rzqVar = (rzq) obj7;
                ArrayList<Map.Entry> arrayList = new ArrayList();
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    r7h.W(((tg50) it.next()).b.entrySet(), arrayList);
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Map.Entry entry : arrayList) {
                    Class cls = (Class) entry.getKey();
                    r3r r3rVar = (wrw) entry.getValue();
                    r3r r3rVar2 = r3rVar instanceof r3r ? r3rVar : null;
                    if (r3rVar2 == null || (wul1Var = r3rVar2.a) == null || (f4rVarB = wul1Var.getData()) == null) {
                        f4rVarB = r3rVar.b();
                    }
                    linkedHashMap.put(cls, f4rVarB);
                }
                wdm wdmVar = (wdm) obj6;
                return new s551(snc0Var, rzqVar, linkedHashMap, (y751) wdmVar.g, (hc51) wdmVar.i, (q8n) wdmVar.t);
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u651 u651Var = (u651) obj7;
                    od51 od51Var = (od51) obj6;
                    u85 u85Var = (erl1) x340Var2.k(szf0.b);
                    if (u85Var == null) {
                        x340Var2.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var2).g;
                    } else {
                        x340Var2.i0(-241885792);
                    }
                    x340Var2.r(false);
                    u651Var.b(od51Var, too1.y(nim0Var, new bgc0(u85Var, 16)), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                u890.c((pa51) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                f3o1.c((qa51) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ila0.i((ta51) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ec51 ec51Var = (ec51) obj;
                long jLongValue = ((Number) obj2).longValue();
                ac51 ac51Var = ec51Var.g;
                return (ac51Var != null ? ac51Var.d : null) != ((cc51) obj7) ? new yb51(ec51Var, (zb51) null, 6) : new yb51(ec51.a(ec51Var, 0, 0L, 0L, 0, 0, (Integer) null, (ac51) ((vu30) obj6).invoke(ac51Var, Long.valueOf(jLongValue)), 0L, 191), (zb51) null, 6);
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pp51 pp51Var = (pp51) obj7;
                    ar30 ar30Var = (ar30) obj6;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var4, nim0Var2);
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
                    nko1.H(mbhVarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    String str = pp51Var.a;
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var4).e;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    uwo1.e(str, uyn1.B(nim0Var2, 16.0f, 0.0f, 0.0f, 16.0f, 6), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2040);
                    x340Var4.i0(657128978);
                    for (String str2 : pp51Var.b) {
                        yp51 yp51Var = (yp51) ar30Var.h;
                        int iC = l1d.C(pp51Var.c);
                        if (iC == 0) {
                            i = 2;
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            i = 1;
                        }
                        otw.c(yp51Var, new tp51(str2, i), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    }
                    x340Var4.r(false);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((yp51) obj7).f((String) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ((tob1) obj6).getValue()).booleanValue();
                    iu30 iu30Var = (iu30) obj7;
                    qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    aex.b(zBooleanValue, iu30Var, uyn1.B(qim0VarC, cbx.b(x340Var6).e.b, 0.0f, 0.0f, 0.0f, 14), (String) null, 0, (idn0) null, (ga80) null, x340Var6, 0, 120);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj6;
                qob1 qob1Var = (qob1) obj7;
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else if (qob1Var instanceof mmb1) {
                    x340Var8.i0(1641134084);
                    mmb1 mmb1Var = (mmb1) qob1Var;
                    String str3 = mmb1Var.b;
                    String str4 = mmb1Var.c;
                    String str5 = mmb1Var.d;
                    String str6 = mmb1Var.e;
                    boolean zG = x340Var8.g(iu30Var2);
                    Object objT = x340Var8.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        wg31 wg31Var = new wg31(iu30Var2, (byte) 29);
                        x340Var8.s0(wg31Var);
                        obj3 = wg31Var;
                    }
                    obj3 = objT;
                    bno1.g(str3, str4, str5, str6, (Function0) obj3, (qim0) null, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(1641374334);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 11:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj6;
                rob1 rob1Var = (rob1) obj7;
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else if (rob1Var instanceof hmb1) {
                    x340Var10.i0(-1182350354);
                    String strO0 = cwl1.o0(x340Var10, 2131961633);
                    hmb1 hmb1Var = (hmb1) rob1Var;
                    Integer num = hmb1Var.c;
                    if (num == null) {
                        x340Var10.i0(-1182234415);
                    } else {
                        x340Var10.i0(-1182234414);
                        int iIntValue6 = num.intValue();
                        strU = cwl1.U(2131820889, iIntValue6, new Object[]{Integer.valueOf(iIntValue6)}, x340Var10);
                    }
                    x340Var10.r(false);
                    String str7 = hmb1Var.a;
                    String str8 = hmb1Var.b;
                    c380 c380VarA = mqo1.A(f46.i0(new String[]{strO0, strU}));
                    boolean zG2 = x340Var10.g(iu30Var3);
                    Object objT2 = x340Var10.T();
                    if (zG2 || objT2 == fkj0.X) {
                        obj4 = objT2;
                        m861 m861Var = new m861(iu30Var3, z ? (byte) 1 : (byte) 0);
                        x340Var10.s0(m861Var);
                        obj4 = m861Var;
                    }
                    obj4 = objT2;
                    fno1.d(str7, str8, c380VarA, (Function0) obj4, (qim0) null, x340Var10, 0);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(-1181911177);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                vqo1.e((l8v0) obj7, (Function0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj6;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objT3 = x340Var12.T();
                    m4c m4cVar = fkj0.X;
                    if (objT3 == m4cVar) {
                        objI = objT3;
                        objI = pzm.i(x340Var12);
                    }
                    objI = objT3;
                    lz20 lz20Var = (lz20) objI;
                    Object objT4 = x340Var12.T();
                    Object obj8 = objT4;
                    if (objT4 == m4cVar) {
                        fx1 fx1Var = new fx1(lz20Var, (lnm) null, (byte) 11);
                        x340Var12.s0(fx1Var);
                        obj8 = fx1Var;
                    }
                    qxd0.t(rih1Var, x340Var12, (vu30) obj8);
                    vt61 vt61Var = (vt61) obj7;
                    lqs0 lqs0Var = vt61.j;
                    c8e1 c8e1Var = (c8e1) ven0Var.getValue();
                    boolean zG3 = x340Var12.g(ven0Var);
                    Object objT5 = x340Var12.T();
                    Object obj9 = objT5;
                    if (zG3 || objT5 == m4cVar) {
                        r9y0 r9y0Var = new r9y0(ven0Var, (byte) 20);
                        x340Var12.s0(r9y0Var);
                        obj9 = r9y0Var;
                    }
                    vt61Var.b(c8e1Var, (iu30) obj9, vby0.p(nim0Var, lz20Var), x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((vt61) obj7).c((sjq0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ((pu61) obj7).c(0, (String) obj6, x340Var14, (qim0) null);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((pu61) obj7).b(czo1.p(7), (j2i) obj6, (b0k) obj);
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                vxo1.f((j171) obj7, (r171) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj6;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String str9 = ((p871) obj7).a;
                    boolean zG4 = x340Var16.g(iu30Var4);
                    Object objT6 = x340Var16.T();
                    if (zG4 || objT6 == fkj0.X) {
                        obj5 = objT6;
                        m861 m861Var2 = new m861(iu30Var4, b2);
                        x340Var16.s0(m861Var2);
                        obj5 = m861Var2;
                    }
                    obj5 = objT6;
                    wyo1.e(0, str9, (Function0) obj5, x340Var16, (qim0) null);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                ((s871) obj7).n1((xtj) obj6, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                zzo1.h((la71) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zzo1.h((u9) obj7, (qim0) obj6, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 22:
                return new ldo(((cl71) obj7).a, ((ji50) obj6).a);
            case 23:
                ((Number) obj2).intValue();
                o2p1.d((flw0) obj7, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                long jLongValue2 = ((Number) obj).longValue();
                long jLongValue3 = ((Number) obj2).longValue();
                if (!((l811) obj7).a) {
                    AtomicLong atomicLong = no71.a;
                    vu30 vu30Var = (vu30) ((ven0) obj6).getValue();
                    if (vu30Var != null) {
                        vu30Var.invoke(Long.valueOf(jLongValue2), Long.valueOf(jLongValue3));
                    }
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                d3p1.s((t7q0) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i3p1.l((bq71) obj7, (qim0) null, (gm31) ((yxb0) obj6).e, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) obj7), apo.r(1555006372, new i90((c380) obj6, (byte) 13), x340Var22), x340Var22, 56);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var23 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var24).a.c, d4o1.a);
                    ze71 ze71Var = (ze71) obj7;
                    wx71 wx71Var = (wx71) obj6;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM2 = x340Var24.m();
                    qim0 qim0VarE2 = zr7.E(x340Var24, qim0VarF2);
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
                    nko1.H(gfh0VarC, x340Var24, y580.O0);
                    nko1.H(xos0VarM2, x340Var24, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var24, y580.R0);
                    nko1.F(x340Var24);
                    nko1.H(qim0VarE2, x340Var24, y580.Y);
                    otw.c(ze71Var, new xe71(wx71Var.e, wx71Var.a, wx71Var.b, wx71Var.c, wx71Var.d, wx71Var.f, wx71Var.g), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                a081.c((iix0) obj7, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt41(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
