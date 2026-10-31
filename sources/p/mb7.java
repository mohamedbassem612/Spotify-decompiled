package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class mb7 implements Update {
    /* JADX WARN: Code duplicated, block: B:174:0x031b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0320  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public final Next a(Object obj, Object obj2) {
        int i;
        ou80 ou80Var;
        Object next;
        Object next2;
        yrd yrdVar;
        rb7 rb7Var = (rb7) obj;
        za7 za7Var = (za7) obj2;
        qb7 qb7Var = rb7Var.a;
        List list = rb7Var.d;
        c9 c9Var = rb7Var.g;
        c9 c9Var2 = rb7Var.f;
        String str = rb7Var.c;
        boolean z = za7Var instanceof la7;
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        ArrayList arrayList = z6x.a;
        Object obj3 = null;
        str = null;
        String str2 = null;
        Object obj4 = null;
        Object obj5 = null;
        if (z) {
            Set set = y4r.a;
            fwq fwqVar = ((la7) za7Var).a;
            List list2 = fwqVar.a;
            il51 il51Var = fwqVar.b;
            List list3 = il51Var.a;
            boolean z3 = il51Var.b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ListIterator listIterator = c9Var2.listIterator(0);
            while (listIterator.hasNext()) {
                linkedHashSet.add(((yrd) listIterator.next()).e);
            }
            List list4 = list2;
            boolean z4 = list4 instanceof Collection;
            if (!z4 || !list4.isEmpty()) {
                Iterator it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        yrd yrdVar2 = (yrd) it.next();
                        if (!linkedHashSet.contains(yrdVar2.e) && y4r.a.contains(yrdVar2.f)) {
                            yrd yrdVar3 = (yrd) o7h.s0(list2);
                            if (yrdVar3 != null) {
                                str = yrdVar3.e;
                            } else {
                                str = null;
                            }
                        }
                    } else if (str != null || (z4 && list4.isEmpty())) {
                        yrdVar = (yrd) o7h.s0(list2);
                        if (yrdVar != null) {
                            str = yrdVar.e;
                        } else {
                            str = null;
                        }
                    } else {
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                yrdVar = (yrd) o7h.s0(list2);
                                if (yrdVar != null) {
                                    str = yrdVar.e;
                                } else {
                                    str = null;
                                }
                            } else if (u890.j(((yrd) it2.next()).e, str)) {
                            }
                        }
                    }
                }
            } else if (str != null) {
                yrdVar = (yrd) o7h.s0(list2);
                if (yrdVar != null) {
                    str = yrdVar.e;
                } else {
                    str = null;
                }
            } else {
                yrdVar = (yrd) o7h.s0(list2);
                if (yrdVar != null) {
                    str = yrdVar.e;
                } else {
                    str = null;
                }
            }
            Iterator it3 = list4.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!u890.j(((yrd) next2).e, str));
            yrd yrdVar4 = (yrd) next2;
            ArrayList arrayListB = yrdVar4 != null ? yrdVar4.b() : null;
            if (arrayListB != null) {
                arrayList = arrayListB;
            }
            return Next.h(rb7.a(rb7Var, z3, str, null, list3, mqo1.F(list4), mqo1.F(arrayList), fwqVar.i, fwqVar.d, fwqVar.e, fwqVar.f, fwqVar.g, fwqVar.j, fwqVar.k, fwqVar.l, fwqVar.c, fwqVar.h, il51Var.e, il51Var.f, il51Var.h, il51Var.i, 9));
        }
        if (za7Var instanceof ka7) {
            ka7 ka7Var = (ka7) za7Var;
            if (!c9Var.isEmpty() && !c9Var.isEmpty()) {
                ListIterator listIterator2 = c9Var.listIterator(0);
                while (listIterator2.hasNext()) {
                    if (((i) listIterator2.next()) instanceof g) {
                        return Next.a(Collections.singleton(new o97(ka7Var.a, l1d.m("AssistedCuration/", str), c9Var, ka7Var.b)));
                    }
                }
            }
            return Next.j();
        }
        if (za7Var instanceof ua7) {
            ua7 ua7Var = (ua7) za7Var;
            if (str == null) {
                return Next.j();
            }
            i iVar = ua7Var.a;
            if (rb7Var.m || ((!rb7Var.n && (iVar instanceof g)) || (!rb7Var.o && (iVar instanceof e)))) {
                return Next.j();
            }
            boolean z5 = iVar instanceof g;
            if (z5) {
                g gVar = (g) iVar;
                if (gVar.i) {
                    return Next.a(Collections.singleton(new k97(gVar.a)));
                }
            }
            if (iVar.g() && rb7Var.l) {
                return Next.a(Collections.singleton(new i97(iVar.getUri(), iVar.getImageUri())));
            }
            return (!iVar.b() || (z5 && ((g) iVar).Y) || !(rb7Var.j || rb7Var.i)) ? Next.a(Collections.singleton(new n97(str, iVar, ua7Var.b))) : Next.a(Collections.singleton(new l97(iVar.getUri())));
        }
        if (za7Var instanceof ra7) {
            return Next.a(Collections.singleton(new f97(list.isEmpty() ? null : new o3w(list.size(), 0, 0, 6), rb7Var.t, rb7Var.u)));
        }
        if (za7Var instanceof va7) {
            return Next.a(Collections.singleton(new e97(rb7Var.b(), ((va7) za7Var).a)));
        }
        if (za7Var instanceof sa7) {
            sa7 sa7Var = (sa7) za7Var;
            String str3 = sa7Var.a;
            ListIterator listIterator3 = c9Var2.listIterator(0);
            do {
                if (!listIterator3.hasNext()) {
                    next = null;
                    break;
                }
                next = listIterator3.next();
            } while (!u890.j(((yrd) next).e, sa7Var.a));
            yrd yrdVar5 = (yrd) next;
            ArrayList arrayListB2 = yrdVar5 != null ? yrdVar5.b() : null;
            if (arrayListB2 != null) {
                arrayList = arrayListB2;
            }
            return Next.h(rb7.a(rb7Var, false, str3, null, null, null, mqo1.F(arrayList), null, false, false, false, false, false, false, false, false, false, null, null, null, null, 2097083));
        }
        boolean z6 = za7Var instanceof oa7;
        qb7 qb7Var2 = qb7.b;
        if (z6) {
            oa7 oa7Var = (oa7) za7Var;
            i iVar2 = oa7Var.a;
            if (qb7Var == qb7Var2) {
                String uri = iVar2.getUri();
                tv80 tv80Var = oa7Var.b;
                if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                    str2 = ou80Var.a;
                }
                return Next.a(Collections.singleton(new h97(uri, str2)));
            }
            if (str == null) {
                return Next.j();
            }
            ListIterator listIterator4 = c9Var2.listIterator(0);
            while (listIterator4.hasNext()) {
                Object next3 = listIterator4.next();
                if (u890.j(((yrd) next3).e, str)) {
                    obj4 = next3;
                    break;
                }
            }
            yrd yrdVar6 = (yrd) obj4;
            if (yrdVar6 == null) {
                return Next.j();
            }
            ListIterator listIterator5 = c9Var.listIterator(0);
            while (listIterator5.hasNext()) {
                if (u890.j(((i) listIterator5.next()).getUri(), iVar2.getUri())) {
                    i = i2;
                    return i == -1 ? Next.j() : Next.a(Collections.singleton(new a97(yrdVar6, i, iVar2, rb7Var.b(), oa7Var.b)));
                }
                i2++;
            }
            i = -1;
            if (i == -1) {
            }
        }
        if (za7Var instanceof pa7) {
            i iVar3 = ((pa7) za7Var).a;
            if (str == null) {
                return Next.j();
            }
            ListIterator listIterator6 = c9Var2.listIterator(0);
            while (listIterator6.hasNext()) {
                Object next4 = listIterator6.next();
                if (u890.j(((yrd) next4).e, str)) {
                    obj5 = next4;
                    break;
                }
            }
            yrd yrdVar7 = (yrd) obj5;
            if (yrdVar7 == null) {
                return Next.j();
            }
            ListIterator listIterator7 = c9Var.listIterator(0);
            int i3 = 0;
            while (true) {
                if (!listIterator7.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (u890.j(((i) listIterator7.next()).getUri(), iVar3.getUri())) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return Next.j();
            }
            if (rb7Var.b().size() == 1 && rb7Var.b().contains(iVar3.getUri())) {
                z2 = true;
            }
            return Next.a(Collections.singleton(new g97(yrdVar7, i3, iVar3, z2)));
        }
        if (za7Var instanceof qa7) {
            qa7 qa7Var = (qa7) za7Var;
            return Next.a(Collections.singleton(new j97(qa7Var.a.getUri(), qa7Var.b)));
        }
        if (za7Var instanceof ta7) {
            if (str == null) {
                return Next.j();
            }
            ListIterator listIterator8 = c9Var2.listIterator(0);
            while (listIterator8.hasNext()) {
                Object next5 = listIterator8.next();
                if (u890.j(((yrd) next5).e, str)) {
                    obj3 = next5;
                    break;
                }
            }
            yrd yrdVar8 = (yrd) obj3;
            if (yrdVar8 == null) {
                return Next.j();
            }
            return !yrdVar8.h ? Next.j() : Next.a(Collections.singleton(new d97(yrdVar8, rb7Var.b())));
        }
        if (za7Var instanceof ya7) {
            ArrayList arrayList2 = ((ya7) za7Var).a;
            if (qb7Var != qb7Var2) {
                return Next.a(Collections.singleton(new b97(arrayList2, rb7Var.b())));
            }
            xa7 xa7Var = (xa7) o7h.s0(arrayList2);
            return xa7Var == null ? Next.j() : Next.a(Collections.singleton(new h97(xa7Var.a, xa7Var.b)));
        }
        if (!(za7Var instanceof ma7)) {
            if (za7Var instanceof na7) {
                return Next.h(rb7.a(rb7Var, false, null, o7h.K0(list, ((na7) za7Var).a), null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, 2097143));
            }
            if (za7Var instanceof wa7) {
                return Next.a(Collections.singleton(m97.a));
            }
            eg.o();
            return null;
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.addAll(list);
        for (String str4 : ((ma7) za7Var).a) {
            if (!list.contains(str4)) {
                smc0VarN.add(str4);
            }
        }
        return Next.h(rb7.a(rb7Var, false, null, k4p1.k(smc0VarN), null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, 2097143));
    }
}
