package p;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fcp1 {
    public static final qbp1 a = new qbp1(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final frl1 b = new frl1(new fqn1(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, false, 12), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, (byte) 23);
    public static final byte[] c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] a(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        frl1 frl1Var = new frl1((byte) 23);
        bym1 bym1Var = new bym1();
        for (i = 1; i < 64; i += 2) {
            qbp1 qbp1Var = new qbp1();
            g(qbp1Var, i / 2, bArr2[i]);
            bym1.k(bym1Var, frl1Var);
            d(frl1Var, bym1Var, qbp1Var);
        }
        fqn1 fqn1Var = new fqn1();
        fqn1.f(frl1Var, fqn1Var);
        f(frl1Var, fqn1Var);
        fqn1.f(frl1Var, fqn1Var);
        f(frl1Var, fqn1Var);
        fqn1.f(frl1Var, fqn1Var);
        f(frl1Var, fqn1Var);
        fqn1.f(frl1Var, fqn1Var);
        f(frl1Var, fqn1Var);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            qbp1 qbp1Var2 = new qbp1();
            g(qbp1Var2, i7 / 2, bArr2[i7]);
            bym1.k(bym1Var, frl1Var);
            d(frl1Var, bym1Var, qbp1Var2);
        }
        fqn1 fqn1Var2 = new fqn1(frl1Var);
        long[] jArr = new long[10];
        zqo1.A(jArr, (long[]) fqn1Var2.b);
        long[] jArr2 = new long[10];
        zqo1.A(jArr2, (long[]) fqn1Var2.c);
        long[] jArr3 = new long[10];
        zqo1.A(jArr3, (long[]) fqn1Var2.d);
        long[] jArr4 = new long[10];
        zqo1.A(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zqo1.w(jArr5, jArr2, jArr);
        zqo1.z(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zqo1.z(jArr6, jArr, jArr2);
        zqo1.z(jArr6, jArr6, hcp1.a);
        zqo1.v(jArr6, jArr6, jArr4);
        zqo1.x(jArr6, jArr6);
        if (MessageDigest.isEqual(zqo1.C(jArr5), zqo1.C(jArr6))) {
            return fqn1Var2.h();
        }
        eg.m("arithmetic error in scalar multiplication");
        return null;
    }

    public static byte[] b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) ygn1.c.a.zza("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i;
        bArrDigest[31] = (byte) (i | 64);
        return bArrDigest;
    }

    public static /* synthetic */ boolean c(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zqo1.y(jArr2);
        byte[] bArrC = zqo1.C(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrC[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void d(frl1 frl1Var, bym1 bym1Var, qbp1 qbp1Var) {
        fqn1 fqn1Var = (fqn1) bym1Var.b;
        fqn1 fqn1Var2 = (fqn1) frl1Var.b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) fqn1Var2.b;
        long[] jArr3 = (long[]) fqn1Var.c;
        long[] jArr4 = (long[]) fqn1Var.b;
        zqo1.v(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) fqn1Var2.c;
        zqo1.w(jArr5, jArr3, jArr4);
        zqo1.z(jArr5, jArr5, qbp1Var.b);
        long[] jArr6 = qbp1Var.a;
        long[] jArr7 = (long[]) fqn1Var2.d;
        zqo1.z(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) frl1Var.c;
        zqo1.z(jArr8, (long[]) bym1Var.c, qbp1Var.c);
        qbp1Var.a(jArr2, (long[]) fqn1Var.d);
        zqo1.v(jArr, jArr2, jArr2);
        zqo1.w(jArr2, jArr7, jArr5);
        zqo1.v(jArr5, jArr7, jArr5);
        zqo1.v(jArr7, jArr, jArr8);
        zqo1.w(jArr8, jArr, jArr8);
    }

    public static void e(frl1 frl1Var, bym1 bym1Var, qbp1 qbp1Var) {
        fqn1 fqn1Var = (fqn1) bym1Var.b;
        fqn1 fqn1Var2 = (fqn1) frl1Var.b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) fqn1Var2.b;
        long[] jArr3 = (long[]) fqn1Var.c;
        long[] jArr4 = (long[]) fqn1Var.b;
        zqo1.v(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) fqn1Var2.c;
        zqo1.w(jArr5, jArr3, jArr4);
        zqo1.z(jArr5, jArr5, qbp1Var.a);
        long[] jArr6 = qbp1Var.b;
        long[] jArr7 = (long[]) fqn1Var2.d;
        zqo1.z(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) frl1Var.c;
        zqo1.z(jArr8, (long[]) bym1Var.c, qbp1Var.c);
        qbp1Var.a(jArr2, (long[]) fqn1Var.d);
        zqo1.v(jArr, jArr2, jArr2);
        zqo1.w(jArr2, jArr7, jArr5);
        zqo1.v(jArr5, jArr7, jArr5);
        zqo1.w(jArr7, jArr, jArr8);
        zqo1.v(jArr8, jArr, jArr8);
    }

    public static void f(frl1 frl1Var, fqn1 fqn1Var) {
        fqn1 fqn1Var2 = (fqn1) frl1Var.b;
        long[] jArr = (long[]) fqn1Var2.b;
        long[] jArr2 = (long[]) fqn1Var.b;
        long[] jArr3 = new long[10];
        zqo1.A(jArr, jArr2);
        long[] jArr4 = (long[]) fqn1Var2.d;
        long[] jArr5 = (long[]) fqn1Var.c;
        zqo1.A(jArr4, jArr5);
        long[] jArr6 = (long[]) frl1Var.c;
        zqo1.A(jArr6, (long[]) fqn1Var.d);
        zqo1.v(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) fqn1Var2.c;
        zqo1.v(jArr7, jArr2, jArr5);
        zqo1.A(jArr3, jArr7);
        zqo1.v(jArr7, jArr4, jArr);
        zqo1.w(jArr4, jArr4, jArr);
        zqo1.w(jArr, jArr3, jArr7);
        zqo1.w(jArr6, jArr6, jArr4);
    }

    public static void g(qbp1 qbp1Var, int i, byte b2) {
        qbp1[][] qbp1VarArr = hcp1.d;
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        int i5 = (i4 ^ (-2)) & 255;
        int i6 = i5 & (i5 << 4);
        int i7 = i6 & (i6 << 2);
        qbp1Var.b(qbp1VarArr[i][0], (i7 & (i7 + i7)) >> 7);
        int i8 = (i4 ^ (-3)) & 255;
        int i9 = i8 & (i8 << 4);
        int i10 = i9 & (i9 << 2);
        qbp1Var.b(qbp1VarArr[i][1], (i10 & (i10 + i10)) >> 7);
        int i11 = (i4 ^ (-4)) & 255;
        int i12 = i11 & (i11 << 4);
        int i13 = i12 & (i12 << 2);
        qbp1Var.b(qbp1VarArr[i][2], (i13 & (i13 + i13)) >> 7);
        int i14 = (i4 ^ (-5)) & 255;
        int i15 = i14 & (i14 << 4);
        int i16 = i15 & (i15 << 2);
        qbp1Var.b(qbp1VarArr[i][3], (i16 & (i16 + i16)) >> 7);
        int i17 = (i4 ^ (-6)) & 255;
        int i18 = i17 & (i17 << 4);
        int i19 = i18 & (i18 << 2);
        qbp1Var.b(qbp1VarArr[i][4], (i19 & (i19 + i19)) >> 7);
        int i20 = (i4 ^ (-7)) & 255;
        int i21 = i20 & (i20 << 4);
        int i22 = i21 & (i21 << 2);
        qbp1Var.b(qbp1VarArr[i][5], (i22 & (i22 + i22)) >> 7);
        int i23 = (i4 ^ (-8)) & 255;
        int i24 = i23 & (i23 << 4);
        int i25 = i24 & (i24 << 2);
        qbp1Var.b(qbp1VarArr[i][6], (i25 & (i25 + i25)) >> 7);
        int i26 = (i4 ^ (-9)) & 255;
        int i27 = i26 & (i26 << 4);
        int i28 = i27 & (i27 << 2);
        qbp1Var.b(qbp1VarArr[i][7], (i28 & (i28 + i28)) >> 7);
        long[] jArr = qbp1Var.b;
        long[] jArr2 = qbp1Var.a;
        long[] jArr3 = qbp1Var.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i29 = 0; i29 < jArrCopyOf3.length; i29++) {
            jArrCopyOf3[i29] = -jArrCopyOf3[i29];
        }
        cwl1.s0(jArr2, jArrCopyOf, i2);
        cwl1.s0(jArr, jArrCopyOf2, i2);
        cwl1.s0(jArr3, jArrCopyOf3, i2);
    }

    public static byte[] h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 > 15) {
                            int i7 = b3 - i5;
                            if (i7 < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) i7;
                            while (i < 256) {
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long i(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    public static long j(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | i(bArr, i);
    }
}
