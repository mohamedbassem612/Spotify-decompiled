package p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class drs0 extends y8 implements yps0 {
    public c9 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public jma e = new jma((byte) 17);
    public Object[] f;
    public Object[] g;
    public int h;

    public drs0(c9 c9Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = c9Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = c9Var.b();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(s4u s4uVar, Object[] objArr, int i, z8c0 z8c0Var) {
        int i2 = 0;
        Object[] objArrO = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) s4uVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrO = o(objArr);
                    z = true;
                    i3 = i2;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArrO[i3] = obj;
                i3 = i2;
            }
            i2 = i4;
        }
        z8c0Var.b = objArrO;
        return i3;
    }

    public final int B(s4u s4uVar, int i, z8c0 z8c0Var) {
        int iA = A(s4uVar, this.g, i, z8c0Var);
        Object obj = z8c0Var.b;
        if (iA == i) {
            return i;
        }
        if (obj == null) {
            bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return 0;
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iA, i, (Object) null);
        this.g = objArr;
        this.h -= i - iA;
        return iA;
    }

    public final Object[] C(Object[] objArr, int i, int i2, z8c0 z8c0Var) {
        int iC0 = ouo1.c0(i2, i);
        if (i == 0) {
            Object obj = objArr[iC0];
            Object[] objArrO = o(objArr);
            int i3 = iC0 + 1;
            System.arraycopy(objArr, i3, objArrO, iC0, 32 - i3);
            objArrO[31] = z8c0Var.b;
            z8c0Var.b = obj;
            return objArrO;
        }
        int iC1 = objArr[31] == null ? ouo1.c0(E() - 1, i) : 31;
        Object[] objArrO2 = o(objArr);
        int i4 = i - 5;
        int i5 = iC0 + 1;
        if (i5 <= iC1) {
            while (true) {
                int i6 = iC1 - 1;
                Object obj2 = objArrO2[iC1];
                if (obj2 == null) {
                    bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return null;
                }
                objArrO2[iC1] = C((Object[]) obj2, i4, 0, z8c0Var);
                if (iC1 == i5) {
                    break;
                }
                iC1 = i6;
            }
        }
        Object obj3 = objArrO2[iC0];
        if (obj3 != null) {
            objArrO2[iC0] = C((Object[]) obj3, i4, i2, z8c0Var);
            return objArrO2;
        }
        bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return null;
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
    public final Object[] G(Object[] objArr, int i, int i2, Object obj, z8c0 z8c0Var) {
        int iC0 = ouo1.c0(i2, i);
        Object[] objArrO = o(objArr);
        if (i == 0) {
            if (objArrO != objArr) {
                ((AbstractList) this).modCount++;
            }
            z8c0Var.b = objArrO[iC0];
            objArrO[iC0] = obj;
            return objArrO;
        }
        Object obj2 = objArrO[iC0];
        if (obj2 != null) {
            objArrO[iC0] = G((Object[]) obj2, i - 5, i2, obj, z8c0Var);
            return objArrO;
        }
        bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return null;
    }

    public final void H(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrQ;
        if (i3 < 1) {
            eg.m("Check failed.");
            return;
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
        wxo1.n(i, b());
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
        z8c0 z8c0Var = new z8c0((Object) null, (byte) 29);
        Object[] objArr = this.f;
        objArr.getClass();
        l(0, z8c0Var.b, i(objArr, this.d, i, obj, z8c0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrQ;
        wxo1.n(i, this.h);
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
                k(collection2, i, i4, objArr2, size, objArrP);
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
                k(collection2, i, i6, objArr2, i7, objArrP2);
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
        wxo1.m(i, b());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i >= iE) {
            return D(this.f, iE, this.d, i - iE);
        }
        z8c0 z8c0Var = new z8c0(this.g[0], (byte) 29);
        Object[] objArr = this.f;
        objArr.getClass();
        D(C(objArr, this.d, i, z8c0Var), iE, this.d, 0);
        return z8c0Var.b;
    }

    public final c9 d() {
        c9 brs0Var;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            brs0Var = this.a;
        } else {
            this.e = new jma((byte) 17);
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                brs0Var = objArr2.length == 0 ? fg91.b : new fg91(Arrays.copyOf(objArr2, this.h));
            } else {
                brs0Var = new brs0(this.h, this.d, objArr, objArr2);
            }
        }
        this.a = brs0Var;
        return brs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final Object get(int i) {
        Object[] objArr;
        wxo1.m(i, b());
        if (E() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ouo1.c0(i, i2)];
                if (objArr3 == null) {
                    bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return null;
                }
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, z8c0 z8c0Var) {
        int iC0 = ouo1.c0(i2, i);
        if (i == 0) {
            z8c0Var.b = objArr[31];
            Object[] objArrO = o(objArr);
            System.arraycopy(objArr, iC0, objArrO, iC0 + 1, 31 - iC0);
            objArrO[iC0] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        Object obj2 = objArrO2[iC0];
        if (obj2 == null) {
            bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return null;
        }
        objArrO2[iC0] = i((Object[]) obj2, i3, i2, obj, z8c0Var);
        int i4 = iC0 + 1;
        while (i4 < 32) {
            int i5 = i4 + 1;
            Object obj3 = objArrO2[i4];
            if (obj3 == null) {
                break;
            }
            objArrO2[i4] = i((Object[]) obj3, i3, 0, z8c0Var.b, z8c0Var);
            i4 = i5;
        }
        return objArrO2;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            eg.m("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        h7 h7VarN = n(E() >> 5);
        int i5 = i3;
        Object[] objArrP = objArr2;
        while (h7VarN.a - 1 != i4) {
            Object[] objArr3 = (Object[]) h7VarN.previous();
            f46.Q(0, 32 - i2, 32, objArr3, objArrP);
            objArrP = p(i2, objArr3);
            i5--;
            objArr[i5] = objArrP;
        }
        Object[] objArr4 = (Object[]) h7VarN.previous();
        int iE = i3 - (((E() >> 5) - 1) - i4);
        if (iE < i3) {
            objArr2 = objArr[iE];
            objArr2.getClass();
        }
        H(collection, i, objArr4, 32, objArr, iE, objArr2);
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
        wxo1.n(i, this.h);
        return new hrs0(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final h7 n(int i) {
        if (this.f == null) {
            eg.m("Required value was null.");
            return null;
        }
        int iE = E() >> 5;
        wxo1.n(i, iE);
        int i2 = this.d;
        Object[] objArr = this.f;
        if (i2 == 0) {
            objArr.getClass();
            return new ry81(objArr, i);
        }
        objArr.getClass();
        return new hug1(objArr, i, iE, i2 / 5);
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

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r0v18 */
    public final boolean removeAll(Collection collection) {
        ?? r0;
        drs0 drs0Var;
        s4u s4uVar = new s4u(collection, (byte) 1);
        int I = I();
        Object[] objArrS = null;
        z8c0 z8c0Var = new z8c0((Object) null, (byte) 29);
        boolean z = false;
        if (this.f != null) {
            h7 h7VarN = n(0);
            int iA = 32;
            while (iA == 32 && h7VarN.hasNext()) {
                iA = A(s4uVar, (Object[]) h7VarN.next(), 32, z8c0Var);
            }
            if (iA == 32) {
                int iB = B(s4uVar, I, z8c0Var);
                if (iB == 0) {
                    u(this.h, this.d, this.f);
                }
                if (iB != I) {
                    drs0Var = this;
                } else {
                    r0 = this;
                }
            } else {
                int i = (h7VarN.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA;
                while (h7VarN.hasNext()) {
                    iZ = z(s4uVar, (Object[]) h7VarN.next(), 32, iZ, z8c0Var, arrayList2, arrayList);
                }
                drs0 drs0Var2 = this;
                int iZ2 = drs0Var2.z(s4uVar, drs0Var2.g, I, iZ, z8c0Var, arrayList2, arrayList);
                Object obj = z8c0Var.b;
                if (obj == null) {
                    bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return false;
                }
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iZ2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrV = drs0Var2.f;
                if (zIsEmpty) {
                    objArrV.getClass();
                } else {
                    objArrV = drs0Var2.v(objArrV, i, drs0Var2.d, arrayList.iterator());
                }
                int size = i + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    eg.m("Check failed.");
                    return false;
                }
                if (size != 0) {
                    int i2 = size - 1;
                    while (true) {
                        int i3 = drs0Var2.d;
                        if ((i2 >> i3) != 0) {
                            objArrS = drs0Var2.s(i2, i3, objArrV);
                            break;
                        }
                        drs0Var2.d = i3 - 5;
                        Object[] objArr2 = objArrV[0];
                        if (objArr2 == null) {
                            bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                            return false;
                        }
                        objArrV = objArr2;
                    }
                } else {
                    drs0Var2.d = 0;
                }
                drs0Var2.f = objArrS;
                drs0Var2.g = objArr;
                drs0Var2.h = size + iZ2;
                drs0Var = drs0Var2;
            }
            z = true;
            r0 = drs0Var;
        } else if (B(s4uVar, I, z8c0Var) != I) {
            drs0Var = this;
            z = true;
            r0 = drs0Var;
        } else {
            r0 = this;
        }
        if (z) {
            ((AbstractList) r0).modCount++;
        }
        return z;
    }

    public final Object[] s(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            eg.m("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iC0 = ouo1.c0(i, i2);
        Object obj = objArr[iC0];
        if (obj == null) {
            bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return null;
        }
        Object objS = s(i, i2 - 5, (Object[]) obj);
        if (iC0 < 31) {
            int i3 = iC0 + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrQ = q();
                System.arraycopy(objArr, 0, objArrQ, 0, i3);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[iC0]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iC0] = objS;
        return objArrO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object set(int i, Object obj) {
        wxo1.m(i, b());
        if (E() > i) {
            z8c0 z8c0Var = new z8c0((Object) null, (byte) 29);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = G(objArr, this.d, i, obj, z8c0Var);
            return z8c0Var.b;
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

    public final Object[] t(Object[] objArr, int i, int i2, z8c0 z8c0Var) {
        Object[] objArrT;
        int iC0 = ouo1.c0(i2 - 1, i);
        if (i == 5) {
            z8c0Var.b = objArr[iC0];
            objArrT = null;
        } else {
            Object obj = objArr[iC0];
            if (obj == null) {
                bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return null;
            }
            objArrT = t((Object[]) obj, i - 5, i2, z8c0Var);
        }
        if (objArrT == null && iC0 == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iC0] = objArrT;
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
        z8c0 z8c0Var = new z8c0((Object) null, (byte) 29);
        objArr.getClass();
        Object[] objArrT = t(objArr, i2, i, z8c0Var);
        objArrT.getClass();
        Object obj = z8c0Var.b;
        if (obj == null) {
            bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return;
        }
        this.g = (Object[]) obj;
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
            eg.m("Check failed.");
            return null;
        }
        if (i2 < 0) {
            eg.m("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iC0 = ouo1.c0(i, i2);
        int i3 = i2 - 5;
        objArrO[iC0] = v((Object[]) objArrO[iC0], i, i3, it);
        while (true) {
            iC0++;
            if (iC0 >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iC0] = v((Object[]) objArrO[iC0], 0, i3, it);
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
        int iC0 = ouo1.c0(b() - 1, i);
        Object[] objArrO = o(objArr);
        if (i == 5) {
            objArrO[iC0] = objArr2;
            return objArrO;
        }
        objArrO[iC0] = y(i - 5, (Object[]) objArrO[iC0], objArr2);
        return objArrO;
    }

    public final int z(s4u s4uVar, Object[] objArr, int i, int i2, z8c0 z8c0Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = z8c0Var.b;
        if (obj == null) {
            bhn0.i("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return 0;
        }
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrQ = objArr2;
        int i3 = 0;
        while (i3 < i) {
            i3++;
            Object obj2 = objArr[i3];
            if (!((Boolean) s4uVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i2 = 0;
                }
                objArrQ[i2] = obj2;
                i2++;
            }
        }
        z8c0Var.b = objArrQ;
        if (objArr2 != objArrQ) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
