package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lh6 implements gfh0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;

    public lh6(boolean z, cvx cvxVar, float f) {
        this.a = z;
        this.b = f;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m216measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        q5t0 q5t0VarH = null;
        boolean z = this.a;
        q5t0 q5t0VarH2 = z ? ((afh0) o7h.q0(list)).H(j) : null;
        afh0 afh0Var = (afh0) o7h.t0(z ? 1 : 0, list);
        if (afh0Var != null) {
            q5t0VarH = afh0Var.H(hjl.b(j, 0, 0, 0, z ? Integer.MAX_VALUE : hjl.h(j), 7));
        }
        q5t0 q5t0Var = q5t0VarH;
        int iI0 = (q5t0VarH2 == null || q5t0Var == null) ? 0 : ifh0Var.i0(8.0f);
        boolean z2 = ((q5t0VarH2 != null ? q5t0VarH2.b : 0) + iI0) + (q5t0Var != null ? q5t0Var.b : 0) <= hjl.h(j);
        int i = (!z2 || q5t0Var == null) ? 0 : q5t0Var.b;
        int iP = (q5t0VarH2 == null || q5t0Var == null || !z2) ? 0 : yoi1.p(((hjl.h(j) - q5t0VarH2.b) - i) - ifh0Var.i0(this.b), iI0, ifh0Var.i0(16.0f));
        int iMax = Math.max(q5t0VarH2 != null ? q5t0VarH2.a : 0, (!z2 || q5t0Var == null) ? 0 : q5t0Var.a);
        return ifh0Var.S(iMax, (q5t0VarH2 != null ? q5t0VarH2.b : 0) + iP + i, b7x.a, new kh6(q5t0VarH2, iMax, z2, q5t0Var, iP));
    }
}
