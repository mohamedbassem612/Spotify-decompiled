package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vok0 implements xo51 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public vok0(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? zoi1.W(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair h(long j, long[] jArr, long[] jArr2) {
        int iF = zoi1.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p.fn51
    public final en51 b(long j) {
        Pair pairH = h(zoi1.n0(zoi1.k(j, 0L, this.c)), this.b, this.a);
        pn51 pn51Var = new pn51(zoi1.W(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new en51(pn51Var, pn51Var);
    }

    @Override // p.xo51
    public final long c() {
        return -1L;
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.xo51
    public final long e(long j) {
        return zoi1.W(((Long) h(j, this.a, this.b).second).longValue());
    }

    @Override // p.xo51
    public final int f() {
        return -2147483647;
    }

    @Override // p.fn51
    public final long g() {
        return this.c;
    }
}
