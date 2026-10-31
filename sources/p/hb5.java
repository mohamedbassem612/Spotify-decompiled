package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hb5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public hb5(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb5)) {
            return false;
        }
        hb5 hb5Var = (hb5) obj;
        long j = hb5Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, hb5Var.b) && z4h1.b(this.c, hb5Var.c) && z4h1.b(this.d, hb5Var.d) && p3v.c(1.0f, 1.0f);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(1.0f) + c13.f(c13.f(c13.f(z4h1.c(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
