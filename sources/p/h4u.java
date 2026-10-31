package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h4u {
    public int[] a;
    public int b;

    public h4u(int i, int[] iArr) {
        int length = iArr.length;
        if (length == 4) {
            this.b = i;
            this.a = iArr;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 44);
        String strA = bap1.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k");
        String strA2 = bap1.a("a0CvvBEaN339T0zNlXk=");
        sb.append(strA);
        sb.append(length);
        sb.append(strA2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long d(boolean z, int i, int i2, int i3, int i4) {
        int i5 = z ? i3 : i4;
        if (z) {
            i3 = i4;
        }
        if (i < i2) {
            return e6p1.e(i, i);
        }
        if (i == i2) {
            return i5 == 0 ? e6p1.e(i2, i3 + i2) : e6p1.e(i2, i2);
        }
        if (i < i2 + i5) {
            return i3 == 0 ? e6p1.e(i2, i2) : e6p1.e(i2, i3 + i2);
        }
        int i6 = (i - i5) + i3;
        return e6p1.e(i6, i6);
    }

    public int[] a() {
        return this.a;
    }

    public int b(int i) {
        return this.a[i + this.b];
    }

    public long c(int i, boolean z) {
        int iMax;
        int[] iArr = this.a;
        int i2 = this.b;
        if (i2 < 0) {
            iMax = i;
        } else if (z) {
            iMax = i;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                long jD = d(z, i, i5, i6, i7);
                long jD2 = d(z, iMax, i5, i6, i7);
                int i8 = nbe1.c;
                i = Math.min((int) (jD >> 32), (int) (jD2 >> 32));
                iMax = Math.max((int) (jD & 4294967295L), (int) (jD2 & 4294967295L));
            }
        } else {
            iMax = i;
            for (int i9 = i2 - 1; -1 < i9; i9--) {
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                int i12 = iArr[i10 + 1];
                int i13 = iArr[i10 + 2];
                long jD3 = d(z, i, i11, i12, i13);
                long jD4 = d(z, iMax, i11, i12, i13);
                int i14 = nbe1.c;
                i = Math.min((int) (jD3 >> 32), (int) (jD4 >> 32));
                iMax = Math.max((int) (jD3 & 4294967295L), (int) (jD4 & 4294967295L));
            }
        }
        return e6p1.e(i, iMax);
    }

    public void e(int i, int i2, int i3) {
        int i4 = this.b;
        int[] iArrCopyOf = this.a;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.a = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.b = i5;
    }

    public void f(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int[] iArrCopyOf = this.a;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.a = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.b = i6;
    }

    public void g(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    j(i3, i4);
                }
            }
            j(i3 + 3, i2);
            g(i, i3);
            g(i3 + 6, i2);
        }
    }

    public void h(int i, int i2, int i3) {
        if (i3 < 0) {
            tf80.a("Expected newLen to be ≥ 0, was " + i3);
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(iMin, i2) - iMin;
        if (iMax >= 2 || iMax != i3) {
            int i4 = this.b + 1;
            int[] iArrCopyOf = this.a;
            if (i4 > iArrCopyOf.length / 3) {
                iArrCopyOf = Arrays.copyOf(this.a, Math.max(i4 * 2, (iArrCopyOf.length / 3) * 2) * 3);
                this.a = iArrCopyOf;
            }
            int i5 = this.b * 3;
            iArrCopyOf[i5] = iMin;
            iArrCopyOf[i5 + 1] = iMax;
            iArrCopyOf[i5 + 2] = i3;
            this.b = i4;
        }
    }

    public void i(int i, int i2) {
        this.a[i + this.b] = i2;
    }

    public void j(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void k(byte[] bArr, int i) {
        h4u h4uVar = this;
        int i2 = 0;
        int i3 = 2055825325;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        char c = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c2 = 0;
        char c3 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i3 != 1173404700) {
            if (i3 == 1523783727) {
                int i16 = (-350379027) + i3;
                i3 += 370337140;
                if (i2 == i13) {
                    i3 = i16;
                }
                h4uVar = this;
            } else if (i3 != 2055825325) {
                int[] iArr = h4uVar.a;
                i4 += (((i11 << i10) ^ (i11 >>> i12)) + i11) ^ (i2 + iArr[i2 & i9]);
                i2 += i14;
                i11 += (((i4 << i10) ^ (i4 >>> i12)) + i4) ^ (iArr[(i2 >>> i15) & i9] + i2);
                i3 -= 370337140;
            } else {
                i4 = h4uVar.b;
                i3 -= 532041598;
                i9 = 3;
                i7 = 255;
                c3 = 7;
                c2 = 6;
                c = 2;
                i5 = 24;
                i15 = 11;
                i14 = 1340169305;
                i12 = 5;
                i10 = 4;
                i13 = -64255200;
                i6 = 16;
                i8 = 8;
                i11 = i;
                i2 = 0;
            }
        }
        bArr[0] = (byte) (i4 >> i5);
        bArr[1] = (byte) ((((i4 >> i6) & i7) << i5) >> i5);
        bArr[c] = (byte) ((((i4 >> i8) & i7) << i5) >> i5);
        bArr[i9] = (byte) (((i4 & i7) << i5) >> i5);
        bArr[i10] = (byte) (i11 >> i5);
        bArr[i12] = (byte) ((((i11 >> i6) & i7) << i5) >> i5);
        bArr[c2] = (byte) ((((i11 >> i8) & i7) << i5) >> i5);
        bArr[c3] = (byte) (((i11 & i7) << i5) >> i5);
    }

    public h4u() {
        this.a = new int[30];
    }

    public h4u(int i, byte b) {
        switch (b) {
            case 1:
                this.a = new int[i];
                break;
            default:
                int[] iArr = new int[i];
                this.a = iArr;
                this.b = iArr.length / 2;
                break;
        }
    }
}
