package p;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qmc0 extends y8 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final qmc0 d;
    public final smc0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public qmc0(Object[] objArr, int i, int i2, qmc0 qmc0Var, smc0 smc0Var) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = qmc0Var;
        this.e = smc0Var;
        ((AbstractList) this).modCount = smc0.d(smc0Var);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object writeReplace() throws NotSerializableException {
        if (this.e.c) {
            return new r661(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void add(int i, Object obj) {
        k();
        i();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
        } else {
            f(this.b + i, obj);
        }
    }

    public final boolean addAll(int i, Collection collection) {
        k();
        i();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
            return false;
        }
        int size = collection.size();
        e(this.b + i, collection, size);
        return size > 0;
    }

    public final int b() {
        i();
        return this.c;
    }

    public final Object c(int i) {
        k();
        i();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return l(this.b + i);
        }
        eg.g(cy30.i(i, "index: ", i2, ", size: "));
        return null;
    }

    public final void clear() {
        k();
        i();
        m(this.b, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        smc0 smc0Var = this.e;
        qmc0 qmc0Var = this.d;
        if (qmc0Var != null) {
            qmc0Var.e(i, collection, i2);
        } else {
            smc0 smc0Var2 = smc0.d;
            smc0Var.e(i, collection, i2);
        }
        this.a = smc0Var.a;
        this.c += i2;
    }

    public final boolean equals(Object obj) {
        i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (u890.j(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        smc0 smc0Var = this.e;
        qmc0 qmc0Var = this.d;
        if (qmc0Var != null) {
            qmc0Var.f(i, obj);
        } else {
            smc0 smc0Var2 = smc0.d;
            smc0Var.f(i, obj);
        }
        this.a = smc0Var.a;
        this.c++;
    }

    public final Object get(int i) {
        i();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a[this.b + i];
        }
        eg.g(cy30.i(i, "index: ", i2, ", size: "));
        return null;
    }

    public final int hashCode() {
        i();
        Object[] objArr = this.a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        if (smc0.d(this.e) == ((AbstractList) this).modCount) {
            return;
        }
        eg.d();
    }

    public final int indexOf(Object obj) {
        i();
        for (int i = 0; i < this.c; i++) {
            if (u890.j(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        i();
        return this.c == 0;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (this.e.c) {
            k220.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object l(int i) {
        Object objL;
        ((AbstractList) this).modCount++;
        qmc0 qmc0Var = this.d;
        if (qmc0Var != null) {
            objL = qmc0Var.l(i);
        } else {
            smc0 smc0Var = smc0.d;
            objL = this.e.l(i);
        }
        this.c--;
        return objL;
    }

    public final int lastIndexOf(Object obj) {
        i();
        for (int i = this.c - 1; i >= 0; i--) {
            if (u890.j(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        i();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            return new ek60(this, i);
        }
        eg.g(cy30.i(i, "index: ", i2, ", size: "));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        qmc0 qmc0Var = this.d;
        if (qmc0Var != null) {
            qmc0Var.m(i, i2);
        } else {
            smc0 smc0Var = smc0.d;
            this.e.m(i, i2);
        }
        this.c -= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int n(int i, int i2, Collection collection, boolean z) {
        int iN;
        qmc0 qmc0Var = this.d;
        if (qmc0Var != null) {
            iN = qmc0Var.n(i, i2, collection, z);
        } else {
            smc0 smc0Var = smc0.d;
            iN = this.e.n(i, i2, collection, z);
        }
        if (iN > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= iN;
        return iN;
    }

    public final boolean remove(Object obj) {
        k();
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    public final boolean removeAll(Collection collection) {
        k();
        i();
        return n(this.b, this.c, collection, false) > 0;
    }

    public final boolean retainAll(Collection collection) {
        k();
        i();
        return n(this.b, this.c, collection, true) > 0;
    }

    public final Object set(int i, Object obj) {
        k();
        i();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
            return null;
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        eqr0.p(i, i2, this.c);
        return new qmc0(this.a, this.b + i, i2 - i, this, this.e);
    }

    public final Object[] toArray(Object[] objArr) {
        i();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        f46.Q(0, i2, i + i2, objArr2, objArr);
        k4p1.D(this.c, objArr);
        return objArr;
    }

    public final String toString() {
        i();
        return bmq0.a0(this.a, this.b, this.c, this);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean add(Object obj) {
        k();
        i();
        f(this.b + this.c, obj);
        return true;
    }

    public final Object[] toArray() {
        i();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return f46.a0(i2, i + i2, objArr);
    }

    public final boolean addAll(Collection collection) {
        k();
        i();
        int size = collection.size();
        e(this.b + this.c, collection, size);
        return size > 0;
    }
}
