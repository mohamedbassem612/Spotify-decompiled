package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rdg1 {
    public final long a;
    public final long b;

    public rdg1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdg1)) {
            return false;
        }
        rdg1 rdg1Var = (rdg1) obj;
        return this.a == rdg1Var.a && this.b == rdg1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
