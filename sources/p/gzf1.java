package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gzf1 {
    public final String a;
    public final String b;
    public final k4m c;
    public final boolean d;
    public final ezf1 e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final s27 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f25p;
    public final boolean q;
    public final boolean r;
    public final aak0 s;

    public gzf1(String str, String str2, k4m k4mVar, boolean z, ezf1 ezf1Var, boolean z2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, s27 s27Var, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, aak0 aak0Var) {
        this.a = str;
        this.b = str2;
        this.c = k4mVar;
        this.d = z;
        this.e = ezf1Var;
        this.f = z2;
        this.g = z3;
        this.h = list;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = s27Var;
        this.n = z8;
        this.o = z9;
        this.f25p = z10;
        this.q = z11;
        this.r = z12;
        this.s = aak0Var;
    }

    public static gzf1 a(gzf1 gzf1Var, String str, String str2, s27 s27Var, boolean z, int i) {
        return new gzf1((i & 1) != 0 ? gzf1Var.a : str, (i & 2) != 0 ? gzf1Var.b : str2, gzf1Var.c, (i & 8) != 0 ? gzf1Var.d : false, (i & 16) != 0 ? gzf1Var.e : ezf1.a, gzf1Var.f, gzf1Var.g, gzf1Var.h, gzf1Var.i, gzf1Var.j, gzf1Var.k, gzf1Var.l, (i & 4096) != 0 ? gzf1Var.m : s27Var, gzf1Var.n, gzf1Var.o, gzf1Var.f25p, gzf1Var.q, (i & 131072) != 0 ? gzf1Var.r : z, gzf1Var.s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzf1)) {
            return false;
        }
        gzf1 gzf1Var = (gzf1) obj;
        return this.a.equals(gzf1Var.a) && this.b.equals(gzf1Var.b) && this.c == gzf1Var.c && this.d == gzf1Var.d && this.e == gzf1Var.e && this.f == gzf1Var.f && this.g == gzf1Var.g && u890.j(this.h, gzf1Var.h) && this.i == gzf1Var.i && this.j == gzf1Var.j && this.k == gzf1Var.k && this.l == gzf1Var.l && this.m.equals(gzf1Var.m) && this.n == gzf1Var.n && this.o == gzf1Var.o && this.f25p == gzf1Var.f25p && this.q == gzf1Var.q && this.r == gzf1Var.r && u890.j(this.s, gzf1Var.s);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.m.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g((this.e.hashCode() + xcg1.g(p3d1.g(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.f25p), 31, this.q), 31, this.r);
        aak0 aak0Var = this.s;
        return iG + (aak0Var == null ? 0 : aak0Var.hashCode());
    }
}
