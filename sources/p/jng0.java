package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jng0 implements Collection {
    public final nng0 a;
    public final Collection b;

    public jng0(nng0 nng0Var, Collection collection) {
        this.a = nng0Var;
        this.b = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.c();
        this.b.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new kng0(this.a, this.b.iterator(), (byte) 0);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.a.c();
        return this.b.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.a.c();
        return this.b.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.a.c();
        return this.b.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.b.toArray();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.toArray(objArr);
    }
}
