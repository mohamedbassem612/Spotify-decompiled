package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class uk80 extends pk80 implements zlb0 {
    public erl1 Q0;

    public uk80(erl1 erl1Var) {
        this.Q0 = erl1Var;
    }

    @Override // p.pk80
    public final erl1 H1(erl1 erl1Var) {
        return poo1.I(erl1Var, this.Q0);
    }

    @Override // p.pk80
    public final void I1() {
        super.I1();
        dio1.y(this);
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        int iB = this.P0.b(ifh0Var, ifh0Var.getLayoutDirection()) - this.O0.b(ifh0Var, ifh0Var.getLayoutDirection());
        int iC = this.P0.c(ifh0Var) - this.O0.c(ifh0Var);
        int iA = (this.P0.a(ifh0Var, ifh0Var.getLayoutDirection()) - this.O0.a(ifh0Var, ifh0Var.getLayoutDirection())) + iB;
        int iD = (this.P0.d(ifh0Var) - this.O0.d(ifh0Var)) + iC;
        q5t0 q5t0VarH = afh0Var.H(jjl.i(-iA, j, -iD));
        return ifh0Var.S(jjl.g(q5t0VarH.a + iA, j), jjl.f(q5t0VarH.b + iD, j), b7x.a, new tk80(q5t0VarH, iB, iC, (byte) 0));
    }
}
