package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xvp0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public xvp0(String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = i3;
        this.l = z5;
        this.m = z6;
        this.n = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvp0)) {
            return false;
        }
        xvp0 xvp0Var = (xvp0) obj;
        return u890.j(this.a, xvp0Var.a) && u890.j(this.b, xvp0Var.b) && u890.j(this.c, xvp0Var.c) && u890.j(this.d, xvp0Var.d) && this.e == xvp0Var.e && this.f == xvp0Var.f && this.g == xvp0Var.g && this.h == xvp0Var.h && this.i == xvp0Var.i && this.j == xvp0Var.j && this.k == xvp0Var.k && this.l == xvp0Var.l && this.m == xvp0Var.m && this.n == xvp0Var.n;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.n) + xcg1.g(xcg1.g(ab80.k(this.k, xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, ab80.k(this.e, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m);
    }
}
