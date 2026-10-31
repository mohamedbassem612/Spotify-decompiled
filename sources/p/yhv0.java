package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yhv0 {
    public final long a;
    public final boolean b;

    public yhv0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhv0)) {
            return false;
        }
        yhv0 yhv0Var = (yhv0) obj;
        return this.a == yhv0Var.a && this.b == yhv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
