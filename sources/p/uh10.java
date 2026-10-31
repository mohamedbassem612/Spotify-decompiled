package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class uh10 {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(ebb1.u, a("java.util.ArrayList", "java.util.LinkedList"));
        b(ebb1.v, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(ebb1.w, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        kf30 kf30Var = new kf30("java.util.function.Function");
        b(new heg(kf30Var.b(), kf30Var.a.g()), a("java.util.function.UnaryOperator"));
        kf30 kf30Var2 = new kf30("java.util.function.BiFunction");
        b(new heg(kf30Var2.b(), kf30Var2.a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new mmr0(((heg) entry.getKey()).a(), ((heg) entry.getValue()).a()));
        }
        b = sqg0.T(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            kf30 kf30Var = new kf30(str);
            arrayList.add(new heg(kf30Var.b(), kf30Var.a.g()));
        }
        return arrayList;
    }

    public static void b(heg hegVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, hegVar);
        }
    }
}
