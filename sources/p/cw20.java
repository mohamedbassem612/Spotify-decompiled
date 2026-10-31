package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cw20 extends j660 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public nr20 n0;
    public HashMap o0;
    public HashMap p0;
    public HashMap q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public byte y0;
    public byte z0;

    public cw20(ynb1 ynb1Var, int i) {
        super(ynb1Var, i);
        this.r0 = 0;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = (byte) 2;
        this.z0 = (byte) 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = false;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (i == 8) {
            this.H0 = true;
        }
    }

    @Override // p.j660
    public final l660 Z() {
        nr20 nr20Var = this.n0;
        if (nr20Var != null) {
            return nr20Var;
        }
        nr20 nr20Var2 = new nr20();
        this.n0 = nr20Var2;
        return nr20Var2;
    }

    @Override // p.j660, p.dil, p.u811, p.od10
    public final void apply() {
        Z();
        a(this.n0);
        nr20 nr20Var = this.n0;
        nr20Var.Z0 = this.H0 ? 1 : 0;
        nr20Var.X0 = this.r0;
        int i = this.G0;
        if (i != -1) {
            nr20Var.Y0 = i;
        }
        int i2 = this.C0;
        if (i2 != 0) {
            ((ljk1) nr20Var).A0 = i2;
        }
        int i3 = this.E0;
        if (i3 != 0) {
            ((ljk1) nr20Var).w0 = i3;
        }
        int i4 = this.D0;
        if (i4 != 0) {
            ((ljk1) nr20Var).B0 = i4;
        }
        int i5 = this.F0;
        if (i5 != 0) {
            ((ljk1) nr20Var).x0 = i5;
        }
        int i6 = this.B0;
        if (i6 != 0) {
            nr20Var.T0 = i6;
        }
        int i7 = this.A0;
        if (i7 != 0) {
            nr20Var.U0 = i7;
        }
        float f = this.h;
        if (f != 0.5f) {
            nr20Var.N0 = f;
        }
        float f2 = this.K0;
        if (f2 != 0.5f) {
            nr20Var.P0 = f2;
        }
        float f3 = this.L0;
        if (f3 != 0.5f) {
            nr20Var.R0 = f3;
        }
        float f4 = this.i;
        if (f4 != 0.5f) {
            nr20Var.O0 = f4;
        }
        float f5 = this.I0;
        if (f5 != 0.5f) {
            nr20Var.Q0 = f5;
        }
        float f6 = this.J0;
        if (f6 != 0.5f) {
            nr20Var.S0 = f6;
        }
        byte b = this.z0;
        if (b != 2) {
            nr20Var.V0 = b;
        }
        byte b2 = this.y0;
        if (b2 != 2) {
            nr20Var.W0 = b2;
        }
        int i8 = this.s0;
        if (i8 != -1) {
            nr20Var.I0 = i8;
        }
        int i9 = this.t0;
        if (i9 != -1) {
            nr20Var.K0 = i9;
        }
        int i10 = this.u0;
        if (i10 != -1) {
            nr20Var.M0 = i10;
        }
        int i11 = this.v0;
        if (i11 != -1) {
            nr20Var.H0 = i11;
        }
        int i12 = this.w0;
        if (i12 != -1) {
            nr20Var.J0 = i12;
        }
        int i13 = this.x0;
        if (i13 != -1) {
            nr20Var.L0 = i13;
        }
        Y();
    }
}
