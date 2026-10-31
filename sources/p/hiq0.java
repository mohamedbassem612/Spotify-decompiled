package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hiq0 {
    public final long a;
    public final boolean b;

    public hiq0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiq0)) {
            return false;
        }
        hiq0 hiq0Var = (hiq0) obj;
        return this.a == hiq0Var.a && this.b == hiq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
