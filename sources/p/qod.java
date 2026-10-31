package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qod extends qx81 implements wod {
    public final e1h1 b;
    public final tod c;
    public final boolean d;
    public final e0h1 e;

    public qod(e1h1 e1h1Var, tod todVar, boolean z, e0h1 e0h1Var) {
        this.b = e1h1Var;
        this.c = todVar;
        this.d = z;
        this.e = e0h1Var;
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new qod(this.b, this.c, z, this.e);
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return new qod(this.b, this.c, this.d, e0h1Var);
    }

    @Override // p.a8b0
    public final e0h1 s0() {
        return this.e;
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return this.c;
    }

    @Override // p.qx81
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.b);
        sb.append(')');
        sb.append(this.d ? "?" : "");
        return sb.toString();
    }

    @Override // p.a8b0
    public final boolean u0() {
        return this.d;
    }

    @Override // p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new qod(this.b.d(g8b0Var), this.c, this.d, this.e);
    }

    @Override // p.qx81, p.gmh1
    public final gmh1 x0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new qod(this.b, this.c, z, this.e);
    }

    @Override // p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        return new qod(this.b.d(g8b0Var), this.c, this.d, this.e);
    }
}
