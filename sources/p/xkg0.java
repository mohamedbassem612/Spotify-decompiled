package p;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xkg0 implements Map, Serializable, sla0 {
    public static final xkg0 N0;
    public zkg0 X;
    public ykg0 Y;
    public boolean Z;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ykg0 t;

    static {
        new nhc((byte) 15);
        xkg0 xkg0Var = new xkg0(0);
        xkg0Var.Z = true;
        N0 = xkg0Var;
    }

    public xkg0(int i) {
        if (i < 0) {
            hhg1.n("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int i2 = nhc.i(i);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[i2];
        this.e = 2;
        this.f = 0;
        this.g = nhc.j(i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.Z) {
            return new z661(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iH = h(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iH];
                if (i3 == 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 >= objArr.length) {
                        e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f = i5;
                    objArr[i4] = obj;
                    this.c[i4] = iH;
                    iArr[iH] = i5;
                    this.i++;
                    this.h++;
                    if (i2 > this.e) {
                        this.e = i2;
                    }
                    return i4;
                }
                if (u890.j(this.a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    i(this.d.length * 2);
                    break;
                }
                iH = iH == 0 ? this.d.length - 1 : iH - 1;
            }
        }
    }

    public final xkg0 b() {
        c();
        this.Z = true;
        return this.i > 0 ? this : N0;
    }

    public final void c() {
        if (this.Z) {
            k220.c();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        bmq0.Y(0, this.f, this.a);
        Object[] objArr = this.b;
        if (objArr != null) {
            bmq0.Y(0, this.f, objArr);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        bmq0.Y(i3, i, this.a);
        if (objArr != null) {
            bmq0.Y(i3, this.f, objArr);
        }
        this.f = i3;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.b;
            this.b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.c = Arrays.copyOf(this.c, i6);
            int i7 = nhc.i(i6);
            if (i7 > this.d.length) {
                i(i7);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ykg0 ykg0Var = this.Y;
        if (ykg0Var != null) {
            return ykg0Var;
        }
        ykg0 ykg0Var2 = new ykg0(this, (byte) 0);
        this.Y = ykg0Var2;
        return ykg0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zJ;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.i == map.size()) {
                for (Object obj2 : map.entrySet()) {
                    if (obj2 != null) {
                        try {
                            Map.Entry entry = (Map.Entry) obj2;
                            int iF = f(entry.getKey());
                            if (iF < 0) {
                                zJ = false;
                            } else {
                                Object[] objArr = this.b;
                                objArr.getClass();
                                zJ = u890.j(objArr[iF], entry.getValue());
                            }
                            if (!zJ) {
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int iH = h(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iH];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (u890.j(this.a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.d.length - 1 : iH - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (u890.j(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[iF];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final int hashCode() {
        ukg0 ukg0Var = new ukg0(this, (byte) 0);
        int i = 0;
        while (ukg0Var.hasNext()) {
            i += ukg0Var.i();
        }
        return i;
    }

    public final void i(int i) {
        int[] iArr;
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            d(false);
        }
        this.d = new int[i];
        this.g = nhc.j(i);
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int iH = h(this.a[i2]);
            int i4 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[iH] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    eg.m("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iH = iH == 0 ? iArr.length - 1 : iH - 1;
            }
            iArr[iH] = i3;
            this.c[i2] = iH;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final void j(int i) {
        int i2;
        int i3;
        int iH;
        int[] iArr;
        this.a[i] = null;
        Object[] objArr = this.b;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.d.length - 1 : length - 1;
                int[] iArr2 = this.d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iH = h(this.a[i3]) - length;
                    iArr = this.d;
                }
            } while ((iH & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.c[i3] = i4;
        }
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ykg0 ykg0Var = this.t;
        if (ykg0Var != null) {
            return ykg0Var;
        }
        ykg0 ykg0Var2 = new ykg0(this, (byte) 1);
        this.t = ykg0Var2;
        return ykg0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                hhg1.n("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    hhg1.n("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!u890.j(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[iF];
        j(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        ukg0 ukg0Var = new ukg0(this, (byte) 0);
        while (ukg0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            ukg0Var.h(sb);
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zkg0 zkg0Var = this.X;
        if (zkg0Var != null) {
            return zkg0Var;
        }
        zkg0 zkg0Var2 = new zkg0(this, (byte) 0);
        this.X = zkg0Var2;
        return zkg0Var2;
    }

    public xkg0() {
        this(8);
    }
}
