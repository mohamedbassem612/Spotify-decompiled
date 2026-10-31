package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sls0 {
    public final long a;
    public final long b;

    public sls0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sls0)) {
            return false;
        }
        sls0 sls0Var = (sls0) obj;
        long j = sls0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, sls0Var.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
