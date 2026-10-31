package p;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ddl1 implements fn51 {
    public final w8h a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public ddl1(w8h w8hVar, int i, long j, long j2) {
        this.a = w8hVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) w8hVar.c);
        this.d = j3;
        this.e = h(j3);
    }

    @Override // p.fn51
    public final en51 b(long j) {
        w8h w8hVar = this.a;
        long j2 = (((long) w8hVar.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long jK = zoi1.k(j2, 0L, j3);
        int i = w8hVar.c;
        long j4 = this.c;
        long jH = h(jK);
        pn51 pn51Var = new pn51(jH, (((long) i) * jK) + j4);
        if (jH >= j || jK == j3) {
            return new en51(pn51Var, pn51Var);
        }
        long j5 = jK + 1;
        return new en51(pn51Var, new pn51(h(j5), (((long) i) * j5) + j4));
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.fn51
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = zoi1.a;
        return zoi1.g0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
