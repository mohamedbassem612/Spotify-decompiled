package p;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wfl1 implements Iterator {
    public Iterator a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.a;
        while (it.hasNext()) {
            pze0.m(((WeakReference) it.next()).get());
            it.remove();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        return null;
    }
}
