package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i5i0 implements m5i0 {
    public final long a;
    public final long b;

    public i5i0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5i0)) {
            return false;
        }
        i5i0 i5i0Var = (i5i0) obj;
        return this.a == i5i0Var.a && this.b == i5i0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
