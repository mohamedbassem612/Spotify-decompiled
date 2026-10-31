package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class htw0 extends ktw0 {
    public final int l;
    public final Set m;
    public final Set n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f32p;
    public final Set q;
    public final Set r;
    public final boolean s;
    public final Set t;
    public final boolean u;
    public final boolean v;

    public htw0(int i, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, boolean z, Set set7, boolean z2, boolean z3) {
        super(i, set, set2, set3, set4, set5, set6, z, set7, z2, z3);
        this.l = i;
        this.m = set;
        this.n = set2;
        this.o = set3;
        this.f32p = set4;
        this.q = set5;
        this.r = set6;
        this.s = z;
        this.t = set7;
        this.u = z2;
        this.v = z3;
    }

    @Override // p.ktw0
    public final Set a() {
        return this.m;
    }

    @Override // p.ktw0
    public final Set b() {
        return this.r;
    }

    @Override // p.ktw0
    public final Set c() {
        return this.q;
    }

    @Override // p.ktw0
    public final Set d() {
        return this.f32p;
    }

    @Override // p.ktw0
    public final Set e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htw0)) {
            return false;
        }
        htw0 htw0Var = (htw0) obj;
        return this.l == htw0Var.l && u890.j(this.m, htw0Var.m) && u890.j(this.n, htw0Var.n) && u890.j(this.o, htw0Var.o) && u890.j(this.f32p, htw0Var.f32p) && u890.j(this.q, htw0Var.q) && u890.j(this.r, htw0Var.r) && this.s == htw0Var.s && u890.j(this.t, htw0Var.t) && this.u == htw0Var.u && this.v == htw0Var.v;
    }

    @Override // p.ktw0
    public final Set f() {
        return this.n;
    }

    @Override // p.ktw0
    public final Set g() {
        return this.t;
    }

    @Override // p.ktw0
    public final boolean h() {
        return this.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v) + xcg1.g(gvg.c(xcg1.g(gvg.c(gvg.c(gvg.c(gvg.c(gvg.c(gvg.c(l1d.C(this.l) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.f32p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
    }

    @Override // p.ktw0
    public final int i() {
        return this.l;
    }

    @Override // p.ktw0
    public final boolean j() {
        return this.u;
    }

    @Override // p.ktw0
    public final boolean k() {
        return this.v;
    }
}
