package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ptn0 implements Set, ola0 {
    public final /* synthetic */ LinkedHashSet a;
    public final ntn0 b;
    public final ntn0 c;
    public final ntn0 d;
    public final ntn0 e;
    public final ntn0 f;

    public ptn0(ntn0 ntn0Var, ntn0 ntn0Var2, ntn0 ntn0Var3, ntn0 ntn0Var4, ntn0 ntn0Var5) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        if (ntn0Var != null) {
            linkedHashSet.add(ntn0Var);
        }
        if (ntn0Var2 != null) {
            linkedHashSet.add(ntn0Var2);
        }
        if (ntn0Var3 != null) {
            linkedHashSet.add(ntn0Var3);
        }
        if (ntn0Var4 != null) {
            linkedHashSet.add(ntn0Var4);
        }
        if (ntn0Var5 != null) {
            linkedHashSet.add(ntn0Var5);
        }
        this.a = linkedHashSet;
        this.b = ntn0Var;
        this.c = ntn0Var2;
        this.d = ntn0Var3;
        this.e = ntn0Var4;
        this.f = ntn0Var5;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ntn0)) {
            return false;
        }
        return this.a.contains((ntn0) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptn0)) {
            return false;
        }
        ptn0 ptn0Var = (ptn0) obj;
        return u890.j(this.b, ptn0Var.b) && u890.j(this.c, ptn0Var.c) && u890.j(this.d, ptn0Var.d) && u890.j(this.e, ptn0Var.e) && u890.j(this.f, ptn0Var.f);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        ntn0 ntn0Var = this.b;
        int iHashCode = (ntn0Var == null ? 0 : ntn0Var.hashCode()) * 31;
        ntn0 ntn0Var2 = this.c;
        int iHashCode2 = (iHashCode + (ntn0Var2 == null ? 0 : ntn0Var2.hashCode())) * 31;
        ntn0 ntn0Var3 = this.d;
        int iHashCode3 = (iHashCode2 + (ntn0Var3 == null ? 0 : ntn0Var3.hashCode())) * 31;
        ntn0 ntn0Var4 = this.e;
        int iHashCode4 = (iHashCode3 + (ntn0Var4 == null ? 0 : ntn0Var4.hashCode())) * 31;
        ntn0 ntn0Var5 = this.f;
        return iHashCode4 + (ntn0Var5 != null ? ntn0Var5.hashCode() : 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }
}
