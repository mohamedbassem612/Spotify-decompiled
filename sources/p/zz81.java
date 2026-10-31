package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class zz81 {
    public static final q8n a = qgo1.q(n5u.d);

    public static final void a(ArrayList arrayList, HashSet hashSet) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (e1r e1rVar : ((f1r) it.next()).getItems()) {
                if (!e1rVar.a.a()) {
                    hashSet.add(e1rVar.a);
                }
            }
        }
    }

    public static final mmr0 b(d0r d0rVar) {
        Map mapJ = d0rVar.j();
        return new mmr0(pvc.h(new pvc((byte) 5), mapJ), new s280(mapJ));
    }

    public static final boolean c(Map map, Map map2, LinkedHashMap linkedHashMap, h8k1 h8k1Var, ioj0 ioj0Var, d0r d0rVar, int i) {
        boolean zIsEmpty;
        boolean z;
        Object obj = h8k1Var.a;
        s3r s3rVar = (s3r) linkedHashMap.get(obj.getClass());
        if (s3rVar != null) {
            return s3rVar.a(d0rVar, obj, i);
        }
        Object obj2 = map2.get(obj.getClass());
        obj2.getClass();
        Map map3 = (Map) ((iu30) obj2).invoke(obj);
        Object obj3 = map.get(obj.getClass());
        obj3.getClass();
        Map map4 = (Map) obj3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(map3.keySet());
        linkedHashSet.removeAll(map4.keySet());
        if (!linkedHashSet.isEmpty()) {
            eg.n("Missing metadata requests for parts: ", linkedHashSet, ". Did you update your element's registration entry requiredMetadata declaration?");
            return false;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map4.entrySet()) {
            if (o7h.i0(map3.keySet(), entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Set set = (Set) entry2.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : set) {
                if (obj4 instanceof zp21) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((zp21) it.next()).a);
            }
            linkedHashMap3.put(key, o7h.p1(arrayList2));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            if (!((Set) entry3.getValue()).isEmpty()) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
            }
        }
        if (linkedHashMap4.isEmpty()) {
            return true;
        }
        cqs0 cqs0Var = ioj0Var.a;
        while (true) {
            boolean z2 = true;
            for (mmr0 mmr0Var : sqg0.S(map3)) {
                Object obj5 = mmr0Var.a;
                Set set2 = (Set) mmr0Var.b;
                w7x w7xVar = (Set) linkedHashMap4.get(obj5);
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                Set set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it2 = set3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = true;
                            break;
                        }
                        Map map5 = (Map) cqs0Var.get((String) it2.next());
                        if (map5 == null) {
                            zIsEmpty = w7xVar.isEmpty();
                        } else if (map5.keySet().containsAll((Collection) w7xVar)) {
                            Set set4 = (Iterable) w7xVar;
                            ArrayList arrayList3 = new ArrayList(q7h.U(set4, 10));
                            Iterator it3 = set4.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((hoj0) map5.get(it3.next()));
                            }
                            if (!arrayList3.isEmpty()) {
                                Iterator it4 = arrayList3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        hoj0 hoj0Var = (hoj0) it4.next();
                                        if (!(hoj0Var instanceof goj0) && (i == 1 || !(hoj0Var instanceof foj0))) {
                                            zIsEmpty = false;
                                        }
                                    }
                                }
                            }
                            zIsEmpty = true;
                        } else {
                            zIsEmpty = false;
                        }
                        if (!zIsEmpty) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (!z2 || !z) {
                    z2 = false;
                }
            }
            return z2;
        }
    }

    public static final int d(List list, Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null && u890.j(o7h.t0(num.intValue(), list), obj)) {
            return num.intValue();
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j((h8k1) it.next(), obj)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        hhg1.n("Failed requirement.");
        return 0;
    }

    public static final LinkedHashMap e(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            for (jh5 jh5Var : (Set) obj) {
                Object arrayList = linkedHashMap.get(jh5Var);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(jh5Var, arrayList);
                }
                ((List) arrayList).add(Integer.valueOf(i));
            }
            i = i2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), o7h.k1((List) entry.getValue()));
        }
        return linkedHashMap2;
    }

    public static final LinkedHashMap f(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            linkedHashMap.putIfAbsent((h8k1) obj, Integer.valueOf(i));
            i = i2;
        }
        return linkedHashMap;
    }
}
