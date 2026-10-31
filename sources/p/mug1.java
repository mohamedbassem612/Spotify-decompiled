package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mug1 implements Iterator, ola0 {
    public Object[] a = kug1.e.d;
    public int b;
    public int c;

    public final Object[] a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final void c(int i, int i2, Object[] objArr) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    public final void d(int i) {
        this.c = i;
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
