package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ecc {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        lf30 lf30Var = rfb1.j;
        mmr0 mmr0Var = new mmr0(lf30Var.a(ajn0.e("name")).i(), sfb1.d);
        mmr0 mmr0Var2 = new mmr0(lf30Var.a(ajn0.e("ordinal")).i(), ajn0.e("ordinal"));
        mmr0 mmr0Var3 = new mmr0(ob51.g("size", rfb1.C), ajn0.e("size"));
        kf30 kf30Var = rfb1.G;
        Map mapJ = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, new mmr0(ob51.g("size", kf30Var), ajn0.e("size")), new mmr0(rfb1.e.a(ajn0.e("length")).i(), ajn0.e("length")), new mmr0(ob51.g("keys", kf30Var), ajn0.e("keySet")), new mmr0(ob51.g("values", kf30Var), ajn0.e("values")), new mmr0(ob51.g("entries", kf30Var), ajn0.e("entrySet")), new mmr0(ob51.g("size", rfb1.a0), ajn0.e("length")), new mmr0(ob51.g("size", rfb1.b0), ajn0.e("length")), new mmr0(ob51.g("size", rfb1.c0), ajn0.e("length"))});
        a = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        ArrayList<mmr0> arrayList = new ArrayList(q7h.U(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new mmr0(((kf30) entry.getKey()).a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mmr0 mmr0Var4 : arrayList) {
            ajn0 ajn0Var = (ajn0) mmr0Var4.b;
            Object arrayList2 = linkedHashMap.get(ajn0Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ajn0Var, arrayList2);
            }
            ((List) arrayList2).add((ajn0) mmr0Var4.a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), o7h.j0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Map map = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = j8a0.a;
            heg hegVarG = j8a0.g(((kf30) entry3.getKey()).b().a);
            hegVarG.getClass();
            linkedHashSet.add(hegVarG.a().a((ajn0) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((kf30) it.next()).a.g());
        }
        d = o7h.p1(arrayList3);
    }
}
