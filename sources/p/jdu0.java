package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jdu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f44p;
    public final boolean q;
    public final List r;
    public final Set s;
    public final boolean t;
    public final boolean u;
    public final String v;

    public jdu0(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, List list, Set set, boolean z9, boolean z10, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = j;
        this.i = j2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.f44p = z7;
        this.q = z8;
        this.r = list;
        this.s = set;
        this.t = z9;
        this.u = z10;
        this.v = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdu0)) {
            return false;
        }
        jdu0 jdu0Var = (jdu0) obj;
        return u890.j(this.a, jdu0Var.a) && u890.j(this.b, jdu0Var.b) && u890.j(this.c, jdu0Var.c) && u890.j(this.d, jdu0Var.d) && u890.j(this.e, jdu0Var.e) && u890.j(this.f, jdu0Var.f) && u890.j(this.g, jdu0Var.g) && this.h == jdu0Var.h && this.i == jdu0Var.i && this.j == jdu0Var.j && this.k == jdu0Var.k && this.l == jdu0Var.l && this.m == jdu0Var.m && this.n == jdu0Var.n && this.o == jdu0Var.o && this.f44p == jdu0Var.f44p && this.q == jdu0Var.q && u890.j(this.r, jdu0Var.r) && u890.j(this.s, jdu0Var.s) && this.t == jdu0Var.t && this.u == jdu0Var.u && u890.j(this.v, jdu0Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + xcg1.g(xcg1.g(gvg.c(f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.f(cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), this.h, 31), this.i, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f44p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
    }

    public /* synthetic */ jdu0() {
        this("", "", "", "", "", "", "", 0L, 0L, false, false, false, false, false, false, false, false, z6x.a, w7x.a, false, false, "");
    }
}
