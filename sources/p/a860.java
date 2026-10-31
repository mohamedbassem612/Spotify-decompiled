package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class a860 {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final long[] d;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        c = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        d = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        tw20.t(z4h1.d(j), "The resulting string length is too big: ");
        return 0;
    }

    public static final void b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            i(str, i, i2, 1, "at least");
            throw null;
        }
        if (i3 > 8) {
            int i4 = (i3 + i) - 8;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbR = cy30.r(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbR.append(str.charAt(i));
                    sbR.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbR.toString());
                }
                i++;
            }
        }
    }

    public static final int c(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    public static byte[] d(String str) {
        byte[] bArr;
        d860 d860Var = d860.d;
        int length = str.length();
        eqr0.o(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        b860 b860Var = d860Var.b;
        if (b860Var.a) {
            if (!b860Var.b) {
                long j = length;
                int i = (int) (j / 2);
                if (((long) i) * 2 != j) {
                    bArr = null;
                } else {
                    bArr = new byte[i];
                    int i2 = i - 1;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr[i4] = f(i3, str);
                        i3 += 2;
                    }
                    bArr[i2] = f(i3, str);
                }
            } else if ((length & 1) != 0) {
                bArr = null;
            } else {
                int i5 = length >> 1;
                bArr = new byte[i5];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = f(i6, str);
                    i6 += 2;
                }
            }
            if (bArr != null) {
                return bArr;
            }
        }
        boolean z = b860Var.c;
        if (length <= 0) {
            hhg1.n("Failed requirement.");
            return null;
        }
        long j2 = length;
        long jL = l(1, j2, 4294967294L);
        long j3 = j2 - (4294967295L * jL);
        long jL2 = l(2, j3, 4294967294L);
        long j4 = j3 - (4294967296L * jL2);
        long jL3 = l(0, j4, 2L);
        int i8 = (int) ((jL2 * 2147483647L) + (jL * 2147483647L) + jL3 + ((long) (j4 - (2 * jL3) > 0 ? 1 : 0)));
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            if (i11 == Integer.MAX_VALUE) {
                if (str.charAt(i9) == '\r') {
                    int i13 = i9 + 1;
                    i9 = (i13 >= length || str.charAt(i13) != '\n') ? i13 : i9 + 2;
                } else {
                    if (str.charAt(i9) != '\n') {
                        StringBuilder sbR = cy30.r(i9, "Expected a new line at index ", ", but was ");
                        sbR.append(str.charAt(i9));
                        throw new NumberFormatException(sbR.toString());
                    }
                    i9++;
                }
                i11 = 0;
                i12 = 0;
            } else if (i12 == Integer.MAX_VALUE) {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (!eth.q("  ".charAt(i14), str.charAt(i9 + i14), z)) {
                        int i15 = 2 + i9;
                        if (i15 <= length) {
                            length = i15;
                        }
                        throw new NumberFormatException(ab80.n("Expected group separator \"  \" at index ", ", but was ", i9, str.substring(i9, length)));
                    }
                }
                i9 += 2;
                i12 = 0;
            }
            i11++;
            i12++;
            if (length - 2 < i9) {
                i(str, i9, length, 2, "exactly");
                throw null;
            }
            bArr2[i10] = f(i9, str);
            i9 += 2;
            i10++;
        }
        return i10 == i8 ? bArr2 : Arrays.copyOf(bArr2, i10);
    }

    public static int e(String str) {
        d860 d860Var = d860.d;
        int length = str.length();
        eqr0.o(0, length, str.length());
        if (d860Var.c.a) {
            b(0, length, str);
            return g(length, str);
        }
        if (length <= 0) {
            throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(str.substring(0, length)));
        }
        b(0, length, str);
        return g(length, str);
    }

    public static final byte f(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = c)[cCharAt]) < 0) {
            h(i, str);
            throw null;
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        h(i4, str);
        throw null;
    }

    public static final int g(int i, String str) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 << 4;
            char cCharAt = str.charAt(i4);
            if ((cCharAt >>> '\b') != 0 || (i2 = c[cCharAt]) < 0) {
                h(i4, str);
                throw null;
            }
            i3 = i5 | i2;
        }
        return i3;
    }

    public static final void h(int i, String str) {
        StringBuilder sbR = cy30.r(i, "Expected a hexadecimal digit at index ", ", but was ");
        sbR.append(str.charAt(i));
        throw new NumberFormatException(sbR.toString());
    }

    public static final void i(String str, int i, int i2, int i3, String str2) {
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + str.substring(i, i2) + "\" of length " + (i2 - i));
    }

    public static final int j(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static final String k(byte[] bArr, d860 d860Var) {
        int length = bArr.length;
        eqr0.o(0, length, bArr.length);
        if (length == 0) {
            return "";
        }
        int[] iArr = d860Var.a ? b : a;
        b860 b860Var = d860Var.b;
        if (b860Var.a) {
            if (b860Var.b) {
                char[] cArr = new char[a(((long) length) * 2)];
                int iC = 0;
                for (int i = 0; i < length; i++) {
                    iC = c(bArr, i, iArr, cArr, iC);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                hhg1.n("Failed requirement.");
                return null;
            }
            char[] cArr2 = new char[a(((long) length) * 2)];
            int iJ = j("", cArr2, c(bArr, 0, iArr, cArr2, j("", cArr2, 0)));
            for (int i2 = 1; i2 < length; i2++) {
                iJ = j("", cArr2, c(bArr, i2, iArr, cArr2, j("", cArr2, j("", cArr2, iJ))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            hhg1.n("Failed requirement.");
            return null;
        }
        int i3 = (length - 1) / Integer.MAX_VALUE;
        int i4 = length % Integer.MAX_VALUE;
        if (i4 == 0) {
            i4 = Integer.MAX_VALUE;
        }
        int iA = a((2 * ((long) length)) + (((long) ((i4 - 1) / Integer.MAX_VALUE)) * 2) + ((long) i3));
        char[] cArr3 = new char[iA];
        int iJ2 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 == Integer.MAX_VALUE) {
                cArr3[iJ2] = '\n';
                i6 = 0;
                iJ2++;
                i5 = 0;
            } else if (i6 == Integer.MAX_VALUE) {
                iJ2 = j("  ", cArr3, iJ2);
                i6 = 0;
            }
            if (i6 != 0) {
                iJ2 = j("", cArr3, iJ2);
            }
            iJ2 = j("", cArr3, c(bArr, i7, iArr, cArr3, j("", cArr3, iJ2)));
            i6++;
            i5++;
        }
        if (iJ2 == iA) {
            return new String(cArr3);
        }
        eg.m("Check failed.");
        return null;
    }

    public static final long l(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
