package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x9a0 {
    public static final x9a0 d = new x9a0(z4p1.g(4279887500L), z4p1.g(3424573372L), z4p1.e(2132710871));
    public final long a;
    public final long b;
    public final long c;

    public x9a0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9a0)) {
            return false;
        }
        x9a0 x9a0Var = (x9a0) obj;
        long j = x9a0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, x9a0Var.b) && z4h1.b(this.c, x9a0Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
