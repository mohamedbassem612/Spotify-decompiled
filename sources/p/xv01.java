package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xv01 implements vv01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final m9m g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final m87 o;

    public xv01(String str, String str2, String str3, String str4, String str5, List list, m9m m9mVar, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, m87 m87Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = m9mVar;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = i;
        this.m = z5;
        this.n = z6;
        this.o = m87Var;
    }

    public final int a() {
        return this.l;
    }

    public final m9m b() {
        return this.g;
    }

    public final boolean c() {
        return this.k;
    }

    public final String d() {
        return this.b;
    }

    public final m87 e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv01)) {
            return false;
        }
        xv01 xv01Var = (xv01) obj;
        if (!this.a.equals(xv01Var.a) || !this.b.equals(xv01Var.b) || !this.c.equals(xv01Var.c) || !this.d.equals(xv01Var.d) || !this.e.equals(xv01Var.e) || !u890.j(this.f, xv01Var.f) || this.g != xv01Var.g || this.h != xv01Var.h || this.i != xv01Var.i || this.j != xv01Var.j || this.k != xv01Var.k || this.l != xv01Var.l || this.m != xv01Var.m || this.n != xv01Var.n || !u890.j(this.o, xv01Var.o)) {
            return false;
        }
        x47 x47Var = x47.a;
        return x47Var.equals(x47Var);
    }

    public final boolean f() {
        return this.m;
    }

    public final boolean g() {
        return this.j;
    }

    public final String getContentDescription() {
        return this.e;
    }

    public final String getEntityUri() {
        return this.a;
    }

    public final String getSubtitle() {
        return this.d;
    }

    public final String getTitle() {
        return this.c;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        m9m m9mVar = this.g;
        int iG = xcg1.g(xcg1.g(kaa0.f(this.l, xcg1.g(xcg1.g(xcg1.g(xcg1.g((iB + (m9mVar == null ? 0 : m9mVar.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n);
        m87 m87Var = this.o;
        return ((iG + (m87Var != null ? m87Var.hashCode() : 0)) * 31) - 1076158992;
    }

    public final x47 i() {
        return x47.a;
    }

    public final boolean j() {
        return this.i;
    }

    public final List k() {
        return this.f;
    }

    public final boolean l() {
        return this.n;
    }
}
