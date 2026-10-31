package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c1z {
    public d1z A;
    public boolean B;
    public xwp0 C;
    public tu00 D;
    public int E;
    public int a;
    public int b;
    public String c;
    public String d;
    public g281 e;
    public Integer f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public g1z k;
    public cen l;
    public boolean m;
    public String n;
    public Long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2p;
    public boolean q;
    public boolean r;
    public String s;
    public cen t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final void A(int i) {
        this.b = i;
    }

    public final void B(boolean z) {
        this.y = z;
    }

    public final void C(g281 g281Var) {
        this.e = g281Var;
    }

    public final void D(Integer num) {
        this.f = num;
    }

    public final void E(g1z g1zVar) {
        this.k = g1zVar;
    }

    public final void F(String str) {
        this.c = str;
    }

    public final void a(boolean z) {
        this.B = z;
    }

    public final void b(boolean z) {
        this.w = z;
    }

    public final i1z c() {
        String str = this.c;
        g1z g1zVar = this.k;
        String str2 = this.d;
        g281 g281Var = this.e;
        boolean z = this.h;
        String str3 = this.g;
        int i = this.a;
        cen cenVar = this.l;
        int i2 = this.b;
        boolean z2 = this.m;
        Integer num = this.f;
        String str4 = this.n;
        d1z d1zVar = this.A;
        boolean z3 = this.f2p;
        boolean z4 = this.q;
        boolean z5 = this.r;
        String str5 = this.i;
        String str6 = this.j;
        cen cenVar2 = this.t;
        xwp0 xwp0Var = this.C;
        Long l = this.o;
        boolean z6 = this.v;
        boolean z7 = this.u;
        boolean z8 = this.w;
        String str7 = this.s;
        tu00 tu00Var = this.D;
        return new i1z(str, str3, str2, cenVar, cenVar2, str6, str5, str7, str4, z7, z3, z4, z5, z, this.x, this.E, this.B, i, num, z2, this.y, this.z, z6, l, z8, i2, g281Var, xwp0Var, d1zVar, g1zVar, tu00Var);
    }

    public final void d(cen cenVar) {
        this.l = cenVar;
    }

    public final void e(boolean z) {
        this.x = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1z)) {
            return false;
        }
        c1z c1zVar = (c1z) obj;
        return this.a == c1zVar.a && this.b == c1zVar.b && this.c.equals(c1zVar.c) && this.d.equals(c1zVar.d) && u890.j(this.e, c1zVar.e) && u890.j(this.f, c1zVar.f) && u890.j(this.g, c1zVar.g) && this.h == c1zVar.h && this.i.equals(c1zVar.i) && this.j.equals(c1zVar.j) && this.k == c1zVar.k && this.l.equals(c1zVar.l) && this.m == c1zVar.m && u890.j(this.n, c1zVar.n) && u890.j(this.o, c1zVar.o) && this.f2p == c1zVar.f2p && this.q == c1zVar.q && this.r == c1zVar.r && this.s.equals(c1zVar.s) && this.t.equals(c1zVar.t) && this.u == c1zVar.u && this.v == c1zVar.v && this.w == c1zVar.w && this.x == c1zVar.x && this.y == c1zVar.y && this.z == c1zVar.z && this.A == c1zVar.A && this.B == c1zVar.B && this.C.equals(c1zVar.C) && this.D.equals(c1zVar.D) && this.E == c1zVar.E;
    }

    public final void f(String str) {
        this.j = str;
    }

    public final void g(boolean z) {
        this.f2p = z;
    }

    public final void h(jv00 jv00Var) {
        this.D = jv00Var;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        g281 g281Var = this.e;
        int iHashCode = (iD + (g281Var == null ? 0 : g281Var.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        int iG = xcg1.g((this.l.hashCode() + ((this.k.hashCode() + cy30.d(cy30.d(xcg1.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m);
        String str2 = this.n;
        int iHashCode3 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.o;
        return l1d.C(this.E) + ((this.D.hashCode() + ((this.C.hashCode() + xcg1.g((this.A.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.t.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31, 31, this.f2p), 31, this.q), 31, this.r), 31, this.s)) * 31, 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z)) * 31, 31, this.B)) * 31)) * 31);
    }

    public final void i(boolean z) {
        this.u = z;
    }

    public final void j(cen cenVar) {
        this.t = cenVar;
    }

    public final void k(String str) {
        this.g = str;
    }

    public final void l(boolean z) {
        this.q = z;
    }

    public final void m(boolean z) {
        this.r = z;
    }

    public final void n(boolean z) {
        this.z = z;
    }

    public final void o(boolean z) {
        this.v = z;
    }

    public final void p(boolean z) {
        this.h = z;
    }

    public final void q(Long l) {
        this.o = l;
    }

    public final void r(int i) {
        this.a = i;
    }

    public final void s(String str) {
        this.i = str;
    }

    public final void t(d1z d1zVar) {
        this.A = d1zVar;
    }

    public final void u(String str) {
        this.d = str;
    }

    public final void v(xwp0 xwp0Var) {
        this.C = xwp0Var;
    }

    public final void w(int i) {
        this.E = i;
    }

    public final void x(boolean z) {
        this.m = z;
    }

    public final void y(String str) {
        this.n = str;
    }

    public final void z(String str) {
        this.s = str;
    }
}
