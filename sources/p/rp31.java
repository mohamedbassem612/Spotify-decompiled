package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rp31 implements Iterator {
    public final kng0 a;
    public wgc b;
    public int c;

    public rp31(sp31 sp31Var) {
        kng0 kng0Var = new kng0(sp31Var);
        this.a = kng0Var;
        this.b = new wgc(kng0Var.a());
        this.c = sp31Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = new wgc(this.a.a());
        }
        this.c--;
        return Byte.valueOf(this.b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
