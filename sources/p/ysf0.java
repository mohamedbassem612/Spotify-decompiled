package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ysf0 {
    public final xsf0 a;
    public final boolean b;
    public final ArrayList c;
    public final usf0 d;
    public final rsf0 e;
    public final boolean f;
    public final msf0 g;
    public final float h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final iu30 n;
    public final iu30 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19p;
    public final boolean q;
    public final boolean r;
    public final float s;
    public final boolean t;

    public ysf0(xsf0 xsf0Var, boolean z, ArrayList arrayList, usf0 usf0Var, rsf0 rsf0Var, boolean z2, msf0 msf0Var, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, iu30 iu30Var, iu30 iu30Var2, boolean z7, boolean z8, boolean z9, float f2, boolean z10) {
        this.a = xsf0Var;
        this.b = z;
        this.c = arrayList;
        this.d = usf0Var;
        this.e = rsf0Var;
        this.f = z2;
        this.g = msf0Var;
        this.h = f;
        this.i = i;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = iu30Var;
        this.o = iu30Var2;
        this.f19p = z7;
        this.q = z8;
        this.r = z9;
        this.s = f2;
        this.t = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysf0)) {
            return false;
        }
        ysf0 ysf0Var = (ysf0) obj;
        return this.a.equals(ysf0Var.a) && this.b == ysf0Var.b && this.c.equals(ysf0Var.c) && this.d.equals(ysf0Var.d) && this.e.equals(ysf0Var.e) && this.f == ysf0Var.f && this.g.equals(ysf0Var.g) && Float.compare(this.h, ysf0Var.h) == 0 && this.i == ysf0Var.i && this.j == ysf0Var.j && this.k == ysf0Var.k && this.l == ysf0Var.l && this.m == ysf0Var.m && u890.j(this.n, ysf0Var.n) && u890.j(this.o, ysf0Var.o) && this.f19p == ysf0Var.f19p && this.q == ysf0Var.q && this.r == ysf0Var.r && Float.compare(this.s, ysf0Var.s) == 0 && this.t == ysf0Var.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + x0d.f(xcg1.g(xcg1.g(xcg1.g(ktd.g(this.o, ktd.g(this.n, xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.i, x0d.f((this.g.hashCode() + xcg1.g((this.e.hashCode() + ((this.d.hashCode() + p3d1.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31, 31, this.f)) * 31, 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31), 31, this.f19p), 31, this.q), 31, this.r), 31, this.s);
    }
}
