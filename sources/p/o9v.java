package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o9v implements Iterator, ola0 {
    public final /* synthetic */ byte a = 1;
    public final Iterator b;
    public int c;

    public o9v(ipd1 ipd1Var) {
        this.c = ipd1Var.b;
        this.b = ipd1Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.c > 0 && it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new aa80(i, it.next());
                }
                p7h.T();
                throw null;
            default:
                int i2 = this.c;
                if (i2 != 0) {
                    this.c = i2 - 1;
                    return it.next();
                }
                hhg1.k();
                return null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o9v(i46 i46Var) {
        this.b = ((i46) i46Var.b).iterator();
    }

    public o9v(p9v p9vVar) {
        this.b = p9vVar.a.iterator();
        this.c = p9vVar.b;
    }
}
