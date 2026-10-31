package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r5g1 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    public r5g1(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5g1)) {
            return false;
        }
        r5g1 r5g1Var = (r5g1) obj;
        return this.a == r5g1Var.a && this.b == r5g1Var.b && this.c == r5g1Var.c && this.d == r5g1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
