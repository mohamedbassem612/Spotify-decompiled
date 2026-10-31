package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class koa1 {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final hoa1 g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set setS0 = f46.S0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(q7h.U(setS0, 10));
        Iterator it = setS0.iterator();
        while (it.hasNext()) {
            arrayList.add(j1e1.A("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", nja0.e.c));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((hoa1) it2.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((hoa1) it3.next()).b.b());
        }
        nja0 nja0Var = nja0.e;
        String str = nja0Var.c;
        String str2 = nja0Var.c;
        hoa1 hoa1VarA = j1e1.A("java/util/Collection", "contains", "Ljava/lang/Object;", str);
        joa1 joa1Var = joa1.d;
        mmr0 mmr0Var = new mmr0(hoa1VarA, joa1Var);
        mmr0 mmr0Var2 = new mmr0(j1e1.A("java/util/Collection", "remove", "Ljava/lang/Object;", str2), joa1Var);
        mmr0 mmr0Var3 = new mmr0(j1e1.A("java/util/Map", "containsKey", "Ljava/lang/Object;", str2), joa1Var);
        mmr0 mmr0Var4 = new mmr0(j1e1.A("java/util/Map", "containsValue", "Ljava/lang/Object;", str2), joa1Var);
        mmr0 mmr0Var5 = new mmr0(j1e1.A("java/util/Map", "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), joa1Var);
        mmr0 mmr0Var6 = new mmr0(j1e1.A("java/util/Map", "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), joa1.e);
        hoa1 hoa1VarA2 = j1e1.A("java/util/Map", "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        joa1 joa1Var2 = joa1.b;
        mmr0 mmr0Var7 = new mmr0(hoa1VarA2, joa1Var2);
        mmr0 mmr0Var8 = new mmr0(j1e1.A("java/util/Map", "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), joa1Var2);
        nja0 nja0Var2 = nja0.i;
        hoa1 hoa1VarA3 = j1e1.A("java/util/List", "indexOf", "Ljava/lang/Object;", nja0Var2.c);
        joa1 joa1Var3 = joa1.c;
        Map mapJ = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, new mmr0(hoa1VarA3, joa1Var3), new mmr0(j1e1.A("java/util/List", "lastIndexOf", "Ljava/lang/Object;", nja0Var2.c), joa1Var3)});
        c = mapJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapJ.size()));
        for (Map.Entry entry : mapJ.entrySet()) {
            linkedHashMap.put(((hoa1) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetY0 = dm61.y0(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(q7h.U(linkedHashSetY0, 10));
        Iterator it4 = linkedHashSetY0.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((hoa1) it4.next()).b);
        }
        e = o7h.p1(arrayList5);
        ArrayList arrayList6 = new ArrayList(q7h.U(linkedHashSetY0, 10));
        Iterator it5 = linkedHashSetY0.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((hoa1) it5.next()).e);
        }
        f = o7h.p1(arrayList6);
        nja0 nja0Var3 = nja0.i;
        String str3 = nja0Var3.c;
        String str4 = nja0Var3.c;
        hoa1 hoa1VarA4 = j1e1.A("java/util/List", "removeAt", str3, "Ljava/lang/Object;");
        g = hoa1VarA4;
        Map mapJ2 = sqg0.J(new mmr0[]{new mmr0(j1e1.A("java/lang/Number", "toByte", "", nja0.g.c), ajn0.e("byteValue")), new mmr0(j1e1.A("java/lang/Number", "toShort", "", nja0.h.c), ajn0.e("shortValue")), new mmr0(j1e1.A("java/lang/Number", "toInt", "", str4), ajn0.e("intValue")), new mmr0(j1e1.A("java/lang/Number", "toLong", "", nja0.X.c), ajn0.e("longValue")), new mmr0(j1e1.A("java/lang/Number", "toFloat", "", nja0.t.c), ajn0.e("floatValue")), new mmr0(j1e1.A("java/lang/Number", "toDouble", "", nja0.Y.c), ajn0.e("doubleValue")), new mmr0(hoa1VarA4, ajn0.e("remove")), new mmr0(j1e1.A("java/lang/CharSequence", "get", str4, nja0.f.c), ajn0.e("charAt")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicInteger", "load", "", "I"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicInteger", "store", "I", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicInteger", "exchange", "I", "I"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicInteger", "fetchAndAdd", "I", "I"), ajn0.e("getAndAdd")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicInteger", "addAndFetch", "I", "I"), ajn0.e("addAndGet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLong", "load", "", "J"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLong", "store", "J", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLong", "exchange", "J", "J"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLong", "fetchAndAdd", "J", "J"), ajn0.e("getAndAdd")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLong", "addAndFetch", "J", "J"), ajn0.e("addAndGet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicBoolean", "load", "", "Z"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicBoolean", "store", "Z", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicBoolean", "exchange", "Z", "Z"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReference", "load", "", "Ljava/lang/Object;"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReference", "store", "Ljava/lang/Object;", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReference", "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicIntegerArray", "loadAt", "I", "I"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicIntegerArray", "storeAt", "II", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicIntegerArray", "exchangeAt", "II", "I"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicIntegerArray", "compareAndSetAt", "III", "Z"), ajn0.e("compareAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicIntegerArray", "fetchAndAddAt", "II", "I"), ajn0.e("getAndAdd")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicIntegerArray", "addAndFetchAt", "II", "I"), ajn0.e("addAndGet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLongArray", "loadAt", "I", "J"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLongArray", "storeAt", "IJ", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLongArray", "exchangeAt", "IJ", "J"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLongArray", "compareAndSetAt", "IJJ", "Z"), ajn0.e("compareAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLongArray", "fetchAndAddAt", "IJ", "J"), ajn0.e("getAndAdd")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicLongArray", "addAndFetchAt", "IJ", "J"), ajn0.e("addAndGet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReferenceArray", "loadAt", "I", "Ljava/lang/Object;"), ajn0.e("get")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReferenceArray", "storeAt", "ILjava/lang/Object;", "V"), ajn0.e("set")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReferenceArray", "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), ajn0.e("getAndSet")), new mmr0(j1e1.A("java/util/concurrent/atomic/AtomicReferenceArray", "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), ajn0.e("compareAndSet"))});
        h = mapJ2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(mapJ2.size()));
        for (Map.Entry entry2 : mapJ2.entrySet()) {
            linkedHashMap2.put(((hoa1) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            hoa1 hoa1Var = (hoa1) entry3.getKey();
            ajn0 ajn0Var = (ajn0) entry3.getValue();
            linkedHashSet.add(hoa1Var.a + '.' + (ajn0Var + '(' + hoa1Var.c + ')' + hoa1Var.d));
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((hoa1) it6.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<mmr0> arrayList7 = new ArrayList(q7h.U(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new mmr0(((hoa1) entry4.getKey()).b, entry4.getValue()));
        }
        int iS = zno1.s(q7h.U(arrayList7, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS);
        for (mmr0 mmr0Var9 : arrayList7) {
            linkedHashMap3.put((ajn0) mmr0Var9.b, (ajn0) mmr0Var9.a);
        }
        k = linkedHashMap3;
    }
}
