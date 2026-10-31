package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x4v0 {
    public final long a;
    public final long b;

    public x4v0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4v0)) {
            return false;
        }
        x4v0 x4v0Var = (x4v0) obj;
        return this.a == x4v0Var.a && this.b == x4v0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
