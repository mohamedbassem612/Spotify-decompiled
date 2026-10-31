package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h7b0 extends hc11 {
    public final v6b0 a;
    public final c4b0 b;
    public final int c;
    public final int d;
    public final String e;
    public final znb0 f;

    public h7b0(v6b0 v6b0Var, c4b0 c4b0Var, int i, int i2, c1h1 c1h1Var) {
        this.a = v6b0Var;
        this.b = c4b0Var;
        this.c = i;
        this.d = i2;
        String str = c4b0Var.b;
        this.e = nhc1.Y(str, "<", false) ? null : str;
        this.f = dm5.S(2, new na((Object) this, (Object) c1h1Var, (byte) 27));
    }

    @Override // p.hc11
    public final dc11 e() {
        return this.a;
    }

    @Override // p.hc11
    public final String getName() {
        return this.e;
    }

    @Override // p.hc11
    public final boolean l() {
        mgc mgcVar = xm7.A;
        mma0 mma0Var = xm7.a[54];
        return mgcVar.D(this.b);
    }

    @Override // p.hc11
    public final int n() {
        return this.c;
    }

    @Override // p.hc11
    public final int s() {
        return this.d;
    }

    @Override // p.hc11
    public final oma0 t() {
        return (oma0) this.f.getValue();
    }

    @Override // p.hc11
    public final boolean w() {
        v6b0 v6b0Var = this.a;
        if (!(v6b0Var instanceof u7b0) && !(v6b0Var.a() instanceof ema0) && !fc11.P(v6b0Var)) {
            bhn0.s(v6b0Var, "Only constructors and top-level callables are supported for now: ");
            return false;
        }
        mgc mgcVar = xm7.A;
        mma0 mma0Var = xm7.a[54];
        return mgcVar.D(this.b);
    }

    @Override // p.hc11
    public final boolean x() {
        return this.b.d != null;
    }
}
