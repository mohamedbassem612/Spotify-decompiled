package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gqo implements f6c0 {
    public final zwp0 a;
    public final z0t b;

    public gqo(zwp0 zwp0Var, z0t z0tVar) {
        this.a = zwp0Var;
        this.b = z0tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // p.f6c0
    public final Single a(List list, List list2, List list3, boolean z) {
        if (!this.b.a.g() || list3.isEmpty()) {
            if (z) {
                Single singleJust = Single.just(o7h.a1(list, this.a));
                singleJust.getClass();
                return singleJust;
            }
            Single singleJust2 = Single.just(list);
            singleJust2.getClass();
            return singleJust2;
        }
        List list4 = list;
        int iS = zno1.s(q7h.U(list4, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list4) {
            linkedHashMap.put(((otl) obj).getId(), obj);
        }
        List list5 = list2;
        int iS2 = zno1.s(q7h.U(list5, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj2 : list5) {
            linkedHashMap2.put(((vod1) obj2).a, obj2);
        }
        LinkedHashMap linkedHashMapO = sqg0.O(linkedHashMap, linkedHashMap2);
        Object arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            otl otlVar = (otl) linkedHashMapO.get((String) it.next());
            if (otlVar != null) {
                arrayList.add(otlVar);
            }
        }
        if (z) {
            arrayList = o7h.a1((Iterable) arrayList, k0d.d);
        }
        Single singleJust3 = Single.just(arrayList);
        singleJust3.getClass();
        return singleJust3;
    }
}
