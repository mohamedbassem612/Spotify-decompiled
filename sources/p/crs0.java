package p;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class crs0 extends d9 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public crs0(int i, int i2, Object[] objArr, Object[] objArr2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(b() > 32)) {
            bmv0.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] m(Object[] objArr, int i, int i2, Object obj, l1p0 l1p0Var) {
        int iO = uwo1.o(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iO == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            f46.Q(iO + 1, iO, 31, objArr, objArrCopyOf);
            l1p0Var.b = objArr[31];
            objArrCopyOf[iO] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        objArrCopyOf2[iO] = m((Object[]) objArr[iO], i3, i2, obj, l1p0Var);
        while (true) {
            iO++;
            if (iO >= 32 || objArrCopyOf2[iO] == null) {
                break;
            }
            objArrCopyOf2[iO] = m((Object[]) objArr[iO], i3, 0, l1p0Var.b, l1p0Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] o(Object[] objArr, int i, int i2, l1p0 l1p0Var) {
        Object[] objArrO;
        int iO = uwo1.o(i2, i);
        if (i == 5) {
            l1p0Var.b = objArr[iO];
            objArrO = null;
        } else {
            objArrO = o((Object[]) objArr[iO], i - 5, i2, l1p0Var);
        }
        if (objArrO == null && iO == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iO] = objArrO;
        return objArrCopyOf;
    }

    public static Object[] u(Object[] objArr, int i, int i2, Object obj) {
        int iO = uwo1.o(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iO] = obj;
            return objArrCopyOf;
        }
        objArrCopyOf[iO] = u((Object[]) objArrCopyOf[iO], i - 5, i2, obj);
        return objArrCopyOf;
    }

    public final int b() {
        return this.c;
    }

    public final d9 c(int i, Object obj) {
        int i2 = this.c;
        yxo1.s(i, i2);
        if (i == i2) {
            return d(obj);
        }
        int iT = t();
        Object[] objArr = this.a;
        if (i >= iT) {
            return n(i - iT, obj, objArr);
        }
        l1p0 l1p0Var = new l1p0((Object) null, (byte) 2);
        return n(0, l1p0Var.b, m(objArr, this.d, i, obj, l1p0Var));
    }

    public final d9 d(Object obj) {
        int iB = b() - t();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (iB >= 32) {
            return p(objArr, objArr2, uwo1.q(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[iB] = obj;
        return new crs0(b() + 1, this.d, objArr, objArrCopyOf);
    }

    public final ers0 f() {
        return new ers0(this, this.a, this.b, this.d);
    }

    public final Object get(int i) {
        Object[] objArr;
        yxo1.r(i, b());
        if (t() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[uwo1.o(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final d9 i(b9 b9Var) {
        ers0 ers0Var = new ers0(this, this.a, this.b, this.d);
        ers0Var.B(b9Var);
        return ers0Var.d();
    }

    public final d9 k(int i) {
        yxo1.r(i, b());
        int iT = t();
        int i2 = this.d;
        Object[] objArr = this.a;
        return i >= iT ? s(objArr, iT, i2, i - iT) : s(r(objArr, i2, i, new l1p0(this.b[0], (byte) 2)), iT, i2, 0);
    }

    public final d9 l(int i, Object obj) {
        int i2 = this.c;
        yxo1.r(i, i2);
        int iT = t();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i3 = this.d;
        if (iT > i) {
            return new crs0(i2, i3, u(objArr, i3, i, obj), objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new crs0(i2, i3, objArr, objArrCopyOf);
    }

    public final ListIterator listIterator(int i) {
        yxo1.s(i, this.c);
        return new grs0(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }

    public final crs0 n(int i, Object obj, Object[] objArr) {
        int iT = t();
        int i2 = this.c;
        int i3 = i2 - iT;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            f46.Q(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new crs0(i2 + 1, this.d, objArr, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        f46.Q(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        return p(objArr, objArrCopyOf, uwo1.q(obj2));
    }

    public final crs0 p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 <= (1 << i3)) {
            return new crs0(i + 1, i3, q(i3, objArr, objArr2), objArr3);
        }
        int i4 = i3 + 5;
        return new crs0(i + 1, i4, q(i4, uwo1.q(objArr), objArr2), objArr3);
    }

    public final Object[] q(int i, Object[] objArr, Object[] objArr2) {
        int iO = uwo1.o(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iO] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iO] = q(i - 5, (Object[]) objArrCopyOf[iO], objArr2);
        return objArrCopyOf;
    }

    public final Object[] r(Object[] objArr, int i, int i2, l1p0 l1p0Var) {
        int iO = uwo1.o(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iO == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            f46.Q(iO, iO + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = l1p0Var.b;
            l1p0Var.b = objArr[iO];
            return objArrCopyOf;
        }
        int iO2 = objArr[31] == null ? uwo1.o(t() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iO + 1;
        if (i4 <= iO2) {
            while (true) {
                objArrCopyOf2[iO2] = r((Object[]) objArrCopyOf2[iO2], i3, 0, l1p0Var);
                if (iO2 == i4) {
                    break;
                }
                iO2--;
            }
        }
        objArrCopyOf2[iO] = r((Object[]) objArrCopyOf2[iO], i3, i2, l1p0Var);
        return objArrCopyOf2;
    }

    public final d9 s(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                f46.Q(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new crs0((i + i4) - 1, i2, objArr, objArrCopyOf);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new gg91(objArr);
        }
        l1p0 l1p0Var = new l1p0((Object) null, (byte) 2);
        Object[] objArrO = o(objArr, i2, i - 1, l1p0Var);
        objArrO.getClass();
        Object[] objArr3 = (Object[]) l1p0Var.b;
        if (objArrO[1] != null) {
            return new crs0(i, i2, objArrO, objArr3);
        }
        return new crs0(i, i2 - 5, (Object[]) objArrO[0], objArr3);
    }

    public final int t() {
        return (this.c - 1) & (-32);
    }
}
