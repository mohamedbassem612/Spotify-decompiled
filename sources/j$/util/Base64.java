package j$.util;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public class Base64 {

    /* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        static {
            int[] iArr = new int[256];
            a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                a[Encoder.c[i]] = i;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                b[Encoder.d[i2]] = i2;
            }
            b[61] = -2;
            c = new Decoder();
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:55:0x0106  */
        /* JADX WARN: Code duplicated, block: B:76:0x00b3 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
        
            if (r10 != 18) goto L58;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:50:0x00ce, please report this as an issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] decode(java.lang.String r21) {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
    public static class Encoder {
        public static final char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder e = new Encoder(false, true);
        public static final Encoder f = new Encoder(true, true);
        public final boolean a;
        public final boolean b;

        public Encoder(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public String encodeToString(byte[] bArr) {
            int i;
            int length = bArr.length;
            boolean z = this.b;
            if (z) {
                i = ((length + 2) / 3) * 4;
            } else {
                int i2 = length % 3;
                i = ((length / 3) * 4) + (i2 == 0 ? 0 : i2 + 1);
            }
            byte[] bArrCopyOf = new byte[i];
            int length2 = bArr.length;
            char[] cArr = c;
            char[] cArr2 = d;
            boolean z2 = this.a;
            char[] cArr3 = z2 ? cArr2 : cArr;
            int i3 = (length2 / 3) * 3;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(i4 + i3, i3);
                char[] cArr4 = z2 ? cArr2 : cArr;
                int i6 = i4;
                int i7 = i5;
                while (i6 < iMin) {
                    int i8 = i6 + 2;
                    boolean z3 = z2;
                    int i9 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
                    i6 += 3;
                    int i10 = i9 | (bArr[i8] & 255);
                    bArrCopyOf[i7] = (byte) cArr4[(i10 >>> 18) & 63];
                    bArrCopyOf[i7 + 1] = (byte) cArr4[(i10 >>> 12) & 63];
                    int i11 = i7 + 3;
                    bArrCopyOf[i7 + 2] = (byte) cArr4[(i10 >>> 6) & 63];
                    i7 += 4;
                    bArrCopyOf[i11] = (byte) cArr4[i10 & 63];
                    z2 = z3;
                }
                boolean z4 = z2;
                int i12 = ((iMin - i4) / 3) * 4;
                i5 += i12;
                if (i12 == -1 && iMin < length2) {
                    throw null;
                }
                z2 = z4;
                i4 = iMin;
            }
            if (i4 < length2) {
                int i13 = i4 + 1;
                int i14 = bArr[i4] & 255;
                int i15 = i5 + 1;
                bArrCopyOf[i5] = (byte) cArr3[i14 >> 2];
                if (i13 == length2) {
                    int i16 = i5 + 2;
                    bArrCopyOf[i15] = (byte) cArr3[(i14 << 4) & 63];
                    if (z) {
                        int i17 = i5 + 3;
                        bArrCopyOf[i16] = 61;
                        i5 += 4;
                        bArrCopyOf[i17] = 61;
                    } else {
                        i5 = i16;
                    }
                } else {
                    int i18 = bArr[i13] & 255;
                    bArrCopyOf[i15] = (byte) cArr3[((i14 << 4) & 63) | (i18 >> 4)];
                    int i19 = i5 + 3;
                    bArrCopyOf[i5 + 2] = (byte) cArr3[(i18 << 2) & 63];
                    if (z) {
                        i5 += 4;
                        bArrCopyOf[i19] = 61;
                    } else {
                        i5 = i19;
                    }
                }
            }
            if (i5 != i) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
            }
            return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
        }

        public Encoder withoutPadding() {
            return !this.b ? this : new Encoder(this.a, false);
        }
    }

    public static Encoder getEncoder() {
        return Encoder.e;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.c;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.f;
    }
}
