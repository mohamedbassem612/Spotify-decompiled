package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x1v0 {
    public final double a;
    public final int b;

    public x1v0(double d, int i) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1v0)) {
            return false;
        }
        x1v0 x1v0Var = (x1v0) obj;
        return Double.compare(this.a, x1v0Var.a) == 0 && this.b == x1v0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
