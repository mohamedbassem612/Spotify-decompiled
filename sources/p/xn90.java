package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xn90 implements Iterator {
    public boolean a = true;
    public final /* synthetic */ Iterator b;

    public xn90(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dm5.z(!this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
