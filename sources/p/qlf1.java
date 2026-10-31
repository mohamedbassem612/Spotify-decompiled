package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qlf1 {
    public final boolean A;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final j9k1 i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f34p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final Integer u;
    public final List v;
    public final boolean w;
    public final boolean x;
    public final String y;
    public final boolean z;

    public qlf1(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, j9k1 j9k1Var, boolean z2, int i2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, Integer num, List list, boolean z12, boolean z13, String str7, boolean z14, boolean z15) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = i;
        this.i = j9k1Var;
        this.j = z2;
        this.k = i2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.f34p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
        this.t = z11;
        this.u = num;
        this.v = list;
        this.w = z12;
        this.x = z13;
        this.y = str7;
        this.z = z14;
        this.A = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlf1)) {
            return false;
        }
        qlf1 qlf1Var = (qlf1) obj;
        return u890.j(this.a, qlf1Var.a) && u890.j(this.b, qlf1Var.b) && u890.j(this.c, qlf1Var.c) && u890.j(this.d, qlf1Var.d) && u890.j(this.e, qlf1Var.e) && u890.j(this.f, qlf1Var.f) && this.g == qlf1Var.g && this.h == qlf1Var.h && this.i.equals(qlf1Var.i) && this.j == qlf1Var.j && this.k == qlf1Var.k && this.l == qlf1Var.l && this.m == qlf1Var.m && this.n == qlf1Var.n && this.o == qlf1Var.o && this.f34p == qlf1Var.f34p && this.q == qlf1Var.q && this.r == qlf1Var.r && this.s == qlf1Var.s && this.t == qlf1Var.t && u890.j(this.u, qlf1Var.u) && u890.j(this.v, qlf1Var.v) && this.w == qlf1Var.w && this.x == qlf1Var.x && this.y.equals(qlf1Var.y) && this.z == qlf1Var.z && this.A == qlf1Var.A;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.k, xcg1.g((this.i.hashCode() + ab80.k(this.h, xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31)) * 31, 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f34p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        Integer num = this.u;
        return Boolean.hashCode(this.A) + xcg1.g(cy30.d(xcg1.g(xcg1.g(f4i1.b((iG + (num != null ? num.hashCode() : 0)) * 31, 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z);
    }
}
