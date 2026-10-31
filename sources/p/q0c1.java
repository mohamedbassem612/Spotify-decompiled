package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q0c1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public q0c1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0c1)) {
            return false;
        }
        q0c1 q0c1Var = (q0c1) obj;
        return this.a == q0c1Var.a && this.b == q0c1Var.b && this.c == q0c1Var.c && this.d == q0c1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
