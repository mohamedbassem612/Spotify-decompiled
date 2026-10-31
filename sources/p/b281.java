package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b281 {
    public String a;
    public String b;
    public String c;
    public final String d;
    public long e;
    public String f;
    public String g;
    public cen h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public long m;
    public String n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f0p;
    public f281 q;
    public boolean r;
    public boolean s;
    public d281 t;
    public e281 u;
    public tu00 v;
    public xwp0 w;
    public int x;
    public Map y;

    public b281() {
        cen cenVar = new cen();
        f281 f281Var = f281.d;
        d281 d281Var = d281.a;
        e281 e281Var = e281.a;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0L;
        this.f = "";
        this.g = null;
        this.h = cenVar;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = "";
        this.m = -1L;
        this.n = "";
        this.o = "";
        this.f0p = 0;
        this.q = f281Var;
        this.r = false;
        this.s = false;
        this.t = d281Var;
        this.u = e281Var;
        this.v = tu00.a;
        this.w = rwp0.a;
        this.x = 1;
        this.y = b7x.a;
    }

    public final g281 a() {
        String str = this.a;
        String str2 = this.b;
        cen cenVar = this.h;
        f281 f281Var = this.q;
        String str3 = this.c;
        String str4 = this.g;
        boolean z = this.i;
        boolean z2 = this.j;
        long j = this.e;
        String str5 = this.f;
        boolean z3 = this.k;
        xwp0 xwp0Var = this.w;
        d281 d281Var = this.t;
        e281 e281Var = this.u;
        String str6 = this.l;
        tu00 tu00Var = this.v;
        int i = this.x;
        return new g281(str, str2, str3, this.d, j, str5, str4, cenVar, z, z2, z3, str6, this.m, this.n, this.o, this.f0p, f281Var, d281Var, e281Var, this.r, this.s, tu00Var, xwp0Var, i, this.y, 134217728);
    }

    public final void b(d281 d281Var) {
        this.t = d281Var;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(cen cenVar) {
        this.h = cenVar;
    }

    public final void e(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b281)) {
            return false;
        }
        b281 b281Var = (b281) obj;
        return u890.j(this.a, b281Var.a) && u890.j(this.b, b281Var.b) && u890.j(this.c, b281Var.c) && u890.j(this.d, b281Var.d) && this.e == b281Var.e && u890.j(this.f, b281Var.f) && u890.j(this.g, b281Var.g) && u890.j(this.h, b281Var.h) && this.i == b281Var.i && this.j == b281Var.j && this.k == b281Var.k && u890.j(this.l, b281Var.l) && this.m == b281Var.m && u890.j(this.n, b281Var.n) && u890.j(this.o, b281Var.o) && this.f0p == b281Var.f0p && this.q == b281Var.q && this.r == b281Var.r && this.s == b281Var.s && this.t == b281Var.t && this.u == b281Var.u && u890.j(this.v, b281Var.v) && u890.j(this.w, b281Var.w) && this.x == b281Var.x && u890.j(this.y, b281Var.y);
    }

    public final void f(boolean z) {
        this.j = z;
    }

    public final void g(jv00 jv00Var) {
        this.v = jv00Var;
    }

    public final void h(boolean z) {
        this.k = z;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(cy30.d(cy30.d(cy30.d(kaa0.f(0, this.a.hashCode() * 31, 31), 961, this.b), 31, this.c), 31, this.d), this.e, 31), 31, this.f);
        String str = this.g;
        return this.y.hashCode() + ab80.k(this.x, (this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + xcg1.g(xcg1.g((this.q.hashCode() + kaa0.f(this.f0p, cy30.d(cy30.d(cy30.f(xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g((this.h.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, false), this.m, 31), 31, this.n), 31, this.o), 31)) * 31, 31, this.r), 31, this.s)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final void i(LinkedHashMap linkedHashMap) {
        this.y = linkedHashMap;
    }

    public final void j(boolean z) {
        this.s = z;
    }

    public final void k(boolean z) {
        this.r = z;
    }

    public final void l(boolean z) {
        this.i = z;
    }

    public final void m(e281 e281Var) {
        this.u = e281Var;
    }

    public final void n() {
        this.m = -1L;
    }

    public final void o(String str) {
        this.n = str;
    }

    public final void p(f281 f281Var) {
        this.q = f281Var;
    }

    public final void q(String str) {
        this.b = str;
    }

    public final void r(xwp0 xwp0Var) {
        this.w = xwp0Var;
    }

    public final void s(int i) {
        this.x = i;
    }

    public final void t(int i) {
        this.f0p = i;
    }

    public final void u(long j) {
        this.e = j;
    }

    public final void v(String str) {
        this.c = str;
    }

    public final void w(String str) {
        this.o = str;
    }

    public final void x(String str) {
        this.l = str;
    }

    public final void y(String str) {
        this.a = str;
    }
}
