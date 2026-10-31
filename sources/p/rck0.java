package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rck0 {
    public final m8w0 a;
    public final b8w0 b;
    public final boolean c;
    public final buk1 d;
    public final hez e;
    public final fa20 f;
    public final px30 g;
    public final k7f0 h;
    public final taa0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f69p;
    public final int q;
    public final boolean r;
    public final List s;
    public final boolean t;
    public final boolean u;

    public rck0(m8w0 m8w0Var, b8w0 b8w0Var, boolean z, buk1 buk1Var, hez hezVar, fa20 fa20Var, px30 px30Var, k7f0 k7f0Var, taa0 taa0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, List list, boolean z10, boolean z11) {
        this.a = m8w0Var;
        this.b = b8w0Var;
        this.c = z;
        this.d = buk1Var;
        this.e = hezVar;
        this.f = fa20Var;
        this.g = px30Var;
        this.h = k7f0Var;
        this.i = taa0Var;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.f69p = z8;
        this.q = i;
        this.r = z9;
        this.s = list;
        this.t = z10;
        this.u = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rck0)) {
            return false;
        }
        rck0 rck0Var = (rck0) obj;
        return u890.j(this.a, rck0Var.a) && this.b == rck0Var.b && this.c == rck0Var.c && u890.j(this.d, rck0Var.d) && u890.j(this.e, rck0Var.e) && u890.j(this.f, rck0Var.f) && u890.j(this.g, rck0Var.g) && u890.j(this.h, rck0Var.h) && u890.j(this.i, rck0Var.i) && this.j == rck0Var.j && this.k == rck0Var.k && this.l == rck0Var.l && this.m == rck0Var.m && this.n == rck0Var.n && this.o == rck0Var.o && this.f69p == rck0Var.f69p && this.q == rck0Var.q && this.r == rck0Var.r && u890.j(this.s, rck0Var.s) && this.t == rck0Var.t && this.u == rck0Var.u;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b8w0 b8w0Var = this.b;
        int iG = xcg1.g((iHashCode + (b8w0Var == null ? 0 : b8w0Var.hashCode())) * 31, 31, this.c);
        buk1 buk1Var = this.d;
        int iHashCode2 = (iG + (buk1Var == null ? 0 : buk1Var.a.hashCode())) * 31;
        hez hezVar = this.e;
        int iHashCode3 = (iHashCode2 + (hezVar == null ? 0 : hezVar.a.hashCode())) * 31;
        fa20 fa20Var = this.f;
        int iHashCode4 = (iHashCode3 + (fa20Var == null ? 0 : fa20Var.a.hashCode())) * 31;
        px30 px30Var = this.g;
        int iHashCode5 = (iHashCode4 + (px30Var == null ? 0 : px30Var.a.hashCode())) * 31;
        k7f0 k7f0Var = this.h;
        int iHashCode6 = (iHashCode5 + (k7f0Var == null ? 0 : k7f0Var.a.hashCode())) * 31;
        taa0 taa0Var = this.i;
        return Boolean.hashCode(this.u) + xcg1.g(f4i1.b(xcg1.g(ab80.k(this.q, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode6 + (taa0Var != null ? taa0Var.a.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f69p), 31), 31, this.r), 31, this.s), 31, this.t);
    }
}
