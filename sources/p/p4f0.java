package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p4f0 {
    public final /* synthetic */ byte a;
    public int b;
    public long[] c;

    public p4f0() {
        this.a = (byte) 1;
        this.c = new long[2];
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArrCopyOf = this.c;
                if (i == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i * 2);
                    this.c = jArrCopyOf;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                jArrCopyOf[i2] = j;
                break;
            default:
                if (!d(j)) {
                    int i3 = this.b;
                    long[] jArrCopyOf2 = this.c;
                    if (i3 >= jArrCopyOf2.length) {
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(i3 + 1, jArrCopyOf2.length * 2));
                        this.c = jArrCopyOf2;
                    }
                    jArrCopyOf2[i3] = j;
                    if (i3 >= this.b) {
                        this.b = i3 + 1;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArrCopyOf = this.c;
        if (length > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(jArrCopyOf.length * 2, length));
            this.c = jArrCopyOf;
        }
        System.arraycopy(jArr, 0, jArrCopyOf, this.b, jArr.length);
        this.b = length;
    }

    public void c() {
        this.b = 0;
    }

    public boolean d(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long e(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        k220.e(this.b, cy30.r(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public long f(int i) {
        return this.c[i];
    }

    public int g() {
        return this.b;
    }

    public boolean h() {
        return this.b == 0;
    }

    public void i(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public void j(int i) {
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = this.c;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.b--;
        }
    }

    public int k() {
        return this.b;
    }

    public p4f0(int i) {
        this.a = (byte) 0;
        this.c = new long[i];
    }
}
