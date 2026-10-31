package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zeg1 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public zeg1(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            hhg1.n("Parameters cannot be NaN");
            throw null;
        }
        if (y1a1.n(d)) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            hhg1.n("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            hhg1.n("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            hhg1.n("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            hhg1.n("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            hhg1.n("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeg1)) {
            return false;
        }
        zeg1 zeg1Var = (zeg1) obj;
        return Double.compare(this.a, zeg1Var.a) == 0 && Double.compare(this.b, zeg1Var.b) == 0 && Double.compare(this.c, zeg1Var.c) == 0 && Double.compare(this.d, zeg1Var.d) == 0 && Double.compare(this.e, zeg1Var.e) == 0 && Double.compare(this.f, zeg1Var.f) == 0 && Double.compare(this.g, zeg1Var.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + xcg1.e(this.f, xcg1.e(this.e, xcg1.e(this.d, xcg1.e(this.c, xcg1.e(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ")";
    }

    public /* synthetic */ zeg1(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
