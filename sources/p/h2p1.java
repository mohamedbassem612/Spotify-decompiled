package p;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class h2p1 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ p2p1 d;

    public h2p1(p2p1 p2p1Var) {
        Objects.requireNonNull(p2p1Var);
        this.d = p2p1Var;
        this.a = p2p1Var.e;
        this.b = p2p1Var.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        p2p1 p2p1Var = this.d;
        if (p2p1Var.e != this.a) {
            eg.d();
            return null;
        }
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        int i = this.b;
        this.c = i;
        Object objA = a(i);
        int i2 = this.b + 1;
        if (i2 >= p2p1Var.f) {
            i2 = -1;
        }
        this.b = i2;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        p2p1 p2p1Var = this.d;
        if (p2p1Var.e != this.a) {
            eg.d();
            return;
        }
        ulo1.v(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        p2p1Var.remove(p2p1Var.a()[this.c]);
        this.b--;
        this.c = -1;
    }
}
