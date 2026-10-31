package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rrb0 extends pim0 implements zlb0 {
    public static final prb0 S0 = new prb0();
    public srb0 O0;
    public laz P0;
    public boolean Q0;
    public qqq0 R0;

    public final boolean H1(nrb0 nrb0Var, int i) {
        if (sap1.e(i, 5) || sap1.e(i, 6)) {
            if (this.R0 == qqq0.b) {
                return false;
            }
        } else if (sap1.e(i, 3) || sap1.e(i, 4)) {
            if (this.R0 == qqq0.a) {
                return false;
            }
        } else if (!sap1.e(i, 1) && !sap1.e(i, 2)) {
            dem1.r();
            throw null;
        }
        if (I1(i)) {
            if (nrb0Var.b >= this.O0.a() - 1) {
                return false;
            }
        } else if (nrb0Var.a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean I1(int i) throws NoWhenBranchMatchedException {
        if (sap1.e(i, 1)) {
            return false;
        }
        if (!sap1.e(i, 2)) {
            if (sap1.e(i, 5)) {
                return this.Q0;
            }
            if (sap1.e(i, 6)) {
                if (this.Q0) {
                    return false;
                }
            } else if (sap1.e(i, 3)) {
                int iOrdinal = oap1.A(this).ordinal();
                if (iOrdinal == 0) {
                    return this.Q0;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return false;
                }
                if (this.Q0) {
                    return false;
                }
            } else {
                if (!sap1.e(i, 4)) {
                    dem1.r();
                    throw null;
                }
                int iOrdinal2 = oap1.A(this).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.Q0;
                    }
                    eg.o();
                    return false;
                }
                if (this.Q0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 10));
    }
}
