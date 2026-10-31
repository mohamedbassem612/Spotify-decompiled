package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wv01 implements vv01 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final m9m e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final m87 j;

    public wv01(String str, String str2, String str3, List list, m9m m9mVar, boolean z, int i, boolean z2, boolean z3, m87 m87Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = m9mVar;
        this.f = z;
        this.g = i;
        this.h = z2;
        this.i = z3;
        this.j = m87Var;
    }

    public final int a() {
        return this.g;
    }

    public final m9m b() {
        return this.e;
    }

    public final boolean c() {
        return false;
    }

    public final String d() {
        return this.b;
    }

    public final m87 e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv01)) {
            return false;
        }
        wv01 wv01Var = (wv01) obj;
        if (!this.a.equals(wv01Var.a) || !this.b.equals(wv01Var.b) || !this.c.equals(wv01Var.c) || !this.d.equals(wv01Var.d) || this.e != wv01Var.e || this.f != wv01Var.f || this.g != wv01Var.g || this.h != wv01Var.h || this.i != wv01Var.i || !u890.j(this.j, wv01Var.j)) {
            return false;
        }
        x47 x47Var = x47.a;
        return x47Var.equals(x47Var);
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return false;
    }

    public final String getContentDescription() {
        return this.c;
    }

    public final String getEntityUri() {
        return this.a;
    }

    public final String getSubtitle() {
        return "";
    }

    public final String getTitle() {
        return "";
    }

    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 29791, this.b), 31, this.c), 31, this.d);
        m9m m9mVar = this.e;
        int iG = xcg1.g(xcg1.g(kaa0.f(this.g, xcg1.g(xcg1.g(xcg1.g(xcg1.g((iB + (m9mVar == null ? 0 : m9mVar.hashCode())) * 31, 31, this.f), 31, false), 31, false), 31, false), 31), 31, this.h), 31, this.i);
        m87 m87Var = this.j;
        return ((iG + (m87Var != null ? m87Var.hashCode() : 0)) * 31) - 1076158992;
    }

    public final x47 i() {
        return x47.a;
    }

    public final boolean j() {
        return false;
    }

    public final List k() {
        return this.d;
    }

    public final boolean l() {
        return this.i;
    }
}
