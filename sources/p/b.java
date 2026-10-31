package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class b {
    public static final byte[] a = ryn1.m("0123456789abcdef");
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long a(nac nacVar, rhc rhcVar, long j, long j2, int i) {
        ip51 ip51Var;
        long j3 = j;
        long j4 = j2;
        long j5 = i;
        zod.u(rhcVar.d(), 0L, j5);
        if (i <= 0) {
            hhg1.n("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            hhg1.f(l1d.l(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbS = cy30.s(j3, "fromIndex > toIndex: ", " > ");
            sbS.append(j4);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        long j6 = nacVar.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (ip51Var = nacVar.a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                ip51Var = ip51Var.g;
                ip51Var.getClass();
                j6 -= (long) (ip51Var.c - ip51Var.b);
            }
            byte[] bArrH = rhcVar.h();
            byte b2 = bArrH[0];
            long jMin = Math.min(j4, (nacVar.b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = ip51Var.a;
                int iMin = (int) Math.min(ip51Var.c, (((long) ip51Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) ip51Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(ip51Var, i2 + 1, bArrH, 1, i)) {
                        return ((long) (i2 - ip51Var.b)) + j6;
                    }
                }
                j6 += (long) (ip51Var.c - ip51Var.b);
                ip51Var = ip51Var.f;
                ip51Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (ip51Var.c - ip51Var.b));
            if (j8 > j3) {
                break;
            }
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j7 = j8;
        }
        byte[] bArrH2 = rhcVar.h();
        byte b3 = bArrH2[0];
        long jMin2 = Math.min(j4, (nacVar.b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = ip51Var.a;
            int iMin2 = (int) Math.min(ip51Var.c, (((long) ip51Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) ip51Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(ip51Var, i3 + 1, bArrH2, 1, i)) {
                    return ((long) (i3 - ip51Var.b)) + j7;
                }
            }
            j7 += (long) (ip51Var.c - ip51Var.b);
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(ip51 ip51Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = ip51Var.c;
        byte[] bArr2 = ip51Var.a;
        while (i2 < i3) {
            if (i == i4) {
                ip51Var = ip51Var.f;
                ip51Var.getClass();
                byte[] bArr3 = ip51Var.a;
                bArr2 = bArr3;
                i = ip51Var.b;
                i4 = ip51Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(nac nacVar, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (nacVar.g(j2) == 13) {
                String strG = nacVar.G(j2, nne.a);
                nacVar.skip(2L);
                return strG;
            }
        }
        String strG2 = nacVar.G(j, nne.a);
        nacVar.skip(1L);
        return strG2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e A[LOOP:0: B:8:0x0019->B:49:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[SYNTHETIC] */
    public static final int d(nac nacVar, cqq0 cqq0Var, boolean z) {
        int i;
        int i2;
        int i3;
        ip51 ip51Var;
        int i4;
        ip51 ip51Var2 = nacVar.a;
        if (ip51Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = ip51Var2.a;
        int i5 = ip51Var2.b;
        int i6 = ip51Var2.c;
        int[] iArr = cqq0Var.b;
        ip51 ip51Var3 = ip51Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (ip51Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            ip51Var3 = ip51Var3.f;
                            ip51Var3.getClass();
                            int i16 = ip51Var3.b;
                            byte[] bArr2 = ip51Var3.a;
                            i2 = ip51Var3.c;
                            if (ip51Var3 == ip51Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                ip51Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        ip51Var3.getClass();
                        ip51 ip51Var4 = ip51Var3.f;
                        ip51Var4.getClass();
                        i3 = ip51Var4.b;
                        byte[] bArr3 = ip51Var4.a;
                        i4 = ip51Var4.c;
                        if (ip51Var4 != ip51Var2) {
                            ip51Var = ip51Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            ip51Var = null;
                        }
                    } else {
                        ip51Var = ip51Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        ip51Var3 = ip51Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    ip51Var3 = ip51Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
