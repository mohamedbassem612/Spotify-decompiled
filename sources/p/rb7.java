package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rb7 {
    public final qb7 a;
    public final boolean b;
    public final String c;
    public final List d;
    public final List e;
    public final c9 f;
    public final c9 g;
    public final sfu0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f58p;
    public final boolean q;
    public final List r;
    public final Map s;
    public final x7i1 t;
    public final String u;

    public rb7(qb7 qb7Var, boolean z, String str, List list, List list2, c9 c9Var, c9 c9Var2, sfu0 sfu0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list3, Map map, x7i1 x7i1Var, String str2) {
        this.a = qb7Var;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = c9Var;
        this.g = c9Var2;
        this.h = sfu0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.f58p = z9;
        this.q = z10;
        this.r = list3;
        this.s = map;
        this.t = x7i1Var;
        this.u = str2;
    }

    public static rb7 a(rb7 rb7Var, boolean z, String str, List list, List list2, c9 c9Var, c9 c9Var2, sfu0 sfu0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, List list3, Map map, x7i1 x7i1Var, String str2, int i) {
        return new rb7(rb7Var.a, (i & 2) != 0 ? rb7Var.b : z, (i & 4) != 0 ? rb7Var.c : str, (i & 8) != 0 ? rb7Var.d : list, (i & 16) != 0 ? rb7Var.e : list2, (i & 32) != 0 ? rb7Var.f : c9Var, (i & 64) != 0 ? rb7Var.g : c9Var2, (i & 128) != 0 ? rb7Var.h : sfu0Var, (i & 256) != 0 ? rb7Var.i : z2, (i & 512) != 0 ? rb7Var.j : z3, (i & 1024) != 0 ? rb7Var.k : z4, (i & 2048) != 0 ? rb7Var.l : z5, (i & 4096) != 0 ? rb7Var.m : z6, (i & 8192) != 0 ? rb7Var.n : z7, (i & 16384) != 0 ? rb7Var.o : z8, (i & 32768) != 0 ? rb7Var.f58p : z9, (i & 65536) != 0 ? rb7Var.q : z10, (i & 131072) != 0 ? rb7Var.r : list3, (i & 262144) != 0 ? rb7Var.s : map, (i & 524288) != 0 ? rb7Var.t : x7i1Var, (i & 1048576) != 0 ? rb7Var.u : str2);
    }

    public final List b() {
        return o7h.j0(o7h.N0(this.d, this.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb7)) {
            return false;
        }
        rb7 rb7Var = (rb7) obj;
        return this.a == rb7Var.a && this.b == rb7Var.b && u890.j(this.c, rb7Var.c) && u890.j(this.d, rb7Var.d) && u890.j(this.e, rb7Var.e) && u890.j(this.f, rb7Var.f) && u890.j(this.g, rb7Var.g) && u890.j(this.h, rb7Var.h) && this.i == rb7Var.i && this.j == rb7Var.j && this.k == rb7Var.k && this.l == rb7Var.l && this.m == rb7Var.m && this.n == rb7Var.n && this.o == rb7Var.o && this.f58p == rb7Var.f58p && this.q == rb7Var.q && u890.j(this.r, rb7Var.r) && u890.j(this.s, rb7Var.s) && this.t.equals(rb7Var.t) && this.u.equals(rb7Var.u);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.u.hashCode() + ((this.t.hashCode() + cy30.e(f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + f4i1.b(f4i1.b((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31)) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f58p), 31, this.q), 31, this.r), 31, this.s)) * 31);
    }
}
