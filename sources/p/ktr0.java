package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ktr0 extends pim0 implements zlb0 {
    public float O0;
    public tob1 P0;
    public tob1 Q0;

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        tob1 tob1Var = this.P0;
        int iRound = (tob1Var == null || ((Number) tob1Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) tob1Var.getValue()).floatValue() * this.O0);
        tob1 tob1Var2 = this.Q0;
        int iRound2 = (tob1Var2 == null || ((Number) tob1Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) tob1Var2.getValue()).floatValue() * this.O0);
        int iK = iRound != Integer.MAX_VALUE ? iRound : hjl.k(j);
        int iJ = iRound2 != Integer.MAX_VALUE ? iRound2 : hjl.j(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = hjl.i(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = hjl.h(j);
        }
        q5t0 q5t0VarH = afh0Var.H(jjl.a(iK, iRound, iJ, iRound2));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 13));
    }
}
