package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hvf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public hvf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public static n8b1 a(rze1 rze1Var, b0k b0kVar) {
        if (rze1Var == rze1.b) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1539262271);
            n8b1 n8b1VarW = t890.w(x340Var, 5);
            x340Var.r(false);
            return n8b1VarW;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(1539355581);
        n8b1 n8b1VarW2 = t890.w(x340Var2, 4);
        x340Var2.r(false);
        return n8b1VarW2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hvf)) {
            return false;
        }
        hvf hvfVar = (hvf) obj;
        long j = hvfVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, hvfVar.b) && z4h1.b(this.c, hvfVar.c) && z4h1.b(this.d, hvfVar.d) && z4h1.b(this.e, hvfVar.e) && z4h1.b(this.f, hvfVar.f) && z4h1.b(this.g, hvfVar.g) && z4h1.b(this.h, hvfVar.h) && z4h1.b(this.i, hvfVar.i) && z4h1.b(this.j, hvfVar.j) && z4h1.b(this.k, hvfVar.k) && z4h1.b(this.l, hvfVar.l);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.l) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31);
    }
}
