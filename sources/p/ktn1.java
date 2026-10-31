package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ktn1 implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ gun1 c;

    public ktn1(gun1 gun1Var) {
        this.c = gun1Var;
        this.b = gun1Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.b(i));
        }
        hhg1.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
