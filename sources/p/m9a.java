package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m9a extends j9a {
    public static final byte[] i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public final byte[] b;
    public int c;
    public int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final byte[] h;

    public m9a() {
        ((j9a) this).a = null;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = i;
        this.b = new byte[2];
        this.c = 0;
        this.d = -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0047  */
    public final boolean j1(byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5;
        byte b;
        byte b2;
        byte b3;
        int i6;
        byte[] bArr2 = (byte[]) ((j9a) this).a;
        int i7 = this.d;
        int i8 = this.c;
        byte[] bArr3 = this.b;
        char c = 2;
        if (i8 != 1) {
            if (i8 == 2 && 1 <= i2) {
                i3 = ((bArr3[0] & 255) << 16) | ((bArr3[1] & 255) << 8) | (bArr[0] & 255);
                this.c = 0;
                i4 = 1;
            } else {
                i4 = 0;
                i3 = -1;
            }
        } else if (2 <= i2) {
            i3 = ((bArr3[0] & 255) << 16) | ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            this.c = 0;
            i4 = 2;
        } else {
            i4 = 0;
            i3 = -1;
        }
        byte b4 = 13;
        boolean z = this.g;
        int i9 = 0;
        byte[] bArr4 = this.h;
        if (i3 != -1) {
            bArr2[0] = bArr4[(i3 >> 18) & 63];
            bArr2[1] = bArr4[(i3 >> 12) & 63];
            bArr2[2] = bArr4[(i3 >> 6) & 63];
            bArr2[3] = bArr4[i3 & 63];
            i7--;
            if (i7 == 0) {
                if (z) {
                    bArr2[4] = 13;
                    i6 = 5;
                } else {
                    i6 = 4;
                }
                i5 = i6 + 1;
                bArr2[i6] = 10;
                i7 = 19;
            } else {
                i5 = 4;
            }
        } else {
            i5 = 0;
        }
        while (true) {
            i4 += 3;
            if (i4 > i2) {
                break;
            }
            char c2 = c;
            byte b5 = b4;
            int i10 = ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8) | (bArr[i4 + 2] & 255);
            bArr2[i5] = bArr4[(i10 >> 18) & 63];
            bArr2[i5 + 1] = bArr4[(i10 >> 12) & 63];
            bArr2[i5 + 2] = bArr4[(i10 >> 6) & 63];
            bArr2[i5 + 3] = bArr4[i10 & 63];
            int i11 = i5 + 4;
            i7--;
            if (i7 == 0) {
                if (z) {
                    bArr2[i11] = b5;
                    i11 = i5 + 5;
                }
                i5 = i11 + 1;
                bArr2[i11] = 10;
                i7 = 19;
            } else {
                i5 = i11;
            }
            c = c2;
            b4 = b5;
        }
        byte b6 = b4;
        int i12 = this.c;
        int i13 = i4 - i12;
        int i14 = i2 - 1;
        boolean z2 = this.e;
        boolean z3 = this.f;
        if (i13 == i14) {
            if (i12 > 0) {
                b3 = bArr3[0];
                i9 = 1;
            } else {
                b3 = bArr[i4];
            }
            int i15 = (b3 & 255) << 4;
            this.c = i12 - i9;
            bArr2[i5] = bArr4[(i15 >> 6) & 63];
            int i16 = i5 + 2;
            bArr2[i5 + 1] = bArr4[i15 & 63];
            if (z2) {
                bArr2[i16] = 61;
                i16 = i5 + 4;
                bArr2[i5 + 3] = 61;
            }
            if (z3) {
                if (z) {
                    bArr2[i16] = b6;
                    i16++;
                }
                bArr2[i16] = 10;
            }
        } else if (i13 == i2 - 2) {
            if (i12 > 1) {
                b = bArr3[0];
                i9 = 1;
            } else {
                byte b7 = bArr[i4];
                i4++;
                b = b7;
            }
            int i17 = (b & 255) << 10;
            if (i12 > 0) {
                b2 = bArr3[i9];
                i9++;
            } else {
                b2 = bArr[i4];
            }
            int i18 = i17 | ((b2 & 255) << 2);
            this.c = i12 - i9;
            bArr2[i5] = bArr4[(i18 >> 12) & 63];
            bArr2[i5 + 1] = bArr4[(i18 >> 6) & 63];
            int i19 = i5 + 3;
            bArr2[i5 + 2] = bArr4[i18 & 63];
            if (z2) {
                bArr2[i19] = 61;
                i19 = i5 + 4;
            }
            if (z3) {
                if (z) {
                    bArr2[i19] = b6;
                    i19++;
                }
                bArr2[i19] = 10;
            }
        } else if (z3 && i5 > 0 && i7 != 19) {
            if (z) {
                bArr2[i5] = b6;
                i5++;
            }
            bArr2[i5] = 10;
        }
        this.d = i7;
        return true;
    }
}
