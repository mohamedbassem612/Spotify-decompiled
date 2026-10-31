package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xaq0 extends pim0 implements sjp0, wjh1 {
    public iu30 O0;
    public bhe1 P0;
    public faa0 Q0;
    public boolean R0;
    public boolean S0;
    public ho11 T0;
    public final waq0 U0 = new waq0(this, (byte) 0);

    public xaq0(iu30 iu30Var) {
        this.O0 = iu30Var;
    }

    @Override // p.pim0
    public final void A1() {
        bhe1 bhe1Var = this.P0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        I1();
    }

    @Override // p.pim0
    public final void B1() {
        I1();
        faa0 faa0Var = this.Q0;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.Q0 = null;
        this.R0 = false;
        this.T0 = null;
    }

    public final void H1(ho11 ho11Var) {
        this.T0 = ho11Var;
        long j = ho11Var.e;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = ho11Var.a;
        int i3 = (int) (j2 >> 32);
        int iMin = Math.min(Math.max(i3, 0), i);
        int i4 = (int) j2;
        int iMin2 = Math.min(Math.max(i4, 0), i2);
        long j3 = ho11Var.b;
        int i5 = (int) (j3 >> 32);
        int i6 = (int) j3;
        float fMax = Math.max((Math.max(Math.min(i6, i2), 0) - iMin2) * (Math.max(Math.min(i5, i), 0) - iMin), 0) / Math.min(i2 * i, (i6 - i4) * (i5 - i3));
        boolean z = fMax > 1.0f || fMax == 1.0f;
        if (z != this.R0) {
            this.R0 = z;
            faa0 faa0Var = this.Q0;
            if (faa0Var != null) {
                ha71.o(faa0Var);
            }
            this.Q0 = null;
            if (z != this.S0) {
                J1();
            }
        }
    }

    public final void I1() {
        faa0 faa0Var = this.Q0;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.Q0 = null;
        this.R0 = false;
        if (this.S0) {
            J1();
        }
    }

    public final void J1() {
        faa0 faa0Var = this.Q0;
        if (faa0Var != null) {
            ha71.o(faa0Var);
        }
        this.Q0 = null;
        this.O0.invoke(Boolean.valueOf(this.R0));
        this.S0 = this.R0;
    }

    public final void u1() {
        I1();
    }

    @Override // p.pim0
    public final void z1() {
        bhe1 bhe1Var = this.P0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        this.P0 = grn1.t(this, 0L, 0L, this.U0);
    }

    @Override // p.sjp0
    public final void f0() {
    }
}
