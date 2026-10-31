package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class itw0 extends ktw0 {
    public final Set l;
    public final Set m;
    public final Set n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f75p;
    public final Set q;
    public final boolean r;
    public final Set s;
    public final boolean t;
    public final boolean u;

    public itw0(Set set, Set set2, Set set3, Set set4, Set set5, Set set6, boolean z, Set set7, boolean z2, boolean z3) {
        super(2, set, set2, set3, set6, set4, set5, z, set7, z2, z3);
        this.l = set;
        this.m = set2;
        this.n = set3;
        this.o = set4;
        this.f75p = set5;
        this.q = set6;
        this.r = z;
        this.s = set7;
        this.t = z2;
        this.u = z3;
    }

    public final Set a() {
        return this.l;
    }

    public final Set b() {
        return this.f75p;
    }

    public final Set c() {
        return this.o;
    }

    public final Set d() {
        return this.q;
    }

    public final Set e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itw0)) {
            return false;
        }
        itw0 itw0Var = (itw0) obj;
        return u890.j(this.l, itw0Var.l) && u890.j(this.m, itw0Var.m) && u890.j(this.n, itw0Var.n) && u890.j(this.o, itw0Var.o) && u890.j(this.f75p, itw0Var.f75p) && u890.j(this.q, itw0Var.q) && this.r == itw0Var.r && u890.j(this.s, itw0Var.s) && this.t == itw0Var.t && this.u == itw0Var.u;
    }

    public final Set f() {
        return this.m;
    }

    public final Set g() {
        return this.s;
    }

    public final boolean h() {
        return this.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + xcg1.g(gvg.c(xcg1.g(gvg.c(gvg.c(gvg.c(gvg.c(gvg.c(this.l.hashCode() * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.f75p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final boolean j() {
        return this.t;
    }

    public final boolean k() {
        return this.u;
    }
}
