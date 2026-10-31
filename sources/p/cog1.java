package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cog1 extends ten0 {
    public final ten0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f23p;
    public final boolean q;
    public iu30 r;
    public iu30 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public cog1(ten0 ten0Var, iu30 iu30Var, iu30 iu30Var2, boolean z, boolean z2) {
        iu30 iu30VarI;
        iu30 iu30VarE;
        ef41 ef41Var = pv91.a;
        super(0L, nv91.e, pv91.i(iu30Var, (ten0Var == null || (iu30VarE = ten0Var.e()) == null) ? pv91.j.e : iu30VarE, z), pv91.j(iu30Var2, (ten0Var == null || (iu30VarI = ten0Var.i()) == null) ? pv91.j.f : iu30VarI));
        this.o = ten0Var;
        this.f23p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = t8p1.k();
    }

    @Override // p.ten0
    public final void B(oen0 oen0Var) {
        oho1.z();
        throw null;
    }

    @Override // p.ten0
    public final ten0 C(iu30 iu30Var, iu30 iu30Var2) {
        iu30 iu30VarI = pv91.i(iu30Var, this.r, true);
        iu30 iu30VarJ = pv91.j(iu30Var2, this.s);
        return !this.f23p ? new cog1(D().C(null, iu30VarJ), iu30VarI, iu30VarJ, false, true) : D().C(iu30VarI, iu30VarJ);
    }

    public final ten0 D() {
        ten0 ten0Var = this.o;
        return ten0Var == null ? pv91.j : ten0Var;
    }

    @Override // p.ten0, p.jv91
    public final void c() {
        ten0 ten0Var;
        this.c = true;
        if (!this.q || (ten0Var = this.o) == null) {
            return;
        }
        ten0Var.c();
    }

    @Override // p.jv91
    public final nv91 d() {
        return D().d();
    }

    @Override // p.ten0, p.jv91
    public final iu30 e() {
        return this.r;
    }

    @Override // p.jv91
    public final boolean f() {
        return D().f();
    }

    @Override // p.jv91
    public final long g() {
        return D().g();
    }

    @Override // p.ten0, p.jv91
    public final int h() {
        return D().h();
    }

    @Override // p.ten0, p.jv91
    public final iu30 i() {
        return this.s;
    }

    @Override // p.ten0, p.jv91
    public final void k() {
        oho1.z();
        throw null;
    }

    @Override // p.ten0, p.jv91
    public final void l() {
        oho1.z();
        throw null;
    }

    @Override // p.ten0, p.jv91
    public final void m() {
        D().m();
    }

    @Override // p.ten0, p.jv91
    public final void n(ypb1 ypb1Var) {
        D().n(ypb1Var);
    }

    @Override // p.jv91
    public final void r(nv91 nv91Var) {
        oho1.z();
        throw null;
    }

    @Override // p.jv91
    public final void s(long j) {
        oho1.z();
        throw null;
    }

    @Override // p.ten0, p.jv91
    public final void t(int i) {
        D().t(i);
    }

    @Override // p.ten0, p.jv91
    public final jv91 u(iu30 iu30Var) {
        iu30 iu30VarI = pv91.i(iu30Var, this.r, true);
        return !this.f23p ? pv91.e(D().u(null), iu30VarI, true) : D().u(iu30VarI);
    }

    @Override // p.ten0
    public final nln w() {
        return D().w();
    }

    @Override // p.ten0
    public final oen0 x() {
        return D().x();
    }

    @Override // p.ten0
    /* JADX INFO: renamed from: y */
    public final iu30 e() {
        return this.r;
    }
}
