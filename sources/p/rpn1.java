package p;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rpn1 extends AbstractMap implements Serializable {
    public static final Object t = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e = Math.min(Math.max(12, 1), 1073741823);
    public transient int f;
    public transient kon1 g;
    public transient kon1 h;
    public transient v8 i;

    public final int[] a() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.e += 32;
        Map mapD = d();
        if (mapD != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapD.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f, (Object) null);
        Arrays.fill(c(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsKey(obj);
        }
        return h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (poo1.K(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void e(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrB[i] = null;
            objArrC[i] = null;
            iArrA[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrB[i3];
        objArrB[i] = obj2;
        objArrC[i] = objArrC[i3];
        objArrB[i3] = null;
        objArrC[i3] = null;
        iArrA[i] = iArrA[i3];
        iArrA[i3] = 0;
        int iW = o4o1.w(obj2) & i2;
        int iI0 = l4o1.i0(iW, obj);
        if (iI0 == size) {
            l4o1.k0(iW, i4, obj);
            return;
        }
        while (true) {
            int i5 = iI0 - 1;
            int i6 = iArrA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrA[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iI0 = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        kon1 kon1Var = this.h;
        if (kon1Var != null) {
            return kon1Var;
        }
        kon1 kon1Var2 = new kon1(this, (byte) 0);
        this.h = kon1Var2;
        return kon1Var2;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final int g() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.get(obj);
        }
        int iH = h(obj);
        if (iH == -1) {
            return null;
        }
        return c()[iH];
    }

    public final int h(Object obj) {
        if (f()) {
            return -1;
        }
        int iW = o4o1.w(obj);
        int iG = g();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iI0 = l4o1.i0(iW & iG, obj2);
        if (iI0 != 0) {
            int i = ~iG;
            int i2 = iW & i;
            do {
                int i3 = iI0 - 1;
                int i4 = a()[i3];
                if ((i4 & i) == i2 && poo1.K(obj, b()[i3])) {
                    return i3;
                }
                iI0 = i4 & iG;
            } while (iI0 != 0);
        }
        return -1;
    }

    public final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objJ0 = l4o1.j0(i2);
        if (i4 != 0) {
            l4o1.k0(i3 & i5, i4 + 1, objJ0);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i6 = 0; i6 <= i; i6++) {
            int iI0 = l4o1.i0(i6, obj);
            while (iI0 != 0) {
                int i7 = iI0 - 1;
                int i8 = iArrA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iI1 = l4o1.i0(i10, objJ0);
                l4o1.k0(i10, iI0, objJ0);
                iArrA[i7] = ((~i5) & i9) | (iI1 & i5);
                iI0 = i8 & i;
            }
        }
        this.a = objJ0;
        this.e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.e & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!f()) {
            int iG = g();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iH0 = l4o1.h0(obj, null, iG, obj2, a(), b(), null);
            if (iH0 != -1) {
                Object obj3 = c()[iH0];
                e(iH0, iG);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kon1 kon1Var = this.g;
        if (kon1Var != null) {
            return kon1Var;
        }
        kon1 kon1Var2 = new kon1(this, (byte) 1);
        this.g = kon1Var2;
        return kon1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (f()) {
            if (!f()) {
                eg.m("Arrays already allocated");
                return null;
            }
            int i3 = this.e;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.a = l4o1.j0(iMax2);
            this.e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i3];
            this.c = new Object[i3];
            this.d = new Object[i3];
        }
        Map mapD = d();
        if (mapD != null) {
            return mapD.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i4 = this.f;
        int i5 = i4 + 1;
        int iW = o4o1.w(obj);
        int iG = g();
        int i6 = iW & iG;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int iI0 = l4o1.i0(i6, obj3);
        if (iI0 == 0) {
            if (i5 > iG) {
                iG = i(iG, (iG + 1) * (iG < 32 ? 4 : 2), iW, i4);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                l4o1.k0(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iG;
            int i8 = iW & i7;
            int i9 = 0;
            while (true) {
                int i10 = iI0 - 1;
                int i11 = iArrA[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && poo1.K(obj, objArrB[i10])) {
                    Object obj5 = objArrC[i10];
                    objArrC[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iG;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iG) {
                            iArrA[i10] = i12 | (i5 & iG);
                            break;
                        }
                        iG = i(iG, (iG + 1) * (iG < i13 ? 4 : 2), iW, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(b()[i16], c()[i16]);
                        int i17 = i16 + 1;
                        i16 = i17 < this.f ? i17 : -1;
                    }
                    this.a = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                iI0 = i14;
                i9 = i15;
                i2 = i13;
            }
        }
        int length = a().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.b = Arrays.copyOf(a(), iMin);
                this.c = Arrays.copyOf(b(), iMin);
                this.d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i4] = (~iG) & iW;
        b()[i4] = obj;
        c()[i4] = obj2;
        this.f = i5;
        this.e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == t) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapD = d();
        return mapD != null ? mapD.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        v8 v8Var = this.i;
        if (v8Var != null) {
            return v8Var;
        }
        v8 v8Var2 = new v8((Object) this, (byte) 5);
        this.i = v8Var2;
        return v8Var2;
    }
}
