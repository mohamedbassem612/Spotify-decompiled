package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mjp0 {
    public final long a;
    public final long b;

    public mjp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjp0)) {
            return false;
        }
        mjp0 mjp0Var = (mjp0) obj;
        return this.a == mjp0Var.a && this.b == mjp0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
