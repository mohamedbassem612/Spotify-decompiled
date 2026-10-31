package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wgd1 extends pim0 implements zlb0 {
    public lhd1 O0;
    public float P0;
    public float Q0;
    public o95 R0;
    public o95 S0;

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        o95 o95Var = this.R0;
        int iI0 = ifh0Var.i0(zjy.p(0.0f, new p3v((o95Var != null ? ((p3v) o95Var.e()).a : this.O0.b) - (this.P0 * 2.0f))).a);
        o95 o95Var2 = this.S0;
        int iI1 = ifh0Var.i0((o95Var2 != null ? ((p3v) o95Var2.e()).a : this.O0.a) + this.P0);
        int i = -ifh0Var.i0(this.Q0);
        q5t0 q5t0VarH = afh0Var.H(hjl.b(j, iI0, iI0, 0, 0, 8));
        int i2 = hjl.i(j);
        int iH = hjl.h(j);
        int i3 = q5t0VarH.b;
        int i4 = iH < i3 ? i3 : iH;
        return ifh0Var.S(i2, i4, b7x.a, new n6m(q5t0VarH, iI1, i4, i, (byte) 2));
    }

    public final void z1() {
        p3v p3vVar = new p3v(this.O0.b);
        tzg1 tzg1Var = rno1.c;
        this.R0 = new o95(p3vVar, tzg1Var, (Object) null, 12);
        this.S0 = new o95(new p3v(this.O0.a), tzg1Var, (Object) null, 12);
    }
}
