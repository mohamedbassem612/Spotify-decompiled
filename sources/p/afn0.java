package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class afn0 implements List, qla0 {
    public final bfn0 a;

    public afn0(bfn0 bfn0Var) {
        this.a = bfn0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        bfn0 bfn0Var = this.a;
        return bfn0Var.e(bfn0Var.c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cfn0.a(i, this);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new tdn0(this, 0, (byte) 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        bfn0 bfn0Var = this.a;
        Object[] objArr = bfn0Var.a;
        for (int i = bfn0Var.c - 1; i >= 0; i--) {
            if (u890.j(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new tdn0(this, 0, (byte) 1);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        cfn0.a(i, this);
        return this.a.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        bfn0 bfn0Var = this.a;
        int i = bfn0Var.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bfn0Var.k(it.next());
        }
        return i != bfn0Var.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        bfn0 bfn0Var = this.a;
        int i = bfn0Var.c;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(bfn0Var.a[i2])) {
                bfn0Var.l(i2);
            }
        }
        return i != bfn0Var.c;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        cfn0.a(i, this);
        Object[] objArr = this.a.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        cfn0.b(i, i2, this);
        return new vdn0(this, i, i2, (byte) 1);
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
    public final void add(int i, Object obj) {
        this.a.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new tdn0(this, i, (byte) 1);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.k(obj);
    }
}
