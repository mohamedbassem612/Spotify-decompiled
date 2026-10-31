package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface v06 extends zlb0 {
    default int A(r06 r06Var, afh0 afh0Var, int i) {
        ndo0 ndo0Var = ((pim0) this).a.h;
        ndo0Var.getClass();
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        if (!z5f0VarC1.y0()) {
            return afh0Var.n(i);
        }
        return G0(new t06(r06Var, r06Var.getLayoutDirection()), new vfh0(afh0Var, 1, 2, (byte) 1), jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    hfh0 G0(x06 x06Var, afh0 afh0Var, long j);

    default hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 1));
    }

    default boolean l1(y5f0 y5f0Var, a6f0 a6f0Var) {
        return false;
    }

    default int p(r06 r06Var, afh0 afh0Var, int i) {
        ndo0 ndo0Var = ((pim0) this).a.h;
        ndo0Var.getClass();
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        if (!z5f0VarC1.y0()) {
            return afh0Var.w(i);
        }
        return G0(new t06(r06Var, r06Var.getLayoutDirection()), new vfh0(afh0Var, 1, 1, (byte) 1), jjl.b(0, 0, 0, i, 7)).getWidth();
    }

    default int r0(r06 r06Var, afh0 afh0Var, int i) {
        ndo0 ndo0Var = ((pim0) this).a.h;
        ndo0Var.getClass();
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        if (!z5f0VarC1.y0()) {
            return afh0Var.C(i);
        }
        return G0(new t06(r06Var, r06Var.getLayoutDirection()), new vfh0(afh0Var, 2, 1, (byte) 1), jjl.b(0, 0, 0, i, 7)).getWidth();
    }

    default int u(r06 r06Var, afh0 afh0Var, int i) {
        ndo0 ndo0Var = ((pim0) this).a.h;
        ndo0Var.getClass();
        z5f0 z5f0VarC1 = ndo0Var.c1();
        z5f0VarC1.getClass();
        if (!z5f0VarC1.y0()) {
            return afh0Var.d(i);
        }
        return G0(new t06(r06Var, r06Var.getLayoutDirection()), new vfh0(afh0Var, 2, 2, (byte) 1), jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    boolean y0(long j);
}
