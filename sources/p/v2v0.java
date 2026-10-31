package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v2v0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final d8r0 h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Integer n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f18p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final lle u;

    public v2v0(String str, String str2, String str3, String str4, String str5, int i, String str6, d8r0 d8r0Var, int i2, boolean z, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, String str8, String str9, String str10, String str11, lle lleVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = d8r0Var;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = num;
        this.o = z5;
        this.f18p = str7;
        this.q = str8;
        this.r = str9;
        this.s = str10;
        this.t = str11;
        this.u = lleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2v0)) {
            return false;
        }
        v2v0 v2v0Var = (v2v0) obj;
        return u890.j(this.a, v2v0Var.a) && u890.j(this.b, v2v0Var.b) && u890.j(this.c, v2v0Var.c) && u890.j(this.d, v2v0Var.d) && u890.j(this.e, v2v0Var.e) && this.f == v2v0Var.f && u890.j(this.g, v2v0Var.g) && this.h.equals(v2v0Var.h) && this.i == v2v0Var.i && this.j == v2v0Var.j && this.k == v2v0Var.k && this.l == v2v0Var.l && this.m == v2v0Var.m && u890.j(this.n, v2v0Var.n) && this.o == v2v0Var.o && u890.j(this.f18p, v2v0Var.f18p) && this.q.equals(v2v0Var.q) && this.r.equals(v2v0Var.r) && this.s.equals(v2v0Var.s) && u890.j(this.t, v2v0Var.t) && this.u == v2v0Var.u;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.i, hrt.i(this.h, cy30.d(ab80.k(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        Integer num = this.n;
        int iG2 = xcg1.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.o);
        String str = this.f18p;
        return this.u.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((iG2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }
}
