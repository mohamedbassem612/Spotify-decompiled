package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wex0 {
    public final double a;
    public final long b;

    public wex0(double d, long j) {
        this.a = d;
        this.b = j;
        if (0.0d > d || d > 100.0d) {
            hhg1.n("Percentage must be between 0 and 100");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wex0)) {
            return false;
        }
        wex0 wex0Var = (wex0) obj;
        return Double.compare(this.a, wex0Var.a) == 0 && this.b == wex0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
