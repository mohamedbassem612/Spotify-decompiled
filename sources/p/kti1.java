package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kti1 implements xo51 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public kti1(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = qxd0.K(j3 - j2, j);
    }

    @Override // p.fn51
    public final en51 b(long j) {
        long[] jArr = this.a;
        int iF = zoi1.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        pn51 pn51Var = new pn51(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new en51(pn51Var, pn51Var);
        }
        int i = iF + 1;
        return new en51(pn51Var, new pn51(jArr[i], jArr2[i]));
    }

    @Override // p.xo51
    public final long c() {
        return this.d;
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.xo51
    public final long e(long j) {
        return this.a[zoi1.f(this.b, j, true)];
    }

    @Override // p.xo51
    public final int f() {
        return this.e;
    }

    @Override // p.fn51
    public final long g() {
        return this.c;
    }
}
