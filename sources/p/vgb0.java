package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vgb0 {
    public final double a;
    public final double b;

    public vgb0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgb0)) {
            return false;
        }
        vgb0 vgb0Var = (vgb0) obj;
        return Double.compare(this.a, vgb0Var.a) == 0 && Double.compare(this.b, vgb0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
