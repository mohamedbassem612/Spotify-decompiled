package p;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yh91 implements Iterator {
    public boolean a;
    public final int b;
    public final /* synthetic */ zh91 c;

    public yh91(zh91 zh91Var) {
        this.c = zh91Var;
        this.b = ((AbstractList) zh91Var).modCount;
    }

    public final void a() {
        zh91 zh91Var = this.c;
        int i = ((AbstractList) zh91Var).modCount;
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) zh91Var).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            hhg1.k();
            return null;
        }
        this.a = true;
        a();
        return this.c.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.c.clear();
    }
}
