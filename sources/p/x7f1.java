package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x7f1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public x7f1(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final x7f1 a(long j, long j2, long j3, long j4, long j5, long j6) {
        return new x7f1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x7f1)) {
            return false;
        }
        x7f1 x7f1Var = (x7f1) obj;
        long j = x7f1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, x7f1Var.b) && z4h1.b(this.c, x7f1Var.c) && z4h1.b(this.d, x7f1Var.d) && z4h1.b(this.e, x7f1Var.e) && z4h1.b(this.f, x7f1Var.f);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.f) + cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
