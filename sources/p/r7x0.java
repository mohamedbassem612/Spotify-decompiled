package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r7x0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f35p;
    public final String q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public r7x0(String str, String str2, String str3, boolean z, boolean z2, smc0 smc0Var, boolean z3, boolean z4, int i, int i2, int i3, boolean z5, boolean z6, String str4, String str5, boolean z7, String str6, String str7, boolean z8, boolean z9, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = smc0Var;
        this.g = z3;
        this.h = z4;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = z5;
        this.m = z6;
        this.n = str4;
        this.o = str5;
        this.f35p = z7;
        this.q = str6;
        this.r = str7;
        this.s = z8;
        this.t = z9;
        this.u = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7x0)) {
            return false;
        }
        r7x0 r7x0Var = (r7x0) obj;
        return u890.j(this.a, r7x0Var.a) && u890.j(this.b, r7x0Var.b) && u890.j(this.c, r7x0Var.c) && this.d == r7x0Var.d && this.e == r7x0Var.e && this.f.equals(r7x0Var.f) && this.g == r7x0Var.g && this.h == r7x0Var.h && this.i == r7x0Var.i && this.j == r7x0Var.j && this.k == r7x0Var.k && this.l == r7x0Var.l && this.m == r7x0Var.m && u890.j(this.n, r7x0Var.n) && u890.j(this.o, r7x0Var.o) && this.f35p == r7x0Var.f35p && u890.j(this.q, r7x0Var.q) && u890.j(this.r, r7x0Var.r) && this.s == r7x0Var.s && this.t == r7x0Var.t && this.u == r7x0Var.u;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g(xcg1.g(kaa0.f(this.k, kaa0.f(this.j, kaa0.f(this.i, xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31), 31, this.l), 31, this.m);
        String str2 = this.n;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iG2 = xcg1.g((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f35p);
        String str4 = this.q;
        int iHashCode2 = (iG2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.r;
        return Boolean.hashCode(this.u) + xcg1.g(xcg1.g((iHashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.s), 961, this.t);
    }
}
