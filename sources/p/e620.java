package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e620 extends pim0 implements zlb0 {
    public int O0;
    public float P0;

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!hjl.e(j) || this.O0 == 1) {
            iK = hjl.k(j);
            i = hjl.i(j);
        } else {
            int iRound = Math.round(hjl.i(j) * this.P0);
            int iK2 = hjl.k(j);
            iK = hjl.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!hjl.d(j) || this.O0 == 2) {
            int iJ = hjl.j(j);
            int iH2 = hjl.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(hjl.h(j) * this.P0);
            int iJ2 = hjl.j(j);
            iH = hjl.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        q5t0 q5t0VarH = afh0Var.H(jjl.a(iK, i, iH, i2));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 7));
    }
}
