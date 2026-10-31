package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hq20 extends dq20 implements p1h1 {
    public final dq20 d;
    public final a8b0 e;

    public hq20(dq20 dq20Var, a8b0 a8b0Var) {
        super(dq20Var.b, dq20Var.c);
        this.d = dq20Var;
        this.e = a8b0Var;
    }

    @Override // p.dq20
    public final qx81 A0() {
        return this.d.A0();
    }

    @Override // p.dq20
    public final String B0(cht chtVar, cht chtVar2) {
        ce0 ce0Var = chtVar2.a.m;
        mma0 mma0Var = fht.Y[11];
        return ((Boolean) ((sgp0) ce0Var).a).booleanValue() ? chtVar.U(this.e) : this.d.B0(chtVar, chtVar2);
    }

    @Override // p.p1h1
    public final a8b0 f() {
        return this.e;
    }

    @Override // p.p1h1
    public final gmh1 o0() {
        return this.d;
    }

    @Override // p.dq20
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.e + ")] " + this.d;
    }

    @Override // p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new hq20(this.d, this.e);
    }

    @Override // p.gmh1
    public final gmh1 x0(boolean z) {
        return vzn1.q(this.d.x0(z), this.e.w0().x0(z));
    }

    @Override // p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        return new hq20(this.d, this.e);
    }

    @Override // p.gmh1
    public final gmh1 z0(e0h1 e0h1Var) {
        return vzn1.q(this.d.z0(e0h1Var), this.e);
    }
}
