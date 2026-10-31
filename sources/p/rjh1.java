package p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rjh1 extends AbstractList implements pvb0, RandomAccess {
    public final kvb0 a;

    public rjh1(kvb0 kvb0Var) {
        this.a = kvb0Var;
    }

    @Override // p.pvb0
    public final void H0(ihc ihcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p.pvb0
    public final List a() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        xob0 xob0Var = new xob0((byte) 4);
        xob0Var.b = this.a.iterator();
        return xob0Var;
    }

    @Override // p.pvb0
    public final Object j(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        njh1 njh1Var = new njh1((byte) 3);
        njh1Var.b = this.a.listIterator(i);
        return njh1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // p.pvb0
    public final pvb0 g() {
        return this;
    }
}
