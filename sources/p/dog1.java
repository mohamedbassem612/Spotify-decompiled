package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dog1 extends jv91 {
    public final jv91 e;
    public final boolean f;
    public final boolean g;
    public iu30 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dog1(jv91 jv91Var, iu30 iu30Var, boolean z, boolean z2) {
        iu30 iu30VarE;
        super(0L, nv91.e);
        ef41 ef41Var = pv91.a;
        this.e = jv91Var;
        this.f = z;
        this.g = z2;
        this.h = pv91.i(iu30Var, (jv91Var == null || (iu30VarE = jv91Var.e()) == null) ? pv91.j.e : iu30VarE, z);
        this.i = t8p1.k();
    }

    @Override // p.jv91
    public final void c() {
        jv91 jv91Var;
        this.c = true;
        if (!this.g || (jv91Var = this.e) == null) {
            return;
        }
        jv91Var.c();
    }

    @Override // p.jv91
    public final nv91 d() {
        return v().d();
    }

    @Override // p.jv91
    public final iu30 e() {
        return this.h;
    }

    @Override // p.jv91
    public final boolean f() {
        return v().f();
    }

    @Override // p.jv91
    public final long g() {
        return v().g();
    }

    @Override // p.jv91
    public final iu30 i() {
        return null;
    }

    @Override // p.jv91
    public final void k() {
        oho1.z();
        throw null;
    }

    @Override // p.jv91
    public final void l() {
        oho1.z();
        throw null;
    }

    @Override // p.jv91
    public final void m() {
        v().m();
    }

    @Override // p.jv91
    public final void n(ypb1 ypb1Var) {
        v().n(ypb1Var);
    }

    @Override // p.jv91
    public final jv91 u(iu30 iu30Var) {
        iu30 iu30VarI = pv91.i(iu30Var, this.h, true);
        return !this.f ? pv91.e(v().u(null), iu30VarI, true) : v().u(iu30VarI);
    }

    public final jv91 v() {
        jv91 jv91Var = this.e;
        return jv91Var == null ? pv91.j : jv91Var;
    }
}
