package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tlh1 extends pim0 implements zlb0 {
    public float O0;
    public float P0;

    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        int iW = afh0Var.w(i);
        int iI0 = !Float.isNaN(this.O0) ? x5f0Var.i0(this.O0) : 0;
        return iW < iI0 ? iI0 : iW;
    }

    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        int iC = afh0Var.C(i);
        int iI0 = !Float.isNaN(this.O0) ? x5f0Var.i0(this.O0) : 0;
        return iC < iI0 ? iI0 : iC;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.O0) || hjl.k(j) != 0) {
            iK = hjl.k(j);
        } else {
            int iI0 = ifh0Var.i0(this.O0);
            iK = hjl.i(j);
            if (iI0 < 0) {
                iI0 = 0;
            }
            if (iI0 <= iK) {
                iK = iI0;
            }
        }
        int i = hjl.i(j);
        if (Float.isNaN(this.P0) || hjl.j(j) != 0) {
            iJ = hjl.j(j);
        } else {
            int iI1 = ifh0Var.i0(this.P0);
            iJ = hjl.h(j);
            int i2 = iI1 >= 0 ? iI1 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        q5t0 q5t0VarH = afh0Var.H(jjl.a(iK, i, iJ, hjl.h(j)));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 22));
    }

    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        int iN = afh0Var.n(i);
        int iI0 = !Float.isNaN(this.P0) ? x5f0Var.i0(this.P0) : 0;
        return iN < iI0 ? iI0 : iN;
    }

    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        int iD = afh0Var.d(i);
        int iI0 = !Float.isNaN(this.P0) ? x5f0Var.i0(this.P0) : 0;
        return iD < iI0 ? iI0 : iD;
    }
}
