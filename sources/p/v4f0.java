package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v4f0 {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public v4f0(int i) {
        dm5.m(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.d = new long[i];
        this.e = i - 1;
    }

    public final void a(long j) {
        int i = this.c;
        long[] jArr = this.d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                bhn0.w();
                return;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(this.d, 0, jArr2, i3, i2);
            this.a = 0;
            int i4 = this.c;
            this.b = i4 - 1;
            this.d = jArr2;
            this.e = length - 1;
            i = i4;
            jArr = jArr2;
        }
        int i5 = (this.b + 1) & this.e;
        this.b = i5;
        jArr[i5] = j;
        this.c = i + 1;
    }

    public final long b() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        hhg1.k();
        return 0L;
    }

    public final long c() {
        int i = this.c;
        if (i == 0) {
            hhg1.k();
            return 0L;
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }
}
