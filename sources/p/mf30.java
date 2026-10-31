package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mf30 {
    public final double a;
    public final double b;
    public final double c;

    public mf30(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf30)) {
            return false;
        }
        mf30 mf30Var = (mf30) obj;
        return Double.compare(this.a, mf30Var.a) == 0 && Double.compare(this.b, mf30Var.b) == 0 && Double.compare(this.c, mf30Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + xcg1.e(this.b, Double.hashCode(this.a) * 31, 31);
    }
}
