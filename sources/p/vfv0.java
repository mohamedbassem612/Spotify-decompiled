package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vfv0 {
    public final long a;
    public final long b;

    public vfv0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfv0)) {
            return false;
        }
        vfv0 vfv0Var = (vfv0) obj;
        return this.a == vfv0Var.a && this.b == vfv0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
