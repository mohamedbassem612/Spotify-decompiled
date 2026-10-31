package p;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p2p1 implements Map, Serializable {
    public static final Object g = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;

    public final Object[] a() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] b() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean c() {
        return this.a == null;
    }

    @Override // java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.e += 32;
        Map mapD = d();
        if (mapD != null) {
            this.e = kno1.D(size(), 3);
            mapD.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(a(), 0, this.f, (Object) null);
        Arrays.fill(b(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsKey(obj);
        }
        return h(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (Objects.equals(obj, b()[i])) {
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
        int[] iArrJ = j();
        Object[] objArrA = a();
        Object[] objArrB = b();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrA[i] = null;
            objArrB[i] = null;
            iArrJ[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrA[i3];
        objArrA[i] = obj2;
        objArrB[i] = objArrB[i3];
        objArrA[i3] = null;
        objArrB[i3] = null;
        iArrJ[i] = iArrJ[i3];
        iArrJ[i3] = 0;
        int iZ = omo1.z(obj2) & i2;
        int iM = mmo1.M(iZ, obj);
        if (iM == size) {
            mmo1.N(iZ, i4, obj);
            return;
        }
        while (true) {
            int i5 = iM - 1;
            int i6 = iArrJ[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrJ[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iM = i7;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new e2p1(this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return smo1.H(obj, this);
    }

    public final int f() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int g(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objL = mmo1.L(i2);
        if (i4 != 0) {
            mmo1.N(i3 & i5, i4 + 1, objL);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM = mmo1.M(i6, obj);
            while (iM != 0) {
                int i7 = iM - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM2 = mmo1.M(i10, objL);
                mmo1.N(i10, iM, objL);
                iArrJ[i7] = ((~i5) & i9) | (iM2 & i5);
                iM = i8 & i;
            }
        }
        this.a = objL;
        this.e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.e & (-32));
        return i5;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.get(obj);
        }
        int iH = h(obj);
        if (iH == -1) {
            return null;
        }
        return b()[iH];
    }

    public final int h(Object obj) {
        if (c()) {
            return -1;
        }
        int iZ = omo1.z(obj);
        int iF = f();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iM = mmo1.M(iZ & iF, obj2);
        if (iM != 0) {
            int i = ~iF;
            int i2 = iZ & i;
            do {
                int i3 = iM - 1;
                int i4 = j()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, a()[i3])) {
                    return i3;
                }
                iM = i4 & iF;
            } while (iM != 0);
        }
        return -1;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new e2p1(this).hashCode();
    }

    public final Object i(Object obj) {
        if (!c()) {
            int iF = f();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iO = mmo1.O(obj, (Object) null, iF, obj2, j(), a(), (Object[]) null);
            if (iO != -1) {
                Object obj3 = b()[iO];
                e(iO, iF);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new e2p1(this, (byte) 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (c()) {
            ulo1.v(c(), "Arrays already allocated");
            int i3 = this.e;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.a = mmo1.L(iMax2);
            this.e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i3];
            this.c = new Object[i3];
            this.d = new Object[i3];
        }
        Map mapD = d();
        if (mapD != null) {
            return mapD.put(obj, obj2);
        }
        int[] iArrJ = j();
        Object[] objArrA = a();
        Object[] objArrB = b();
        int i4 = this.f;
        int i5 = i4 + 1;
        int iZ = omo1.z(obj);
        int iF = f();
        int i6 = iZ & iF;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int iM = mmo1.M(i6, obj3);
        if (iM == 0) {
            if (i5 > iF) {
                iF = g(iF, (iF + 1) * (iF < 32 ? 4 : 2), iZ, i4);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                mmo1.N(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iF;
            int i8 = iZ & i7;
            int i9 = 0;
            while (true) {
                int i10 = iM - 1;
                int i11 = iArrJ[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && Objects.equals(obj, objArrA[i10])) {
                    Object obj5 = objArrB[i10];
                    objArrB[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iF;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iF) {
                            iArrJ[i10] = (i5 & iF) | i12;
                            break;
                        }
                        iF = g(iF, (iF < i13 ? 4 : 2) * (iF + 1), iZ, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(f() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(a()[i16], b()[i16]);
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
                iM = i14;
                i9 = i15;
                i2 = i13;
            }
        }
        int length = j().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.b = Arrays.copyOf(j(), iMin);
                this.c = Arrays.copyOf(a(), iMin);
                this.d = Arrays.copyOf(b(), iMin);
            }
        }
        j()[i4] = (~iF) & iZ;
        a()[i4] = obj;
        b()[i4] = obj2;
        this.f = i5;
        this.e += 32;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.remove(obj);
        }
        Object objI = i(obj);
        if (objI == g) {
            return null;
        }
        return objI;
    }

    @Override // java.util.Map
    public final int size() {
        Map mapD = d();
        return mapD != null ? mapD.size() : this.f;
    }

    public final String toString() {
        return smo1.I(this);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new m2p1(this);
    }
}
