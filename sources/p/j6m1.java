package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j6m1 extends pim0 implements zlb0 {
    public int O0;
    public boolean P0;
    public vu30 Q0;

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(jjl.a(this.O0 != 1 ? 0 : hjl.k(j), (this.O0 == 1 || !this.P0) ? hjl.i(j) : Integer.MAX_VALUE, this.O0 == 2 ? hjl.j(j) : 0, (this.O0 == 2 || !this.P0) ? hjl.h(j) : Integer.MAX_VALUE));
        int iP = yoi1.p(q5t0VarH.a, hjl.k(j), hjl.i(j));
        int iP2 = yoi1.p(q5t0VarH.b, hjl.j(j), hjl.h(j));
        return ifh0Var.S(iP, iP2, b7x.a, new iw31(this, iP, q5t0VarH, iP2, ifh0Var));
    }
}
