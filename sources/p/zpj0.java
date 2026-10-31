package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zpj0 {
    public final mdp0 a;
    public final mdp0 b;
    public final khp0 c;
    public final o8n d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ArrayList i = new ArrayList();
    public final poj0 j;
    public final vnd1 k;
    public final bnj0 l;
    public final Object m;
    public final o860 n;

    public zpj0(ArrayList arrayList, mdp0 mdp0Var, mdp0 mdp0Var2, khp0 khp0Var, o8n o8nVar) {
        this.a = mdp0Var;
        this.b = mdp0Var2;
        this.c = khp0Var;
        this.d = o8nVar;
        smo1.e(ha71.A(guo1.B(), o8nVar));
        this.j = new poj0(arrayList);
        vnd1 vnd1Var = new vnd1((byte) 3);
        this.k = vnd1Var;
        this.l = new bnj0(mdp0Var, mdp0Var2, vnd1Var);
        this.m = new Object();
        this.n = new o860(o8nVar, new yih0(this, (byte) 22));
    }

    public static void e(ArrayList arrayList, Function0 function0) {
        Double d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (j0p1.n(((mqj0) obj).e().b)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty() || (d = (Double) function0.invoke()) == null) {
            return;
        }
        double dDoubleValue = d.doubleValue();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((mqj0) it.next()).i(dDoubleValue);
        }
    }

    public static void f(ArrayList arrayList, iu30 iu30Var) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (j0p1.n(((mqj0) obj).e().b)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList2) {
            String str = ((mqj0) obj2).e().a;
            Object objH = linkedHashMap.get(str);
            if (objH == null) {
                objH = cfm0.h(str, linkedHashMap);
            }
            ((List) objH).add(obj2);
        }
        iu30Var.invoke(new t311(linkedHashMap.keySet(), new yih0(linkedHashMap, (byte) 21)));
    }

    public final void a(mqj0 mqj0Var) {
        String str = mqj0Var.e().a;
        LinkedHashMap linkedHashMap = this.g;
        Object objH = linkedHashMap.get(str);
        if (objH == null) {
            objH = cfm0.h(str, linkedHashMap);
        }
        ((List) objH).add(mqj0Var);
    }

    public final Long b(String str) {
        Collection collectionValues = this.e.values();
        Collection collectionValues2 = this.f.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues2.iterator();
        while (it.hasNext()) {
            r7h.W(((Map) it.next()).values(), arrayList);
        }
        ArrayList arrayListN0 = o7h.N0(arrayList, collectionValues);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayListN0.iterator();
        while (it2.hasNext()) {
            ((mqj0) it2.next()).e().a.equals(str);
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(((mqj0) it3.next()).g()));
        }
        return (Long) o7h.G0(arrayList3);
    }

    public final ArrayList c(npj0 npj0Var, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<nqj0> arrayList2 = new ArrayList();
        for (Object obj : list) {
            nqj0 nqj0Var = (nqj0) obj;
            if ((nqj0Var.c instanceof sqj0) && !l(npj0Var, nqj0Var, pqj0.a)) {
                arrayList2.add(obj);
            }
        }
        for (nqj0 nqj0Var2 : arrayList2) {
            sqj0 sqj0Var = (sqj0) nqj0Var2.c;
            mqj0 mqj0VarT = bnj0.t(this.l, npj0Var, nqj0Var2, this.d, j0p1.r(nqj0Var2.b) ? new lbc0(this) : null);
            if (mqj0VarT != null) {
                this.e.put(mqj0VarT.f(), mqj0VarT);
                a(mqj0VarT);
                this.n.u(mqj0VarT, sqj0Var.a);
                arrayList.add(mqj0VarT);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = o7h.l1(this.c.l.values()).iterator();
        while (it.hasNext()) {
            r7h.W(d((wgp0) it.next(), npj0Var, list), arrayList3);
        }
        return o7h.N0(arrayList3, arrayList);
    }

    public final ArrayList d(wgp0 wgp0Var, npj0 npj0Var, List list) {
        npj0 npj0Var2;
        boolean zContains;
        ArrayList arrayList = new ArrayList();
        ArrayList<nqj0> arrayList2 = new ArrayList();
        for (Object obj : list) {
            nqj0 nqj0Var = (nqj0) obj;
            uqj0 uqj0Var = nqj0Var.c;
            if (uqj0Var instanceof sqj0) {
                zContains = false;
            } else {
                if (!(uqj0Var instanceof tqj0)) {
                    eg.o();
                    return null;
                }
                Set set = (Set) wgp0Var.b.d.get(qm81.METRIC);
                if (set == null) {
                    set = w7x.a;
                }
                zContains = set.contains(nqj0Var.a());
            }
            if (zContains) {
                arrayList2.add(obj);
            }
        }
        for (nqj0 nqj0Var2 : arrayList2) {
            qqj0 qqj0Var = new qqj0(wgp0Var.a, wgp0Var.d);
            if (l(npj0Var, nqj0Var2, qqj0Var)) {
                npj0Var2 = npj0Var;
            } else {
                npj0Var2 = npj0Var;
                mqj0 mqj0VarS = bnj0.s(this.l, npj0Var2, nqj0Var2, wgp0Var.e, wgp0Var.f, qqj0Var);
                if (mqj0VarS != null) {
                    LinkedHashMap linkedHashMap = this.f;
                    UUID uuid = wgp0Var.d;
                    Object linkedHashMap2 = linkedHashMap.get(uuid);
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap.put(uuid, linkedHashMap2);
                    }
                    ((Map) linkedHashMap2).put(mqj0VarS.f(), mqj0VarS);
                    a(mqj0VarS);
                    arrayList.add(mqj0VarS);
                }
            }
            npj0Var = npj0Var2;
        }
        return arrayList;
    }

    public final void g(hpj0 hpj0Var, long j) {
        List listN0;
        Collection collectionValues;
        Double d;
        boolean zEquals = hpj0Var.equals(epj0.a);
        LinkedHashMap linkedHashMap = this.e;
        if (zEquals) {
            listN0 = o7h.l1(linkedHashMap.values());
        } else {
            boolean z = hpj0Var instanceof gpj0;
            LinkedHashMap linkedHashMap2 = this.f;
            if (z) {
                Map map = (Map) linkedHashMap2.get(((gpj0) hpj0Var).a());
                listN0 = (map == null || (collectionValues = map.values()) == null) ? null : o7h.l1(collectionValues);
                if (listN0 == null) {
                    listN0 = z6x.a;
                }
            } else {
                if (!(hpj0Var instanceof fpj0)) {
                    eg.o();
                    return;
                }
                Collection collectionValues2 = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues2) {
                    if (((fpj0) hpj0Var).a().contains(((mqj0) obj).e())) {
                        arrayList.add(obj);
                    }
                }
                Collection collectionValues3 = linkedHashMap2.values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues3.iterator();
                while (it.hasNext()) {
                    Collection collectionValues4 = ((Map) it.next()).values();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : collectionValues4) {
                        if (((fpj0) hpj0Var).b().contains(((mqj0) obj2).e())) {
                            arrayList3.add(obj2);
                        }
                    }
                    r7h.W(arrayList3, arrayList2);
                }
                listN0 = o7h.N0(arrayList2, arrayList);
            }
        }
        List<mqj0> list = listN0;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((mqj0) it2.next()).e().a);
        }
        for (String str : linkedHashSet) {
            Function0 function0 = (Function0) this.h.get(str);
            if (function0 != null && (d = (Double) function0.invoke()) != null) {
                j(str, d.doubleValue(), j, list);
            }
        }
        for (ypj0 ypj0Var : this.i) {
            Set setB = ypj0Var.b();
            if (!(setB instanceof Collection) || !setB.isEmpty()) {
                Iterator it3 = setB.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (linkedHashSet.contains((String) it3.next())) {
                            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
                            UUID uuid = new UUID((threadLocalRandomCurrent.nextLong() & (-61441)) | 16384, (threadLocalRandomCurrent.nextLong() & 4611686018427387903L) | Long.MIN_VALUE);
                            for (mqj0 mqj0Var : list) {
                                if (ypj0Var.b().contains(mqj0Var.e().a)) {
                                    mqj0Var.h(uuid);
                                }
                            }
                            ypj0Var.a().invoke(new t311(linkedHashSet, new qi6(this, j, list, (byte) 10)));
                        }
                    }
                }
            }
            list = list;
        }
    }

    public final npj0 h(String str, opj0 opj0Var, kqj0 kqj0Var) {
        npj0 npj0Var;
        a6e a6eVarK;
        synchronized (this.m) {
            mmr0 mmr0VarE = this.j.E(str, opj0Var, kqj0Var);
            npj0Var = (npj0) mmr0VarE.a;
            if (((Boolean) mmr0VarE.b).booleanValue() && (a6eVarK = this.j.k(str)) != null) {
                c(npj0Var, a6eVarK.a());
            }
        }
        return npj0Var;
    }

    public final void i(mqj0 mqj0Var) {
        String str = mqj0Var.e().a;
        LinkedHashMap linkedHashMap = this.g;
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            return;
        }
        list.remove(mqj0Var);
        if (list.isEmpty()) {
            linkedHashMap.remove(str);
        }
    }

    public final void j(String str, double d, long j, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mqj0 mqj0Var = (mqj0) it.next();
            if (mqj0Var.e().a.equals(str)) {
                mqj0Var.i(d);
            }
        }
    }

    public final void k(Set set) {
        Map mapT;
        synchronized (this.m) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Long lB = b(str);
                    mmr0 mmr0VarN = lB != null ? oqn1.n(str, Long.valueOf(lB.longValue())) : null;
                    if (mmr0VarN != null) {
                        arrayList.add(mmr0VarN);
                    }
                }
                mapT = sqg0.T(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k.w(mapT, this.d);
    }

    public final boolean l(npj0 npj0Var, nqj0 nqj0Var, rqj0 rqj0Var) {
        oqj0 oqj0Var = new oqj0(npj0Var, nqj0Var, rqj0Var);
        if (rqj0Var.equals(pqj0.a)) {
            return this.e.containsKey(oqj0Var);
        }
        if (!(rqj0Var instanceof qqj0)) {
            eg.o();
            return false;
        }
        Map map = (Map) this.f.get(((qqj0) rqj0Var).a());
        if (map == null) {
            map = b7x.a;
        }
        return map.containsKey(oqj0Var);
    }
}
