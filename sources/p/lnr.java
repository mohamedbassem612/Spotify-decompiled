package p;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lnr implements l0l {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final Boolean J;
    public final fj50 K;
    public final String L;
    public final int M;
    public final int N;
    public final String a;
    public final String b;
    public final f0u c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f860 f10p;
    public final s1l q;
    public final List r;
    public final List s;
    public final c1l t;
    public final String u;
    public final boolean v;
    public final int w;
    public final int x;
    public final List y;
    public final String z;

    public lnr(e2l e2lVar, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int iR;
        boolean z4 = e2lVar.b;
        List<t880> list = e2lVar.s;
        String str3 = e2lVar.p;
        String str4 = e2lVar.n;
        String str5 = e2lVar.q;
        g0u g0uVar = e2lVar.r;
        f0u f0uVarL0 = hqq0.l0(g0uVar);
        boolean z5 = g0uVar == g0u.f || g0uVar == g0u.g;
        if (!z5) {
            for (t880 t880Var : list) {
                String str6 = t880Var.a;
                boolean z6 = t880Var.c;
                if (str6.equals("CAST") || str6.equals("CAST_JS")) {
                    z5 = z6;
                    break;
                }
            }
        }
        int i = z5 ? 2 : 1;
        boolean z7 = e2lVar.g;
        String str7 = e2lVar.o;
        boolean z8 = e2lVar.A;
        boolean z9 = e2lVar.i;
        boolean z10 = e2lVar.h;
        boolean z11 = e2lVar.E;
        String str8 = e2lVar.l;
        String str9 = e2lVar.m;
        try {
            try {
                if (!z4) {
                    z2 = z9;
                    z3 = true;
                    if (1 != e2lVar.P && !e2lVar.c) {
                    }
                    boolean z12 = e2lVar.f;
                    boolean z13 = e2lVar.v;
                    e860 e860Var = e2lVar.x;
                    boolean z14 = z3;
                    f860 f860Var = new f860(e860Var.c, e860Var.a);
                    s1l s1lVar = e2lVar.y;
                    List list2 = e2lVar.w;
                    boolean z15 = e2lVar.e;
                    boolean z16 = e2lVar.B;
                    boolean z17 = e2lVar.d;
                    int i2 = e2lVar.P;
                    boolean z18 = z2;
                    c1l c1lVar = new c1l(i2, str7, z15, z16, z17);
                    str = e2lVar.C;
                    str2 = str;
                    iR = ydh.r(hrt.w(i2).toUpperCase(Locale.ROOT));
                    int i3 = e2lVar.z;
                    int i4 = e2lVar.t;
                    List list3 = e2lVar.D;
                    String str10 = e2lVar.F;
                    boolean z19 = e2lVar.G;
                    boolean z20 = e2lVar.H;
                    boolean z21 = e2lVar.I;
                    boolean z22 = e2lVar.J;
                    boolean z23 = e2lVar.j;
                    boolean z24 = e2lVar.K;
                    boolean z25 = e2lVar.L;
                    int i5 = e2lVar.M;
                    Boolean bool = e2lVar.N;
                    fj50 fj50Var = e2lVar.O;
                    this.a = str4;
                    this.b = str5;
                    this.c = f0uVarL0;
                    this.M = i;
                    this.d = str7;
                    this.e = z7;
                    this.f = z12;
                    this.g = z4;
                    this.h = z13;
                    this.i = z14;
                    this.j = z8;
                    this.k = z18;
                    this.l = z10;
                    this.m = z11;
                    this.n = str8;
                    this.o = str9;
                    this.f10p = f860Var;
                    this.q = s1lVar;
                    this.r = list;
                    this.s = list2;
                    this.t = c1lVar;
                    this.u = str2;
                    this.v = z16;
                    this.N = iR;
                    this.w = i3;
                    this.x = i4;
                    this.y = list3;
                    this.z = str10;
                    this.A = z19;
                    this.B = z20;
                    this.C = z21;
                    this.D = z22;
                    this.E = z23;
                    this.F = z24;
                    this.G = z25;
                    this.H = z;
                    this.I = i5;
                    this.J = bool;
                    this.K = fj50Var;
                    this.L = str3;
                }
                z2 = z9;
                iR = ydh.r(hrt.w(i2).toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
                iR = 22;
            }
            str2 = str;
        } catch (IllegalArgumentException unused2) {
            str2 = str;
        }
        z3 = false;
        boolean z110 = e2lVar.f;
        boolean z111 = e2lVar.v;
        e860 e860Var2 = e2lVar.x;
        boolean z112 = z3;
        f860 f860Var2 = new f860(e860Var2.c, e860Var2.a);
        s1l s1lVar2 = e2lVar.y;
        List list4 = e2lVar.w;
        boolean z113 = e2lVar.e;
        boolean z114 = e2lVar.B;
        boolean z115 = e2lVar.d;
        int i6 = e2lVar.P;
        boolean z116 = z2;
        c1l c1lVar2 = new c1l(i6, str7, z113, z114, z115);
        str = e2lVar.C;
        int i7 = e2lVar.z;
        int i8 = e2lVar.t;
        List list5 = e2lVar.D;
        String str11 = e2lVar.F;
        boolean z117 = e2lVar.G;
        boolean z26 = e2lVar.H;
        boolean z27 = e2lVar.I;
        boolean z28 = e2lVar.J;
        boolean z29 = e2lVar.j;
        boolean z210 = e2lVar.K;
        boolean z211 = e2lVar.L;
        int i9 = e2lVar.M;
        Boolean bool2 = e2lVar.N;
        fj50 fj50Var2 = e2lVar.O;
        this.a = str4;
        this.b = str5;
        this.c = f0uVarL0;
        this.M = i;
        this.d = str7;
        this.e = z7;
        this.f = z110;
        this.g = z4;
        this.h = z111;
        this.i = z112;
        this.j = z8;
        this.k = z116;
        this.l = z10;
        this.m = z11;
        this.n = str8;
        this.o = str9;
        this.f10p = f860Var2;
        this.q = s1lVar2;
        this.r = list;
        this.s = list4;
        this.t = c1lVar2;
        this.u = str2;
        this.v = z114;
        this.N = iR;
        this.w = i7;
        this.x = i8;
        this.y = list5;
        this.z = str11;
        this.A = z117;
        this.B = z26;
        this.C = z27;
        this.D = z28;
        this.E = z29;
        this.F = z210;
        this.G = z211;
        this.H = z;
        this.I = i9;
        this.J = bool2;
        this.K = fj50Var2;
        this.L = str3;
    }

    public final int A() {
        return this.w;
    }

    public final boolean B() {
        return this.E;
    }

    public final boolean C() {
        return this.A;
    }

    public final f860 D() {
        return this.f10p;
    }

    public final String E() {
        return this.n;
    }

    public final boolean F() {
        return this.k;
    }

    public final c1l G() {
        return this.t;
    }

    public final String H() {
        return this.L;
    }

    public final boolean I() {
        return this.m;
    }

    public final int c() {
        return this.x;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnr)) {
            return false;
        }
        lnr lnrVar = (lnr) obj;
        return u890.j(this.a, lnrVar.a) && u890.j(this.b, lnrVar.b) && this.c == lnrVar.c && this.M == lnrVar.M && u890.j(this.d, lnrVar.d) && this.e == lnrVar.e && this.f == lnrVar.f && this.g == lnrVar.g && this.h == lnrVar.h && this.i == lnrVar.i && this.j == lnrVar.j && this.k == lnrVar.k && this.l == lnrVar.l && this.m == lnrVar.m && u890.j(this.n, lnrVar.n) && u890.j(this.o, lnrVar.o) && u890.j(this.f10p, lnrVar.f10p) && u890.j(this.q, lnrVar.q) && u890.j(this.r, lnrVar.r) && u890.j(this.s, lnrVar.s) && u890.j(this.t, lnrVar.t) && u890.j(this.u, lnrVar.u) && this.v == lnrVar.v && this.N == lnrVar.N && this.w == lnrVar.w && this.x == lnrVar.x && u890.j(this.y, lnrVar.y) && u890.j(this.z, lnrVar.z) && this.A == lnrVar.A && this.B == lnrVar.B && this.C == lnrVar.C && this.D == lnrVar.D && this.E == lnrVar.E && this.F == lnrVar.F && this.G == lnrVar.G && this.H == lnrVar.H && this.I == lnrVar.I && u890.j(this.J, lnrVar.J) && u890.j(this.K, lnrVar.K) && u890.j(this.L, lnrVar.L);
    }

    public final boolean f() {
        return this.i;
    }

    public final boolean g() {
        return this.j;
    }

    public final List getCapabilities() {
        return this.s;
    }

    public final String getName() {
        return this.b;
    }

    public final int getState() {
        return this.N;
    }

    public final f0u getType() {
        return this.c;
    }

    public final List h() {
        return this.r;
    }

    public final int hashCode() {
        int iHashCode = (this.f10p.hashCode() + cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(ab80.k(this.M, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o)) * 31;
        s1l s1lVar = this.q;
        int iF = kaa0.f(this.I, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(f4i1.b(kaa0.f(this.x, kaa0.f(this.w, ab80.k(this.N, xcg1.g(cy30.d((this.t.hashCode() + f4i1.b(f4i1.b((iHashCode + (s1lVar == null ? 0 : s1lVar.hashCode())) * 31, 31, this.r), 31, this.s)) * 31, 31, this.u), 31, this.v), 31), 31), 31), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31);
        Boolean bool = this.J;
        int iHashCode2 = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        fj50 fj50Var = this.K;
        int iHashCode3 = (iHashCode2 + (fj50Var == null ? 0 : fj50Var.hashCode())) * 31;
        String str = this.L;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final int i() {
        return this.I;
    }

    public final boolean isActive() {
        return this.g;
    }

    public final String j() {
        return this.a;
    }

    public final boolean k() {
        return this.l;
    }

    public final boolean l() {
        return false;
    }

    public final boolean m() {
        return this.B;
    }

    public final boolean n() {
        return this.v;
    }

    public final boolean o() {
        return this.h;
    }

    public final int p() {
        return this.M;
    }

    public final String q() {
        return this.z;
    }

    public final String r() {
        return this.u;
    }

    public final String s() {
        return this.o;
    }

    public final boolean t() {
        return this.C;
    }

    public final fj50 u() {
        return this.K;
    }

    public final boolean v() {
        return this.e;
    }

    public final boolean w() {
        return this.H;
    }

    public final List x() {
        return this.y;
    }

    public final Boolean y() {
        return this.J;
    }

    public final boolean z() {
        return this.f;
    }
}
