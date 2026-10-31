package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ctg0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ctg0(long j, long j2, long j3, long j4, long j5) {
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
        if (!(obj instanceof ctg0)) {
            return false;
        }
        ctg0 ctg0Var = (ctg0) obj;
        long j = ctg0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, ctg0Var.b) && z4h1.b(this.c, ctg0Var.c) && z4h1.b(this.d, ctg0Var.d) && z4h1.b(this.e, ctg0Var.e);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.e) + cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
