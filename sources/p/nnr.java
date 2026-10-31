package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nnr implements l0l {
    public final String A;
    public final sce0 B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final Boolean K;
    public final int L;
    public final int M;
    public final String a;
    public final String b;
    public final f0u c;
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
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f80p;
    public final f860 q;
    public final s1l r;
    public final List s;
    public final List t;
    public final c1l u;
    public final String v;
    public final boolean w;
    public final int x;
    public final int y;
    public final List z;

    public nnr(e2l e2lVar, sce0 sce0Var) {
        String str = e2lVar.n;
        String str2 = e2lVar.q;
        f0u f0uVarL0 = hqq0.l0(e2lVar.r);
        int iR = omo1.r(e2lVar);
        boolean z = e2lVar.g;
        String str3 = e2lVar.o;
        String str4 = e2lVar.f28p;
        boolean z2 = e2lVar.A;
        boolean z3 = e2lVar.i;
        boolean z4 = e2lVar.h;
        boolean z5 = e2lVar.E;
        String str5 = e2lVar.l;
        String str6 = e2lVar.m;
        int i = e2lVar.P;
        boolean z6 = 1 == i || e2lVar.c;
        boolean z7 = e2lVar.f;
        boolean z8 = e2lVar.b;
        boolean z9 = e2lVar.v;
        boolean z10 = z6;
        e860 e860Var = e2lVar.x;
        f860 f860Var = new f860(e860Var.c, e860Var.a);
        s1l s1lVar = e2lVar.y;
        List list = e2lVar.s;
        List list2 = e2lVar.w;
        boolean z11 = e2lVar.e;
        boolean z12 = e2lVar.B;
        c1l c1lVar = new c1l(i, str3, z11, z12, e2lVar.d);
        String str7 = e2lVar.C;
        int iU = sjo0.u(i);
        int i2 = e2lVar.z;
        int i3 = e2lVar.t;
        List list3 = e2lVar.D;
        String str8 = e2lVar.F;
        boolean z13 = e2lVar.G;
        boolean z14 = e2lVar.H;
        boolean z15 = e2lVar.I;
        boolean z16 = e2lVar.J;
        boolean z17 = e2lVar.j;
        boolean z18 = e2lVar.K;
        boolean z19 = e2lVar.L;
        int i4 = e2lVar.M;
        Boolean bool = e2lVar.N;
        this.a = str;
        this.b = str2;
        this.c = f0uVarL0;
        this.L = iR;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = str5;
        this.f80p = str6;
        this.q = f860Var;
        this.r = s1lVar;
        this.s = list;
        this.t = list2;
        this.u = c1lVar;
        this.v = str7;
        this.w = z12;
        this.M = iU;
        this.x = i2;
        this.y = i3;
        this.z = list3;
        this.A = str8;
        this.B = sce0Var;
        this.C = z13;
        this.D = z14;
        this.E = z15;
        this.F = z16;
        this.G = z17;
        this.H = z18;
        this.I = z19;
        this.J = i4;
        this.K = bool;
    }

    @Override // p.l0l
    public final int A() {
        return this.x;
    }

    @Override // p.l0l
    public final boolean B() {
        return this.G;
    }

    @Override // p.l0l
    public final boolean C() {
        return this.C;
    }

    @Override // p.l0l
    public final f860 D() {
        return this.q;
    }

    @Override // p.l0l
    public final String E() {
        return this.o;
    }

    @Override // p.l0l
    public final boolean F() {
        return this.l;
    }

    @Override // p.l0l
    public final c1l G() {
        return this.u;
    }

    @Override // p.l0l
    public final String H() {
        return this.e;
    }

    @Override // p.l0l
    public final boolean I() {
        return this.n;
    }

    @Override // p.l0l
    public final int c() {
        return this.y;
    }

    @Override // p.l0l
    public final String d() {
        return this.d;
    }

    @Override // p.l0l
    public final boolean e() {
        return this.F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnr)) {
            return false;
        }
        nnr nnrVar = (nnr) obj;
        return this.a.equals(nnrVar.a) && u890.j(this.b, nnrVar.b) && this.c == nnrVar.c && this.L == nnrVar.L && this.d.equals(nnrVar.d) && u890.j(this.e, nnrVar.e) && this.f == nnrVar.f && this.g == nnrVar.g && this.h == nnrVar.h && this.i == nnrVar.i && this.j == nnrVar.j && this.k == nnrVar.k && this.l == nnrVar.l && this.m == nnrVar.m && this.n == nnrVar.n && this.o.equals(nnrVar.o) && this.f80p.equals(nnrVar.f80p) && this.q.equals(nnrVar.q) && u890.j(this.r, nnrVar.r) && u890.j(this.s, nnrVar.s) && u890.j(this.t, nnrVar.t) && this.u.equals(nnrVar.u) && u890.j(this.v, nnrVar.v) && this.w == nnrVar.w && this.M == nnrVar.M && this.x == nnrVar.x && this.y == nnrVar.y && u890.j(this.z, nnrVar.z) && u890.j(this.A, nnrVar.A) && this.B.equals(nnrVar.B) && this.C == nnrVar.C && this.D == nnrVar.D && this.E == nnrVar.E && this.F == nnrVar.F && this.G == nnrVar.G && this.H == nnrVar.H && this.I == nnrVar.I && cev0.u(this.J, nnrVar.J) && u890.j(this.K, nnrVar.K);
    }

    @Override // p.l0l
    public final boolean f() {
        return this.j;
    }

    @Override // p.l0l
    public final boolean g() {
        return this.k;
    }

    @Override // p.l0l
    public final List getCapabilities() {
        return this.t;
    }

    @Override // p.l0l
    public final String getName() {
        return this.b;
    }

    @Override // p.l0l
    public final int getState() {
        return this.M;
    }

    @Override // p.l0l
    public final f0u getType() {
        return this.c;
    }

    @Override // p.l0l
    public final List h() {
        return this.s;
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.L, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.d);
        String str = this.e;
        int iHashCode = (this.q.hashCode() + cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f80p)) * 31;
        s1l s1lVar = this.r;
        int iF = (cev0.F(this.J) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.B.hashCode() + cy30.d(f4i1.b(kaa0.f(this.y, kaa0.f(this.x, ab80.k(this.M, xcg1.g(cy30.d((this.u.hashCode() + f4i1.b(f4i1.b((iHashCode + (s1lVar == null ? 0 : s1lVar.hashCode())) * 31, 31, this.s), 31, this.t)) * 31, 31, this.v), 31, this.w), 31), 31), 31), 31, this.z), 31, this.A)) * 31, 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I)) * 31;
        Boolean bool = this.K;
        return (iF + (bool != null ? bool.hashCode() : 0)) * 31;
    }

    @Override // p.l0l
    public final int i() {
        return this.J;
    }

    @Override // p.l0l
    public final boolean isActive() {
        return this.h;
    }

    @Override // p.l0l
    public final String j() {
        return this.a;
    }

    @Override // p.l0l
    public final boolean k() {
        return this.m;
    }

    @Override // p.l0l
    public final boolean l() {
        return true;
    }

    @Override // p.l0l
    public final boolean m() {
        return this.D;
    }

    @Override // p.l0l
    public final boolean n() {
        return this.w;
    }

    @Override // p.l0l
    public final boolean o() {
        return this.i;
    }

    @Override // p.l0l
    public final int p() {
        return this.L;
    }

    @Override // p.l0l
    public final String q() {
        return this.A;
    }

    @Override // p.l0l
    public final String r() {
        return this.v;
    }

    @Override // p.l0l
    public final String s() {
        return this.f80p;
    }

    @Override // p.l0l
    public final boolean t() {
        return this.E;
    }

    @Override // p.l0l
    public final fj50 u() {
        return null;
    }

    @Override // p.l0l
    public final boolean v() {
        return this.f;
    }

    @Override // p.l0l
    public final boolean w() {
        return false;
    }

    @Override // p.l0l
    public final List x() {
        return this.z;
    }

    @Override // p.l0l
    public final Boolean y() {
        return this.K;
    }

    @Override // p.l0l
    public final boolean z() {
        return this.g;
    }
}
