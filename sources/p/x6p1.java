package p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x6p1 extends bno1 {
    public static final x6p1 c = new x6p1();

    public static void A(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jA = d8p1.a(bArr, i) + j;
        long jA2 = d8p1.a(bArr, i + 8);
        long jA3 = d8p1.a(bArr, i + 16);
        long jA4 = d8p1.a(bArr, i + 24);
        long j3 = jA2 + jA + jA3;
        long jRotateRight = Long.rotateRight(j3, 23) + Long.rotateRight(j2 + jA + jA4, 51);
        jArr[0] = j3 + jA4;
        jArr[1] = jRotateRight + jA;
    }

    public final String toString() {
        return "Hashing.fingerprint2011()";
    }

    public final g7p1 z(String str) {
        long j;
        char c2;
        long j2;
        long j3;
        long j4;
        long jRotateRight;
        long j5;
        int i;
        int i2;
        byte[] bytes = str.toString().getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ulo1.y(0, length, bytes.length);
        if (length <= 32) {
            long j6 = (((long) length) * (-4132994306676758123L)) ^ (-1397348546323613475L);
            int i3 = 0;
            while (true) {
                i2 = length & (-8);
                if (i3 >= i2) {
                    break;
                }
                long jA = d8p1.a(bytes, i3) * (-4132994306676758123L);
                j6 = (j6 ^ ((jA ^ (jA >>> 47)) * (-4132994306676758123L))) * (-4132994306676758123L);
                i3 += 8;
            }
            int i4 = length & 7;
            if (i4 != 0) {
                r7p1 r7p1Var = d8p1.a;
                int iMin = Math.min(i4, 8);
                long j7 = 0;
                for (int i5 = 0; i5 < iMin; i5++) {
                    j7 |= (((long) bytes[i2 + i5]) & 255) << (i5 * 8);
                }
                j = 0;
                j6 = (j6 ^ j7) * (-4132994306676758123L);
            } else {
                j = 0;
            }
            long j8 = (j6 ^ (j6 >>> 47)) * (-4132994306676758123L);
            j5 = j8 ^ (j8 >>> 47);
            i = 8;
            c2 = '/';
            j2 = -6505348102511208375L;
        } else {
            j = 0;
            int i6 = 37;
            if (length <= 64) {
                long jA2 = d8p1.a(bytes, 24);
                int i7 = length - 16;
                j2 = -6505348102511208375L;
                long jA3 = ((((long) length) + d8p1.a(bytes, i7)) * (-6505348102511208375L)) + d8p1.a(bytes, 0);
                long jRotateRight2 = Long.rotateRight(jA3 + jA2, 52);
                long jRotateRight3 = Long.rotateRight(jA3, 37);
                long jA4 = d8p1.a(bytes, 8) + jA3;
                long jRotateRight4 = Long.rotateRight(jA4, 7) + jRotateRight3;
                long jA5 = d8p1.a(bytes, 16) + jA4;
                long j9 = jA2 + jA5;
                c2 = '/';
                long jRotateRight5 = Long.rotateRight(jA5, 31) + jRotateRight2;
                long jA6 = d8p1.a(bytes, length - 32) + d8p1.a(bytes, 16);
                long jA7 = d8p1.a(bytes, length - 8);
                long jRotateRight6 = Long.rotateRight(jA6 + jA7, 52);
                long jRotateRight7 = Long.rotateRight(jA6, 37);
                long jA8 = d8p1.a(bytes, length - 24) + jA6;
                long jRotateRight8 = Long.rotateRight(jA8, 7) + jRotateRight7;
                long jA9 = d8p1.a(bytes, i7) + jA8;
                long j10 = jRotateRight5 + jRotateRight4;
                long jRotateRight9 = ((Long.rotateRight(jA9, 31) + jRotateRight6 + jRotateRight8 + j9) * (-4288712594273399085L)) + ((jA9 + jA7 + j10) * (-6505348102511208375L));
                long j11 = ((jRotateRight9 ^ (jRotateRight9 >>> 47)) * (-6505348102511208375L)) + j10;
                j5 = (-4288712594273399085L) * (j11 ^ (j11 >>> 47));
            } else {
                c2 = '/';
                j2 = -6505348102511208375L;
                long jA10 = d8p1.a(bytes, 0);
                long jA11 = d8p1.a(bytes, length - 16) ^ (-8261664234251669945L);
                long jA12 = d8p1.a(bytes, length - 56) ^ (-6505348102511208375L);
                long j12 = length;
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                A(bytes, length - 64, j12, jA11, jArr);
                A(bytes, length - 32, j12 * (-8261664234251669945L), -6505348102511208375L, jArr2);
                long j13 = jArr[1];
                long j14 = ((j13 ^ (j13 >>> 47)) * (-8261664234251669945L)) + jA12;
                long jRotateRight10 = Long.rotateRight(j14 + jA10, 39) * (-8261664234251669945L);
                int i8 = 33;
                long jRotateRight11 = Long.rotateRight(jA11, 33) * (-8261664234251669945L);
                int i9 = (length - 1) & (-64);
                int i10 = 0;
                while (true) {
                    long jRotateRight12 = Long.rotateRight(d8p1.a(bytes, i10 + 16) + jRotateRight10 + jRotateRight11 + jArr[0], i6) * (-8261664234251669945L);
                    long jRotateRight13 = Long.rotateRight(d8p1.a(bytes, i10 + 48) + jRotateRight11 + jArr[1], 42) * (-8261664234251669945L);
                    j3 = jRotateRight12 ^ jArr2[1];
                    j4 = jRotateRight13 ^ jArr[0];
                    jRotateRight = Long.rotateRight(j14 ^ jArr2[0], i8);
                    int i11 = i8;
                    int i12 = i10;
                    A(bytes, i12, jArr[1] * (-8261664234251669945L), j3 + jArr2[0], jArr);
                    A(bytes, i12 + 32, jRotateRight + jArr2[1], j4, jArr2);
                    i10 = i12 + 64;
                    i9 -= 64;
                    if (i9 == 0) {
                        break;
                    }
                    jRotateRight11 = j4;
                    i8 = i11;
                    j14 = j3;
                    jRotateRight10 = jRotateRight;
                    i6 = 37;
                }
                long j15 = jArr[0];
                long j16 = (jArr2[0] ^ j15) * (-4132994306676758123L);
                long j17 = (j15 ^ (j16 ^ (j16 >>> 47))) * (-4132994306676758123L);
                long j18 = ((j17 ^ (j17 >>> 47)) * (-4132994306676758123L)) + ((j4 ^ (j4 >>> 47)) * (-8261664234251669945L)) + j3;
                long j19 = jArr[1];
                long j20 = (jArr2[1] ^ j19) * (-4132994306676758123L);
                long j21 = (j19 ^ (j20 ^ (j20 >>> 47))) * (-4132994306676758123L);
                long j22 = ((((j21 ^ (j21 >>> 47)) * (-4132994306676758123L)) + jRotateRight) ^ j18) * (-4132994306676758123L);
                long j23 = (j18 ^ (j22 ^ (j22 >>> 47))) * (-4132994306676758123L);
                j5 = (j23 ^ (j23 >>> 47)) * (-4132994306676758123L);
            }
            i = 8;
        }
        long jA13 = length >= i ? d8p1.a(bytes, 0) : j2;
        long jA14 = j5 + (length >= 9 ? d8p1.a(bytes, length - 8) : j2);
        long j24 = (jA13 ^ jA14) * (-4132994306676758123L);
        long j25 = ((j24 ^ (j24 >>> c2)) ^ jA14) * (-4132994306676758123L);
        long j26 = (j25 ^ (j25 >>> c2)) * (-4132994306676758123L);
        if (j26 == j) {
            j26 -= 2;
        } else if (j26 == 1) {
            j26 = 1;
            j26 -= 2;
        }
        return new e7p1(j26);
    }
}
