package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yzp0 {
    public final double a;
    public final double b;
    public final double c;

    public yzp0(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzp0)) {
            return false;
        }
        yzp0 yzp0Var = (yzp0) obj;
        return Double.compare(this.a, yzp0Var.a) == 0 && Double.compare(this.b, yzp0Var.b) == 0 && Double.compare(this.c, yzp0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + xcg1.e(this.b, Double.hashCode(this.a) * 31, 31);
    }
}
