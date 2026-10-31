package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kjx0 {
    public final long a;
    public final long b;

    public kjx0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjx0)) {
            return false;
        }
        kjx0 kjx0Var = (kjx0) obj;
        return this.a == kjx0Var.a && this.b == kjx0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
