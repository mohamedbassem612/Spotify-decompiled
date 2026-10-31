package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rs41 extends l5t implements j4k, sjp0 {
    public ct41 Q0;
    public qqq0 R0;
    public boolean S0;
    public boolean T0;
    public iq20 U0;
    public idn0 V0;
    public p5c W0;
    public boolean X0;
    public hxq0 Y0;
    public bt41 Z0;
    public x4t a1;
    public ixq0 b1;
    public hxq0 c1;
    public boolean d1;

    @Override // p.pim0
    public final void A1() {
        x4t x4tVar = this.a1;
        if (x4tVar != null) {
            I1(x4tVar);
        }
    }

    public final void K1() {
        x4t x4tVar = this.a1;
        if (x4tVar != null) {
            if (((pim0) x4tVar).a.N0) {
                return;
            }
            H1(x4tVar);
            return;
        }
        if (this.X0) {
            p9p1.z(this, new ww21(this, (byte) 5));
        }
        hxq0 hxq0Var = this.X0 ? this.c1 : this.Y0;
        if (hxq0Var != null) {
            x4t x4tVarA = hxq0Var.a();
            if (((pim0) x4tVarA).a.N0) {
                return;
            }
            H1(x4tVarA);
            this.a1 = x4tVarA;
        }
    }

    public final boolean L1() {
        return ern1.z(this.N0 ? oap1.A(this) : flb0.a, this.R0, this.T0);
    }

    public final void M1(p5c p5cVar, iq20 iq20Var, idn0 idn0Var, qqq0 qqq0Var, hxq0 hxq0Var, ct41 ct41Var, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.Q0 = ct41Var;
        this.R0 = qqq0Var;
        boolean z5 = true;
        if (this.X0 != z) {
            this.X0 = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (u890.j(this.Y0, hxq0Var)) {
            z5 = false;
        } else {
            this.Y0 = hxq0Var;
        }
        if (z4 || (z5 && !z)) {
            x4t x4tVar = this.a1;
            if (x4tVar != null) {
                I1(x4tVar);
            }
            this.a1 = null;
            K1();
        }
        this.S0 = z2;
        this.T0 = z3;
        this.U0 = iq20Var;
        this.V0 = idn0Var;
        this.W0 = p5cVar;
        boolean zL1 = L1();
        this.d1 = zL1;
        bt41 bt41Var = this.Z0;
        if (bt41Var != null) {
            bt41Var.d2(p5cVar, iq20Var, idn0Var, qqq0Var, this.X0 ? this.c1 : this.Y0, ct41Var, z2, zL1);
        }
    }

    @Override // p.x4t
    public final void T() {
        boolean zL1 = L1();
        if (this.d1 != zL1) {
            this.d1 = zL1;
            ct41 ct41Var = this.Q0;
            qqq0 qqq0Var = this.R0;
            boolean z = this.X0;
            hxq0 hxq0Var = z ? this.c1 : this.Y0;
            M1(this.W0, this.U0, this.V0, qqq0Var, hxq0Var, ct41Var, z, this.S0, this.T0);
        }
    }

    @Override // p.sjp0
    public final void f0() {
        ixq0 ixq0Var = (ixq0) lcc.z(this, jxq0.a);
        if (u890.j(ixq0Var, this.b1)) {
            return;
        }
        this.b1 = ixq0Var;
        this.c1 = null;
        x4t x4tVar = this.a1;
        if (x4tVar != null) {
            I1(x4tVar);
        }
        this.a1 = null;
        K1();
        bt41 bt41Var = this.Z0;
        if (bt41Var != null) {
            ct41 ct41Var = this.Q0;
            qqq0 qqq0Var = this.R0;
            hxq0 hxq0Var = this.X0 ? this.c1 : this.Y0;
            bt41Var.d2(this.W0, this.U0, this.V0, qqq0Var, hxq0Var, ct41Var, this.S0, this.d1);
        }
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    @Override // p.pim0
    public final void z1() {
        this.d1 = L1();
        K1();
        if (this.Z0 == null) {
            ct41 ct41Var = this.Q0;
            hxq0 hxq0Var = this.X0 ? this.c1 : this.Y0;
            bt41 bt41Var = new bt41(this.W0, this.U0, this.V0, this.R0, hxq0Var, ct41Var, this.S0, this.d1);
            H1(bt41Var);
            this.Z0 = bt41Var;
        }
    }
}
