package p;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class do90 implements Iterator {
    public Iterator a;
    public Iterator b;
    public Iterator c;
    public ArrayDeque d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                ArrayDeque arrayDeque = this.d;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    it = null;
                    break;
                }
                this.c = (Iterator) this.d.removeFirst();
            }
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof do90) {
                do90 do90Var = (do90) it4;
                this.b = do90Var.b;
                ArrayDeque arrayDeque2 = this.d;
                if (arrayDeque2 == null) {
                    arrayDeque2 = new ArrayDeque();
                    this.d = arrayDeque2;
                }
                arrayDeque2.addFirst(this.c);
                if (do90Var.d != null) {
                    while (!do90Var.d.isEmpty()) {
                        this.d.addFirst((Iterator) do90Var.d.removeLast());
                    }
                }
                this.c = do90Var.c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        Iterator it = this.b;
        this.a = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.a;
        if (it == null) {
            eg.m("no calls to next() since the last call to remove()");
        } else {
            it.remove();
            this.a = null;
        }
    }
}
