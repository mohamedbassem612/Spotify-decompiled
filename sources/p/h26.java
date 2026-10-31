package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h26 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f34p;
    public final boolean q;

    public h26(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = z4;
        this.f34p = z5;
        this.q = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h26)) {
            return false;
        }
        h26 h26Var = (h26) obj;
        return this.a == h26Var.a && this.b == h26Var.b && this.c == h26Var.c && this.d == h26Var.d && this.e == h26Var.e && this.f == h26Var.f && this.g == h26Var.g && this.h == h26Var.h && this.i == h26Var.i && this.j == h26Var.j && this.k == h26Var.k && this.l == h26Var.l && this.m == h26Var.m && this.n == h26Var.n && this.o == h26Var.o && this.f34p == h26Var.f34p && this.q == h26Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + xcg1.g(xcg1.g(kaa0.f(this.n, kaa0.f(this.m, kaa0.f(this.l, kaa0.f(this.k, kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.o), 31, this.f34p);
    }
}
