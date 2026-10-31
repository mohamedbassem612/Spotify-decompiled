package p;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i4p1 extends j3p1 implements Set {
    public transient r3p1 b;

    public static int k(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        hhg1.n("collection too large");
        return 0;
    }

    public static i4p1 l(i4p1 i4p1Var) {
        if (i4p1Var != null && !(i4p1Var instanceof SortedSet) && !i4p1Var.f()) {
            return i4p1Var;
        }
        Object[] array = i4p1Var.toArray(j3p1.a);
        return o(array.length, array);
    }

    public static i4p1 o(int i, Object... objArr) {
        if (i == 0) {
            return f6p1.i;
        }
        byte b = 1;
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new m4p1(obj, b);
        }
        int iK = k(i);
        Object[] objArr2 = new Object[iK];
        int i2 = iK - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            fc11.n0(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iY = omo1.y(iHashCode);
            while (true) {
                int i6 = iY & i2;
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
                iY++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m4p1(obj4, b);
        }
        if (k(i4) < iK / 2) {
            return o(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new f6p1(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i4p1) && (this instanceof f6p1) && (((i4p1) obj) instanceof f6p1) && ((f6p1) this).d != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zmo1.z(this);
    }

    public final r3p1 m() {
        r3p1 r3p1Var = this.b;
        if (r3p1Var != null) {
            return r3p1Var;
        }
        r3p1 r3p1VarN = n();
        this.b = r3p1VarN;
        return r3p1VarN;
    }

    public r3p1 n() {
        Object[] array = toArray(j3p1.a);
        int length = array.length;
        return length == 0 ? i5p1.e : new i5p1(length, array);
    }
}
