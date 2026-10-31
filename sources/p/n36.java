package p;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n36 extends y8 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public n36(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else {
            if (i <= 0) {
                hhg1.n(f4i1.c(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        e(this.c + 1);
        int iN = n(this.a + i);
        int i3 = this.c;
        int i4 = (i3 + 1) >> 1;
        int i5 = this.a;
        if (i < i4) {
            int length = iN == 0 ? this.b.length - 1 : iN - 1;
            int length2 = i5 == 0 ? this.b.length - 1 : i5 - 1;
            Object[] objArr = this.b;
            if (length >= i5) {
                objArr[length2] = objArr[i5];
                f46.Q(i5, i5 + 1, length + 1, objArr, objArr);
            } else {
                f46.Q(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                f46.Q(0, 1, length + 1, objArr2, objArr2);
            }
            this.b[length] = obj;
            this.a = length2;
        } else {
            int iN2 = n(i3 + i5);
            Object[] objArr3 = this.b;
            if (iN < iN2) {
                f46.Q(iN + 1, iN, iN2, objArr3, objArr3);
            } else {
                f46.Q(1, 0, iN2, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                f46.Q(iN + 1, iN, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[iN] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        o();
        e(collection.size() + this.c);
        int iN = n(this.c + this.a);
        int iN2 = n(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = iN2 + size;
            Object[] objArr = this.b;
            if (iN2 < iN) {
                int i4 = size + iN;
                if (i4 <= objArr.length) {
                    f46.Q(i3, iN2, iN, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    f46.Q(i3 - objArr.length, iN2, iN, objArr, objArr);
                } else {
                    int length = iN - (i4 - objArr.length);
                    f46.Q(0, length, iN, objArr, objArr);
                    Object[] objArr2 = this.b;
                    f46.Q(i3, iN2, length, objArr2, objArr2);
                }
            } else {
                f46.Q(size, 0, iN, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i3 >= objArr3.length) {
                    f46.Q(i3 - objArr3.length, iN2, objArr3.length, objArr3, objArr3);
                } else {
                    f46.Q(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    f46.Q(i3, iN2, objArr4.length - size, objArr4, objArr4);
                }
            }
            d(iN2, collection);
            return true;
        }
        int i5 = this.a;
        int length2 = i5 - size;
        Object[] objArr5 = this.b;
        if (iN2 < i5) {
            f46.Q(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size >= iN2) {
                f46.Q(objArr6.length - size, 0, iN2, objArr6, objArr6);
            } else {
                f46.Q(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.b;
                f46.Q(0, size, iN2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            f46.Q(length2, i5, iN2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iN2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                f46.Q(length2, i5, iN2, objArr5, objArr5);
            } else {
                f46.Q(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.b;
                f46.Q(0, this.a + length3, iN2, objArr8, objArr8);
            }
        }
        this.a = length2;
        d(l(iN2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        e(this.c + 1);
        int length = this.a;
        if (length == 0) {
            length = this.b.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        o();
        e(b() + 1);
        this.b[n(b() + this.a)] = obj;
        this.c = b() + 1;
    }

    @Override // p.y8
    public final int b() {
        return this.c;
    }

    @Override // p.y8
    public final Object c(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            eg.g(cy30.i(i, "index: ", i2, ", size: "));
            return null;
        }
        if (i == p7h.L(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iN];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (iN >= i4) {
                f46.Q(i4 + 1, i4, iN, objArr, objArr);
            } else {
                f46.Q(1, 0, iN, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                f46.Q(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = i(i6);
        } else {
            int iN2 = n(p7h.L(this) + i4);
            Object[] objArr4 = this.b;
            if (iN <= iN2) {
                f46.Q(iN, iN + 1, iN2 + 1, objArr4, objArr4);
            } else {
                f46.Q(iN, iN + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                f46.Q(0, 1, iN2 + 1, objArr5, objArr5);
            }
            this.b[iN2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.a, n(b() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void e(int i) {
        if (i < 0) {
            eg.m("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        f46.Q(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        f46.Q(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        bhn0.t("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iB = b();
        if (i >= 0 && i < iB) {
            return this.b[n(this.a + i)];
        }
        eg.g(cy30.i(i, "index: ", iB, ", size: "));
        return null;
    }

    public final int i(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iN = n(b() + this.a);
        int length = this.a;
        if (length < iN) {
            while (length < iN) {
                if (u890.j(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.a) < iN) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (u890.j(obj, this.b[length])) {
                i = this.a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iN; i2++) {
            if (u890.j(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return this.b[n(p7h.L(this) + this.a)];
    }

    public final int l(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            bhn0.t("ArrayDeque is empty.");
            return null;
        }
        return this.b[n(p7h.L(this) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iN = n(b() + this.a);
        int i2 = this.a;
        if (i2 < iN) {
            length = iN - 1;
            if (i2 <= length) {
                while (!u890.j(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= iN) {
            do {
                iN--;
                objArr = this.b;
                if (-1 >= iN) {
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!u890.j(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                }
                return length - i;
            } while (!u890.j(obj, objArr[iN]));
            length = iN + this.b.length;
            i = this.a;
            return length - i;
        }
        return -1;
    }

    public final void m(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            f46.e0(objArr, null, i, i2);
        } else {
            f46.e0(objArr, null, i, objArr.length);
            f46.e0(this.b, null, 0, i2);
        }
    }

    public final int n(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iN;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iN2 = n(this.c + this.a);
            int i = this.a;
            if (i < iN2) {
                iN = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iN2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iN] = obj;
                        iN++;
                    }
                    i++;
                }
                f46.e0(objArr, null, iN, iN2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iN] = obj3;
                        iN = i(iN);
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.c = l(iN - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            bhn0.t("ArrayDeque is empty.");
            return null;
        }
        o();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = i(i);
        this.c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            bhn0.t("ArrayDeque is empty.");
            return null;
        }
        o();
        int iN = n(p7h.L(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[iN];
        objArr[iN] = null;
        this.c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        eqr0.p(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            c(i);
            return;
        }
        o();
        int i4 = this.c - i2;
        int i5 = this.a;
        if (i < i4) {
            int iN = n((i - 1) + i5);
            int iN2 = n(this.a + (i2 - 1));
            while (i > 0) {
                int i6 = iN + 1;
                int iMin = Math.min(i, Math.min(i6, iN2 + 1));
                Object[] objArr = this.b;
                int i7 = iN2 - iMin;
                int i8 = iN - iMin;
                f46.Q(i7 + 1, i8 + 1, i6, objArr, objArr);
                iN = l(i8);
                iN2 = l(i7);
                i -= iMin;
            }
            int iN3 = n(this.a + i3);
            m(this.a, iN3);
            this.a = iN3;
        } else {
            int iN4 = n(i5 + i2);
            int iN5 = n(this.a + i);
            int i9 = this.c;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i9, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.b;
                int i10 = iN4 + i2;
                f46.Q(iN5, iN4, i10, objArr3, objArr3);
                iN4 = n(i10);
                iN5 = n(iN5 + i2);
            }
            int iN6 = n(this.c + this.a);
            m(l(iN6 - i3), iN6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iN;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iN2 = n(this.c + this.a);
            int i = this.a;
            if (i < iN2) {
                iN = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iN2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[iN] = obj;
                        iN++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                f46.e0(objArr, null, iN, iN2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iN] = obj3;
                        iN = i(iN);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.c = l(iN - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iB = b();
        if (i < 0 || i >= iB) {
            eg.g(cy30.i(i, "index: ", iB, ", size: "));
            return null;
        }
        int iN = n(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iN];
        objArr[iN] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iN = n(this.c + this.a);
        int i2 = this.a;
        if (i2 < iN) {
            f46.W(i2, iN, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            f46.Q(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            f46.Q(objArr3.length - this.a, 0, iN, objArr3, objArr);
        }
        k4p1.D(this.c, objArr);
        return objArr;
    }

    public n36() {
        this.b = d;
    }

    public n36(Collection collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.b = array;
        this.c = array.length;
        if (array.length == 0) {
            this.b = d;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        o();
        e(collection.size() + b());
        d(n(b() + this.a), collection);
        return true;
    }
}
