package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class f9a {
    public static final byte[] a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(nne.a);

    public static final String a(byte[] bArr) {
        int i;
        byte[] bArr2;
        int i2;
        int i3;
        if (bArr.length != 16) {
            hhg1.n("Not a 16 byte value");
            return null;
        }
        int i4 = 0;
        int iB = b(bArr, 0);
        int iB2 = b(bArr, 4);
        int iB3 = b(bArr, 8);
        int iB4 = b(bArr, 12);
        byte[] bArr3 = new byte[22];
        while (true) {
            i = 6;
            bArr2 = a;
            if (i4 >= 6) {
                break;
            }
            long j = ((long) iB) & 4294967295L;
            iB = (int) (j / 62);
            long j2 = ((j % 62) << 32) | (((long) iB2) & 4294967295L);
            iB2 = (int) (j2 / 62);
            long j3 = ((j2 % 62) << 32) | (((long) iB3) & 4294967295L);
            iB3 = (int) (j3 / 62);
            long j4 = ((j3 % 62) << 32) | (((long) iB4) & 4294967295L);
            iB4 = (int) (j4 / 62);
            bArr3[21 - i4] = bArr2[(int) (j4 % 62)];
            i4++;
        }
        while (true) {
            i2 = 11;
            if (i >= 11) {
                break;
            }
            long j5 = ((long) iB2) & 4294967295L;
            iB2 = (int) (j5 / 62);
            long j6 = ((j5 % 62) << 32) | (((long) iB3) & 4294967295L);
            iB3 = (int) (j6 / 62);
            long j7 = ((j6 % 62) << 32) | (((long) iB4) & 4294967295L);
            bArr3[21 - i] = bArr2[(int) (j7 % 62)];
            i++;
            iB4 = (int) (j7 / 62);
        }
        while (true) {
            if (i2 >= 17) {
                break;
            }
            long j8 = ((long) iB3) & 4294967295L;
            iB3 = (int) (j8 / 62);
            long j9 = ((j8 % 62) << 32) | (((long) iB4) & 4294967295L);
            iB4 = (int) (j9 / 62);
            bArr3[21 - i2] = bArr2[(int) (j9 % 62)];
            i2++;
        }
        for (i3 = 17; i3 < 22; i3++) {
            bArr3[21 - i3] = bArr2[iB4 % 62];
            iB4 /= 62;
        }
        return new String(bArr3, nne.a);
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
