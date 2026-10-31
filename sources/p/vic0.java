package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vic0 {
    public final double a;
    public final double b;
    public final double c;

    public vic0(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final vic0 a() {
        return new vic0(yoi1.n(this.a, 0.0d, 1.0d), yoi1.n(this.b, 0.0d, 1.0d), yoi1.n(this.c, 0.0d, 1.0d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vic0)) {
            return false;
        }
        vic0 vic0Var = (vic0) obj;
        return Double.compare(this.a, vic0Var.a) == 0 && Double.compare(this.b, vic0Var.b) == 0 && Double.compare(this.c, vic0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + xcg1.e(this.b, Double.hashCode(this.a) * 31, 31);
    }
}
