package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class q280 extends AbstractCollection implements Serializable {
    public static final Object[] a = new Object[0];

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public b380 b() {
        if (isEmpty()) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        Object[] array = toArray(a);
        w280 w280Var2 = b380.b;
        return b380.l(array.length, array);
    }

    public int c(int i, Object[] objArr) {
        mjh1 mjh1VarK = k();
        while (mjh1VarK.hasNext()) {
            objArr[i] = mjh1VarK.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return ((jg11) this).e.b(obj) > 0;
    }

    public Object[] d() {
        return null;
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean i();

    public abstract mjh1 k();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrD = d();
            if (objArrD != null) {
                return qyo1.n(f(), e(), objArrD, objArr);
            }
            objArr = i8p1.q(size, objArr);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(0, objArr);
        return objArr;
    }

    public Object writeReplace() {
        return new x280(toArray(a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(a);
    }
}
