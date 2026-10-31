package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hmt0 implements imt0 {
    public final long a;

    public hmt0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmt0)) {
            return false;
        }
        long j = ((hmt0) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }
}
