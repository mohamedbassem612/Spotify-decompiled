package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w0i1 {
    public final z740 a;
    public final e2i1 b;
    public final int c;
    public final long d;
    public final int e;

    public w0i1(z740 z740Var, e2i1 e2i1Var, int i, long j, int i2) {
        this.a = z740Var;
        this.b = e2i1Var;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0i1)) {
            return false;
        }
        w0i1 w0i1Var = (w0i1) obj;
        return u890.j(this.a, w0i1Var.a) && this.b == w0i1Var.b && this.c == w0i1Var.c && jfv.f(this.d, w0i1Var.d) && this.e == w0i1Var.e;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        ytw0 ytw0Var = jfv.b;
        return Integer.hashCode(1) + ab80.k(this.e, cy30.f(iK, this.d, 31), 31);
    }
}
