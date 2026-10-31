package p;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wd31 extends g7 {
    public final List a;

    public wd31(List list) {
        this.a = list;
    }

    @Override // p.k6
    public final int b() {
        return this.a.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.get(o7h.R0(i, this));
    }

    @Override // p.g7, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ud31(this, 0);
    }

    @Override // p.g7, java.util.List
    public final ListIterator listIterator() {
        return new ud31(this, 0);
    }

    @Override // p.g7, java.util.List
    public final ListIterator listIterator(int i) {
        return new ud31(this, i);
    }
}
