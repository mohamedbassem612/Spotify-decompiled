package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gpg1 implements Iterator, ola0 {
    public final ArrayList a = new ArrayList();
    public Iterator b;

    public gpg1(d7 d7Var) {
        this.b = d7Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        Iterator it = (Iterator) j141.U0.invoke(next);
        ArrayList arrayList = this.a;
        if (it != null && it.hasNext()) {
            arrayList.add(this.b);
            this.b = it;
            return next;
        }
        while (!this.b.hasNext() && !arrayList.isEmpty()) {
            this.b = (Iterator) o7h.A0(arrayList);
            r7h.d0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
