package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class lug1 implements Iterator, ola0 {
    public Object[] a = jug1.e.d;
    public int b;
    public int c;

    public final void a(int i, int i2, Object[] objArr) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
