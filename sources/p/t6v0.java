package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t6v0 {
    public final double a;
    public final long b;
    public final boolean c;

    public t6v0(double d, long j, boolean z) {
        this.a = d;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6v0)) {
            return false;
        }
        t6v0 t6v0Var = (t6v0) obj;
        return Double.compare(this.a, t6v0Var.a) == 0 && this.b == t6v0Var.b && this.c == t6v0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.f(Double.hashCode(this.a) * 31, this.b, 31);
    }
}
