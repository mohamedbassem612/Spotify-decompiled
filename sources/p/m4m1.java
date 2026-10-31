package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m4m1 extends o4m1 {
    public final ws61 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final List k;
    public final Set l;
    public final Integer m;
    public final boolean n;
    public final gzl1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final gj4 v;
    public final boolean w;

    public m4m1(ws61 ws61Var, ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list, Set set, Integer num, boolean z, gzl1 gzl1Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, gj4 gj4Var, boolean z8) {
        this.a = ws61Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = list;
        this.l = set;
        this.m = num;
        this.n = z;
        this.o = gzl1Var;
        this.f17p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = gj4Var;
        this.w = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4m1)) {
            return false;
        }
        m4m1 m4m1Var = (m4m1) obj;
        return this.a == m4m1Var.a && this.b.equals(m4m1Var.b) && this.c == m4m1Var.c && this.d == m4m1Var.d && this.e == m4m1Var.e && this.f == m4m1Var.f && this.g == m4m1Var.g && this.h == m4m1Var.h && this.i == m4m1Var.i && this.j == m4m1Var.j && u890.j(this.k, m4m1Var.k) && u890.j(this.l, m4m1Var.l) && u890.j(this.m, m4m1Var.m) && this.n == m4m1Var.n && this.o == m4m1Var.o && this.f17p == m4m1Var.f17p && this.q == m4m1Var.q && this.r == m4m1Var.r && this.s == m4m1Var.s && this.t == m4m1Var.t && this.u == m4m1Var.u && this.v == m4m1Var.v && this.w == m4m1Var.w;
    }

    public final int hashCode() {
        int iC = gvg.c(f4i1.b(kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.k), 31, this.l);
        Integer num = this.m;
        return Boolean.hashCode(this.w) + ((this.v.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.o.hashCode() + xcg1.g((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.n)) * 31, 31, this.f17p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u)) * 31);
    }
}
