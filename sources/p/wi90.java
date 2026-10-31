package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wi90 {
    public final vu30 a;
    public final yj41 b;
    public final vu30 c;
    public final vu30 d;
    public final vu30 e;
    public final long f;

    public wi90(vu30 vu30Var, yj41 yj41Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, long j) {
        this.a = vu30Var;
        this.b = yj41Var;
        this.c = vu30Var2;
        this.d = vu30Var3;
        this.e = vu30Var4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi90)) {
            return false;
        }
        wi90 wi90Var = (wi90) obj;
        if (!u890.j(this.a, wi90Var.a) || !u890.j(this.b, wi90Var.b) || !this.c.equals(wi90Var.c) || !u890.j(this.d, wi90Var.d) || !u890.j(this.e, wi90Var.e)) {
            return false;
        }
        long j = wi90Var.f;
        int i = u7h.l;
        return z4h1.b(this.f, j);
    }

    public final int hashCode() {
        int iG = hrt.g(hrt.g(hrt.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        int i = u7h.l;
        return Long.hashCode(this.f) + iG;
    }
}
