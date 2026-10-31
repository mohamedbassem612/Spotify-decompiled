package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iyf1 {
    public final boolean A;
    public final boolean B;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final d8r0 g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final p7w k;
    public final List l;
    public final q8b m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aql f11p;
    public final String q;
    public final List r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final String y;
    public final boolean z;

    public iyf1(String str, String str2, String str3, String str4, String str5, int i, d8r0 d8r0Var, String str6, boolean z, boolean z2, p7w p7wVar, List list, q8b q8bVar, boolean z3, boolean z4, aql aqlVar, String str7, List list2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str8, String str9, boolean z10, boolean z11, boolean z12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = d8r0Var;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = p7wVar;
        this.l = list;
        this.m = q8bVar;
        this.n = z3;
        this.o = z4;
        this.f11p = aqlVar;
        this.q = str7;
        this.r = list2;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z8;
        this.w = z9;
        this.x = str8;
        this.y = str9;
        this.z = z10;
        this.A = z11;
        this.B = z12;
    }

    public static iyf1 a(iyf1 iyf1Var) {
        return new iyf1(iyf1Var.a, iyf1Var.b, iyf1Var.c, iyf1Var.d, iyf1Var.e, iyf1Var.f, iyf1Var.g, iyf1Var.h, iyf1Var.i, iyf1Var.j, iyf1Var.k, iyf1Var.l, iyf1Var.m, iyf1Var.n, iyf1Var.o, iyf1Var.f11p, iyf1Var.q, iyf1Var.r, iyf1Var.s, iyf1Var.t, iyf1Var.u, iyf1Var.v, iyf1Var.w, iyf1Var.x, iyf1Var.y, false, true, iyf1Var.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyf1)) {
            return false;
        }
        iyf1 iyf1Var = (iyf1) obj;
        return u890.j(this.a, iyf1Var.a) && u890.j(this.b, iyf1Var.b) && u890.j(this.c, iyf1Var.c) && u890.j(this.d, iyf1Var.d) && u890.j(this.e, iyf1Var.e) && this.f == iyf1Var.f && this.g.equals(iyf1Var.g) && u890.j(this.h, iyf1Var.h) && this.i == iyf1Var.i && this.j == iyf1Var.j && u890.j(this.k, iyf1Var.k) && this.l.equals(iyf1Var.l) && this.m.equals(iyf1Var.m) && this.n == iyf1Var.n && this.o == iyf1Var.o && u890.j(this.f11p, iyf1Var.f11p) && u890.j(this.q, iyf1Var.q) && this.r.equals(iyf1Var.r) && this.s == iyf1Var.s && this.t == iyf1Var.t && this.u == iyf1Var.u && this.v == iyf1Var.v && this.w == iyf1Var.w && u890.j(this.x, iyf1Var.x) && this.y.equals(iyf1Var.y) && this.z == iyf1Var.z && this.A == iyf1Var.A && this.B == iyf1Var.B;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iG = xcg1.g(xcg1.g(cy30.d(hrt.i(this.g, ab80.k(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.h), 31, this.i), 31, this.j);
        p7w p7wVar = this.k;
        return Boolean.hashCode(this.B) + xcg1.g(xcg1.g(cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(cy30.d((this.f11p.hashCode() + xcg1.g(xcg1.g((this.m.hashCode() + f4i1.b((iG + (p7wVar != null ? p7wVar.hashCode() : 0)) * 31, 31, this.l)) * 31, 31, this.n), 31, this.o)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
    }
}
