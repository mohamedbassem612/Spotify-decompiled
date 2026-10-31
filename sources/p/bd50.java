package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bd50 extends cd50 {
    public final double a;
    public final long b;
    public final c380 c;

    public bd50(double d, long j, c380 c380Var) {
        this.a = d;
        this.b = j;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd50)) {
            return false;
        }
        bd50 bd50Var = (bd50) obj;
        return Double.compare(this.a, bd50Var.a) == 0 && this.b == bd50Var.b && u890.j(this.c, bd50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(Double.hashCode(this.a) * 31, this.b, 31);
    }
}
