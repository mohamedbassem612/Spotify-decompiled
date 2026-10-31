package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m6n0 {
    public final long a;
    public final long b;

    public m6n0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6n0)) {
            return false;
        }
        m6n0 m6n0Var = (m6n0) obj;
        return this.a == m6n0Var.a && this.b == m6n0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
