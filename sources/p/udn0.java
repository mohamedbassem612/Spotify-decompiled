package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class udn0 implements List, qla0 {
    public final wdn0 a;

    public udn0(wdn0 wdn0Var) {
        this.a = wdn0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.b(obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        wdn0 wdn0Var = this.a;
        if (i < 0 || i > wdn0Var.b) {
            StringBuilder sbR = cy30.r(i, "Index ", " must be in 0..");
            sbR.append(wdn0Var.b);
            eqr0.O(sbR.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + wdn0Var.b;
        Object[] objArr = wdn0Var.a;
        if (objArr.length < size) {
            wdn0Var.n(size, objArr);
        }
        Object[] objArr2 = wdn0Var.a;
        if (i != wdn0Var.b) {
            f46.Q(collection.size() + i, i, wdn0Var.b, objArr2, objArr2);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        wdn0Var.b = collection.size() + wdn0Var.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.e();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.h(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.a.h(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lfp0.a(i, this);
        return this.a.g(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new tdn0(this, 0, (byte) 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        wdn0 wdn0Var = this.a;
        Object[] objArr = wdn0Var.a;
        int i = wdn0Var.b;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new tdn0(this, 0, (byte) 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        lfp0.a(i, this);
        return this.a.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        wdn0 wdn0Var = this.a;
        int i = wdn0Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            wdn0Var.k(it.next());
        }
        return i != wdn0Var.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        wdn0 wdn0Var = this.a;
        int i = wdn0Var.b;
        Object[] objArr = wdn0Var.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                wdn0Var.l(i2);
            }
        }
        return i != wdn0Var.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        lfp0.a(i, this);
        return this.a.o(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        lfp0.b(i, i2, this);
        return new vdn0(this, i, i2, (byte) 0);
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
        return new tdn0(this, i, (byte) 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        wdn0 wdn0Var = this.a;
        int i = wdn0Var.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            wdn0Var.b(it.next());
        }
        return i != wdn0Var.b;
    }
}
