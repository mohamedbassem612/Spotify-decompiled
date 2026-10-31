package p;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rqz0 implements List, ola0 {
    public final List a;
    public final Map b;
    public final idd1 c = new idd1(new l5v0(this, (byte) 6));
    public final int d;

    public rqz0(List list, Map map) {
        this.a = list;
        this.b = map;
        this.d = list.size();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof l7e0) && indexOf((l7e0) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw sqz0.a;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final l7e0 get(int i) {
        zuc0 zuc0Var = (zuc0) this.a.get(i);
        zuc0 zuc0Var2 = (zuc0) this.b.get(zuc0Var.a);
        return zuc0Var2 != null ? new j7e0(zuc0Var2) : new k7e0(zuc0Var.a, zuc0Var.c);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof rqz0) && ((rqz0) obj).hashCode() == hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return ((Number) this.c.getValue()).intValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof l7e0)) {
            return -1;
        }
        l7e0 l7e0Var = (l7e0) obj;
        tdn0 tdn0Var = new tdn0(this);
        int i = 0;
        while (tdn0Var.hasNext()) {
            if (tdn0Var.next().equals(l7e0Var)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new tdn0(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof l7e0) {
            throw sqz0.a;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new tdn0(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        throw sqz0.a;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        throw sqz0.a;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
