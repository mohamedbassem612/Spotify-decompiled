package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class loj1 {
    public final long a;
    public final long b;

    public loj1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loj1)) {
            return false;
        }
        loj1 loj1Var = (loj1) obj;
        return this.a == loj1Var.a && this.b == loj1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
