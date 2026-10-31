package p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x7 extends AbstractCollection {
    public final Object a;
    public Collection b;
    public final x7 c;
    public final Collection d;
    public final /* synthetic */ b8 e;

    public x7(b8 b8Var, Object obj, Collection collection, x7 x7Var) {
        this.e = b8Var;
        this.a = obj;
        this.b = collection;
        this.c = x7Var;
        this.d = x7Var == null ? null : x7Var.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.e.f++;
            if (zIsEmpty) {
                b();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            this.e.f += this.b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return zAddAll;
    }

    public final void b() {
        x7 x7Var = this.c;
        if (x7Var != null) {
            x7Var.b();
        } else {
            this.e.e.put(this.a, this.b);
        }
    }

    public final void c() {
        Collection collection;
        x7 x7Var = this.c;
        if (x7Var != null) {
            x7Var.c();
            if (x7Var.b == this.d) {
                return;
            }
            eg.d();
            return;
        }
        if (!this.b.isEmpty() || (collection = (Collection) this.e.e.get(this.a)) == null) {
            return;
        }
        this.b = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.f -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.b.containsAll(collection);
    }

    public final void d() {
        x7 x7Var = this.c;
        if (x7Var != null) {
            x7Var.d();
        } else if (this.b.isEmpty()) {
            this.e.e.remove(this.a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new p7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            this.e.f--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            this.e.f += this.b.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            this.e.f += this.b.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.b.toString();
    }
}
