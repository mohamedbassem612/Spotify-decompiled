package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ulc1 implements Collection, ola0 {
    public final ydn0 a;

    public ulc1() {
        int i = nqq0.a;
        this.a = new ydn0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(Object obj) {
        this.a.a(obj);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nh40(new aen0(this.a));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.g(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.i(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }
}
