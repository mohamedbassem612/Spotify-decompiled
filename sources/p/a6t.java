package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class a6t extends z5t {
    public final qx81 b;

    public a6t(qx81 qx81Var) {
        this.b = qx81Var;
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        return z == u0() ? this : this.b.x0(z).z0(s0());
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final qx81 z0(e0h1 e0h1Var) {
        return e0h1Var != s0() ? new tx81(this, e0h1Var) : this;
    }

    @Override // p.z5t
    public final qx81 C0() {
        return this.b;
    }
}
