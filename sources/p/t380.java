package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class t380 extends q280 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient b380 b;

    public static r380 l(int i) {
        n3p1.j(i, "expectedSize");
        r380 r380Var = new r380(i);
        r380Var.d = new Object[m(i)];
        return r380Var;
    }

    public static int m(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            dm5.n(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static t380 n(int i, Object... objArr) {
        if (i == 0) {
            return kg11.t;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new b291(obj);
        }
        int iM = m(i);
        Object[] objArr2 = new Object[iM];
        int i2 = iM - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            i8p1.k(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iA = j0o1.A(iHashCode);
            while (true) {
                int i6 = iA & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new b291(obj4);
        }
        if (m(i4) < iM / 2) {
            return n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new kg11(i3, i2, i4, objArr, objArr2);
    }

    public static t380 o(Iterable iterable) {
        if (iterable instanceof Collection) {
            return p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return kg11.t;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new b291(next);
        }
        r380 r380Var = new r380(4);
        r380Var.g(next);
        while (it.hasNext()) {
            r380Var.g(it.next());
        }
        return r380Var.i();
    }

    public static t380 p(Collection collection) {
        if ((collection instanceof t380) && !(collection instanceof SortedSet)) {
            t380 t380Var = (t380) collection;
            if (!t380Var.i()) {
                return t380Var;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static t380 q(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? n(objArr.length, (Object[]) objArr.clone()) : new b291(objArr[0]);
        }
        return kg11.t;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static t380 t(Object obj, Object obj2) {
        return n(2, obj, obj2);
    }

    public static t380 u(Object obj, Object obj2, Object obj3) {
        return n(3, obj, obj2, obj3);
    }

    public static t380 v(Object obj, Object obj2, Object obj3, Object obj4) {
        return n(4, obj, obj2, obj3, obj4);
    }

    public static t380 w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        dm5.n(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return n(length, objArr2);
    }

    @Override // p.q280
    public b380 b() {
        b380 b380Var = this.b;
        if (b380Var != null) {
            return b380Var;
        }
        b380 b380VarR = r();
        this.b = b380VarR;
        return b380VarR;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t380) && s() && ((t380) obj).s() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zqo1.o(obj, this);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zqo1.q(this);
    }

    public b380 r() {
        Object[] array = toArray(q280.a);
        w280 w280Var = b380.b;
        return b380.l(array.length, array);
    }

    public boolean s() {
        return this instanceof kg11;
    }

    @Override // p.q280
    public Object writeReplace() {
        return new s380(toArray(q280.a));
    }
}
