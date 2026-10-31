package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xrw {
    public static final long[] e = new long[0];
    public final h661 a;
    public final vu30 b;
    public long c;
    public final long[] d;

    public xrw(h661 h661Var, vu30 vu30Var) {
        this.a = h661Var;
        this.b = vu30Var;
        int iD = h661Var.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }

    public final void a(int i) {
        if (i < 64) {
            this.c = (1 << i) | this.c;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.d;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    public final int b() {
        vu30 vu30Var;
        int iNumberOfTrailingZeros;
        h661 h661Var = this.a;
        int iD = h661Var.d();
        do {
            long j = this.c;
            vu30Var = this.b;
            if (j == -1) {
                if (iD <= 64) {
                    return -1;
                }
                long[] jArr = this.d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) vu30Var.invoke(h661Var, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) vu30Var.invoke(h661Var, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
