package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rw60 {
    public final double a;
    public final long b;
    public final long c;
    public final long d;

    public rw60(double d, long j, long j2, long j3) {
        this.a = d;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw60)) {
            return false;
        }
        rw60 rw60Var = (rw60) obj;
        return Double.compare(this.a, rw60Var.a) == 0 && this.b == rw60Var.b && this.c == rw60Var.c && this.d == rw60Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.f(Double.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
