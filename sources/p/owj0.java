package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class owj0 {
    public final nwj0 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final g3d0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final cug0 l;
    public final boolean m;
    public final boolean n;

    public owj0(nwj0 nwj0Var, int i, boolean z, boolean z2, boolean z3, g3d0 g3d0Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, cug0 cug0Var, boolean z9, boolean z10) {
        this.a = nwj0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = g3d0Var;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = cug0Var;
        this.m = z9;
        this.n = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owj0)) {
            return false;
        }
        owj0 owj0Var = (owj0) obj;
        return this.a.equals(owj0Var.a) && this.b == owj0Var.b && this.c == owj0Var.c && this.d == owj0Var.d && this.e == owj0Var.e && u890.j(this.f, owj0Var.f) && this.g == owj0Var.g && this.h == owj0Var.h && this.i == owj0Var.i && this.j == owj0Var.j && this.k == owj0Var.k && this.l == owj0Var.l && this.m == owj0Var.m && this.n == owj0Var.n;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        g3d0 g3d0Var = this.f;
        return Boolean.hashCode(this.n) + xcg1.g((this.l.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m);
    }
}
