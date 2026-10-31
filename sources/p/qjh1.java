package p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qjh1 extends AbstractList implements RandomAccess, ovb0 {
    public final jvb0 a;

    public qjh1(jvb0 jvb0Var) {
        this.a = jvb0Var;
    }

    @Override // p.ovb0
    public final void N0(qmd0 qmd0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p.ovb0
    public final List a() {
        return Collections.unmodifiableList(this.a.a);
    }

    @Override // p.ovb0
    public final qhc c0(int i) {
        return this.a.c0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        xob0 xob0Var = new xob0((byte) 3);
        xob0Var.b = this.a.iterator();
        return xob0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        njh1 njh1Var = new njh1((byte) 2);
        njh1Var.b = this.a.listIterator(i);
        return njh1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // p.ovb0
    public final qjh1 g() {
        return this;
    }
}
