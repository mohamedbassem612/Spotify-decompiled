package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class pgl implements fn51 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public pgl(long j, long j2, boolean z, int i, int i2, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    @Override // p.fn51
    public final boolean a() {
        return this.h;
    }

    @Override // p.fn51
    public en51 b(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            pn51 pn51Var = new pn51(0L, j3);
            return new en51(pn51Var, pn51Var);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        pn51 pn51Var2 = new pn51(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new en51(pn51Var2, new pn51((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new en51(pn51Var2, pn51Var2);
    }

    @Override // p.fn51
    public final boolean d() {
        return this.d != -1 || this.g;
    }

    @Override // p.fn51
    public long g() {
        return this.f;
    }
}
