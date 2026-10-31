package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ep20 implements Iterator, ola0 {
    public final Iterator a;
    public Iterator b;
    public byte c;
    public final /* synthetic */ fp20 d;

    public ep20(fp20 fp20Var) {
        this.d = fp20Var;
        this.a = fp20Var.a.iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.b;
        if (it2 != null && it2.hasNext()) {
            this.c = (byte) 1;
            return true;
        }
        do {
            Iterator it3 = this.a;
            if (!it3.hasNext()) {
                this.c = (byte) 2;
                this.b = null;
                return false;
            }
            Object next = it3.next();
            fp20 fp20Var = this.d;
            it = (Iterator) fp20Var.c.invoke(fp20Var.b.invoke(next));
        } while (!it.hasNext());
        this.b = it;
        this.c = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.c;
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.c;
        if (b == 2) {
            hhg1.k();
            return null;
        }
        if (b == 0 && !a()) {
            hhg1.k();
            return null;
        }
        this.c = (byte) 0;
        Iterator it = this.b;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
