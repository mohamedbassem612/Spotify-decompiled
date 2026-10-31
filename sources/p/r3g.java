package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r3g {
    public final long a;
    public final long b;

    public r3g(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3g)) {
            return false;
        }
        r3g r3gVar = (r3g) obj;
        long j = r3gVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, r3gVar.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
