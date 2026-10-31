package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class dl91 implements Update {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.Update
    public final Next a(Object obj, Object obj2) {
        Object next;
        Boolean bool;
        Iterator it;
        Next next2;
        if81 if81Var;
        rtw0 rtw0Var;
        boolean zJ;
        if81 if81Var2;
        String str;
        yj91 yj91VarY;
        kl91 kl91VarA = (kl91) obj;
        tk91 tk91Var = (yk91) obj2;
        rtw0 rtw0Var2 = rtw0.g;
        Map map = kl91VarA.n;
        Map map2 = kl91VarA.m;
        List list = kl91VarA.l;
        Map map3 = kl91VarA.d;
        Map map4 = kl91VarA.c;
        jdu0 jdu0Var = kl91VarA.b;
        String str2 = jdu0Var.a;
        Map map5 = kl91VarA.e;
        boolean z = tk91Var instanceof hk91;
        skg skgVar = skg.c;
        if (z) {
            hk91 hk91Var = (hk91) tk91Var;
            int i = hk91Var.a;
            Integer numValueOf = Integer.valueOf(i);
            String str3 = hk91Var.b;
            Map mapP = sqg0.P(map4, oqn1.n(numValueOf, str3));
            Integer numValueOf2 = Integer.valueOf(i);
            li91 li91Var = hk91Var.c;
            Next nextM = rtw0.M(vbe.z(kl91.a(kl91VarA, null, mapP, sqg0.P(map3, oqn1.n(numValueOf2, li91Var)), null, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 524275)), kl91VarA);
            shs0 shs0Var = (shs0) vbe.w(nextM).r.get(str3);
            return (shs0Var != null && skgVar == li91Var.d() && u890.j(shs0Var.a(), vbe.w(nextM).b.g)) ? vbe.y(kl91.a(vbe.w(nextM), null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, sqg0.K(str3, vbe.w(nextM).r), false, 393215), dm61.x0(new yj91(i, 5, str3), nextM.b())) : nextM;
        }
        Object qj91Var = null;
        if (tk91Var instanceof ik91) {
            int i2 = ((ik91) tk91Var).a;
            Next nextZ = vbe.z(kl91.a(kl91VarA, null, sqg0.K(Integer.valueOf(i2), map4), sqg0.K(Integer.valueOf(i2), map3), null, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 524275));
            String str4 = (String) map4.get(Integer.valueOf(i2));
            ubm ubmVar = str4 != null ? (ubm) map5.get(str4) : null;
            String strB = ubmVar != null ? ubmVar.b() : null;
            return (strB == 0 || rtw0.A(vbe.w(nextZ)).contains(strB)) ? nextZ : rtw0.U(nextZ, new gk91(strB), 8000L);
        }
        if (tk91Var instanceof gk91) {
            String str5 = ((gk91) tk91Var).a;
            if (rtw0.A(kl91VarA).contains(str5)) {
                return Next.j();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map5.entrySet()) {
                if (!u890.j((String) entry.getKey(), str5)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return vbe.z(kl91.a(kl91VarA, null, null, null, linkedHashMap, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 524271));
        }
        if (tk91Var instanceof qk91) {
            jdu0 jdu0Var2 = ((qk91) tk91Var).a;
            boolean z2 = jdu0Var2.n;
            boolean z3 = jdu0Var2.m;
            String str6 = jdu0Var2.a;
            Next nextY = rtw0.y(rtw0.M(vbe.z(kl91.a(kl91VarA, jdu0Var2, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 524285)), kl91VarA));
            boolean z4 = jdu0Var.m;
            if (!u890.j(str2, vbe.w(nextY).b.a) && vbe.w(nextY).b.m && !vbe.w(nextY).b.l) {
                ubm ubmVar2 = (ubm) vbe.w(nextY).e.get(vbe.w(nextY).b.a);
                if (ubmVar2 != null && ubmVar2.e().c()) {
                    nextY = vbe.y(vbe.w(nextY), dm61.y0(nextY.b(), Collections.singleton(new pj91(vbe.w(nextY).b.a, true, true))));
                }
            }
            if (vbe.w(nextY).a.e) {
                jdu0 jdu0Var3 = vbe.w(nextY).b;
                boolean z5 = jdu0Var3.j && !jdu0Var3.l && jdu0Var3.m;
                vk91 vk91Var = vk91.a;
                if (z5 && !vbe.w(nextY).j) {
                    nextY = rtw0.U(vbe.y(kl91.a(vbe.w(nextY), null, null, null, null, null, null, null, false, true, 0, null, null, null, null, 0, 0, null, false, 523775), nextY.b()), vk91Var, 6000L);
                } else if (!z5 && vbe.w(nextY).j) {
                    nextY = rtw0.x(vbe.y(kl91.a(vbe.w(nextY), null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 523775), nextY.b()), vk91Var);
                }
            }
            if (vbe.w(nextY).a.o && jdu0Var2.o) {
                str = str6;
                boolean zJ2 = u890.j(str2, str);
                boolean z6 = z2 && !z3;
                boolean z7 = z4 && !z3;
                if (((!zJ2 && z6) || z7) && (yj91VarY = rtw0.Y(vbe.w(nextY), str)) != null) {
                    nextY = vbe.y(vbe.w(nextY), dm61.x0(yj91VarY, nextY.b()));
                }
            } else {
                str = str6;
            }
            String str7 = jdu0Var2.g;
            if (jdu0Var2.q) {
                boolean z8 = (u890.j(str2, str) && u890.j(jdu0Var.g, str7)) ? false : true;
                boolean z9 = z2 && !z3;
                boolean z10 = z4 && !z3;
                if ((z8 && z9) || z10) {
                    if (!rtw0.B(vbe.w(nextY), str, Collections.singleton(skgVar))) {
                        shs0 shs0Var2 = new shs0(str7);
                        return rtw0.U(vbe.y(kl91.a(vbe.w(nextY), null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, sqg0.P(vbe.w(nextY).r, oqn1.n(str, shs0Var2)), false, 393215), nextY.b()), new tk91(str, shs0Var2), 5000L);
                    }
                    Integer numX = rtw0.X(vbe.w(nextY), false);
                    yj91 yj91Var = numX != null ? new yj91(numX.intValue(), 5, str) : null;
                    if (yj91Var != null) {
                        return vbe.y(vbe.w(nextY), dm61.x0(yj91Var, nextY.b()));
                    }
                }
            }
            return nextY;
        }
        boolean z11 = tk91Var instanceof jk91;
        if81 if81Var3 = if81.a;
        if81 if81Var4 = if81.b;
        if (z11) {
            if81 if81Var5 = if81Var3;
            rtw0 rtw0Var3 = rtw0Var2;
            Next nextZ2 = vbe.z(kl91.a(kl91VarA, null, null, null, ((jk91) tk91Var).a, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 524271));
            Set setO1 = o7h.o1(nextZ2.b());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList<mmr0> arrayList = new ArrayList();
            Collection collectionValues = vbe.w(nextZ2).e.values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : collectionValues) {
                if (!map5.containsKey(((ubm) obj3).b())) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ubm ubmVar3 = (ubm) it2.next();
                yrc0 yrc0VarC = ubmVar3.c();
                if (yrc0VarC != null) {
                    String strB2 = ubmVar3.b();
                    Boolean boolT = rtw0.T(ubmVar3);
                    kl91 kl91VarW = vbe.w(nextZ2);
                    ubm ubmVar4 = (ubm) kl91VarW.e.get(strB2);
                    if (ubmVar4 != null) {
                        rtw0Var = rtw0Var3;
                        zJ = rtw0Var.J(kl91VarW, ubmVar4);
                    } else {
                        rtw0Var = rtw0Var3;
                        zJ = false;
                    }
                    boolean zI = rtw0.I(ubmVar3);
                    boolean z12 = vbe.w(nextZ2).i;
                    boolean zD = rtw0.D(vbe.w(nextZ2), ubmVar3);
                    kl91 kl91VarW2 = vbe.w(nextZ2);
                    boolean z13 = rtw0.w(kl91VarW2, ubmVar3) && kl91VarW2.b.k;
                    boolean z14 = vbe.w(nextZ2).b.l;
                    boolean zC = ubmVar3.e().c();
                    boolean zA = yrc0VarC.a();
                    it = it2;
                    next2 = nextZ2;
                    boolean z15 = ubmVar3.a() == 1 ? zA : zD && vbe.w(next2).b.m;
                    if (!z15 || ((zJ || (zD && !z12)) && (zI || (zD && !(z13 && z12))))) {
                        if81Var = if81Var5;
                        if (zD) {
                            if (!z15 && u890.j(boolT, Boolean.TRUE) && zC) {
                                setO1.add(new pj91(strB2, z14, false));
                            } else if (z15 && u890.j(boolT, Boolean.FALSE) && zC) {
                                setO1.add(new pj91(strB2, true, true));
                            }
                        } else if (!vbe.w(next2).a.h && zA && zI && zJ && rtw0.B(vbe.w(next2), strB2, dm61.z0(skg.a, skg.b))) {
                            setO1.add(new tj91(strB2));
                        }
                    } else if (vbe.w(next2).a.n) {
                        if (z14) {
                            if81Var = if81Var5;
                        } else {
                            if81Var = if81Var5;
                            if (ubmVar3.e().b().contains(if81Var)) {
                                if81Var2 = if81Var;
                            }
                            arrayList.add(oqn1.n(ubmVar3, if81Var2));
                        }
                        if81Var2 = if81Var4;
                        arrayList.add(oqn1.n(ubmVar3, if81Var2));
                    } else {
                        if81Var = if81Var5;
                        setO1.addAll(rtw0.d0(vbe.w(next2), ubmVar3, z14));
                    }
                    it2 = it;
                    if81Var5 = if81Var;
                    rtw0Var3 = rtw0Var;
                    nextZ2 = next2;
                } else {
                    it = it2;
                    next2 = nextZ2;
                    if81Var = if81Var5;
                    rtw0Var = rtw0Var3;
                }
                it2 = it;
                if81Var5 = if81Var;
                rtw0Var3 = rtw0Var;
                nextZ2 = next2;
            }
            Next next3 = nextZ2;
            Next nextY2 = vbe.y(kl91.a(vbe.w(next3), null, null, null, null, null, null, null, false, false, 0, null, null, null, dm61.y0(vbe.w(next3).o, linkedHashSet), 0, 0, null, false, 507903), setO1);
            for (mmr0 mmr0Var : arrayList) {
                nextY2 = rtw0.b0(nextY2, (ubm) mmr0Var.a, (if81) mmr0Var.b, 4, (tv80) null, 24);
            }
            return rtw0.V(rtw0.y(nextY2));
        }
        boolean z16 = tk91Var instanceof wk91;
        if81 if81Var6 = if81.c;
        if (z16) {
            Next nextZ3 = vbe.z(kl91.a(kl91VarA, null, null, null, null, ((wk91) tk91Var).a, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 524255));
            if (!vbe.w(nextZ3).a.m && (bool = kl91VarA.f.a) != null && !bool.equals(vbe.w(nextZ3).f.a)) {
                String str8 = vbe.w(nextZ3).b.a;
                ubm ubmVar5 = (ubm) vbe.w(nextZ3).e.get(str8);
                if (ubmVar5 != null) {
                    Boolean bool2 = vbe.w(nextZ3).f.a;
                    Boolean bool3 = Boolean.TRUE;
                    if (u890.j(bool2, bool3) && vbe.w(nextZ3).b.m) {
                        return rtw0.b0(nextZ3, ubmVar5, if81Var4, 5, (tv80) null, 24);
                    }
                    if (u890.j(vbe.w(nextZ3).f.a, Boolean.FALSE) && !vbe.w(nextZ3).b.m) {
                        ubm ubmVar6 = (ubm) vbe.w(nextZ3).e.get(str8);
                        if (ubmVar6 != null ? u890.j(rtw0.T(ubmVar6), bool3) : false) {
                            return rtw0.b0(nextZ3, ubmVar5, if81Var6, 6, (tv80) null, 24);
                        }
                    }
                }
            }
            return nextZ3;
        }
        if (tk91Var instanceof mk91) {
            Next nextZ4 = vbe.z(kl91.a(kl91VarA, null, null, null, null, null, Boolean.valueOf(((mk91) tk91Var).a), null, false, false, 0, null, null, null, null, 0, 0, null, false, 524223));
            Boolean bool4 = kl91VarA.g;
            if (bool4 == null || bool4.equals(vbe.w(nextZ4).g)) {
                return nextZ4;
            }
            String str9 = vbe.w(nextZ4).b.a;
            ubm ubmVar7 = (ubm) vbe.w(nextZ4).e.get(str9);
            if (ubmVar7 == null) {
                return nextZ4;
            }
            Boolean bool5 = vbe.w(nextZ4).g;
            Boolean bool6 = Boolean.TRUE;
            if (u890.j(bool5, bool6) && vbe.w(nextZ4).b.m) {
                return vbe.y(vbe.w(nextZ4), rtw0.d0(vbe.w(nextZ4), ubmVar7, true));
            }
            if (!u890.j(vbe.w(nextZ4).g, Boolean.FALSE) || vbe.w(nextZ4).b.m) {
                return nextZ4;
            }
            ubm ubmVar8 = (ubm) vbe.w(nextZ4).e.get(str9);
            return ubmVar8 != null ? u890.j(rtw0.T(ubmVar8), bool6) : false ? vbe.y(vbe.w(nextZ4), rtw0.e0(vbe.w(nextZ4), ubmVar7)) : nextZ4;
        }
        if (tk91Var instanceof nk91) {
            return vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, Boolean.valueOf(((nk91) tk91Var).a), false, false, 0, null, null, null, null, 0, 0, null, false, 524159));
        }
        if (tk91Var instanceof lk91) {
            return vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, ((lk91) tk91Var).a, false, 0, null, null, null, null, 0, 0, null, false, 524031));
        }
        if (tk91Var instanceof ek91) {
            ek91 ek91Var = (ek91) tk91Var;
            ArrayList arrayListO0 = o7h.O0(ek91Var.a, list);
            ek91 ek91Var2 = ek91Var;
            kl91 kl91VarA2 = kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, arrayListO0, null, null, null, 0, 0, null, false, 522239);
            List listD1 = o7h.d1(o7h.a1(arrayListO0, new be21((byte) 11)), 1);
            ArrayList arrayList3 = new ArrayList(q7h.U(listD1, 10));
            Iterator it3 = listD1.iterator();
            while (it3.hasNext()) {
                ek91 ek91Var3 = ek91Var2;
                long jA = ((ll91) it3.next()).a() - ek91Var3.b;
                if (jA < 0) {
                    jA = 0;
                }
                arrayList3.add(new qj91(jA));
                ek91Var2 = ek91Var3;
            }
            return Next.i(kl91VarA2, o7h.p1(arrayList3));
        }
        if (tk91Var instanceof rk91) {
            long j = ((rk91) tk91Var).a;
            if (list.isEmpty()) {
                return Next.j();
            }
            List list2 = list;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (((ll91) obj4).a() > j) {
                    arrayList4.add(obj4);
                }
            }
            kl91 kl91VarA3 = kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, arrayList4, null, null, null, 0, 0, null, false, 522239);
            ArrayList<ll91> arrayList5 = new ArrayList();
            for (Object obj5 : list2) {
                if (((ll91) obj5).a() <= j) {
                    arrayList5.add(obj5);
                }
            }
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
            for (ll91 ll91Var : arrayList5) {
                ll91Var.getClass();
                arrayList6.add(new sj91(ll91Var.b().a()));
            }
            Set setP1 = o7h.p1(arrayList6);
            Iterator it4 = arrayList4.iterator();
            if (it4.hasNext()) {
                next = it4.next();
                if (it4.hasNext()) {
                    long jA2 = ((ll91) next).a();
                    do {
                        Object next4 = it4.next();
                        long jA3 = ((ll91) next4).a();
                        if (jA2 > jA3) {
                            next = next4;
                            jA2 = jA3;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next = null;
            }
            ll91 ll91Var2 = (ll91) next;
            if (ll91Var2 != null) {
                long jA4 = ll91Var2.a() - j;
                if (jA4 < 0) {
                    jA4 = 0;
                }
                qj91Var = new qj91(jA4);
            }
            return vbe.y(kl91VarA3, dm61.y0(setP1, dm61.A0(qj91Var)));
        }
        if (tk91Var instanceof kk91) {
            return rtw0.Q(kl91VarA, (kk91) tk91Var);
        }
        if (tk91Var instanceof vk91) {
            if (!kl91VarA.j) {
                return Next.j();
            }
            Next nextZ5 = vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, false, 523775));
            ubm ubmVar9 = (ubm) map5.get(str2);
            return (ubmVar9 == null || !jdu0Var.j || jdu0Var.l || !jdu0Var.m) ? nextZ5 : rtw0.b0(nextZ5, ubmVar9, if81Var3, 7, (tv80) null, 24);
        }
        if (tk91Var instanceof fk91) {
            String str10 = ((fk91) tk91Var).a;
            ubm ubmVar10 = (ubm) map5.get(str10);
            ybd1 ybd1Var = (ybd1) map2.get(str10);
            if (ubmVar10 == null || ybd1Var == null) {
                return Next.j();
            }
            if (kl91VarA.a.l <= 0) {
                kl91VarA = kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, sqg0.K(str10, map2), null, null, 0, 0, null, false, 520191);
            }
            return rtw0Var2.a0(vbe.z(kl91VarA), ubmVar10, ybd1Var.d(), ybd1Var.c(), ybd1Var.b(), ybd1Var.a());
        }
        if (!(tk91Var instanceof xk91)) {
            if (tk91Var instanceof uk91) {
                return vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, sqg0.K(((uk91) tk91Var).a, map2), null, null, 0, 0, null, false, 520191));
            }
            if (tk91Var instanceof pk91) {
                return vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, ((pk91) tk91Var).a, 0, null, false, 491519));
            }
            if (tk91Var instanceof sk91) {
                return vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, ((sk91) tk91Var).a, null, false, 458751));
            }
            if (tk91Var instanceof ok91) {
                return vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, null, ((ok91) tk91Var).a, 262143));
            }
            if (!(tk91Var instanceof tk91)) {
                eg.o();
                return null;
            }
            tk91 tk91Var2 = tk91Var;
            Map map6 = kl91VarA.r;
            return u890.j((shs0) map6.get(tk91Var2.a()), tk91Var2.b()) ? vbe.z(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, 0, sqg0.K(tk91Var2.a(), map6), false, 393215)) : Next.j();
        }
        xk91 xk91Var = (xk91) tk91Var;
        String str11 = xk91Var.a;
        ybd1 ybd1Var2 = (ybd1) map.get(str11);
        if (ybd1Var2 == null) {
            return Next.j();
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (ybd1Var2.d() == if81Var6 || ybd1Var2.a() == if81Var6) {
            boolean z17 = ybd1Var2.d() == if81Var6;
            String str12 = xk91Var.a;
            List listX = k4p1.x(ybd1Var2.d() == if81Var6 ? mh10.b : mh10.c);
            ubm ubmVar11 = (ubm) map5.get(str11);
            linkedHashSet2.add(new nj91(z17, false, str12, listX, ubmVar11 != null ? rtw0.D(kl91VarA, ubmVar11) : false ? kl91VarA.i ? 2 : 3 : 1, rtw0.c0(ybd1Var2.c()), ybd1Var2.b()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (!u890.j((String) entry2.getKey(), str11)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return vbe.y(kl91.a(kl91VarA, null, null, null, null, null, null, null, false, false, 0, null, null, linkedHashMap2, null, 0, 0, null, false, 516095), o7h.p1(linkedHashSet2));
    }
}
