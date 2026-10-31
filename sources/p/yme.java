package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yme implements Iterator, ola0 {
    public final int a;
    public boolean b;
    public int c;

    public yme(char c, char c2) {
        this.a = c2;
        boolean z = u890.q(c, c2) <= 0;
        this.b = z;
        this.c = z ? c : c2;
    }

    public final char a() {
        int i = this.c;
        if (i != this.a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                hhg1.k();
                return (char) 0;
            }
            this.b = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
