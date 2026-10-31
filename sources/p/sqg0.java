package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class sqg0 extends zno1 {
    public static Object G(Object obj, Map map) {
        if (!(map instanceof rdn0)) {
            Object obj2 = map.get(obj);
            if (obj2 != null || map.containsKey(obj)) {
                return obj2;
            }
            bhn0.t(cy30.m("Key ", obj, " is missing in the map."));
            return null;
        }
        LinkedHashMap linkedHashMap = ((rdn0) map).a;
        Object obj3 = linkedHashMap.get(obj);
        if (obj3 != null || linkedHashMap.containsKey(obj)) {
            return obj3;
        }
        return 0;
    }

    public static HashMap H(mmr0... mmr0VarArr) {
        HashMap map = new HashMap(zno1.s(mmr0VarArr.length));
        R(map, mmr0VarArr);
        return map;
    }

    public static LinkedHashMap I(mmr0... mmr0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mmr0VarArr.length));
        R(linkedHashMap, mmr0VarArr);
        return linkedHashMap;
    }

    public static Map J(mmr0... mmr0VarArr) {
        if (mmr0VarArr.length <= 0) {
            return b7x.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mmr0VarArr.length));
        R(linkedHashMap, mmr0VarArr);
        return linkedHashMap;
    }

    public static Map K(Object obj, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return N(linkedHashMap);
    }

    public static Map L(Map map, Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.keySet().removeAll(r7h.Y(iterable));
        return N(linkedHashMap);
    }

    public static LinkedHashMap M(mmr0... mmr0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mmr0VarArr.length));
        R(linkedHashMap, mmr0VarArr);
        return linkedHashMap;
    }

    public static final Map N(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return b7x.a;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static LinkedHashMap O(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map P(Map map, mmr0 mmr0Var) {
        if (map.isEmpty()) {
            return zno1.t(mmr0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(mmr0Var.a, mmr0Var.b);
        return linkedHashMap;
    }

    public static final void Q(LinkedHashMap linkedHashMap, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mmr0 mmr0Var = (mmr0) it.next();
            linkedHashMap.put(mmr0Var.a, mmr0Var.b);
        }
    }

    public static void R(Map map, mmr0[] mmr0VarArr) {
        for (mmr0 mmr0Var : mmr0VarArr) {
            map.put(mmr0Var.a, mmr0Var.b);
        }
    }

    public static List S(Map map) {
        int size = map.size();
        z6x z6xVar = z6x.a;
        if (size == 0) {
            return z6xVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return z6xVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return k4p1.x(new mmr0(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new mmr0(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new mmr0(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map T(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Q(linkedHashMap, iterable);
            return N(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return b7x.a;
        }
        if (size == 1) {
            return zno1.t((mmr0) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(collection.size()));
        Q(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map U(Map map) {
        int size = map.size();
        if (size == 0) {
            return b7x.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static Map V(n561 n561Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = n561Var.iterator();
        while (it.hasNext()) {
            mmr0 mmr0Var = (mmr0) it.next();
            linkedHashMap.put(mmr0Var.a, mmr0Var.b);
        }
        return N(linkedHashMap);
    }

    public static Map W(mmr0[] mmr0VarArr) {
        int length = mmr0VarArr.length;
        if (length == 0) {
            return b7x.a;
        }
        if (length == 1) {
            return zno1.t(mmr0VarArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mmr0VarArr.length));
        R(linkedHashMap, mmr0VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap X(Map map) {
        return new LinkedHashMap(map);
    }
}
