package p;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ouh extends AbstractSet implements Serializable {
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient int d;
    public transient int e;

    public static ouh b(int i) {
        ouh ouhVar = new ouh();
        dm5.n(i >= 0, "Expected size must be >= 0");
        ouhVar.d = bmq0.m(i, 1);
        return ouhVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(f4i1.c(i, "Invalid size: "));
        }
        dm5.n(i >= 0, "Expected size must be >= 0");
        this.d = bmq0.m(i, 1);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        char c = 31;
        if (d()) {
            dm5.z(d(), "Arrays already allocated");
            int i = this.d;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.a = x9p1.g(iMax2);
            this.d = x9p1.k(this.d, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.b = new int[i];
            this.c = new Object[i];
        }
        Set setC = c();
        if (setC != null) {
            return setC.add(obj);
        }
        int[] iArrF = f();
        Object[] objArrE = e();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iB = j0o1.B(obj);
        int i4 = (1 << (this.d & 31)) - 1;
        int i5 = iB & i4;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iT = x9p1.t(i5, obj2);
        if (iT != 0) {
            int i6 = ~i4;
            int i7 = iB & i6;
            int i8 = 0;
            while (true) {
                int i9 = iT - 1;
                int i10 = iArrF[i9];
                char c2 = c;
                if ((i10 & i6) == i7 && zno1.k(obj, objArrE[i9])) {
                    return false;
                }
                int i11 = i10 & i4;
                i8++;
                if (i11 == 0) {
                    if (i8 < 9) {
                        if (i3 <= i4) {
                            iArrF[i9] = x9p1.k(i10, i3, i4);
                            break;
                        }
                        i4 = i(i4, x9p1.l(i4), iB, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.d & 31), 1.0f);
                    int i12 = isEmpty() ? -1 : 0;
                    while (i12 >= 0) {
                        linkedHashSet.add(e()[i12]);
                        i12++;
                        if (i12 >= this.e) {
                            i12 = -1;
                        }
                    }
                    this.a = linkedHashSet;
                    this.b = null;
                    this.c = null;
                    this.d += 32;
                    return linkedHashSet.add(obj);
                }
                iT = i11;
                c = c2;
            }
        } else if (i3 > i4) {
            i4 = i(i4, x9p1.l(i4), iB, i2);
        } else {
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            x9p1.u(i5, i3, obj3);
        }
        int length = f().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(f(), iMin);
            this.c = Arrays.copyOf(e(), iMin);
        }
        f()[i2] = x9p1.k(iB, 0, i4);
        e()[i2] = obj;
        this.e = i3;
        this.d += 32;
        return true;
    }

    public final Set c() {
        Object obj = this.a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (d()) {
            return;
        }
        this.d += 32;
        Set setC = c();
        if (setC != null) {
            this.d = bmq0.m(size(), 3);
            setC.clear();
            this.a = null;
            this.e = 0;
            return;
        }
        Arrays.fill(e(), 0, this.e, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(f(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (d()) {
            return false;
        }
        Set setC = c();
        if (setC != null) {
            return setC.contains(obj);
        }
        int iB = j0o1.B(obj);
        int i = (1 << (this.d & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iT = x9p1.t(iB & i, obj2);
        if (iT == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iB & i2;
        do {
            int i4 = iT - 1;
            int i5 = f()[i4];
            if ((i5 & i2) == i3 && zno1.k(obj, e()[i4])) {
                return true;
            }
            iT = i5 & i;
        } while (iT != 0);
        return false;
    }

    public final boolean d() {
        return this.a == null;
    }

    public final Object[] e() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] f() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int i(int i, int i2, int i3, int i4) {
        Object objG = x9p1.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            x9p1.u(i3 & i5, i4 + 1, objG);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrF = f();
        for (int i6 = 0; i6 <= i; i6++) {
            int iT = x9p1.t(i6, obj);
            while (iT != 0) {
                int i7 = iT - 1;
                int i8 = iArrF[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iT2 = x9p1.t(i10, objG);
                x9p1.u(i10, iT, objG);
                iArrF[i7] = x9p1.k(i9, iT2, i5);
                iT = i8 & i;
            }
        }
        this.a = objG;
        this.d = x9p1.k(this.d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setC = c();
        return setC != null ? setC.iterator() : new nuh(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!d()) {
            Set setC = c();
            if (setC != null) {
                return setC.remove(obj);
            }
            int i3 = (1 << (this.d & 31)) - 1;
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iO = x9p1.o(obj, null, i3, obj2, f(), e(), null);
            if (iO != -1) {
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                int[] iArrF = f();
                Object[] objArrE = e();
                int size = size();
                int i4 = size - 1;
                if (iO < i4) {
                    Object obj4 = objArrE[i4];
                    objArrE[iO] = obj4;
                    objArrE[i4] = null;
                    iArrF[iO] = iArrF[i4];
                    iArrF[i4] = 0;
                    int iB = j0o1.B(obj4) & i3;
                    int iT = x9p1.t(iB, obj3);
                    if (iT == size) {
                        x9p1.u(iB, iO + 1, obj3);
                    } else {
                        while (true) {
                            i = iT - 1;
                            i2 = iArrF[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            iT = i5;
                        }
                        iArrF[i] = x9p1.k(i2, iO + 1, i3);
                    }
                } else {
                    objArrE[iO] = null;
                    iArrF[iO] = 0;
                }
                this.e--;
                this.d += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setC = c();
        return setC != null ? setC.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (d()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setC = c();
        if (setC != null) {
            return setC.toArray(objArr);
        }
        Object[] objArrE = e();
        int i = this.e;
        dm5.v(0, i, objArrE.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrE, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (d()) {
            return new Object[0];
        }
        Set setC = c();
        return setC != null ? setC.toArray() : Arrays.copyOf(e(), this.e);
    }
}
