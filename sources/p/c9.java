package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class c9 extends g7 implements c380, p280 {
    @Override // p.k6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p.k6, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p.g7, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p.g7, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p.g7, java.util.List
    public final List subList(int i, int i2) {
        return cto1.u(this, i, i2);
    }

    @Override // java.util.List, p.c380
    public final z280 subList(int i, int i2) {
        return cto1.u(this, i, i2);
    }
}
