package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class b380 extends q280 implements List, RandomAccess {
    public static final w280 b = new w280(0, bg11.e);

    public static bg11 l(int i, Object[] objArr) {
        return i == 0 ? bg11.e : new bg11(i, objArr);
    }

    public static v280 m() {
        return new v280(4);
    }

    public static v280 n(int i) {
        n3p1.j(i, "expectedSize");
        return new v280(i);
    }

    public static b380 o(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return bg11.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t(next);
        }
        v280 v280Var = new v280(4);
        v280Var.c(next);
        while (it.hasNext()) {
            v280Var.c(it.next());
        }
        return v280Var.g();
    }

    public static b380 p(Collection collection) {
        if (!(collection instanceof q280)) {
            Object[] array = collection.toArray();
            i8p1.m(array);
            return l(array.length, array);
        }
        b380 b380VarB = ((q280) collection).b();
        if (!b380VarB.i()) {
            return b380VarB;
        }
        Object[] array2 = b380VarB.toArray(q280.a);
        return l(array2.length, array2);
    }

    public static bg11 q(Object[] objArr) {
        if (objArr.length == 0) {
            return bg11.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        i8p1.m(objArr2);
        return l(objArr2.length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static bg11 s(Serializable serializable, Serializable serializable2, Serializable serializable3, Serializable serializable4, Serializable serializable5, Serializable serializable6, Serializable serializable7, Serializable serializable8, Serializable serializable9, Serializable serializable10, Serializable serializable11, Serializable serializable12, Object... objArr) {
        dm5.n(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = serializable;
        objArr2[1] = serializable2;
        objArr2[2] = serializable3;
        objArr2[3] = serializable4;
        objArr2[4] = serializable5;
        objArr2[5] = serializable6;
        objArr2[6] = serializable7;
        objArr2[7] = serializable8;
        objArr2[8] = serializable9;
        objArr2[9] = serializable10;
        objArr2[10] = serializable11;
        objArr2[11] = serializable12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        i8p1.m(objArr2);
        return l(length, objArr2);
    }

    public static bg11 t(Object obj) {
        Object[] objArr = {obj};
        i8p1.m(objArr);
        return l(1, objArr);
    }

    public static bg11 u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        i8p1.m(objArr);
        return l(2, objArr);
    }

    public static bg11 v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        i8p1.m(objArr);
        return l(5, objArr);
    }

    public static bg11 w(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        Object[] objArrB = hr80.B(iterable);
        i8p1.m(objArrB);
        Arrays.sort(objArrB, comparator);
        return l(objArrB.length, objArrB);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p.q280
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p.q280, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return z1p1.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z1p1.t(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p.q280
    public final mjh1 k() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z1p1.v(this, obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final w280 listIterator(int i) {
        dm5.u(i, size());
        return isEmpty() ? b : new w280(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p.q280
    public Object writeReplace() {
        return new x280(toArray(q280.a));
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b380 subList(int i, int i2) {
        dm5.v(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? bg11.e : new y280(this, i, i3);
    }

    @Override // p.q280
    public final b380 b() {
        return this;
    }
}
