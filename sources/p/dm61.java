package p;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class dm61 extends cwl1 {
    public static Set A0(Object obj) {
        return obj != null ? Collections.singleton(obj) : w7x.a;
    }

    public static Set B0(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static HashSet t0(Object... objArr) {
        HashSet hashSet = new HashSet(zno1.s(objArr.length));
        f46.K0(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet u0(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && u890.j(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set v0(Set set, Iterable iterable) {
        Collection<?> collectionY = r7h.Y(iterable);
        if (collectionY.isEmpty()) {
            return o7h.p1(set);
        }
        if (!(collectionY instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionY);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionY).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set w0(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(objArr.length));
        f46.K0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet x0(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet y0(Set set, Iterable iterable) {
        int size;
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(size));
        linkedHashSet.addAll(set);
        r7h.W(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set z0(Object... objArr) {
        return f46.S0(objArr);
    }
}
