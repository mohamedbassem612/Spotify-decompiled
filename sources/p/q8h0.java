package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q8h0 {
    public final long a;
    public final long b;

    public q8h0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8h0)) {
            return false;
        }
        q8h0 q8h0Var = (q8h0) obj;
        long j = q8h0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, q8h0Var.b) && p3v.c(8.0f, 8.0f) && p3v.c(2.6666667f, 2.6666667f) && p3v.c(8.0f, 8.0f) && p3v.c(1.0f, 1.0f);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(1.0f) + x0d.f(x0d.f(x0d.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, 8.0f), 31, 2.6666667f), 31, 8.0f);
    }
}
