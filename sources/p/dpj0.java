package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dpj0 {
    public final double a;
    public final long b;

    public dpj0(double d, long j) {
        this.a = d;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpj0)) {
            return false;
        }
        dpj0 dpj0Var = (dpj0) obj;
        return Double.compare(this.a, dpj0Var.a) == 0 && this.b == dpj0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
