package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oud1 implements Update {
    public static final oud1 a = new oud1();

    public final Next a(Object obj, Object obj2) {
        Object next;
        boolean z;
        Object next2;
        sud1 sud1Var = (sud1) obj;
        nud1 nud1Var = (nud1) obj2;
        sud1Var.getClass();
        nud1Var.getClass();
        List list = sud1Var.b;
        boolean z2 = nud1Var instanceof jud1;
        int i = 111;
        List list2 = null;
        wtd1 wtd1Var = wtd1.a;
        if (z2) {
            List<dvd1> list3 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            for (dvd1 dvd1VarA : list3) {
                jud1 jud1Var = (jud1) nud1Var;
                if (dvd1VarA.a.equals(jud1Var.a)) {
                    dvd1VarA = dvd1.a(dvd1VarA, null, o7h.N0(dvd1VarA.e, Collections.singletonList(jud1Var.b)), 111);
                }
                arrayList.add(dvd1VarA);
            }
            sud1 sud1VarA = sud1.a(sud1Var, arrayList);
            return ((jud1) nud1Var).b.d ? Next.i(sud1VarA, Collections.singleton(wtd1Var)) : Next.h(sud1VarA);
        }
        if (nud1Var instanceof lud1) {
            List<dvd1> list4 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
            for (dvd1 dvd1VarA2 : list4) {
                List list5 = dvd1VarA2.e;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        String str = ((ct10) it.next()).a;
                        lud1 lud1Var = (lud1) nud1Var;
                        String str2 = lud1Var.a;
                        if (str.equals(str2)) {
                            List<ct10> list6 = dvd1VarA2.e;
                            ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
                            for (ct10 ct10VarA : list6) {
                                if (ct10VarA.a.equals(str2)) {
                                    ct10VarA = ct10.a(ct10VarA, lud1Var.b, lud1Var.c, lud1Var.d, 17);
                                }
                                arrayList3.add(ct10VarA);
                                i = 111;
                                list2 = null;
                            }
                            dvd1VarA2 = dvd1.a(dvd1VarA2, list2, arrayList3, i);
                            break;
                        }
                    }
                }
                arrayList2.add(dvd1VarA2);
                i = 111;
                list2 = null;
            }
            sud1 sud1VarA2 = sud1.a(sud1Var, arrayList2);
            return ((lud1) nud1Var).d ? Next.i(sud1VarA2, Collections.singleton(wtd1Var)) : Next.h(sud1VarA2);
        }
        if (nud1Var instanceof kud1) {
            List<dvd1> list7 = list;
            ArrayList arrayList4 = new ArrayList(q7h.U(list7, 10));
            for (dvd1 dvd1VarA3 : list7) {
                List list8 = dvd1VarA3.e;
                if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                    Iterator it2 = list8.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str3 = ((ct10) it2.next()).a;
                        String str4 = ((kud1) nud1Var).a;
                        if (str3.equals(str4)) {
                            List list9 = dvd1VarA3.e;
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj3 : list9) {
                                if (!((ct10) obj3).a.equals(str4)) {
                                    arrayList5.add(obj3);
                                }
                            }
                            dvd1VarA3 = dvd1.a(dvd1VarA3, null, arrayList5, 111);
                            break;
                        }
                    }
                } else {
                    break;
                    break;
                }
                arrayList4.add(dvd1VarA3);
            }
            return Next.h(sud1.a(sud1Var, arrayList4));
        }
        if (nud1Var instanceof iud1) {
            return Next.a(Collections.singleton(new vtd1(((iud1) nud1Var).a)));
        }
        if (!(nud1Var instanceof mud1)) {
            eg.o();
            return null;
        }
        sud1 sud1Var2 = ((mud1) nud1Var).a;
        List list10 = sud1Var2.b;
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = list10.iterator();
        while (it3.hasNext()) {
            r7h.W(((dvd1) it3.next()).e, arrayList6);
        }
        int iS = zno1.s(q7h.U(arrayList6, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj4 : arrayList6) {
            linkedHashMap.put(((ct10) obj4).a, obj4);
        }
        List<dvd1> list11 = list;
        ArrayList arrayList7 = new ArrayList(q7h.U(list11, 10));
        boolean z3 = false;
        for (dvd1 dvd1VarA4 : list11) {
            List list12 = sud1Var2.b;
            Iterator it4 = list12.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!((dvd1) next).a.equals(dvd1VarA4.a));
            dvd1 dvd1Var = (dvd1) next;
            if (dvd1Var == null) {
                Iterator it5 = list12.iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                } while (!ihc1.V0(((dvd1) next2).a, '_', "").equals(ihc1.V0(dvd1VarA4.a, '_', "")));
                dvd1Var = (dvd1) next2;
            }
            List<ct10> list13 = dvd1VarA4.e;
            ArrayList arrayList8 = new ArrayList(q7h.U(list13, 10));
            boolean z4 = false;
            for (ct10 ct10VarA2 : list13) {
                ct10 ct10Var = (ct10) linkedHashMap.get(ct10VarA2.a);
                if (ct10Var != null && (z = ct10Var.d) != ct10VarA2.d) {
                    ct10VarA2 = ct10.a(ct10VarA2, null, 0L, z, 23);
                    z4 = true;
                }
                arrayList8.add(ct10VarA2);
            }
            if (z4) {
                dvd1VarA4 = dvd1.a(dvd1VarA4, dvd1Var != null ? dvd1Var.d : dvd1VarA4.d, arrayList8, 103);
                z3 = true;
            }
            arrayList7.add(dvd1VarA4);
        }
        return z3 ? Next.h(sud1.a(sud1Var, arrayList7)) : Next.j();
    }
}
