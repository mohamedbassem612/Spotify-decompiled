package p;

import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class f46 extends zno1 {
    public static Object[] A0(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    public static Object B0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            bhn0.t("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        hhg1.n("Array has more than one element.");
        return null;
    }

    public static byte[] C0(byte[] bArr, tr80 tr80Var) {
        return tr80Var.isEmpty() ? new byte[0] : Z(tr80Var.a, bArr, tr80Var.b + 1);
    }

    public static void D0(int i, int[] iArr) {
        Arrays.sort(iArr, 0, i);
    }

    public static void E0(Object[] objArr) {
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void F0(Object[] objArr, Comparator comparator) {
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static Iterable G(Object[] objArr) {
        return objArr.length == 0 ? z6x.a : new h46(objArr, (byte) 0);
    }

    public static void G0(Object[] objArr, Comparator comparator, int i) {
        Arrays.sort(objArr, 0, i, comparator);
    }

    public static List H(Object[] objArr) {
        return Arrays.asList(objArr);
    }

    public static List H0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            F0(objArr, comparator);
        }
        return H(objArr);
    }

    public static n561 I(Object[] objArr) {
        return objArr.length == 0 ? v7x.a : new i46(objArr, (byte) 0);
    }

    public static List I0(int i, int[] iArr) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return z6x.a;
        }
        if (i >= iArr.length) {
            return O0(iArr);
        }
        if (i == 1) {
            return k4p1.x(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static int J(float f, float[] fArr) {
        return Arrays.binarySearch(fArr, 0, fArr.length, f);
    }

    public static List J0(byte[] bArr, int i) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return z6x.a;
        }
        if (i >= bArr.length) {
            return L0(bArr);
        }
        if (i == 1) {
            return k4p1.x(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean K(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static final void K0(Object[] objArr, AbstractSet abstractSet) {
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static boolean L(int[] iArr, int i) {
        return o0(i, iArr) >= 0;
    }

    public static List L0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return k4p1.x(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static boolean M(Object[] objArr, Object obj) {
        return p0(objArr, obj) >= 0;
    }

    public static List M0(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return k4p1.x(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static boolean N(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!N((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof q3h1) && (obj2 instanceof q3h1)) {
                            if (!Arrays.equals(((q3h1) obj).a, ((q3h1) obj2).a)) {
                            }
                        } else if ((obj instanceof o5h1) && (obj2 instanceof o5h1)) {
                            if (!Arrays.equals(((o5h1) obj).a, ((o5h1) obj2).a)) {
                            }
                        } else if ((obj instanceof v4h1) && (obj2 instanceof v4h1)) {
                            if (!Arrays.equals(((v4h1) obj).a, ((v4h1) obj2).a)) {
                            }
                        } else if ((obj instanceof a5h1) && (obj2 instanceof a5h1)) {
                            if (!Arrays.equals(((a5h1) obj).a, ((a5h1) obj2).a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List N0(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return k4p1.x(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static void O(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static List O0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return k4p1.x(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static void P(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static List P0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return k4p1.x(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static void Q(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static List Q0(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? H(Arrays.copyOf(objArr, objArr.length)) : k4p1.x(objArr[0]);
        }
        return z6x.a;
    }

    public static void R(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static List R0(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return z6x.a;
        }
        if (length == 1) {
            return k4p1.x(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static void S(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
    }

    public static Set S0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return w7x.a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(objArr.length));
        K0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static void T(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static Float[] T0(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public static void U(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static Integer[] U0(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static void V(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    public static ba80 V0(Object[] objArr) {
        return new ba80(new hx4(objArr, (byte) 5));
    }

    public static void W(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static ArrayList W0(Object[] objArr, Object[] objArr2) {
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(oqn1.n(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static void X(float[] fArr, float[] fArr2, int i) {
        int i2 = (i & 4) != 0 ? 0 : 1;
        System.arraycopy(fArr, i2, fArr2, 0, ((i & 8) != 0 ? fArr.length : 6) - i2);
    }

    public static void Y(long[] jArr, long[] jArr2, int i) {
        System.arraycopy(jArr, 0, jArr2, i, jArr.length);
    }

    public static byte[] Z(int i, byte[] bArr, int i2) {
        zno1.f(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static Object[] a0(int i, int i2, Object[] objArr) {
        zno1.f(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    public static List b0(int i, Object[] objArr) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            hhg1.f(gvg.e(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return z6x.a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return Q0(objArr);
        }
        return length == 1 ? k4p1.x(objArr[length2 - 1]) : H(a0(length2 - length, length2, objArr));
    }

    public static void c0(int i, int[] iArr) {
        Arrays.fill(iArr, 0, i, -1);
    }

    public static void d0(long[] jArr, int i) {
        Arrays.fill(jArr, 0, i, 9223372034707292159L);
    }

    public static void e0(Object[] objArr, te70 te70Var, int i, int i2) {
        Arrays.fill(objArr, i, i2, te70Var);
    }

    public static void f0(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void g0(long[] jArr, long j) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    public static void h0(Object[] objArr, Object obj) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    public static List i0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object j0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        bhn0.t("Array is empty.");
        return null;
    }

    public static Object k0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static tr80 l0(int[] iArr) {
        return new tr80(0, iArr.length - 1, 1);
    }

    public static Integer m0(int i, int[] iArr) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object n0(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int o0(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int p0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void q0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, iu30 iu30Var) throws IOException {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            jhc1.l(sb, obj, iu30Var);
        }
        sb.append(charSequence3);
    }

    public static String r0(byte[] bArr, iu30 iu30Var, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            iu30Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (iu30Var != null) {
                sb.append((CharSequence) iu30Var.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String s0(Object[] objArr, String str, String str2, String str3, iu30 iu30Var, int i) throws IOException {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            iu30Var = null;
        }
        StringBuilder sb = new StringBuilder();
        q0(objArr, sb, str4, str5, str6, "...", iu30Var);
        return sb.toString();
    }

    public static Object t0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        bhn0.t("Array is empty.");
        return null;
    }

    public static int u0(Object[] objArr, Object obj) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Integer v0(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static int w0(int[] iArr) {
        if (iArr.length == 0) {
            hhg1.k();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static byte[] x0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static int[] y0(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    public static Object[] z0(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        return objArrCopyOf;
    }
}
