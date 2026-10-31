package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f7s0 {
    public final long a;
    public final int b;

    public f7s0(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7s0)) {
            return false;
        }
        f7s0 f7s0Var = (f7s0) obj;
        return this.a == f7s0Var.a && this.b == f7s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
