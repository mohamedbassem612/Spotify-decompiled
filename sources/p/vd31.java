package p;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vd31 extends y8 {
    public final List a;

    public vd31(List list) {
        this.a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, Object obj) {
        this.a.add(o7h.S0(i, this), obj);
    }

    public final int b() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(int i) {
        return this.a.remove(o7h.R0(i, this));
    }

    public final void clear() {
        this.a.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object get(int i) {
        return this.a.get(o7h.R0(i, this));
    }

    public final Iterator iterator() {
        return new ud31(this, 0);
    }

    public final ListIterator listIterator() {
        return new ud31(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object set(int i, Object obj) {
        return this.a.set(o7h.R0(i, this), obj);
    }

    public final ListIterator listIterator(int i) {
        return new ud31(this, i);
    }
}
