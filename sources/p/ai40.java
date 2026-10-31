package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ai40 {
    public static final ai40 g = new ai40(4201, 4096, 1);
    public static final ai40 h = new ai40(1033, 1024, 1);
    public static final ai40 i = new ai40(67, 64, 1);
    public static final ai40 j = new ai40(19, 16, 1);
    public static final ai40 k = new ai40(285, 256, 0);
    public static final ai40 l = new ai40(301, 256, 1);
    public final int[] a;
    public final int[] b;
    public final bi40 c;
    public final short d;
    public final short e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ai40(int i2, int i3, int i4) {
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2 ? 1 : 0) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new bi40(this, new int[]{0});
    }

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return l1d.o(sb, this.d, ')');
    }
}
