package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ugb0 {
    public final double a;
    public final double b;

    public ugb0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugb0)) {
            return false;
        }
        ugb0 ugb0Var = (ugb0) obj;
        return Double.compare(this.a, ugb0Var.a) == 0 && Double.compare(this.b, ugb0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
