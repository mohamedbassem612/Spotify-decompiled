package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lfx0 {
    public final long a;
    public final long b;

    public lfx0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfx0)) {
            return false;
        }
        lfx0 lfx0Var = (lfx0) obj;
        long j = lfx0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, lfx0Var.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
