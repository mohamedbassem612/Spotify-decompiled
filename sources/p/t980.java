package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class t980 implements Iterator, ola0 {
    public int a;
    public int b;
    public boolean c;

    public t980(int i) {
        this.a = i;
    }

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        Object objA = a(this.b);
        this.b++;
        this.c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            eg.m("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
