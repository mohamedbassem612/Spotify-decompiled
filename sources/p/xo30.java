package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xo30 {
    public final long a;
    public final long b;
    public final boolean c;
    public final int d;

    public xo30(int i) {
        long j = u7h.k;
        boolean z = (i & 16) != 0;
        this.a = j;
        this.b = j;
        this.c = z;
        this.d = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo30)) {
            return false;
        }
        xo30 xo30Var = (xo30) obj;
        if (!p3v.c(40.0f, 40.0f)) {
            return false;
        }
        long j = xo30Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, xo30Var.b) && Float.compare(1.0f, 1.0f) == 0 && this.c == xo30Var.c && this.d == xo30Var.d;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(40.0f) * 31;
        int i = u7h.l;
        return l1d.C(this.d) + xcg1.g(x0d.f(cy30.f(cy30.f(iHashCode, this.a, 31), this.b, 31), 31, 1.0f), 31, this.c);
    }
}
