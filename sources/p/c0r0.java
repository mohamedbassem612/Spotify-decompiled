package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c0r0 extends pim0 implements zlb0 {
    public vzq0 O0;

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        float fB = this.O0.b(ifh0Var.getLayoutDirection());
        float fD = this.O0.d();
        float fC = this.O0.c(ifh0Var.getLayoutDirection());
        float fA = this.O0.a();
        if (!((p3v.b(fB, 0.0f) >= 0) & (p3v.b(fD, 0.0f) >= 0) & (p3v.b(fC, 0.0f) >= 0) & (p3v.b(fA, 0.0f) >= 0))) {
            of80.a("Padding must be non-negative");
        }
        int iI0 = ifh0Var.i0(fB);
        int iI1 = ifh0Var.i0(fC) + iI0;
        int iI2 = ifh0Var.i0(fD);
        int iI3 = ifh0Var.i0(fA) + iI2;
        q5t0 q5t0VarH = afh0Var.H(jjl.i(-iI1, j, -iI3));
        return ifh0Var.S(jjl.g(q5t0VarH.a + iI1, j), jjl.f(q5t0VarH.b + iI3, j), b7x.a, new tk80(q5t0VarH, iI0, iI2, (byte) 3));
    }
}
