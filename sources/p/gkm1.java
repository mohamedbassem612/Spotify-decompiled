package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gkm1 implements xo51 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public gkm1(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = qxd0.K(j3 - ((long) i), j2);
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p.fn51
    public final en51 b(long j) {
        double d;
        double d2;
        boolean zD = d();
        int i = this.b;
        long j2 = this.a;
        if (!zD) {
            pn51 pn51Var = new pn51(0L, j2 + ((long) i));
            return new en51(pn51Var, pn51Var);
        }
        long jK = zoi1.k(j, 0L, this.c);
        double d3 = (jK * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.e;
        pn51 pn51Var2 = new pn51(jK, j2 + zoi1.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new en51(pn51Var2, pn51Var2);
    }

    @Override // p.xo51
    public final long c() {
        return this.f;
    }

    @Override // p.fn51
    public final boolean d() {
        return this.g != null;
    }

    @Override // p.xo51
    public final long e(long j) {
        long j2 = j - this.a;
        if (!d() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iF = zoi1.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p.xo51
    public final int f() {
        return this.d;
    }

    @Override // p.fn51
    public final long g() {
        return this.c;
    }
}
