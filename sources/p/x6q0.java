package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x6q0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public x6q0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6q0)) {
            return false;
        }
        x6q0 x6q0Var = (x6q0) obj;
        return this.a == x6q0Var.a && this.b == x6q0Var.b && this.c == x6q0Var.c && this.d == x6q0Var.d && this.e == x6q0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
