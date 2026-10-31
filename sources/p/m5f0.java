package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m5f0 implements Iterator, ola0 {
    public final long a;
    public boolean b;
    public long c;

    public m5f0(long j, long j2) {
        this.a = j2;
        boolean z = j <= j2;
        this.b = z;
        this.c = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.c;
        if (j != this.a) {
            this.c = 1 + j;
        } else {
            if (!this.b) {
                hhg1.k();
                return null;
            }
            this.b = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
