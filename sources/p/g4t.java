package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g4t extends z5t implements yro, h4t {
    public final qx81 b;
    public final boolean c;

    public g4t(qx81 qx81Var, boolean z) {
        this.b = qx81Var;
        this.c = z;
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        return z ? this.b.x0(z) : this;
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return new g4t(this.b.z0(e0h1Var), this.c);
    }

    @Override // p.z5t
    public final qx81 C0() {
        return this.b;
    }

    @Override // p.z5t
    public final z5t E0(qx81 qx81Var) {
        return new g4t(qx81Var, this.c);
    }

    @Override // p.yro
    public final gmh1 c0(a8b0 a8b0Var) {
        return mue1.M(a8b0Var.w0(), this.c);
    }

    @Override // p.yro
    public final boolean l0() {
        qx81 qx81Var = this.b;
        qx81Var.t0();
        return qx81Var.t0().s() instanceof y0h1;
    }

    @Override // p.qx81
    public final String toString() {
        return this.b + " & Any";
    }

    @Override // p.z5t, p.a8b0
    public final boolean u0() {
        return false;
    }
}
