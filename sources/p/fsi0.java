package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fsi0 {
    public final long a;
    public final long b;

    public fsi0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi0)) {
            return false;
        }
        fsi0 fsi0Var = (fsi0) obj;
        return this.a == fsi0Var.a && this.b == fsi0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
