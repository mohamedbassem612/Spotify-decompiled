package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ux81 extends z5t implements p1h1 {
    public final qx81 b;
    public final a8b0 c;

    public ux81(qx81 qx81Var, a8b0 a8b0Var) {
        this.b = qx81Var;
        this.c = a8b0Var;
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        return (qx81) vzn1.q(this.b.x0(z), this.c.w0().x0(z));
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return (qx81) vzn1.q(this.b.z0(e0h1Var), this.c);
    }

    @Override // p.z5t
    public final qx81 C0() {
        return this.b;
    }

    @Override // p.z5t
    /* JADX INFO: renamed from: D0 */
    public final qx81 v0(g8b0 g8b0Var) {
        return new ux81(this.b, this.c);
    }

    @Override // p.z5t
    public final z5t E0(qx81 qx81Var) {
        return new ux81(qx81Var, this.c);
    }

    @Override // p.p1h1
    public final a8b0 f() {
        return this.c;
    }

    @Override // p.p1h1
    public final gmh1 o0() {
        return this.b;
    }

    @Override // p.qx81
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.c + ")] " + this.b;
    }

    @Override // p.z5t, p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new ux81(this.b, this.c);
    }

    @Override // p.z5t, p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        return new ux81(this.b, this.c);
    }
}
