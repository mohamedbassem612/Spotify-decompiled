package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jhs0 implements Queue {
    public final /* synthetic */ LinkedList a = new LinkedList();

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.add((qwq0) obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof qwq0) {
            return this.a.contains((qwq0) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return (qwq0) this.a.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.a.offer((qwq0) obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return (qwq0) this.a.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return (qwq0) this.a.poll();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof qwq0) {
            return this.a.remove((qwq0) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }

    @Override // java.util.Queue
    public final Object remove() {
        return (qwq0) this.a.remove();
    }
}
