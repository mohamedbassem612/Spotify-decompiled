package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oi9 {
    public final double a;
    public final di9 b;

    public oi9(double d, di9 di9Var) {
        this.a = d;
        this.b = di9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi9)) {
            return false;
        }
        oi9 oi9Var = (oi9) obj;
        return Double.compare(this.a, oi9Var.a) == 0 && this.b == oi9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }
}
