package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class m2w0 implements Update {
    public final Next a(Object obj, Object obj2) {
        Object next;
        String str;
        String str2;
        t2w0 t2w0Var = (t2w0) obj;
        h2w0 h2w0Var = (h2w0) obj2;
        String str3 = t2w0Var.a;
        List<o3w0> list = t2w0Var.c;
        j2w0 j2w0Var = t2w0Var.b;
        String str4 = j2w0Var.a;
        String str5 = j2w0Var.b;
        String strM = j2w0Var.i;
        List list2 = j2w0Var.m;
        if (h2w0Var instanceof j1w0) {
            return Next.a(Collections.singleton(a0w0.d));
        }
        if (h2w0Var instanceof o1w0) {
            if (list2.size() == 1) {
                return Next.a(Collections.singleton(new c0w0(((nyv0) o7h.q0(list2)).a, ((o1w0) h2w0Var).a)));
            }
            List list3 = list2;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((nyv0) it.next()).a);
            }
            return Next.a(Collections.singleton(new g0w0(arrayList, ((o1w0) h2w0Var).a)));
        }
        if (h2w0Var instanceof z1w0) {
            boolean z = ((z1w0) h2w0Var).a;
            if (!t2w0Var.s || strM.length() <= 0) {
                strM = l1d.m("spotify:prerelease:", str3);
            }
            return Next.i(t2w0.a(t2w0Var, (j2w0) null, (ArrayList) null, (Boolean) null, (Boolean) null, z, 507903), Collections.singleton(new m0w0(strM, z)));
        }
        if (h2w0Var instanceof f2w0) {
            f2w0 f2w0Var = (f2w0) h2w0Var;
            return Next.a(Collections.singleton(new c0w0(f2w0Var.a, f2w0Var.b)));
        }
        if (h2w0Var instanceof a2w0) {
            boolean z2 = ((a2w0) h2w0Var).a;
            j2w0 j2w0VarA = j2w0.a(j2w0Var, z2, false, 16379);
            return (z2 && t2w0Var.o) ? Next.i(t2w0.a(t2w0Var, j2w0VarA, (ArrayList) null, (Boolean) null, (Boolean) null, false, 507901), Collections.singleton(j0w0.d)) : Next.h(t2w0.a(t2w0Var, j2w0VarA, (ArrayList) null, (Boolean) null, (Boolean) null, false, 524285));
        }
        if (h2w0Var instanceof b2w0) {
            tv80 tv80Var = ((b2w0) h2w0Var).a;
            String strM2 = l1d.m("spotify:prerelease:", str3);
            nyv0 nyv0Var = (nyv0) o7h.s0(list2);
            str2 = nyv0Var != null ? nyv0Var.b : null;
            if (str2 == null) {
                str2 = "";
            }
            return Next.a(Collections.singleton(new d0w0(strM2, str5, str4, str2, tv80Var)));
        }
        if (h2w0Var instanceof p1w0) {
            Map map = ((p1w0) h2w0Var).a;
            ArrayList arrayList2 = new ArrayList();
            for (o3w0 o3w0Var : list) {
                CollectionTrack collectionTrack = (CollectionTrack) map.get(o3w0Var.c);
                if (collectionTrack == null) {
                    arrayList2.add(o3w0Var);
                } else {
                    boolean isPlayable = collectionTrack.t().getIsPlayable();
                    arrayList2.add(o3w0.a(o3w0Var, u890.j(collectionTrack.u().getOffline(), "yes"), false, collectionTrack.s().getIsExplicit(), collectionTrack.s().getIs19PlusOnly(), isPlayable, o3w0Var.j && isPlayable, o3w0Var.k ? collectionTrack.t().getPlayabilityRestriction() : o3w0Var.l, 1071));
                }
            }
            return Next.h(t2w0.a(t2w0Var, (j2w0) null, arrayList2, (Boolean) null, (Boolean) null, false, 524283));
        }
        if (h2w0Var instanceof d2w0) {
            List<o3w0> list4 = list;
            ArrayList arrayList3 = new ArrayList();
            for (o3w0 o3w0Var2 : list4) {
                String str6 = o3w0Var2.j ? o3w0Var2.c : null;
                if (str6 != null) {
                    arrayList3.add(str6);
                }
            }
            String str7 = ((d2w0) h2w0Var).a;
            String str8 = t2w0Var.a;
            Iterator it2 = list4.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((o3w0) next).c, str7));
            o3w0 o3w0Var3 = (o3w0) next;
            if ((o3w0Var3 != null ? o3w0Var3.j : false) && str7 != null) {
                return Next.a(Collections.singleton(new e0w0(str7, o3w0Var3.d, str8, arrayList3, t2w0Var.n)));
            }
            if (str7 == null) {
                return Next.j();
            }
            if (o3w0Var3 != null && (str = o3w0Var3.l) != null) {
                str2 = (str == PlayabilityRestriction.EXPLICIT_CONTENT || str == PlayabilityRestriction.AGE_RESTRICTED) ? str : null;
                if (str2 != null) {
                    return Next.a(Collections.singleton(new h0w0(str7, str2)));
                }
            }
            return Next.j();
        }
        if (h2w0Var instanceof k1w0) {
            return Next.j();
        }
        if (h2w0Var instanceof c2w0) {
            c2w0 c2w0Var = (c2w0) h2w0Var;
            String str9 = c2w0Var.a;
            return str9 != null ? Next.a(Collections.singleton(new k0w0(str9, c2w0Var.b, c2w0Var.c))) : Next.j();
        }
        if (h2w0Var instanceof g2w0) {
            g2w0 g2w0Var = (g2w0) h2w0Var;
            return Next.a(Collections.singleton(new c0w0(g2w0Var.a, g2w0Var.d)));
        }
        if (h2w0Var instanceof t1w0) {
            t1w0 t1w0Var = (t1w0) h2w0Var;
            return Next.a(Collections.singleton(new c0w0(t1w0Var.c, t1w0Var.d)));
        }
        if (h2w0Var instanceof w1w0) {
            w1w0 w1w0Var = (w1w0) h2w0Var;
            return Next.a(Collections.singleton(new c0w0(((a3w0) t2w0Var.e.get(w1w0Var.a)).a, w1w0Var.b)));
        }
        if (h2w0Var instanceof q1w0) {
            return Next.a(Collections.singleton(new c0w0(strM, ((q1w0) h2w0Var).a)));
        }
        if (h2w0Var instanceof v1w0) {
            v1w0 v1w0Var = (v1w0) h2w0Var;
            String str10 = v1w0Var.a;
            boolean z3 = v1w0Var.b;
            List<o3w0> list5 = list;
            ArrayList arrayList4 = new ArrayList(q7h.U(list5, 10));
            for (o3w0 o3w0Var4 : list5) {
                arrayList4.add(o3w0.a(o3w0Var4, false, u890.j(o3w0Var4.c, str10), false, false, false, false, (PlayabilityRestriction) null, 4063));
            }
            t2w0 t2w0VarA = t2w0.a(t2w0Var, (j2w0) null, arrayList4, Boolean.valueOf(z3), (Boolean) null, false, 523771);
            if (z3 && !j2w0Var.j) {
                t2w0VarA = t2w0.a(t2w0VarA, j2w0.a(j2w0Var, false, true, 15871), (ArrayList) null, (Boolean) null, (Boolean) null, false, 524285);
            }
            return Next.h(t2w0VarA);
        }
        if (h2w0Var instanceof u1w0) {
            j2w0 j2w0VarA2 = j2w0.a(j2w0Var, false, ((u1w0) h2w0Var).b, 15871);
            boolean z4 = j2w0VarA2.j;
            t2w0 t2w0VarA2 = t2w0.a(t2w0Var, j2w0VarA2, (ArrayList) null, (Boolean) null, t2w0Var.j, false, 523261);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Boolean bool = t2w0Var.j;
            Boolean bool2 = Boolean.TRUE;
            if (u890.j(bool, bool2) && !z4) {
                linkedHashSet.add(new l0w0(false));
            } else if (u890.j(t2w0Var.k, bool2) && z4) {
                linkedHashSet.add(new l0w0(true));
            }
            return Next.i(t2w0VarA2, linkedHashSet);
        }
        if (h2w0Var instanceof n1w0) {
            return Next.h(t2w0Var);
        }
        if (h2w0Var instanceof m1w0) {
            m1w0 m1w0Var = (m1w0) h2w0Var;
            return Next.a(Collections.singleton(new c0w0(m1w0Var.a, m1w0Var.b)));
        }
        if (h2w0Var instanceof x1w0) {
            return Next.a(Collections.singleton(new b0w0(((x1w0) h2w0Var).a)));
        }
        if (h2w0Var instanceof e2w0) {
            return Next.h(t2w0.a(t2w0Var, j2w0.a(j2w0Var, false, false, 15359), (ArrayList) null, (Boolean) null, (Boolean) null, false, 524285));
        }
        if (h2w0Var instanceof y1w0) {
            return Next.j();
        }
        if (h2w0Var instanceof l1w0) {
            return Next.h(t2w0.a(t2w0Var, (j2w0) null, (ArrayList) null, (Boolean) null, Boolean.FALSE, false, 523263));
        }
        if (!(h2w0Var instanceof i1w0)) {
            if (h2w0Var instanceof r1w0) {
                r1w0 r1w0Var = (r1w0) h2w0Var;
                return Next.a(Collections.singleton(new c0w0(r1w0Var.a, r1w0Var.b)));
            }
            if (h2w0Var instanceof s1w0) {
                s1w0 s1w0Var = (s1w0) h2w0Var;
                return Next.a(Collections.singleton(new c0w0(s1w0Var.a, s1w0Var.c)));
            }
            eg.o();
            return null;
        }
        tv80 tv80Var2 = ((i1w0) h2w0Var).a;
        List<nyv0> list6 = list2;
        ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
        for (nyv0 nyv0Var2 : list6) {
            arrayList5.add(new hb6(nyv0Var2.b, nyv0Var2.a, null));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : list) {
            o3w0 o3w0Var5 = (o3w0) obj3;
            if (o3w0Var5.c != null && o3w0Var5.i) {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            String str11 = ((o3w0) it3.next()).c;
            str11.getClass();
            arrayList7.add(str11);
        }
        return Next.a(Collections.singleton(new i0w0(str4, str5, arrayList5, arrayList7, t2w0Var.t, tv80Var2)));
    }
}
