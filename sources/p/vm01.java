package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vm01 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final String G;
    public final yj60 H;
    public final int I;
    public final int J;
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f42p;
    public final bi4 q;
    public final ci4 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final Integer x;
    public final boolean y;
    public final boolean z;

    public vm01(String str, String str2, CharSequence charSequence, String str3, String str4, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, bi4 bi4Var, ci4 ci4Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Integer num, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, String str5, yj60 yj60Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.I = i;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.J = i2;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.f42p = z11;
        this.q = bi4Var;
        this.r = ci4Var;
        this.s = z12;
        this.t = z13;
        this.u = z14;
        this.v = z15;
        this.w = z16;
        this.x = num;
        this.y = z17;
        this.z = z18;
        this.A = z19;
        this.B = z20;
        this.C = z21;
        this.D = z22;
        this.E = z23;
        this.F = z24;
        this.G = str5;
        this.H = yj60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm01)) {
            return false;
        }
        vm01 vm01Var = (vm01) obj;
        return u890.j(this.a, vm01Var.a) && this.b.equals(vm01Var.b) && this.c.equals(vm01Var.c) && u890.j(this.d, vm01Var.d) && u890.j(this.e, vm01Var.e) && this.f == vm01Var.f && this.I == vm01Var.I && this.g == vm01Var.g && this.h == vm01Var.h && this.i == vm01Var.i && this.j == vm01Var.j && this.k == vm01Var.k && this.J == vm01Var.J && this.l == vm01Var.l && this.m == vm01Var.m && this.n == vm01Var.n && this.o == vm01Var.o && this.f42p == vm01Var.f42p && this.q == vm01Var.q && this.r == vm01Var.r && this.s == vm01Var.s && this.t == vm01Var.t && this.u == vm01Var.u && this.v == vm01Var.v && this.w == vm01Var.w && u890.j(this.x, vm01Var.x) && this.y == vm01Var.y && this.z == vm01Var.z && this.A == vm01Var.A && this.B == vm01Var.B && this.C == vm01Var.C && this.D == vm01Var.D && this.E == vm01Var.E && this.F == vm01Var.F && u890.j(this.G, vm01Var.G) && u890.j(this.H, vm01Var.H);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.r.hashCode() + ((this.q.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.J, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.I, xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f42p)) * 31)) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        Integer num = this.x;
        int iD = cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
        yj60 yj60Var = this.H;
        return iD + (yj60Var != null ? yj60Var.hashCode() : 0);
    }
}
