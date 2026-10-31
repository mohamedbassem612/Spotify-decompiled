package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qgl extends pgl implements xo51 {
    public final long i;
    public final long j;

    public qgl(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, z, i, i2, z2);
        this.i = j3;
        this.j = j == -1 ? -1L : j;
    }

    @Override // p.pgl, p.fn51
    public final en51 b(long j) {
        long j2 = this.i;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.j;
            if (j3 != -1) {
                long j4 = this.c;
                long j5 = this.b;
                pn51 pn51Var = new pn51(Math.max(0L, j2 - ((Math.max(0L, (j4 + j5) - j5) * 8000000) / ((long) this.e))), Math.max(j5, j3 - j4));
                return new en51(pn51Var, pn51Var);
            }
        }
        return super.b(j);
    }

    @Override // p.xo51
    public final long c() {
        return this.j;
    }

    @Override // p.xo51
    public final long e(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // p.xo51
    public final int f() {
        return this.e;
    }

    @Override // p.pgl, p.fn51
    public final long g() {
        long j = this.i;
        return j != -9223372036854775807L ? j : this.f;
    }
}
