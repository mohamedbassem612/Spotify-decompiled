package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gg11 extends j380 {
    public static final gg11 g = new gg11(0, null, new Object[0]);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public gg11(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static gg11 p(int i, Object[] objArr, h380 h380Var) {
        if (i == 0) {
            return g;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new gg11(1, null, objArr);
        }
        dm5.u(i, objArr.length >> 1);
        Object objQ = q(objArr, i, t380.m(i), 0);
        if (objQ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objQ;
            g380 g380Var = (g380) objArr2[2];
            if (h380Var == null) {
                throw g380Var.a();
            }
            h380Var.c = g380Var;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objQ = obj;
            i = iIntValue;
        }
        return new gg11(i, objQ, objArr);
    }

    public static Object q(Object[] objArr, int i, int i2, int i3) {
        g380 g380Var = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int iA = j0o1.A(obj.hashCode());
                while (true) {
                    int i9 = iA & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i10])) {
                        int i11 = i10 ^ 1;
                        Object obj3 = objArr[i11];
                        Objects.requireNonNull(obj3);
                        g380Var = new g380(obj, obj2, obj3);
                        objArr[i11] = obj2;
                        break;
                    }
                    iA = i9 + 1;
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), g380Var};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int iA2 = j0o1.A(obj4.hashCode());
                while (true) {
                    int i15 = iA2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                        break;
                    }
                    if (obj4.equals(objArr[i16])) {
                        int i17 = i16 ^ 1;
                        Object obj6 = objArr[i17];
                        Objects.requireNonNull(obj6);
                        g380Var = new g380(obj4, obj5, obj6);
                        objArr[i17] = obj5;
                        break;
                    }
                    iA2 = i15 + 1;
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), g380Var};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int iA3 = j0o1.A(obj7.hashCode());
            while (true) {
                int i21 = iA3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                    break;
                }
                if (obj7.equals(objArr[i22])) {
                    int i23 = i22 ^ 1;
                    Object obj9 = objArr[i23];
                    Objects.requireNonNull(obj9);
                    g380Var = new g380(obj7, obj8, obj9);
                    objArr[i23] = obj8;
                    break;
                }
                iA3 = i21 + 1;
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), g380Var};
    }

    public static Object r(int i, int i2, Object obj, Object obj2, Object[] objArr) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = j0o1.A(obj2.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iA = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = j0o1.A(obj2.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = j0o1.A(obj2.hashCode());
            while (true) {
                int i7 = iA3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iA3 = i7 + 1;
            }
        }
    }

    @Override // p.j380
    public final t380 d() {
        return new dg11(this, this.e, 0, this.f);
    }

    @Override // p.j380
    public final t380 e() {
        return new eg11(this, new fg11(0, this.f, this.e));
    }

    @Override // p.j380
    public final q280 f() {
        return new fg11(1, this.f, this.e);
    }

    @Override // p.j380, java.util.Map
    public final Object get(Object obj) {
        Object objR = r(this.f, 0, this.d, obj, this.e);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    @Override // p.j380
    public final boolean h() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // p.j380
    public Object writeReplace() {
        return super.writeReplace();
    }
}
