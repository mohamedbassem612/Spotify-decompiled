package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y291 extends pim0 implements zlb0 {
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public boolean S0;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long H1(ifh0 ifh0Var) {
        int iI0;
        int iI1;
        int iI2;
        int i = 0;
        if (Float.isNaN(this.Q0)) {
            iI0 = Integer.MAX_VALUE;
        } else {
            iI0 = ifh0Var.i0(this.Q0);
            if (iI0 < 0) {
                iI0 = 0;
            }
        }
        if (Float.isNaN(this.R0)) {
            iI1 = Integer.MAX_VALUE;
        } else {
            iI1 = ifh0Var.i0(this.R0);
            if (iI1 < 0) {
                iI1 = 0;
            }
        }
        if (Float.isNaN(this.O0)) {
            iI2 = 0;
        } else {
            iI2 = ifh0Var.i0(this.O0);
            if (iI2 < 0) {
                iI2 = 0;
            }
            if (iI2 > iI0) {
                iI2 = iI0;
            }
            if (iI2 == Integer.MAX_VALUE) {
                iI2 = 0;
            }
        }
        if (!Float.isNaN(this.P0)) {
            int iI3 = ifh0Var.i0(this.P0);
            if (iI3 < 0) {
                iI3 = 0;
            }
            if (iI3 > iI1) {
                iI3 = iI1;
            }
            if (iI3 != Integer.MAX_VALUE) {
                i = iI3;
            }
        }
        return jjl.a(iI2, iI0, i, iI1);
    }

    @Override // p.zlb0
    public final int P0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jH1 = H1(x5f0Var);
        if (hjl.g(jH1)) {
            return hjl.i(jH1);
        }
        if (!this.S0) {
            i = jjl.f(i, jH1);
        }
        return jjl.g(afh0Var.w(i), jH1);
    }

    @Override // p.zlb0
    public final int V0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jH1 = H1(x5f0Var);
        if (hjl.g(jH1)) {
            return hjl.i(jH1);
        }
        if (!this.S0) {
            i = jjl.f(i, jH1);
        }
        return jjl.g(afh0Var.C(i), jH1);
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        int iK;
        int i;
        int iJ;
        int iH;
        long jA;
        long jH1 = H1(ifh0Var);
        if (this.S0) {
            jA = jjl.e(j, jH1);
        } else {
            if (Float.isNaN(this.O0)) {
                iK = hjl.k(j);
                int i2 = hjl.i(jH1);
                if (iK > i2) {
                    iK = i2;
                }
            } else {
                iK = hjl.k(jH1);
            }
            if (Float.isNaN(this.Q0)) {
                i = hjl.i(j);
                int iK2 = hjl.k(jH1);
                if (i < iK2) {
                    i = iK2;
                }
            } else {
                i = hjl.i(jH1);
            }
            if (Float.isNaN(this.P0)) {
                iJ = hjl.j(j);
                int iH2 = hjl.h(jH1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = hjl.j(jH1);
            }
            if (Float.isNaN(this.R0)) {
                iH = hjl.h(j);
                int iJ2 = hjl.j(jH1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = hjl.h(jH1);
            }
            jA = jjl.a(iK, i, iJ, iH);
        }
        q5t0 q5t0VarH = afh0Var.H(jA);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 14));
    }

    @Override // p.zlb0
    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jH1 = H1(x5f0Var);
        if (hjl.f(jH1)) {
            return hjl.h(jH1);
        }
        if (!this.S0) {
            i = jjl.g(i, jH1);
        }
        return jjl.f(afh0Var.n(i), jH1);
    }

    @Override // p.zlb0
    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        long jH1 = H1(x5f0Var);
        if (hjl.f(jH1)) {
            return hjl.h(jH1);
        }
        if (!this.S0) {
            i = jjl.g(i, jH1);
        }
        return jjl.f(afh0Var.d(i), jH1);
    }
}
