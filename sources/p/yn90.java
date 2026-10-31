package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yn90 extends rw20 {
    public final /* synthetic */ Collection b;
    public final /* synthetic */ int c;

    public yn90(int i, Collection collection) {
        this.b = collection;
        this.c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Collection collection = this.b;
        boolean z = collection instanceof List;
        int i = this.c;
        if (z) {
            List list = (List) collection;
            return list.subList(Math.min(list.size(), i), list.size()).iterator();
        }
        Iterator it = collection.iterator();
        it.getClass();
        dm5.n(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new xn90(it);
    }
}
