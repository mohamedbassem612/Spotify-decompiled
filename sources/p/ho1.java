package p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ho1 {
    public final svh0 a;
    public final zwm1 b;
    public final vlo c;
    public go1 d;
    public Set e;
    public final LinkedHashMap f = new LinkedHashMap();

    public ho1(svh0 svh0Var, zwm1 zwm1Var, agc0 agc0Var, vlo vloVar) {
        this.a = svh0Var;
        this.b = zwm1Var;
        this.c = vloVar;
    }

    public static ArrayList i(ArrayList arrayList, List list) {
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : arrayList) {
            linkedHashMap.put(((pt1) obj).getUri(), obj);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pt1 pt1VarG = (pt1) it.next();
            pt1 pt1Var = (pt1) linkedHashMap.get(pt1VarG.getUri());
            if (pt1Var != null) {
                if (pt1VarG instanceof nt1) {
                    nt1 nt1Var = (nt1) pt1VarG;
                    pt1VarG = new nt1(nt1Var.a, nt1Var.b, nt1Var.c, nt1Var.d, pt1Var.b(), nt1Var.f, nt1Var.g);
                } else {
                    if (!(pt1VarG instanceof ot1)) {
                        eg.o();
                        return null;
                    }
                    pt1VarG = ot1.g((ot1) pt1VarG, pt1Var.b(), 32751);
                }
            }
            arrayList2.add(pt1VarG);
        }
        return arrayList2;
    }

    public final go1 a(YourLibraryResponse yourLibraryResponse, YourLibraryResponse yourLibraryResponse2, l57 l57Var) {
        AbstractList abstractListB = b(true, yourLibraryResponse2.n(), l57Var);
        h290 h290VarN = yourLibraryResponse.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarN) {
            if (!((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj).e().p()) {
                arrayList.add(obj);
            }
        }
        return e(abstractListB, b(false, arrayList, l57Var), l57Var);
    }

    public final AbstractList b(boolean z, List list, l57 l57Var) {
        Boolean bool;
        smc0 smc0VarN = k4p1.n();
        boolean z2 = l57Var.f;
        Set set = l57Var.k;
        if (!z2 && l57Var.e == null && (bool = l57Var.i) != null && bool.equals(Boolean.valueOf(z))) {
            smc0VarN.add(j(z));
        }
        smc0VarN.addAll(this.a.q(list, l57Var.a, l57Var.g));
        smc0 smc0VarK = k4p1.k(smc0VarN);
        if (z || set.isEmpty()) {
            if (!z) {
                List list2 = l57Var.j;
                if (!list2.isEmpty()) {
                    String str = (String) o7h.q0(list2);
                    String str2 = bo1.a;
                    Set set2 = s4b1.f;
                    if (!uic.h(str, new blc0[]{blc0.ti, blc0.C8})) {
                        if (!this.c.a((String) o7h.q0(list2))) {
                            ArrayList arrayList = new ArrayList();
                            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                            while (true) {
                                rmc0 rmc0Var = rmc0VarListIterator;
                                if (!rmc0Var.hasNext()) {
                                    return arrayList;
                                }
                                Object next = rmc0Var.next();
                                String uri = ((pt1) next).getUri();
                                if (!uri.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !uri.equals("spotify:collection:tracks") && !uri.equals("spotify:internal:collection:tracks") && (!nhc1.Y(uri, "spotify:user:", false) || !nhc1.R(uri, ":collection", false))) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                }
            }
            return smc0VarK;
        }
        ArrayList arrayList2 = new ArrayList();
        rmc0 rmc0VarListIterator2 = smc0VarK.listIterator(0);
        while (true) {
            rmc0 rmc0Var2 = rmc0VarListIterator2;
            if (!rmc0Var2.hasNext()) {
                return arrayList2;
            }
            Object next2 = rmc0Var2.next();
            if (!set.contains(((pt1) next2).getUri())) {
                arrayList2.add(next2);
            }
        }
    }

    public final Set c() {
        return this.e;
    }

    public final void d(String str, String str2) {
        mmr0 mmr0Var = new mmr0(this.d, this.e);
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.put(str, mmr0Var);
        mmr0 mmr0Var2 = (mmr0) linkedHashMap.get(str2);
        if (mmr0Var2 == null) {
            mmr0Var2 = new mmr0((Object) null, (Object) null);
        }
        go1 go1Var = (go1) mmr0Var2.a;
        Set set = (Set) mmr0Var2.b;
        this.d = go1Var;
        this.e = set;
    }

    public final go1 e(AbstractList abstractList, AbstractList abstractList2, l57 l57Var) {
        ArrayList arrayListN0 = o7h.N0(abstractList2, abstractList);
        if (this.d == null && this.e == null && !l57Var.c) {
            ArrayList arrayList = new ArrayList(q7h.U(abstractList, 10));
            Iterator it = abstractList.iterator();
            while (it.hasNext()) {
                arrayList.add(((pt1) it.next()).getUri());
            }
            this.e = o7h.p1(arrayList);
        }
        go1 go1Var = this.d;
        List listF = f(abstractList, go1Var != null ? go1Var.c : null, arrayListN0, true, l57Var);
        go1 go1Var2 = this.d;
        List listF2 = f(abstractList2, go1Var2 != null ? go1Var2.d : null, arrayListN0, false, l57Var);
        pia1 pia1Var = l57Var.b;
        boolean z = l57Var.c;
        go1 go1Var3 = new go1(pia1Var, listF, listF2, z, l57Var.n, 2);
        if ((this.d == null || l57Var.o) && !z) {
            this.d = go1Var3;
        }
        return go1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    public final List f(List list, List list2, ArrayList arrayList, boolean z, l57 l57Var) {
        boolean z2;
        boolean z3 = l57Var.c;
        boolean z4 = l57Var.o;
        if (!z3) {
            Set set = this.e;
            if (list2 != null) {
                if (z4) {
                    go1 go1Var = this.d;
                    if ((go1Var != null ? go1Var.a : null) != l57Var.b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                Set set2 = w7x.a;
                if (!z && (l57Var.d || z2)) {
                    List list3 = list2;
                    int iS = zno1.s(q7h.U(list3, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (Object obj : list3) {
                        linkedHashMap.put(((pt1) obj).getUri(), obj);
                    }
                    ArrayList<pt1> arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        pt1 pt1Var = (pt1) obj2;
                        Set set3 = this.e;
                        if (set3 == null) {
                            set3 = set2;
                        }
                        if (!set3.contains(pt1Var.getUri())) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (pt1 pt1Var2 : arrayList2) {
                        pt1 pt1Var3 = (pt1) linkedHashMap.get(pt1Var2.getUri());
                        if (pt1Var3 != null) {
                            pt1Var2 = pt1Var3;
                        }
                        arrayList3.add(pt1Var2);
                    }
                    return i(arrayList, arrayList3);
                }
                ArrayList<Object> arrayListI = i(arrayList, list2);
                if (z) {
                    Set set4 = l57Var.l;
                    if (!set4.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(q7h.U(arrayListI, 10));
                        for (Object objG : arrayListI) {
                            if (objG instanceof ot1) {
                                ot1 ot1Var = (ot1) objG;
                                if (set4.contains(ot1Var.a)) {
                                    objG = ot1.g(ot1Var, true, 32751);
                                }
                            }
                            arrayList4.add(objG);
                        }
                        return arrayList4;
                    }
                } else if (z4) {
                    go1 go1Var2 = this.d;
                    List list4 = go1Var2 != null ? go1Var2.c : null;
                    if (list4 == null) {
                        list4 = z6x.a;
                    }
                    ArrayList arrayListN0 = o7h.N0(arrayListI, list4);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = arrayListN0.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(((pt1) it.next()).getUri());
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        pt1 pt1Var4 = (pt1) obj3;
                        if (!linkedHashSet.contains(pt1Var4.getUri())) {
                            Set set5 = this.e;
                            if (set5 == null) {
                                set5 = set2;
                            }
                            if (!set5.contains(pt1Var4.getUri())) {
                                arrayList5.add(obj3);
                            }
                        }
                    }
                    return o7h.N0(arrayList5, arrayListI);
                }
                return arrayListI;
            }
            if (set != null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (set.contains(((pt1) obj4).getUri()) == z) {
                        arrayList6.add(obj4);
                    }
                }
                return arrayList6;
            }
        }
        return list;
    }

    public final void g(go1 go1Var) {
        this.d = go1Var;
    }

    public final void h(Set set) {
        this.e = set;
    }

    public final ot1 j(boolean z) {
        String str = bo1.b;
        zwm1 zwm1Var = this.b;
        return new ot1(str, zwm1Var.i(), zwm1Var.i(), z, (String) null, false, false, (String) null, false, false, 0, (Map) null, 0, false, 32752);
    }
}
