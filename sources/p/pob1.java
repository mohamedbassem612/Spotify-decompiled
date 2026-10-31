package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pob1 {
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;

    public pob1(long j, boolean z, long j2, long j3, long j4) {
        this.a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pob1)) {
            return false;
        }
        pob1 pob1Var = (pob1) obj;
        return this.a == pob1Var.a && this.b == pob1Var.b && this.c == pob1Var.c && this.d == pob1Var.d && this.e == pob1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(cy30.f(xcg1.g(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31);
    }
}
