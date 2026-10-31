package p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ers0 extends y8 implements Collection, pla0 {
    public d9 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public ypa e = new ypa(false);
    public Object[] f;
    public Object[] g;
    public int h;

    public ers0(d9 d9Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = d9Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = d9Var.b();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(iu30 iu30Var, Object[] objArr, int i, l1p0 l1p0Var) {
        Object[] objArrO = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrO = o(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrO[i2] = obj;
                i2++;
            }
        }
        l1p0Var.b = objArrO;
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B(iu30 iu30Var) {
        int i;
        iu30 iu30Var2 = iu30Var;
        int I = I();
        Object[] objArrS = null;
        l1p0 l1p0Var = new l1p0((Object) null, (byte) 2);
        boolean z = false;
        if (this.f == null) {
            int iA = A(iu30Var2, this.g, I, l1p0Var);
            Object obj = l1p0Var.b;
            if (iA == I) {
                iA = I;
            } else {
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA, I, (Object) null);
                this.g = objArr;
                this.h -= I - iA;
            }
            if (iA != I) {
                z = true;
            }
        } else {
            i7 i7VarN = n(0);
            int iA2 = 32;
            while (iA2 == 32 && i7VarN.hasNext()) {
                iA2 = A(iu30Var2, (Object[]) i7VarN.next(), 32, l1p0Var);
            }
            if (iA2 == 32) {
                int iA3 = A(iu30Var2, this.g, I, l1p0Var);
                Object obj2 = l1p0Var.b;
                if (iA3 == I) {
                    iA3 = I;
                } else {
                    Object[] objArr2 = (Object[]) obj2;
                    Arrays.fill(objArr2, iA3, I, (Object) null);
                    this.g = objArr2;
                    this.h -= I - iA3;
                }
                if (iA3 == 0) {
                    u(this.h, this.d, this.f);
                }
                if (iA3 != I) {
                }
            } else {
                int i2 = (i7VarN.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA2;
                while (i7VarN.hasNext()) {
                    iZ = z(iu30Var2, (Object[]) i7VarN.next(), 32, iZ, l1p0Var, arrayList2, arrayList);
                    iu30Var2 = iu30Var;
                }
                int iZ2 = z(iu30Var, this.g, I, iZ, l1p0Var, arrayList2, arrayList);
                Object[] objArr3 = (Object[]) l1p0Var.b;
                Arrays.fill(objArr3, iZ2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrV = this.f;
                if (zIsEmpty) {
                    objArrV.getClass();
                } else {
                    objArrV = v(objArrV, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    bmv0.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        objArrV = objArrV[0];
                    }
                    objArrS = s(i3, i, objArrV);
                }
                this.f = objArrS;
                this.g = objArr3;
                this.h = size + iZ2;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] C(Object[] objArr, int i, int i2, l1p0 l1p0Var) {
        int iO = uwo1.o(i2, i);
        if (i == 0) {
            Object obj = objArr[iO];
            Object[] objArrO = o(objArr);
            int i3 = iO + 1;
            System.arraycopy(objArr, i3, objArrO, iO, 32 - i3);
            objArrO[31] = l1p0Var.b;
            l1p0Var.b = obj;
            return objArrO;
        }
        int iO2 = objArr[31] == null ? uwo1.o(E() - 1, i) : 31;
        Object[] objArrO2 = o(objArr);
        int i4 = i - 5;
        int i5 = iO + 1;
        if (i5 <= iO2) {
            while (true) {
                objArrO2[iO2] = C((Object[]) objArrO2[iO2], i4, 0, l1p0Var);
                if (iO2 == i5) {
                    break;
                }
                iO2--;
            }
        }
        objArrO2[iO] = C((Object[]) objArrO2[iO], i4, i2, l1p0Var);
        return objArrO2;
    }

    public final Object D(Object[] objArr, int i, int i2, int i3) {
        int iB = b() - i;
        Object[] objArr2 = this.g;
        if (iB == 1) {
            Object obj = objArr2[0];
            u(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrO = o(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrO, i3, iB - i4);
        objArrO[iB - 1] = null;
        this.f = objArr;
        this.g = objArrO;
        this.h = (i + iB) - 1;
        this.d = i2;
        return obj2;
    }

    public final int E() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] G(Object[] objArr, int i, int i2, Object obj, l1p0 l1p0Var) {
        int iO = uwo1.o(i2, i);
        Object[] objArrO = o(objArr);
        if (i != 0) {
            objArrO[iO] = G((Object[]) objArrO[iO], i - 5, i2, obj, l1p0Var);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        l1p0Var.b = objArrO[iO];
        objArrO[iO] = obj;
        return objArrO;
    }

    public final void H(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrQ;
        if (i3 < 1) {
            bmv0.a("requires at least one nullBuffer");
        }
        Object[] objArrO = o(objArr);
        objArr2[0] = objArrO;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            f46.Q(size + 1, i4, i2, objArrO, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrQ = objArrO;
            } else {
                objArrQ = q();
                i3--;
                objArr2[i3] = objArrQ;
            }
            int i7 = i2 - i6;
            f46.Q(0, i7, i2, objArrO, objArr3);
            f46.Q(size + 1, i4, i7, objArrO, objArrQ);
            objArr3 = objArrQ;
        }
        Iterator it = collection.iterator();
        e(objArrO, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrQ2 = q();
            e(objArrQ2, 0, it);
            objArr2[i8] = objArrQ2;
        }
        e(objArr3, 0, it);
    }

    public final int I() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, Object obj) {
        yxo1.s(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            l(i - iE, obj, this.f);
            return;
        }
        l1p0 l1p0Var = new l1p0((Object) null, (byte) 2);
        Object[] objArr = this.f;
        objArr.getClass();
        l(0, l1p0Var.b, k(objArr, this.d, i, obj, l1p0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrQ;
        yxo1.s(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrO = o(objArr);
            System.arraycopy(objArr, i3, objArrO, size2 + 1, I() - i3);
            e(objArrO, i3, collection.iterator());
            this.g = objArrO;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int I = I();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= E()) {
            objArrQ = q();
            collection2 = collection;
            H(collection2, i, this.g, I, objArr2, size, objArrQ);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > I) {
                int i4 = size3 - I;
                Object[] objArrP = p(i4, objArr3);
                i(collection2, i, i4, objArr2, size, objArrP);
                objArr2 = objArr2;
                objArrQ = objArrP;
            } else {
                objArrQ = q();
                int i5 = I - size3;
                System.arraycopy(objArr3, i5, objArrQ, 0, I - i5);
                int i6 = 32 - i5;
                Object[] objArrP2 = p(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = objArrP2;
                i(collection2, i, i6, objArr2, i7, objArrP2);
                collection2 = collection2;
            }
        }
        this.f = w(this.f, i2, objArr2);
        this.g = objArrQ;
        this.h = collection2.size() + this.h;
        return true;
    }

    public final int b() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(int i) {
        yxo1.r(i, b());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            return D(this.f, iE, this.d, i - iE);
        }
        l1p0 l1p0Var = new l1p0(this.g[0], (byte) 2);
        Object[] objArr = this.f;
        objArr.getClass();
        D(C(objArr, this.d, i, l1p0Var), iE, this.d, 0);
        return l1p0Var.b;
    }

    public final d9 d() {
        d9 crs0Var;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            crs0Var = this.a;
        } else {
            this.e = new ypa(false);
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                crs0Var = objArr2.length == 0 ? gg91.b : new gg91(Arrays.copyOf(objArr2, this.h));
            } else {
                crs0Var = new crs0(this.h, this.d, objArr, objArr2);
            }
        }
        this.a = crs0Var;
        return crs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final Object get(int i) {
        Object[] objArr;
        yxo1.r(i, b());
        if (E() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[uwo1.o(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void i(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            eg.m("root is null");
            return;
        }
        int i4 = i >> 5;
        i7 i7VarN = n(E() >> 5);
        int i5 = i3;
        Object[] objArrP = objArr2;
        while (i7VarN.a - 1 != i4) {
            Object[] objArr3 = (Object[]) i7VarN.previous();
            f46.Q(0, 32 - i2, 32, objArr3, objArrP);
            objArrP = p(i2, objArr3);
            i5--;
            objArr[i5] = objArrP;
        }
        Object[] objArr4 = (Object[]) i7VarN.previous();
        int iE = i3 - (((E() >> 5) - 1) - i4);
        if (iE < i3) {
            objArr2 = objArr[iE];
            objArr2.getClass();
        }
        H(collection, i, objArr4, 32, objArr, iE, objArr2);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, l1p0 l1p0Var) {
        Object obj2;
        int iO = uwo1.o(i2, i);
        if (i == 0) {
            l1p0Var.b = objArr[31];
            Object[] objArrO = o(objArr);
            System.arraycopy(objArr, iO, objArrO, iO + 1, 31 - iO);
            objArrO[iO] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        objArrO2[iO] = k((Object[]) objArrO2[iO], i3, i2, obj, l1p0Var);
        while (true) {
            iO++;
            if (iO >= 32 || (obj2 = objArrO2[iO]) == null) {
                break;
            }
            objArrO2[iO] = k((Object[]) obj2, i3, 0, l1p0Var.b, l1p0Var);
        }
        return objArrO2;
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int I = I();
        Object[] objArrO = o(this.g);
        Object[] objArr2 = this.g;
        if (I >= 32) {
            Object obj2 = objArr2[31];
            f46.Q(i + 1, i, 31, objArr2, objArrO);
            objArrO[i] = obj;
            x(objArr, objArrO, r(obj2));
            return;
        }
        f46.Q(i + 1, i, I, objArr2, objArrO);
        objArrO[i] = obj;
        this.f = objArr;
        this.g = objArrO;
        this.h++;
    }

    public final ListIterator listIterator(int i) {
        yxo1.s(i, this.h);
        return new irs0(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final i7 n(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            eg.m("Invalid root");
            return null;
        }
        int iE = E() >> 5;
        yxo1.s(i, iE);
        int i2 = this.d;
        return i2 == 0 ? new sy81(objArr, i) : new iug1(objArr, i, iE, i2 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return q();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrQ = q();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        f46.W(0, length, 6, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] p(int i, Object[] objArr) {
        if (m(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrQ = q();
        System.arraycopy(objArr, 0, objArrQ, i, 32 - i);
        return objArrQ;
    }

    public final Object[] q() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.Collection
    public final boolean removeAll(final Collection collection) {
        final byte b = 1;
        return B(new iu30() { // from class: p.b9
            public final Object invoke(Object obj) {
                boolean zContains;
                byte b2 = b;
                Collection<?> collection2 = collection;
                switch (b2) {
                    case 0:
                        zContains = collection2.contains(obj);
                        break;
                    case 1:
                        zContains = collection2.contains(obj);
                        break;
                    default:
                        zContains = ((List) obj).retainAll(collection2);
                        break;
                }
                return Boolean.valueOf(zContains);
            }
        });
    }

    public final Object[] s(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            bmv0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iO = uwo1.o(i, i2);
        Object objS = s(i, i2 - 5, (Object[]) objArr[iO]);
        if (iO < 31) {
            int i3 = iO + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrQ = q();
                System.arraycopy(objArr, 0, objArrQ, 0, i3);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[iO]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iO] = objS;
        return objArrO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object set(int i, Object obj) {
        yxo1.r(i, b());
        if (E() > i) {
            l1p0 l1p0Var = new l1p0((Object) null, (byte) 2);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = G(objArr, this.d, i, obj, l1p0Var);
            return l1p0Var.b;
        }
        Object[] objArrO = o(this.g);
        if (objArrO != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrO[i2];
        objArrO[i2] = obj;
        this.g = objArrO;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, l1p0 l1p0Var) {
        Object[] objArrT;
        int iO = uwo1.o(i2 - 1, i);
        if (i == 5) {
            l1p0Var.b = objArr[iO];
            objArrT = null;
        } else {
            objArrT = t((Object[]) objArr[iO], i - 5, i2, l1p0Var);
        }
        if (objArrT == null && iO == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iO] = objArrT;
        return objArrO;
    }

    public final void u(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        l1p0 l1p0Var = new l1p0((Object) null, (byte) 2);
        objArr.getClass();
        Object[] objArrT = t(objArr, i2, i, l1p0Var);
        objArrT.getClass();
        this.g = (Object[]) l1p0Var.b;
        this.h = i;
        if (objArrT[1] == null) {
            this.f = (Object[]) objArrT[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrT;
            this.d = i2;
        }
    }

    public final Object[] v(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            bmv0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            bmv0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iO = uwo1.o(i, i2);
        int i3 = i2 - 5;
        objArrO[iO] = v((Object[]) objArrO[iO], i, i3, it);
        while (true) {
            iO++;
            if (iO >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iO] = v((Object[]) objArrO[iO], 0, i3, it);
        }
        return objArrO;
    }

    public final Object[] w(Object[] objArr, int i, Object[][] objArr2) {
        d7 d7Var = new d7(objArr2, (byte) 1);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrV = i2 < (1 << i3) ? v(objArr, i, i3, d7Var) : o(objArr);
        while (d7Var.hasNext()) {
            this.d += 5;
            objArrV = r(objArrV);
            int i4 = this.d;
            v(objArrV, 1 << i4, i4, d7Var);
        }
        return objArrV;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = y(this.d + 5, r(objArr), objArr2);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = y(i3, objArr, objArr2);
            this.g = objArr3;
            this.h++;
        }
    }

    public final Object[] y(int i, Object[] objArr, Object[] objArr2) {
        int iO = uwo1.o(b() - 1, i);
        Object[] objArrO = o(objArr);
        if (i == 5) {
            objArrO[iO] = objArr2;
            return objArrO;
        }
        objArrO[iO] = y(i - 5, (Object[]) objArrO[iO], objArr2);
        return objArrO;
    }

    public final int z(iu30 iu30Var, Object[] objArr, int i, int i2, l1p0 l1p0Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) l1p0Var.b;
        Object[] objArrQ = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i2 = 0;
                }
                objArrQ[i2] = obj;
                i2++;
            }
        }
        l1p0Var.b = objArrQ;
        if (objArr2 != objArrQ) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int I = I();
        if (I < 32) {
            Object[] objArrO = o(this.g);
            objArrO[I] = obj;
            this.g = objArrO;
            this.h = b() + 1;
        } else {
            x(this.f, this.g, r(obj));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        Iterator it = collection.iterator();
        if (32 - I >= collection.size()) {
            Object[] objArrO = o(this.g);
            e(objArrO, I, it);
            this.g = objArrO;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.g);
        e(objArrO2, I, it);
        objArr[0] = objArrO2;
        for (int i = 1; i < size; i++) {
            Object[] objArrQ = q();
            e(objArrQ, 0, it);
            objArr[i] = objArrQ;
        }
        this.f = w(this.f, E(), objArr);
        Object[] objArrQ2 = q();
        e(objArrQ2, 0, it);
        this.g = objArrQ2;
        this.h = collection.size() + this.h;
        return true;
    }
}
