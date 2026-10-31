package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class q890 extends pim0 implements zlb0 {
    public abstract long H1(afh0 afh0Var, long j);

    public abstract boolean I1();

    @Override // p.zlb0
    public int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.w(i);
    }

    @Override // p.zlb0
    public int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.C(i);
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        long jH1 = H1(afh0Var, j);
        if (I1()) {
            jH1 = jjl.e(j, jH1);
        }
        q5t0 q5t0VarH = afh0Var.H(jH1);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 9));
    }

    public int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.n(i);
    }

    public int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        return afh0Var.d(i);
    }
}
