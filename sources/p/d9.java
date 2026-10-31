package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class d9 extends g7 implements d380 {
    public abstract d9 c(int i, Object obj);

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    public abstract d9 d(Object obj);

    public d9 e(Collection collection) {
        ers0 ers0VarF = f();
        ers0VarF.addAll(collection);
        return ers0VarF.d();
    }

    public abstract ers0 f();

    public abstract d9 i(b9 b9Var);

    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract d9 k(int i);

    public abstract d9 l(int i, Object obj);

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final List subList(int i, int i2) {
        return super.subList(i, i2);
    }
}
