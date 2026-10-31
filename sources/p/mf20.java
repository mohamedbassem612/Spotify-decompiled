package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mf20 implements Iterator, ola0 {
    public final Iterator a;
    public int b = -1;
    public Object c;
    public final /* synthetic */ nf20 d;

    public mf20(nf20 nf20Var) {
        this.d = nf20Var;
        this.a = nf20Var.a.iterator();
    }

    public final void a() {
        Object next;
        nf20 nf20Var;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                this.b = 0;
                return;
            } else {
                next = it.next();
                nf20Var = this.d;
            }
        } while (((Boolean) nf20Var.c.invoke(next)).booleanValue() != nf20Var.b);
        this.c = next;
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            hhg1.k();
            return null;
        }
        Object obj = this.c;
        this.c = null;
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
