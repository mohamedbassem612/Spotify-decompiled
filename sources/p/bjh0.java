package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bjh0 {
    public final un10 a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final int n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3p;
    public boolean q;
    public final int r;
    public final boolean s;
    public final int t;
    public final int u;

    public bjh0(un10 un10Var, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, int i9, boolean z3, int i10, int i11, int i12) {
        boolean z4 = un10Var.a;
        this.a = un10Var;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = z2;
        this.l = i9;
        this.m = z3;
        this.n = i10;
        this.o = i11;
        this.f3p = i12;
        boolean z5 = un10Var instanceof sn10;
        this.q = z5;
        if (!z5 || !z4 || !z || i3 >= i8) {
            i3 = z5 ? i8 : i7;
        }
        this.r = i3;
        this.s = z && z5 && z4;
        this.t = z5 ? 12288 : 1048576;
        this.u = Math.min(z5 ? i2 : i5, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjh0)) {
            return false;
        }
        bjh0 bjh0Var = (bjh0) obj;
        return u890.j(this.a, bjh0Var.a) && this.b == bjh0Var.b && this.c == bjh0Var.c && this.d == bjh0Var.d && this.e == bjh0Var.e && this.f == bjh0Var.f && this.g == bjh0Var.g && this.h == bjh0Var.h && this.i == bjh0Var.i && this.j == bjh0Var.j && this.k == bjh0Var.k && this.l == bjh0Var.l && this.m == bjh0Var.m && this.n == bjh0Var.n && this.o == bjh0Var.o && this.f3p == bjh0Var.f3p;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3p) + kaa0.f(this.o, kaa0.f(this.n, xcg1.g(kaa0.f(this.l, xcg1.g(kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.k), 31), 31, this.m), 31), 31);
    }
}
