package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u2v0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final d8r0 h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16p;
    public final String q;
    public final String r;
    public final lle s;

    public u2v0(String str, String str2, String str3, String str4, String str5, int i, String str6, d8r0 d8r0Var, int i2, int i3, boolean z, boolean z2, boolean z3, String str7, String str8, String str9, String str10, String str11, lle lleVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = d8r0Var;
        this.i = i2;
        this.j = i3;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = str7;
        this.o = str8;
        this.f16p = str9;
        this.q = str10;
        this.r = str11;
        this.s = lleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2v0)) {
            return false;
        }
        u2v0 u2v0Var = (u2v0) obj;
        return u890.j(this.a, u2v0Var.a) && u890.j(this.b, u2v0Var.b) && u890.j(this.c, u2v0Var.c) && u890.j(this.d, u2v0Var.d) && u890.j(this.e, u2v0Var.e) && this.f == u2v0Var.f && u890.j(this.g, u2v0Var.g) && this.h.equals(u2v0Var.h) && this.i == u2v0Var.i && this.j == u2v0Var.j && this.k == u2v0Var.k && this.l == u2v0Var.l && this.m == u2v0Var.m && u890.j(this.n, u2v0Var.n) && this.o.equals(u2v0Var.o) && this.f16p.equals(u2v0Var.f16p) && this.q.equals(u2v0Var.q) && u890.j(this.r, u2v0Var.r) && this.s == u2v0Var.s;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.j, ab80.k(this.i, hrt.i(this.h, cy30.d(ab80.k(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31), 31), 31), 31, this.k), 31, this.l), 31, this.m);
        String str = this.n;
        return this.s.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.o), 31, this.f16p), 31, this.q), 31, this.r);
    }
}
