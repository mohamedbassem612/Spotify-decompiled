package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yb5 extends pim0 implements zlb0 {
    public float O0;
    public o95 P0;

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        o95 o95Var = this.P0;
        int iI0 = ifh0Var.i0(o95Var != null ? ((p3v) o95Var.e()).a : this.O0);
        q5t0 q5t0VarH = afh0Var.H(j);
        int i = q5t0VarH.a + iI0;
        if (i < 0) {
            i = 0;
        }
        return ifh0Var.S(i, q5t0VarH.b, b7x.a, new wb5(q5t0VarH, iI0, (byte) 0));
    }

    public final void z1() {
        this.P0 = new o95(new p3v(this.O0), rno1.c, (Object) null, 12);
    }
}
