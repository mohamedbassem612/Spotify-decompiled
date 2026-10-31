package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class we01 extends jv91 {
    public final iu30 e;
    public int f;

    public we01(long j, nv91 nv91Var, iu30 iu30Var) {
        super(j, nv91Var);
        this.e = iu30Var;
        this.f = 1;
    }

    @Override // p.jv91
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (pv91.c) {
            o();
        }
    }

    @Override // p.jv91
    public final iu30 e() {
        return this.e;
    }

    @Override // p.jv91
    public final boolean f() {
        return true;
    }

    @Override // p.jv91
    public final iu30 i() {
        return null;
    }

    @Override // p.jv91
    public final void k() {
        this.f++;
    }

    @Override // p.jv91
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // p.jv91
    public final void n(ypb1 ypb1Var) {
        ef41 ef41Var = pv91.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p.jv91
    public final jv91 u(iu30 iu30Var) {
        pv91.t(this);
        return new b6o0(this.b, this.a, pv91.i(iu30Var, this.e, true), this);
    }

    @Override // p.jv91
    public final void m() {
    }
}
