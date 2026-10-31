package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g2h0 implements e4h0 {
    public final long a;
    public final boolean b;

    public g2h0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2h0)) {
            return false;
        }
        g2h0 g2h0Var = (g2h0) obj;
        return this.a == g2h0Var.a && this.b == g2h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
