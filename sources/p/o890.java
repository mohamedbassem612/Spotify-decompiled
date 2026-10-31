package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o890 extends q890 {
    public int O0;
    public boolean P0;

    @Override // p.q890
    public final long H1(afh0 afh0Var, long j) {
        int iN = this.O0 == 1 ? afh0Var.n(hjl.i(j)) : afh0Var.d(hjl.i(j));
        if (iN < 0) {
            iN = 0;
        }
        if (iN < 0) {
            sf80.a("height must be >= 0");
        }
        return jjl.h(0, Integer.MAX_VALUE, iN, iN);
    }

    @Override // p.q890
    public final boolean I1() {
        return this.P0;
    }

    @Override // p.q890, p.zlb0
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return this.O0 == 1 ? afh0Var.n(i) : afh0Var.d(i);
    }

    @Override // p.q890, p.zlb0
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return this.O0 == 1 ? afh0Var.n(i) : afh0Var.d(i);
    }
}
