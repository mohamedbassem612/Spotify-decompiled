package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vlx0 {
    public final ulx0 a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public vlx0(ulx0 ulx0Var, long j, long j2, long j3, boolean z, long j4, long j5, long j6, boolean z2) {
        this.a = ulx0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlx0)) {
            return false;
        }
        vlx0 vlx0Var = (vlx0) obj;
        if (this.a != vlx0Var.a) {
            return false;
        }
        long j = vlx0Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j) && z4h1.b(this.c, vlx0Var.c) && z4h1.b(this.d, vlx0Var.d) && this.e == vlx0Var.e && z4h1.b(this.f, vlx0Var.f) && z4h1.b(this.g, vlx0Var.g) && z4h1.b(this.h, vlx0Var.h) && this.i == vlx0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Boolean.hashCode(this.i) + cy30.f(cy30.f(cy30.f(xcg1.g(cy30.f(cy30.f(cy30.f(iHashCode, this.b, 31), this.c, 31), this.d, 31), 31, this.e), this.f, 31), this.g, 31), this.h, 31);
    }
}
