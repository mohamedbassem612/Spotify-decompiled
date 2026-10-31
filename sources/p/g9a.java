package p;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class g9a {
    public static final byte[] a;
    public static final Set b;
    public static final char[] c;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        a = bArr;
        e9a e9aVar = new e9a();
        for (byte b2 : bArr) {
            e9aVar.add(Character.valueOf((char) (b2 & 255)));
        }
        b = Collections.unmodifiableSet(e9aVar);
        c = new char[]{'7', 'N', '4', '2', 'd', 'g', 'm', '5', 't', 'F', 'L', 'K', '9', 'N', '8', 'M', 'T', '7', 'f', 'H', 'C', '7'};
    }

    public static String a(byte[] bArr) {
        int i;
        byte[] bArr2;
        int i2;
        int i3;
        if (bArr.length != 16) {
            hhg1.n("Not a 16 byte value");
            return null;
        }
        int i4 = 0;
        int iC = c(bArr, 0);
        int iC2 = c(bArr, 4);
        int iC3 = c(bArr, 8);
        int iC4 = c(bArr, 12);
        byte[] bArr3 = new byte[22];
        while (true) {
            i = 6;
            bArr2 = a;
            if (i4 >= 6) {
                break;
            }
            long j = ((long) iC) & 4294967295L;
            iC = (int) (j / 62);
            long j2 = ((j % 62) << 32) | (((long) iC2) & 4294967295L);
            iC2 = (int) (j2 / 62);
            long j3 = ((j2 % 62) << 32) | (((long) iC3) & 4294967295L);
            iC3 = (int) (j3 / 62);
            long j4 = ((j3 % 62) << 32) | (((long) iC4) & 4294967295L);
            iC4 = (int) (j4 / 62);
            bArr3[21 - i4] = bArr2[(int) (j4 % 62)];
            i4++;
        }
        while (true) {
            i2 = 11;
            if (i >= 11) {
                break;
            }
            long j5 = ((long) iC2) & 4294967295L;
            iC2 = (int) (j5 / 62);
            long j6 = ((j5 % 62) << 32) | (((long) iC3) & 4294967295L);
            iC3 = (int) (j6 / 62);
            long j7 = ((j6 % 62) << 32) | (((long) iC4) & 4294967295L);
            bArr3[21 - i] = bArr2[(int) (j7 % 62)];
            i++;
            iC4 = (int) (j7 / 62);
        }
        while (true) {
            if (i2 >= 17) {
                break;
            }
            long j8 = ((long) iC3) & 4294967295L;
            iC3 = (int) (j8 / 62);
            long j9 = ((j8 % 62) << 32) | (((long) iC4) & 4294967295L);
            iC4 = (int) (j9 / 62);
            bArr3[21 - i2] = bArr2[(int) (j9 % 62)];
            i2++;
        }
        for (i3 = 17; i3 < 22; i3++) {
            bArr3[21 - i3] = bArr2[iC4 % 62];
            iC4 /= 62;
        }
        return new String(bArr3, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    public static boolean b(String str) {
        char c2;
        boolean zIsUpperCase;
        if (str == null || 22 != str.length()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < 22; i++) {
            char cCharAt = str.charAt(i);
            if (!b.contains(Character.valueOf(cCharAt))) {
                return false;
            }
            if (!z && cCharAt != (c2 = c[i])) {
                if ((c2 < '0' || c2 > '9') && (cCharAt < '0' || cCharAt > '9')) {
                    if (Character.isUpperCase(c2) != Character.isUpperCase(cCharAt)) {
                        zIsUpperCase = Character.isUpperCase(c2);
                    } else if (c2 > cCharAt) {
                        zIsUpperCase = true;
                    } else {
                        zIsUpperCase = false;
                    }
                } else if (c2 > cCharAt) {
                    zIsUpperCase = true;
                } else {
                    zIsUpperCase = false;
                }
                if (!zIsUpperCase) {
                    return false;
                }
                z = true;
            }
        }
        return true;
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
