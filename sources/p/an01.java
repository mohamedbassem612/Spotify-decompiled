package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class an01 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yn01 f0p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;

    public an01(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, String str5, yn01 yn01Var, String str6, String str7, String str8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str4;
        this.i = z4;
        this.j = z5;
        this.k = i2;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = str5;
        this.f0p = yn01Var;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = z9;
        this.u = z10;
        this.v = z11;
        this.w = z12;
    }

    public static an01 a(an01 an01Var, String str, String str2, int i) {
        return new an01((i & 1) != 0 ? an01Var.a : str, "", (i & 4) != 0 ? an01Var.c : str2, an01Var.d, an01Var.e, an01Var.f, an01Var.g, an01Var.h, an01Var.i, an01Var.j, an01Var.k, an01Var.l, an01Var.m, an01Var.n, an01Var.o, an01Var.f0p, an01Var.q, an01Var.r, an01Var.s, an01Var.t, an01Var.u, an01Var.v, an01Var.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an01)) {
            return false;
        }
        an01 an01Var = (an01) obj;
        return this.a.equals(an01Var.a) && this.b.equals(an01Var.b) && this.c.equals(an01Var.c) && this.d == an01Var.d && this.e == an01Var.e && this.f == an01Var.f && this.g == an01Var.g && this.h.equals(an01Var.h) && this.i == an01Var.i && this.j == an01Var.j && this.k == an01Var.k && this.l == an01Var.l && this.m == an01Var.m && this.n == an01Var.n && u890.j(this.o, an01Var.o) && this.f0p.equals(an01Var.f0p) && this.q.equals(an01Var.q) && this.r.equals(an01Var.r) && this.s.equals(an01Var.s) && this.t == an01Var.t && this.u == an01Var.u && this.v == an01Var.v && this.w == an01Var.w;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(ab80.k(this.k, xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n);
        String str = this.o;
        return Boolean.hashCode(this.w) + xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d((this.f0p.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
    }
}
