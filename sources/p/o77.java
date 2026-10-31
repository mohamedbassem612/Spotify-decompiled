package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o77 {
    public final yrd a;
    public final qb7 b;
    public final int c;
    public final List d;
    public final boolean e;
    public final sfu0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final axq0 n;
    public final iu30 o;

    public o77(yrd yrdVar, qb7 qb7Var, int i, List list, boolean z, sfu0 sfu0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, axq0 axq0Var, iu30 iu30Var) {
        this.a = yrdVar;
        this.b = qb7Var;
        this.c = i;
        this.d = list;
        this.e = z;
        this.f = sfu0Var;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = axq0Var;
        this.o = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o77)) {
            return false;
        }
        o77 o77Var = (o77) obj;
        return u890.j(this.a, o77Var.a) && this.b == o77Var.b && this.c == o77Var.c && this.d.equals(o77Var.d) && this.e == o77Var.e && u890.j(this.f, o77Var.f) && this.g == o77Var.g && this.h == o77Var.h && this.i == o77Var.i && this.j == o77Var.j && this.k == o77Var.k && this.l == o77Var.l && this.m == o77Var.m && this.n.equals(o77Var.n) && this.o.equals(o77Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.f.hashCode() + xcg1.g(f4i1.b(kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31);
    }
}
