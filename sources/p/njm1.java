package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class njm1 extends h2k {
    public final qba X;

    public njm1(qba qbaVar) {
        this.X = qbaVar;
    }

    @Override // p.h2k
    public final p2i0 A(Object obj, p2i0 p2i0Var) {
        return I(p2i0Var);
    }

    @Override // p.h2k
    public final long B(long j, Object obj) {
        return j;
    }

    @Override // p.h2k
    public final int C(int i, Object obj) {
        return i;
    }

    @Override // p.h2k
    public final void G(Object obj, qba qbaVar, sqe1 sqe1Var) {
        p(sqe1Var);
    }

    public void J() {
        H(null, this.X);
    }

    @Override // p.qba
    public boolean c(yoh0 yoh0Var) {
        return this.X.c(yoh0Var);
    }

    @Override // p.qba
    public arh0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        return this.X.f(p2i0Var, hw3Var, j);
    }

    @Override // p.qba
    public final sqe1 l() {
        return this.X.l();
    }

    @Override // p.qba
    public final yoh0 m() {
        return this.X.m();
    }

    @Override // p.qba
    public final boolean n() {
        return this.X.n();
    }

    @Override // p.qba
    public final void r(yeg1 yeg1Var) {
        this.t = zoi1.r((lkh0) null);
        J();
    }

    @Override // p.qba
    public void t(arh0 arh0Var) {
        this.X.t(arh0Var);
    }

    @Override // p.qba
    public void z(yoh0 yoh0Var) {
        this.X.z(yoh0Var);
    }

    public p2i0 I(p2i0 p2i0Var) {
        return p2i0Var;
    }
}
