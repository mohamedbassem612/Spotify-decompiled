package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zuc0 {
    public final String a;
    public final int b;
    public final String c;
    public final x4i1 d;
    public final boolean e;
    public final List f;
    public final Map g;
    public final pc41 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final fbp1 n;
    public final fbp1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lkj0 f111p;
    public final tu00 q;
    public final idd1 r = new idd1(new yuc0(this, (byte) 4));
    public final idd1 s = new idd1(new cc00(this, (byte) 21));
    public final idd1 t = new idd1(new yuc0(this, (byte) 1));
    public final idd1 u = new idd1(new yuc0(this, (byte) 2));
    public final idd1 v = new idd1(new yuc0(this, (byte) 0));
    public final idd1 w = new idd1(new yuc0(this, (byte) 3));

    public zuc0(String str, int i, String str2, x4i1 x4i1Var, boolean z, List list, Map map, pc41 pc41Var, String str3, boolean z2, boolean z3, boolean z4, boolean z5, fbp1 fbp1Var, fbp1 fbp1Var2, lkj0 lkj0Var, tu00 tu00Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = x4i1Var;
        this.e = z;
        this.f = list;
        this.g = map;
        this.h = pc41Var;
        this.i = str3;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = fbp1Var;
        this.o = fbp1Var2;
        this.f111p = lkj0Var;
        this.q = tu00Var;
    }

    public final String a(int i) {
        lkj0 lkj0Var = this.f111p;
        if (lkj0Var instanceof hkj0) {
            return "";
        }
        if (lkj0Var instanceof fjf1) {
            return ((fjf1) lkj0Var).a.a().a(i);
        }
        if (lkj0Var instanceof k1z) {
            return ((k1z) lkj0Var).a(i);
        }
        eg.o();
        return null;
    }

    public final ltt0 b() {
        return (ltt0) this.w.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuc0)) {
            return false;
        }
        zuc0 zuc0Var = (zuc0) obj;
        return u890.j(this.a, zuc0Var.a) && this.b == zuc0Var.b && u890.j(this.c, zuc0Var.c) && u890.j(this.d, zuc0Var.d) && this.e == zuc0Var.e && u890.j(this.f, zuc0Var.f) && u890.j(this.g, zuc0Var.g) && u890.j(this.h, zuc0Var.h) && this.i.equals(zuc0Var.i) && this.j == zuc0Var.j && this.k == zuc0Var.k && this.l == zuc0Var.l && this.m == zuc0Var.m && u890.j(this.n, zuc0Var.n) && u890.j(this.o, zuc0Var.o) && u890.j(this.f111p, zuc0Var.f111p) && u890.j(this.q, zuc0Var.q);
    }

    public final boolean f() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        x4i1 x4i1Var = this.d;
        int iE = cy30.e(f4i1.b(xcg1.g((iD + (x4i1Var == null ? 0 : x4i1Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        pc41 pc41Var = this.h;
        int iHashCode = (this.n.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((iE + (pc41Var == null ? 0 : pc41Var.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31;
        fbp1 fbp1Var = this.o;
        int iHashCode2 = fbp1Var != null ? fbp1Var.hashCode() : 0;
        return this.q.hashCode() + ((this.f111p.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }
}
