package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class szq0 extends pim0 implements zlb0 {
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public boolean S0;

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        int iI0 = ifh0Var.i0(this.Q0) + ifh0Var.i0(this.O0);
        int iI1 = ifh0Var.i0(this.R0) + ifh0Var.i0(this.P0);
        q5t0 q5t0VarH = afh0Var.H(jjl.i(-iI0, j, -iI1));
        return ifh0Var.S(jjl.g(q5t0VarH.a + iI0, j), jjl.f(q5t0VarH.b + iI1, j), b7x.a, new gub0(this, q5t0VarH, (byte) 9));
    }
}
