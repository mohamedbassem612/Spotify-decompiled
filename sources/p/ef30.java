package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ef30 extends cf30 implements Queue, Collection {
    @Override // java.util.Collection
    public final void clear() {
        ((fj00) this).a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((fj00) this).a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((fj00) this).a.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return ((fj00) this).a.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((fj00) this).a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((fj00) this).a.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return ((fj00) this).a.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return ((fj00) this).a.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return ((fj00) this).a.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((fj00) this).a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((fj00) this).a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return ((fj00) this).a.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ((fj00) this).a.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((fj00) this).a.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((fj00) this).a.toArray(objArr);
    }
}
