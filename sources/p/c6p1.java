package p;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c6p1 extends y3p1 {
    public static final c6p1 d = new c6p1(0, null, new Object[0]);
    public final transient Object a;
    public final transient Object[] b;
    public final transient int c;

    public c6p1(int i, Object obj, Object[] objArr) {
        this.a = obj;
        this.b = objArr;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    public static c6p1 c(int i, Object[] objArr, que0 que0Var) {
        boolean z;
        int i2;
        int i3;
        short[] sArr;
        boolean z2;
        Object obj;
        boolean z3;
        ?? r16;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return d;
        }
        u3p1 u3p1Var = null;
        ?? r2 = 0;
        u3p1 u3p1Var2 = null;
        u3p1 u3p1Var3 = null;
        boolean z4 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new c6p1(1, null, objArrCopyOf);
        }
        ulo1.x(i4, objArrCopyOf.length >> 1);
        int iK = i4p1.k(i4);
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            r16 = 0;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = iK - 1;
            if (iK <= 128) {
                byte[] bArr = new byte[iK];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj2 = objArrCopyOf[i10];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArrCopyOf[i10 ^ 1];
                    Objects.requireNonNull(obj3);
                    int iY = omo1.y(obj2.hashCode());
                    while (true) {
                        int i11 = iY & i6;
                        z3 = z4;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj2;
                                objArrCopyOf[i9 ^ 1] = obj3;
                            }
                            i8++;
                            break;
                        }
                        if (obj2.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj4 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj4);
                            u3p1 u3p1Var4 = new u3p1(obj2, obj3, obj4);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj3;
                            u3p1Var2 = u3p1Var4;
                            break;
                        }
                        iY = i11 + 1;
                        z4 = z3;
                    }
                    i7++;
                    z4 = z3;
                }
                z = z4;
                obj = bArr;
                z2 = z;
                if (i8 == i4) {
                    i2 = 1;
                    r2 = obj;
                    r16 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i8);
                    sArr[2] = u3p1Var2;
                    r2 = sArr;
                    i2 = 1;
                    r16 = z;
                }
            } else {
                z = false;
                if (iK <= 32768) {
                    sArr = new short[iK];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj5 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj5);
                        Object obj6 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj6);
                        int iY2 = omo1.y(obj5.hashCode());
                        while (true) {
                            int i18 = iY2 & i6;
                            char c = (char) sArr[i18];
                            if (c == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj5;
                                    objArrCopyOf[i16 ^ 1] = obj6;
                                }
                                i14++;
                                break;
                            }
                            if (obj5.equals(objArrCopyOf[c])) {
                                int i19 = c ^ 1;
                                Object obj7 = objArrCopyOf[i19 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                u3p1 u3p1Var5 = new u3p1(obj5, obj6, obj7);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj6;
                                u3p1Var3 = u3p1Var5;
                                break;
                            }
                            iY2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r2 = sArr;
                        i2 = 1;
                        r16 = z;
                    } else {
                        obj = new Object[]{sArr, Integer.valueOf(i14), u3p1Var3};
                        z2 = z;
                        i2 = 1;
                        r2 = obj;
                        r16 = z2;
                    }
                } else {
                    int[] iArr = new int[iK];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj8 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i23 ^ i5];
                        Objects.requireNonNull(obj9);
                        int iY3 = omo1.y(obj8.hashCode());
                        while (true) {
                            int i24 = iY3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj8;
                                    objArrCopyOf[i22 ^ 1] = obj9;
                                }
                                i21++;
                                i3 = i5;
                                break;
                            }
                            i3 = i5;
                            if (obj8.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                Object obj10 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj10);
                                u3p1 u3p1Var6 = new u3p1(obj8, obj9, obj10);
                                objArrCopyOf[i26] = obj9;
                                u3p1Var = u3p1Var6;
                                break;
                            }
                            iY3 = i24 + 1;
                            i5 = i3;
                        }
                        i20++;
                        i5 = i3;
                    }
                    i2 = i5;
                    if (i21 == i4) {
                        r2 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i2] = Integer.valueOf(i21);
                        objArr2[2] = u3p1Var;
                        r2 = objArr2;
                        r16 = z;
                    }
                }
            }
        }
        boolean z5 = r2 instanceof Object[];
        ?? r3 = r2;
        if (z5) {
            Object[] objArr3 = (Object[]) r2;
            que0Var.d = (u3p1) objArr3[2];
            Object obj11 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r3 = obj11;
            i4 = iIntValue;
        }
        return new c6p1(i4, r3, objArrCopyOf);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u5p1 entrySet() {
        return new u5p1(this, this.b, this.c);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a6p1 values() {
        return new a6p1(1, this.c, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.c;
            Object[] objArr = this.b;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.a;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iY = omo1.y(obj.hashCode());
                    while (true) {
                        int i2 = iY & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iY = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iY2 = omo1.y(obj.hashCode());
                    while (true) {
                        int i4 = iY2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iY2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iY3 = omo1.y(obj.hashCode());
                    while (true) {
                        int i5 = iY3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iY3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public final Set keySet() {
        return new x5p1(this, new a6p1(0, this.c, this.b));
    }

    public final int size() {
        return this.c;
    }
}
