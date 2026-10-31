package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k5a1 {
    public final boolean A;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final List i;
    public final rqb1 j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f48p;
    public final boolean q;
    public final tpt r;
    public final wg61 s;
    public final fb61 t;
    public final td61 u;
    public final boolean v;
    public final boolean w;
    public final wi61 x;
    public final boolean y;
    public final boolean z;

    public k5a1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, List list, rqb1 rqb1Var, int i, int i2, String str3, String str4, Integer num, boolean z7, boolean z8, tpt tptVar, wg61 wg61Var, fb61 fb61Var, td61 td61Var, boolean z9, boolean z10, wi61 wi61Var, boolean z11, boolean z12, boolean z13) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = str;
        this.h = str2;
        this.i = list;
        this.j = rqb1Var;
        this.k = i;
        this.l = i2;
        this.m = str3;
        this.n = str4;
        this.o = num;
        this.f48p = z7;
        this.q = z8;
        this.r = tptVar;
        this.s = wg61Var;
        this.t = fb61Var;
        this.u = td61Var;
        this.v = z9;
        this.w = z10;
        this.x = wi61Var;
        this.y = z11;
        this.z = z12;
        this.A = z13;
    }

    public final a0s0 a() {
        Object next;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((a0s0) next).g()) {
                return (a0s0) next;
            }
        }
        next = null;
        return (a0s0) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5a1)) {
            return false;
        }
        k5a1 k5a1Var = (k5a1) obj;
        return this.a == k5a1Var.a && this.b == k5a1Var.b && this.c == k5a1Var.c && this.d == k5a1Var.d && this.e == k5a1Var.e && this.f == k5a1Var.f && u890.j(this.g, k5a1Var.g) && u890.j(this.h, k5a1Var.h) && u890.j(this.i, k5a1Var.i) && this.j == k5a1Var.j && this.k == k5a1Var.k && this.l == k5a1Var.l && u890.j(this.m, k5a1Var.m) && u890.j(this.n, k5a1Var.n) && u890.j(this.o, k5a1Var.o) && this.f48p == k5a1Var.f48p && this.q == k5a1Var.q && u890.j(this.r, k5a1Var.r) && u890.j(this.s, k5a1Var.s) && u890.j(this.t, k5a1Var.t) && u890.j(this.u, k5a1Var.u) && this.v == k5a1Var.v && this.w == k5a1Var.w && u890.j(this.x, k5a1Var.x) && this.y == k5a1Var.y && this.z == k5a1Var.z && this.A == k5a1Var.A;
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iK = ab80.k(this.l, ab80.k(this.k, (this.j.hashCode() + f4i1.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.i)) * 31, 31), 31);
        String str2 = this.m;
        int iHashCode = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.o;
        int iG = xcg1.g(xcg1.g((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f48p), 31, this.q);
        tpt tptVar = this.r;
        int iHashCode3 = (iG + (tptVar == null ? 0 : tptVar.hashCode())) * 31;
        wg61 wg61Var = this.s;
        int iHashCode4 = (iHashCode3 + (wg61Var == null ? 0 : wg61Var.hashCode())) * 31;
        fb61 fb61Var = this.t;
        int iHashCode5 = (iHashCode4 + (fb61Var == null ? 0 : fb61Var.hashCode())) * 31;
        td61 td61Var = this.u;
        int iG2 = xcg1.g(xcg1.g((iHashCode5 + (td61Var == null ? 0 : td61Var.hashCode())) * 31, 31, this.v), 31, this.w);
        wi61 wi61Var = this.x;
        return Boolean.hashCode(this.A) + xcg1.g(xcg1.g((iG2 + (wi61Var != null ? wi61Var.hashCode() : 0)) * 31, 31, this.y), 31, this.z);
    }

    public /* synthetic */ k5a1() {
        this(false, false, false, false, false, false, "", null, z6x.a, rqb1.a, 1, 1, null, null, null, false, false, null, null, null, null, false, false, null, false, false, false);
    }
}
