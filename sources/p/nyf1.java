package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nyf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final j9k1 h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f46p;
    public final boolean q;
    public final List r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final Integer v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public nyf1(String str, String str2, String str3, String str4, String str5, boolean z, int i, j9k1 j9k1Var, boolean z2, int i2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, List list, boolean z9, boolean z10, boolean z11, Integer num, String str7, boolean z12, boolean z13, boolean z14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = i;
        this.h = j9k1Var;
        this.i = z2;
        this.j = i2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = str6;
        this.f46p = z7;
        this.q = z8;
        this.r = list;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = num;
        this.w = str7;
        this.x = z12;
        this.y = z13;
        this.z = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyf1)) {
            return false;
        }
        nyf1 nyf1Var = (nyf1) obj;
        return u890.j(this.a, nyf1Var.a) && u890.j(this.b, nyf1Var.b) && u890.j(this.c, nyf1Var.c) && u890.j(this.d, nyf1Var.d) && u890.j(this.e, nyf1Var.e) && this.f == nyf1Var.f && this.g == nyf1Var.g && this.h.equals(nyf1Var.h) && this.i == nyf1Var.i && this.j == nyf1Var.j && this.k == nyf1Var.k && this.l == nyf1Var.l && this.m == nyf1Var.m && this.n == nyf1Var.n && u890.j(this.o, nyf1Var.o) && this.f46p == nyf1Var.f46p && this.q == nyf1Var.q && this.r.equals(nyf1Var.r) && this.s == nyf1Var.s && this.t == nyf1Var.t && this.u == nyf1Var.u && u890.j(this.v, nyf1Var.v) && this.w.equals(nyf1Var.w) && this.x == nyf1Var.x && this.y == nyf1Var.y && this.z == nyf1Var.z;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.j, xcg1.g((this.h.hashCode() + ab80.k(this.g, xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31)) * 31, 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f46p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
        Integer num = this.v;
        return Boolean.hashCode(this.z) + xcg1.g(xcg1.g(cy30.d((iG + (num != null ? num.hashCode() : 0)) * 31, 31, this.w), 31, this.x), 31, this.y);
    }
}
