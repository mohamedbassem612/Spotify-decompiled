package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jgc {
    public static final int[] c;
    public byte[] a = new byte[32];
    public int b;

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        c = iArr;
    }

    public final void a(int i, long j) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            int i3 = this.b;
            if (i2 >= i) {
                bArr[i3 + i] = (byte) j;
                this.b = i + 1 + i3;
                return;
            } else {
                bArr[i3 + i2] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i2++;
            }
        }
    }

    public final void b(int i) {
        int i2 = this.b + i;
        if (i2 <= this.a.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        f46.U(0, 0, 14, this.a, bArr);
        this.a = bArr;
    }

    public final void c(int i) {
        b(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    public final void d(long j) {
        b(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }
}
