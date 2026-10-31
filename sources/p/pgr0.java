package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pgr0 implements sgr0 {
    public final long a;
    public final long b;

    public pgr0(int i) {
        this(z4p1.e(i), z4p1.e(16777215 & i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgr0)) {
            return false;
        }
        pgr0 pgr0Var = (pgr0) obj;
        long j = pgr0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, pgr0Var.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public pgr0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
