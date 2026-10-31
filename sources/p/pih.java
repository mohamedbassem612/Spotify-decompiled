package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pih extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(hzm1 hzm1Var, iu30 iu30Var, es41 es41Var, cgq cgqVar, u911 u911Var, iu30 iu30Var2, uxy0 uxy0Var) {
        super(3);
        this.a = (byte) 8;
        this.c = hzm1Var;
        this.d = iu30Var;
        this.e = es41Var;
        this.f = cgqVar;
        this.b = u911Var;
        this.g = iu30Var2;
        this.h = uxy0Var;
    }

    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mhh mhhVar;
        Object obj4;
        ?? r13;
        ven0 ven0Var;
        int i;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.b;
        Object obj11 = this.c;
        switch (b) {
            case 0:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                ven0 ven0Var2 = (ven0) obj8;
                ven0 ven0Var3 = (ven0) obj9;
                ven0 ven0Var4 = (ven0) obj10;
                m4c m4cVar = fkj0.X;
                mhh mhhVar2 = (mhh) obj11;
                lhh lhhVar = mhhVar2.f;
                List listD1 = lhhVar.a;
                String str = lhhVar.d;
                if (lhhVar.b > 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(1688971134);
                    boolean zG = x340Var2.g(listD1) | x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        if (str == null) {
                            obj4 = obj5;
                        } else {
                            List listSingletonList = Collections.singletonList(str);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = listD1.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                Object next = it2.next();
                                Object obj12 = obj5;
                                if (!u890.j((String) next, str)) {
                                    arrayList.add(next);
                                }
                                it = it2;
                                obj5 = obj12;
                            }
                            obj4 = obj5;
                            listD1 = o7h.d1(o7h.N0(arrayList, listSingletonList), 3);
                        }
                        x340Var2.s0(listD1);
                        objT = listD1;
                    } else {
                        obj7 = obj7;
                        obj4 = obj5;
                    }
                    List list = (List) objT;
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = kaa0.h(0L, x340Var2);
                    }
                    ven0 ven0Var5 = (ven0) objT2;
                    int i2 = lhhVar.b;
                    String str2 = lhhVar.c;
                    boolean z = str != null;
                    Function0 function0 = (Function0) obj7;
                    boolean zI = x340Var2.i(ven0Var4) | x340Var2.i(mhhVar2) | x340Var2.i(ven0Var3) | x340Var2.i(ven0Var5) | x340Var2.i(ven0Var2);
                    ven0 ven0Var6 = (ven0) obj10;
                    ven0 ven0Var7 = (ven0) obj9;
                    ven0 ven0Var8 = (ven0) obj8;
                    mhhVar = mhhVar2;
                    Object objT3 = x340Var2.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new vt1(mhhVar, ven0Var6, ven0Var5, ven0Var7, ven0Var8);
                        ven0Var = ven0Var5;
                        x340Var2.s0(objT3);
                    } else {
                        ven0Var = ven0Var5;
                    }
                    Function0 function1 = (Function0) objT3;
                    qim0 qim0VarE = ew20Var.e(qim0Var, fraVar);
                    boolean zI2 = x340Var2.i(ven0Var);
                    Object objT4 = x340Var2.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new f4g(ven0Var, (byte) 7);
                        x340Var2.s0(objT4);
                    }
                    r6p1.h(list, i2, str2, z, function0, function1, ern1.x(qim0VarE, (iu30) objT4), x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    mhhVar = mhhVar2;
                    str = str;
                    obj4 = obj5;
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1689978262);
                    x340Var3.r(false);
                }
                if (str == null) {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(1690059234);
                    Function0 function2 = (Function0) obj6;
                    boolean zI3 = x340Var4.i(ven0Var4) | x340Var4.i(mhhVar) | x340Var4.i(ven0Var3) | x340Var4.i(ven0Var2);
                    Object objT5 = x340Var4.T();
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new ggh((Object) mhhVar, ven0Var4, (Object) ven0Var3, ven0Var2, (byte) 2);
                        x340Var4.s0(objT5);
                    }
                    r13 = 0;
                    r6p1.c(0, function2, x340Var4, (iu30) objT5, ew20Var.e(qim0Var, fraVar));
                    x340Var4.r(false);
                } else {
                    r13 = 0;
                    x340 x340Var5 = x340Var;
                    x340Var5.i0(1690355222);
                    x340Var5.r(false);
                }
                if (mhhVar.g == 1) {
                    x340 x340Var6 = x340Var;
                    x340Var6.i0(1690409100);
                    r6p1.k((int) r13, (Function0) obj4, x340Var6, ew20Var.e(qim0Var, fraVar));
                    x340Var6.r((boolean) r13);
                } else {
                    x340 x340Var7 = x340Var;
                    x340Var7.i0(1690510966);
                    x340Var7.r((boolean) r13);
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj6;
                ven0 ven0Var9 = (ven0) obj10;
                x340 x340Var8 = (b0k) obj2;
                Object objT6 = x340Var8.T();
                m4c m4cVar2 = fkj0.X;
                if (objT6 == m4cVar2) {
                    objT6 = r5r.c1;
                    x340Var8.s0(objT6);
                }
                qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT6);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var8).b;
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarB);
                long j = ((u7h) ((tob1) obj5).getValue()).a;
                long j2 = ((u7h) ((tob1) obj9).getValue()).a;
                boolean z2 = ((bnl) obj11).d;
                o95 o95Var = (o95) obj7;
                boolean zI4 = x340Var8.i(ven0Var9) | x340Var8.g(iu30Var);
                Object objT7 = x340Var8.T();
                if (zI4 || objT7 == m4cVar2) {
                    objT7 = new wq9(iu30Var, ven0Var9, (byte) 12);
                    x340Var8.s0(objT7);
                }
                qim0 qim0VarI = zr7.i(qim0VarZ, new g110(j, j2, z2, o95Var, (Function0) objT7));
                ah91 ah91Var = (ah91) obj8;
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var8.T);
                xos0 xos0VarM = x340Var8.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarI);
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
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                fdg1.h(ah91Var, x340Var8, 8);
                x340Var8.r(true);
                return rih1Var;
            case 2:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                jj10 jj10Var = (jj10) obj11;
                Function0 function3 = (Function0) obj7;
                Function0 function4 = (Function0) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj10;
                Locale locale = (Locale) obj9;
                TimeZone timeZone = (TimeZone) obj8;
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var9, 0);
                x340 x340Var10 = x340Var9;
                int iHashCode2 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM2 = x340Var10.m();
                qim0 qim0VarE3 = zr7.E(x340Var9, qim0Var);
                hzj.A.getClass();
                x340 x340Var11 = x340Var9;
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
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var9, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var9, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var9, lljVar3);
                nko1.F(x340Var9);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var9, lljVar4);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM3 = x340Var11.m();
                qim0 qim0VarE4 = zr7.E(x340Var9, qim0Var);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(gfh0VarC2, x340Var9, lljVar);
                nko1.H(xos0VarM3, x340Var9, lljVar2);
                i3a.l(iHashCode3, x340Var9, lljVar3, x340Var9);
                nko1.H(qim0VarE4, x340Var9, lljVar4);
                cuo1.q(jj10Var, h2c.a.b(qim0Var), x340Var9, 0);
                qim0 qim0VarJ = u291.j(295.0f, 0.0f, 2, u291.f(qim0Var, 1.0f));
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var9).b;
                qim0 qim0VarX = uyn1.x(qim0VarJ, 16.0f);
                mbh mbhVarA2 = jbh.a(h36.g, eraVar, x340Var9, 0);
                int iHashCode4 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM4 = x340Var11.m();
                qim0 qim0VarE5 = zr7.E(x340Var9, qim0VarX);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(mbhVarA2, x340Var9, lljVar);
                nko1.H(xos0VarM4, x340Var9, lljVar2);
                i3a.l(iHashCode4, x340Var9, lljVar3, x340Var9);
                nko1.H(qim0VarE5, x340Var9, lljVar4);
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var9, 0);
                int iHashCode5 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM5 = x340Var11.m();
                qim0 qim0VarE6 = zr7.E(x340Var9, qim0Var);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(mbhVarA3, x340Var9, lljVar);
                nko1.H(xos0VarM5, x340Var9, lljVar2);
                i3a.l(iHashCode5, x340Var9, lljVar3, x340Var9);
                nko1.H(qim0VarE6, x340Var9, lljVar4);
                if (jj10Var.k != null) {
                    x340Var11.i0(-1747453563);
                    vbe.s(jj10Var.k, anm1.N("HeaderPremiumOnlyText", qim0Var), 0L, 0L, cbx.d(x340Var9).k, false, x340Var9, 0, 44);
                    i = 0;
                    x340Var11.r(false);
                } else {
                    i = 0;
                    x340Var11.i0(-1747216723);
                    x340Var11.r(false);
                }
                cvx cvxVar3 = cbx.b(x340Var9).b;
                ydh.l(qim0Var, 16.0f, x340Var9, x340Var11, true);
                locale.getClass();
                timeZone.getClass();
                cuo1.p(jj10Var, str3, str4, locale, timeZone, x340Var9, 0);
                x340Var11.r(true);
                x340Var11.r(true);
                cuo1.e(jj10Var, function3, function4, x340Var9, i);
                x340Var11.r(true);
                return rih1Var;
            case 3:
                i2c i2cVar = (i2c) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                boolean z3 = p3v.b(i2cVar.d(), 600.0f) > 0;
                p3v p3vVar = new p3v(upo1.w(b0kVar, ((hdn0) obj11).s() * 2));
                float fD = i2cVar.d();
                cbx.a.getClass();
                upo1.j(pap1.y(p3vVar, new p3v(fD / uwr.d().a)).a, 384, 0, apo.r(614904668, new swj((odi0) obj10, (Function0) obj7, (Function0) obj6, (hdn0) obj11, (j2i) obj9, (Function0) obj5, (fns) obj8, z3), b0kVar), b0kVar, nim0.a);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                hzn0 hzn0Var = (hzn0) obj5;
                Object obj13 = fkj0.X;
                float fC = ((i2c) obj).c() * 0.8f;
                ods odsVar = (ods) obj11;
                x340 x340Var12 = (b0k) obj2;
                gfq0 gfq0Var = (gfq0) obj7;
                boolean zI5 = x340Var12.i(odsVar) | x340Var12.i(gfq0Var);
                Object objT8 = x340Var12.T();
                if (zI5 || objT8 == obj13) {
                    objT8 = new ocp0(odsVar, gfq0Var, (byte) 29);
                    x340Var12.s0(objT8);
                }
                Function0 function5 = (Function0) objT8;
                scx scxVar = (scx) obj6;
                boolean zI6 = x340Var12.i(hzn0Var) | x340Var12.i(odsVar);
                Object objT9 = x340Var12.T();
                if (zI6 || objT9 == obj13) {
                    objT9 = new neq0(hzn0Var, odsVar);
                    x340Var12.s0(objT9);
                }
                x74.f(function5, scxVar, (mfx) objT9, true, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-1201083495, new oeq0((r1q0) obj10, (ods) obj11, fC, (rzo0) obj9, gfq0Var, (th61) obj8), x340Var12), x340Var12, 12585984, 48, 1904);
                return rih1Var;
            case 5:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                oho1.h(u291.c(u291.f(qim0Var, 1.0f), 0.5f), x340Var13, 0);
                qim0 qim0VarH = l6o1.H(uyn1.w(u291.d(qim0Var, 1.0f), (vzq0) obj), l6o1.C(0, 0, 1, x340Var13), false, 14);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var13).b;
                qim0 qim0VarX2 = uyn1.x(qim0VarH, 16.0f);
                era eraVar2 = een.Q0;
                rhm0 rhm0Var = (rhm0) obj11;
                String str5 = rhm0Var.a;
                iu30 iu30Var2 = (iu30) obj10;
                r6r r6rVar = (r6r) obj9;
                iu30 iu30Var3 = (iu30) obj8;
                Function0 function6 = (Function0) obj7;
                Function0 function7 = (Function0) obj6;
                Function0 function8 = (Function0) obj5;
                mbh mbhVarA4 = jbh.a(f36Var, eraVar2, x340Var13, 0);
                x340 x340Var14 = x340Var13;
                int iHashCode6 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM6 = x340Var14.m();
                qim0 qim0VarE7 = zr7.E(x340Var13, qim0VarX2);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA4, x340Var13, y580.O0);
                nko1.H(xos0VarM6, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE7, x340Var13, y580.Y);
                oho1.i(str5, rhm0Var.b, x340Var13, 0);
                op71.g(x340Var13, u291.h(qim0Var, cbx.b(x340Var13).b.b));
                e6r e6rVar = rhm0Var.d;
                boolean z4 = !rhm0Var.e;
                int i3 = rhm0Var.c;
                boolean zG2 = x340Var15.g(iu30Var3);
                Object objT10 = x340Var15.T();
                if (zG2 || objT10 == fkj0.X) {
                    objT10 = new ipy(iu30Var3, (byte) 27);
                    x340Var15.s0(objT10);
                }
                oho1.c(str5, e6rVar, iu30Var2, r6rVar, z4, i3, (xu30) objT10, function6, x340Var13, 4096);
                op71.g(x340Var13, new wnb0(1.0f, true));
                qim0 qim0VarB2 = uyn1.B(u291.f(qim0Var, 1.0f), 0.0f, cbx.b(x340Var13).b.b, 0.0f, 0.0f, 13);
                boolean z5 = rhm0Var.e;
                oho1.g(z5, (z5 || rhm0Var.d == null) ? false : true, function7, function8, qim0VarB2, x340Var13, 0);
                x340Var15.r(true);
                return rih1Var;
            case 6:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                d36 d36Var = new d36(cbx.b(x340Var16).b.b, true, new um5(false));
                qim0 qim0VarB3 = uyn1.B(uyn1.w(l6o1.H(qim0Var, l6o1.C(0, 0, 1, x340Var16), false, 14), (vzq0) obj), 0.0f, 0.0f, 0.0f, cbx.b(x340Var16).b.b, 7);
                nb81 nb81Var = (nb81) obj11;
                kb81 kb81Var = (kb81) obj7;
                kls0 kls0Var = (kls0) obj6;
                et90 et90Var = (et90) obj5;
                u961 u961Var = (u961) obj10;
                s24 s24Var = (s24) obj9;
                j7a1 j7a1Var = (j7a1) obj8;
                mbh mbhVarA5 = jbh.a(d36Var, een.P0, x340Var16, 0);
                x340 x340Var17 = x340Var16;
                int iHashCode7 = Long.hashCode(x340Var17.T);
                xos0 xos0VarM7 = x340Var17.m();
                qim0 qim0VarE8 = zr7.E(x340Var16, qim0VarB3);
                hzj.A.getClass();
                x340 x340Var18 = x340Var16;
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
                nko1.H(mbhVarA5, x340Var16, y580.O0);
                nko1.H(xos0VarM7, x340Var16, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var16, y580.R0);
                nko1.F(x340Var16);
                nko1.H(qim0VarE8, x340Var16, y580.Y);
                ton1.h(0, nb81Var.a, nb81Var.b, x340Var16, uyn1.z(16.0f, 0.0f, 2, qim0Var));
                x340Var18.i0(-705361071);
                for (zb81 zb81Var : nb81Var.c) {
                    h7p1.p(zb81Var, kb81Var, kls0Var, et90Var, u961Var, s24Var, j7a1Var, ((zb81Var instanceof rb81) || (zb81Var instanceof xb81) || (zb81Var instanceof tb81) || (zb81Var instanceof yb81) || (zb81Var instanceof vb81)) ? qim0Var : uyn1.z(16.0f, 0.0f, 2, qim0Var), x340Var16, 0);
                }
                x340Var18.r(false);
                x340Var18.r(true);
                return rih1Var;
            case 7:
                u7h u7hVar = (u7h) obj11;
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var19 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var19.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    uwr uwrVar5 = cbx.a;
                    gaa1.a(u7hVar, cbx.a(x340Var20).a.a.a(), ((vex) zex.a.e).c, uyn1.B(too1.i(u291.d(qim0Var, 1.0f), uyn1.j(0.0f, vzq0Var.d(), 0.0f, 0.0f, 13)), 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), false, (fe5) null, apo.r(-432473774, new wy51((hw2) obj7, (String) obj6, (lik1) obj5, (x8a1) obj10, (cm0) obj9, vzq0Var, u7hVar, (w6a1) obj8, (byte) 4), x340Var20), x340Var20, 1572864, 48);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            default:
                sio1.g(((hzm1) obj11).b, (iu30) obj7, (es41) obj6, (cgq) obj5, (u911) obj10, (iu30) obj9, (qim0) ((uxy0) obj8).c, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 21) & 29360128);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(mhh mhhVar, Function0 function0, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, Function0 function1, Function0 function2) {
        super(3);
        this.a = (byte) 0;
        this.c = mhhVar;
        this.d = function0;
        this.b = ven0Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
        this.e = function1;
        this.f = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(bnl bnlVar, o95 o95Var, ven0 ven0Var, iu30 iu30Var, tob1 tob1Var, tob1 tob1Var2, ah91 ah91Var) {
        super(3);
        this.a = (byte) 1;
        this.c = bnlVar;
        this.d = o95Var;
        this.b = ven0Var;
        this.e = iu30Var;
        this.f = tob1Var;
        this.g = tob1Var2;
        this.h = ah91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(rhm0 rhm0Var, iu30 iu30Var, r6r r6rVar, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2) {
        super(3);
        this.a = (byte) 5;
        this.c = rhm0Var;
        this.b = iu30Var;
        this.g = r6rVar;
        this.h = iu30Var2;
        this.d = function0;
        this.e = function1;
        this.f = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(hdn0 hdn0Var, odi0 odi0Var, Function0 function0, Function0 function1, j2i j2iVar, Function0 function2, fns fnsVar) {
        super(3);
        this.a = (byte) 3;
        this.c = hdn0Var;
        this.b = odi0Var;
        this.d = function0;
        this.e = function1;
        this.g = j2iVar;
        this.f = function2;
        this.h = fnsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(nb81 nb81Var, kb81 kb81Var, kls0 kls0Var, et90 et90Var, u961 u961Var, s24 s24Var, j7a1 j7a1Var) {
        super(3);
        this.a = (byte) 6;
        this.c = nb81Var;
        this.d = kb81Var;
        this.e = kls0Var;
        this.f = et90Var;
        this.b = u961Var;
        this.g = s24Var;
        this.h = j7a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pih(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
