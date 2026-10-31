package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a661 implements Iterator, ola0 {
    public boolean a = true;
    public final /* synthetic */ Object b;

    public a661(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            this.a = false;
            return this.b;
        }
        hhg1.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
