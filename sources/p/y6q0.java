package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y6q0 {
    public final double a;
    public final long b;
    public final x6q0 c;

    public y6q0(double d, long j, x6q0 x6q0Var) {
        this.a = d;
        this.b = j;
        this.c = x6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6q0)) {
            return false;
        }
        y6q0 y6q0Var = (y6q0) obj;
        return Double.compare(this.a, y6q0Var.a) == 0 && this.b == y6q0Var.b && u890.j(this.c, y6q0Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(Double.hashCode(this.a) * 31, this.b, 31);
        x6q0 x6q0Var = this.c;
        return iF + (x6q0Var == null ? 0 : x6q0Var.hashCode());
    }
}
