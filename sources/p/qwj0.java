package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qwj0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final g3d0 f;
    public final boolean g;
    public final boolean h;
    public final cug0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public qwj0(int i, boolean z, boolean z2, boolean z3, boolean z4, g3d0 g3d0Var, boolean z5, boolean z6, cug0 cug0Var, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = g3d0Var;
        this.g = z5;
        this.h = z6;
        this.i = cug0Var;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwj0)) {
            return false;
        }
        qwj0 qwj0Var = (qwj0) obj;
        return this.a == qwj0Var.a && this.b == qwj0Var.b && this.c == qwj0Var.c && this.d == qwj0Var.d && this.e == qwj0Var.e && u890.j(this.f, qwj0Var.f) && this.g == qwj0Var.g && this.h == qwj0Var.h && this.i == qwj0Var.i && this.j == qwj0Var.j && this.k == qwj0Var.k && this.l == qwj0Var.l && this.m == qwj0Var.m;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        g3d0 g3d0Var = this.f;
        return Boolean.hashCode(this.m) + xcg1.g(xcg1.g(xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g((iG + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }
}
