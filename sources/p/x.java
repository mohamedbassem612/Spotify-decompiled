package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x extends z5t {
    public final qx81 b;
    public final qx81 c;

    public x(qx81 qx81Var, qx81 qx81Var2) {
        this.b = qx81Var;
        this.c = qx81Var2;
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return new x(this.b.z0(e0h1Var), this.c);
    }

    @Override // p.z5t
    public final qx81 C0() {
        return this.b;
    }

    @Override // p.z5t
    /* JADX INFO: renamed from: D0 */
    public final qx81 v0(g8b0 g8b0Var) {
        return new x(this.b, this.c);
    }

    @Override // p.z5t
    public final z5t E0(qx81 qx81Var) {
        return new x(qx81Var, this.c);
    }

    @Override // p.qx81, p.gmh1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final x x0(boolean z) {
        return new x(this.b.x0(z), this.c.x0(z));
    }

    @Override // p.z5t, p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new x(this.b, this.c);
    }

    @Override // p.z5t, p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        return new x(this.b, this.c);
    }
}
