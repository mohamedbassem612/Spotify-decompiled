package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.yourupdates.domain.models.ApplicationState;
import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y1n1 implements Update {
    public final Next a(Object obj, Object obj2) {
        List list;
        g2n1 g2n1VarA;
        g2n1 g2n1Var = (g2n1) obj;
        q1n1 q1n1Var = (q1n1) obj2;
        g2n1Var.getClass();
        String str = g2n1Var.a;
        q1n1Var.getClass();
        r2n1 r2n1Var = g2n1Var.b;
        dce0 dce0Var = g2n1Var.c;
        List list2 = g2n1Var.h;
        List<wro0> list3 = g2n1Var.d;
        if (q1n1Var instanceof y0n1) {
            return ((y0n1) q1n1Var).a == ApplicationState.BACKGROUND ? Next.h(g2n1.a(g2n1Var, (dce0) null, (List) null, false, false, true, (ArrayList) null, 191)) : Next.j();
        }
        boolean z = q1n1Var instanceof p1n1;
        r0n1 r0n1Var = r0n1.c;
        if (z) {
            return !((p1n1) q1n1Var).a ? Next.i(g2n1Var, Collections.singleton(r0n1Var)) : Next.j();
        }
        boolean z2 = true;
        oqn1 ksn0Var = null;
        q9t q9tVar = null;
        Object obj3 = null;
        Object obj4 = null;
        if (q1n1Var instanceof m1n1) {
            m1n1 m1n1Var = (m1n1) q1n1Var;
            kjo0 kjo0Var = m1n1Var.a;
            tv80 tv80Var = m1n1Var.b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            pjo0 pjo0Var = kjo0Var.d;
            if (pjo0Var.b != v80.ACTION_TYPE_UNSPECIFIED) {
                kjo0 kjo0VarA = kjo0.a(kjo0Var);
                ArrayList arrayList = new ArrayList();
                for (wro0 wro0Var : list3) {
                    List list4 = wro0Var.a;
                    if (list4.contains(kjo0Var)) {
                        ArrayList arrayList2 = new ArrayList(list4);
                        arrayList2.set(list4.indexOf(kjo0Var), kjo0VarA);
                        arrayList.add(new wro0(wro0Var.b, arrayList2, wro0Var.c));
                    } else {
                        arrayList.add(wro0Var);
                    }
                }
                g2n1VarA = g2n1.a(g2n1Var, (dce0) null, arrayList, false, true, false, (ArrayList) null, 215);
            } else {
                g2n1VarA = g2n1Var;
            }
            v80 v80Var = pjo0Var.b;
            String str2 = pjo0Var.a;
            int iOrdinal = v80Var.ordinal();
            if (iOrdinal == 1) {
                ksn0Var = new ksn0(str2, tv80Var);
            } else if (iOrdinal == 2) {
                ksn0Var = new msn0(str2, tv80Var);
            }
            if (ksn0Var != null) {
                linkedHashSet.add(new n0n1(ksn0Var));
            }
            return !g2n1VarA.equals(g2n1Var) ? Next.i(g2n1VarA, linkedHashSet) : Next.a(linkedHashSet);
        }
        if (q1n1Var instanceof k1n1) {
            k1n1 k1n1Var = (k1n1) q1n1Var;
            return Next.a(Collections.singleton(new s0n1(k1n1Var.a, k1n1Var.b, k1n1Var.c)));
        }
        if (q1n1Var instanceof o1n1) {
            tv80 tv80Var2 = ((o1n1) q1n1Var).a;
            boolean z3 = g2n1Var.e;
            wro0 wro0Var2 = (wro0) o7h.s0(list3);
            return Next.a(Collections.singleton(new t0n1(wro0Var2 != null ? wro0Var2.b : null, tv80Var2, z3)));
        }
        if (q1n1Var instanceof d1n1) {
            d1n1 d1n1Var = (d1n1) q1n1Var;
            return Next.a(Collections.singleton(new n0n1(new ksn0(d1n1Var.a, d1n1Var.b))));
        }
        if (q1n1Var instanceof l1n1) {
            return Next.a(Collections.singleton(new l0n1(((l1n1) q1n1Var).a)));
        }
        if (q1n1Var instanceof b1n1) {
            String str3 = ((b1n1) q1n1Var).a;
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                wro0 wro0Var3 = (wro0) list3.get(i);
                Iterator it = wro0Var3.a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (u890.j(((kjo0) it.next()).g, str3)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    q9tVar = new q9t((kjo0) wro0Var3.a.get(i2), i, i2);
                    break;
                }
            }
            if (q9tVar == null) {
                return Next.j();
            }
            List<wro0> list5 = list3;
            ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
            for (wro0 wro0Var4 : list5) {
                List list6 = wro0Var4.a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list6) {
                    if (!u890.j(((kjo0) obj5).g, str3)) {
                        arrayList4.add(obj5);
                    }
                }
                arrayList3.add(new wro0(wro0Var4.b, arrayList4, wro0Var4.c));
            }
            return Next.h(g2n1.a(g2n1Var, (dce0) null, arrayList3, false, false, false, o7h.O0(q9tVar, list2), 119));
        }
        if (q1n1Var instanceof c1n1) {
            String str4 = ((c1n1) q1n1Var).a;
            List list7 = list2;
            for (Object obj6 : list7) {
                if (u890.j(((q9t) obj6).a.g, str4)) {
                    obj3 = obj6;
                    break;
                }
            }
            q9t q9tVar2 = (q9t) obj3;
            return q9tVar2 == null ? Next.j() : Next.i(g2n1.a(g2n1Var, (dce0) null, (List) null, false, false, false, o7h.J0(list7, q9tVar2), 127), Collections.singleton(new q0n1(q9tVar2)));
        }
        if (q1n1Var instanceof a1n1) {
            String str5 = ((a1n1) q1n1Var).a;
            List list8 = list2;
            for (Object obj7 : list8) {
                if (u890.j(((q9t) obj7).a.g, str5)) {
                    obj4 = obj7;
                    break;
                }
            }
            q9t q9tVar3 = (q9t) obj4;
            return q9tVar3 == null ? Next.a(Collections.singleton(r0n1Var)) : Next.i(g2n1.a(g2n1Var, (dce0) null, f2n1.c(list3, q9tVar3), false, false, false, o7h.J0(list8, q9tVar3), 119), Collections.singleton(r0n1Var));
        }
        if (q1n1Var instanceof n1n1) {
            q9t q9tVar4 = ((n1n1) q1n1Var).a;
            return Next.i(g2n1.a(g2n1Var, (dce0) null, f2n1.c(list3, q9tVar4), false, false, false, (ArrayList) null, 247), Collections.singleton(new p0n1(q9tVar4)));
        }
        if (q1n1Var instanceof j1n1) {
            smo1 smo1Var = ((j1n1) q1n1Var).a;
            if (!(smo1Var instanceof cvo0)) {
                if (!(smo1Var instanceof bvo0)) {
                    eg.o();
                    return null;
                }
                bvo0 bvo0Var = (bvo0) smo1Var;
                cae0 cae0Var = bvo0Var.d;
                FetchMode fetchMode = bvo0Var.c;
                FetchMode fetchMode2 = FetchMode.INITIAL;
                return Next.h(g2n1.a(g2n1Var, (!(fetchMode == fetchMode2 && list3.isEmpty()) && (fetchMode == fetchMode2 || cae0Var.toString().length() <= 0)) ? new jbe0(fetchMode) : new kbe0(fetchMode, cae0Var), (List) null, false, false, false, (ArrayList) null, 251));
            }
            cvo0 cvo0Var = (cvo0) smo1Var;
            wro0 wro0Var5 = cvo0Var.d;
            String str6 = wro0Var5.b;
            int i3 = e2n1.a[cvo0Var.c.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.o();
                    return null;
                }
                hbe0 hbe0Var = new hbe0(FetchMode.INITIAL);
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(wro0Var5);
                List list9 = wro0Var5.a;
                if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                    Iterator it2 = list9.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        }
                    } while (!((kjo0) it2.next()).f);
                } else {
                    z2 = false;
                    break;
                }
                g2n1 g2n1VarA2 = g2n1.a(g2n1Var, hbe0Var, arrayList5, z2, false, false, (ArrayList) null, 227);
                return (str6 == null || str6.length() == 0) ? Next.h(g2n1VarA2) : Next.i(g2n1VarA2, Collections.singleton(new u0n1(new ms21(str6))));
            }
            List list10 = list3;
            if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                Iterator it3 = list10.iterator();
                do {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                } while (!u890.j(((wro0) it3.next()).c, wro0Var5.c));
            } else {
                z2 = false;
                break;
            }
            hbe0 hbe0Var2 = new hbe0(FetchMode.NEXT);
            if (z2) {
                list = list3;
            } else {
                ArrayList arrayList6 = new ArrayList(list3);
                arrayList6.add(wro0Var5);
                list = arrayList6;
            }
            g2n1 g2n1VarA3 = g2n1.a(g2n1Var, hbe0Var2, list, false, false, false, (ArrayList) null, 243);
            return (str6 == null || str6.length() == 0) ? Next.h(g2n1VarA3) : Next.i(g2n1VarA3, Collections.singleton(new u0n1(new ms21(str6))));
        }
        if (q1n1Var instanceof e1n1) {
            boolean z4 = ((e1n1) q1n1Var).a;
            if (!(dce0Var instanceof kbe0) || !z4) {
                return Next.j();
            }
            FetchMode fetchMode3 = FetchMode.NEXT;
            g2n1 g2n1VarA4 = g2n1.a(g2n1Var, new rbe0(fetchMode3), (List) null, false, false, false, (ArrayList) null, 251);
            wro0 wro0Var6 = (wro0) o7h.C0(list3);
            String str7 = wro0Var6 != null ? wro0Var6.c : null;
            r2n1Var.getClass();
            return Next.i(g2n1VarA4, Collections.singleton(new m0n1(fetchMode3, new lvo0(0, str, str7))));
        }
        if (q1n1Var instanceof z0n1) {
            return ((z0n1) q1n1Var).a ? Next.a(Collections.singleton(new o0n1())) : Next.j();
        }
        if (q1n1Var instanceof i1n1) {
            wro0 wro0Var7 = (wro0) o7h.C0(list3);
            String str8 = wro0Var7 != null ? wro0Var7.c : null;
            if (str8 != null && str8.length() != 0) {
                FetchMode fetchMode4 = FetchMode.NEXT;
                if (!u890.j(dce0Var, new rbe0(fetchMode4))) {
                    g2n1 g2n1VarA5 = g2n1.a(g2n1Var, new rbe0(fetchMode4), (List) null, false, false, false, (ArrayList) null, 251);
                    r2n1Var.getClass();
                    return Next.i(g2n1VarA5, Collections.singleton(new m0n1(fetchMode4, new lvo0(0, str, str8))));
                }
            }
            return Next.j();
        }
        if (!(q1n1Var instanceof h1n1)) {
            if (q1n1Var instanceof f1n1) {
                String str9 = ((f1n1) q1n1Var).a;
                wro0 wro0Var8 = (wro0) o7h.s0(list3);
                return !u890.j(str9, wro0Var8 != null ? wro0Var8.b : null) ? Next.j() : Next.a(Collections.singleton(new o0n1()));
            }
            if (q1n1Var instanceof g1n1) {
                return Next.a(Collections.singleton(r0n1Var));
            }
            eg.o();
            return null;
        }
        String str10 = ((h1n1) q1n1Var).a;
        wro0 wro0Var9 = (wro0) o7h.s0(list3);
        if (!u890.j(str10, wro0Var9 != null ? wro0Var9.b : null)) {
            return Next.j();
        }
        List<wro0> list11 = list3;
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = list11.iterator();
        while (it4.hasNext()) {
            r7h.W(((wro0) it4.next()).a, arrayList7);
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : arrayList7) {
            if (((kjo0) obj8).f) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            arrayList9.add(((kjo0) it5.next()).a);
        }
        if (arrayList9.isEmpty()) {
            return Next.j();
        }
        ArrayList arrayList10 = new ArrayList(q7h.U(list11, 10));
        for (wro0 wro0Var10 : list11) {
            List<kjo0> list12 = wro0Var10.a;
            ArrayList arrayList11 = new ArrayList(q7h.U(list12, 10));
            for (kjo0 kjo0VarA2 : list12) {
                if (kjo0VarA2.f) {
                    kjo0VarA2 = kjo0.a(kjo0VarA2);
                }
                arrayList11.add(kjo0VarA2);
            }
            arrayList10.add(new wro0(wro0Var10.b, arrayList11, wro0Var10.c));
        }
        return Next.h(g2n1.a(g2n1Var, (dce0) null, arrayList10, false, false, false, (ArrayList) null, 231));
    }
}
