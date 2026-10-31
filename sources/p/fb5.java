package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fb5 {
    public final long a;
    public final long b;
    public final long c;

    public fb5(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5Var = (fb5) obj;
        long j = fb5Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, fb5Var.b) && z4h1.b(this.c, fb5Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
