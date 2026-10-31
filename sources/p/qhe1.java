package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qhe1 extends pim0 implements zlb0 {
    public idn0 O0;
    public boolean P0;
    public n8b1 Q0;
    public boolean R0;
    public o95 S0;
    public o95 T0;
    public float U0;
    public float V0;

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        float f;
        boolean z = (afh0Var.d(hjl.i(j)) == 0 || afh0Var.C(hjl.h(j)) == 0) ? false : true;
        if (this.R0) {
            f = 28.0f;
        } else {
            f = (z || this.P0) ? 24.0f : 16.0f;
        }
        float fX0 = ifh0Var.X0(f);
        o95 o95Var = this.T0;
        int iFloatValue = (int) (o95Var != null ? ((Number) o95Var.e()).floatValue() : fX0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            sf80.a("width and height must be >= 0");
        }
        q5t0 q5t0VarH = afh0Var.H(jjl.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fX1 = ifh0Var.X0((32.0f - ifh0Var.N0(fX0)) / 2.0f);
        float fX2 = ifh0Var.X0(28.0f - 4.0f);
        boolean z2 = this.R0;
        if (z2 && this.P0) {
            fX1 = fX2 - ifh0Var.X0(2.0f);
        } else if (z2 && !this.P0) {
            fX1 = ifh0Var.X0(2.0f);
        } else if (this.P0) {
            fX1 = fX2;
        }
        o95 o95Var2 = this.T0;
        if (!u890.h(o95Var2 != null ? (Float) o95Var2.e.getValue() : null, fX0)) {
            fn31.T(v1(), null, 0, new phe1(this, fX0, null, (byte) 0), 3);
        }
        o95 o95Var3 = this.S0;
        if (!u890.h(o95Var3 != null ? (Float) o95Var3.e.getValue() : null, fX1)) {
            fn31.T(v1(), null, 0, new phe1(this, fX1, null, (byte) 1), 3);
        }
        if (Float.isNaN(this.V0) && Float.isNaN(this.U0)) {
            this.V0 = fX0;
            this.U0 = fX1;
        }
        return ifh0Var.S(iFloatValue, iFloatValue, b7x.a, new hc4(q5t0VarH, this, fX1));
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        fn31.T(v1(), null, 0, new xba1(this, (lnm) null, (byte) 29), 3);
    }
}
