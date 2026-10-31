package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e7o0 {
    public final double a;
    public final long b;
    public final long c;

    public e7o0(double d, long j, long j2) {
        this.a = d;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7o0)) {
            return false;
        }
        e7o0 e7o0Var = (e7o0) obj;
        return Double.compare(this.a, e7o0Var.a) == 0 && this.b == e7o0Var.b && this.c == e7o0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Double.hashCode(this.a) * 31, this.b, 31);
    }
}
