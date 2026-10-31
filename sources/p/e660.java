package p;

import androidx.car.app.model.Alert;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e660 extends pim0 implements j4k, zlb0, sjp0 {
    public lee1 O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public lee1 U0;
    public f2h1 V0;

    public final void A1() {
        this.U0 = null;
        this.V0 = null;
        this.R0 = false;
    }

    public final void H1(ifh0 ifh0Var, lee1 lee1Var, f930 f930Var) {
        w9e1 w9e1Var = e5e1.b(lee1Var, ifh0Var, f930Var, 3, true).d;
        float fH = w9e1Var.h(0);
        float fH2 = w9e1Var.h(1);
        float fH3 = w9e1Var.h(2);
        this.S0 = gio1.m(fH, fH2, fH3, this.P0, 1);
        this.T0 = gio1.m(fH, fH2, fH3, this.Q0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void I1(x5f0 x5f0Var) {
        if (this.R0) {
            H1(x5f0Var, J1(), (f930) lcc.z(this, t4k.k));
            this.R0 = false;
        }
        int i = this.S0;
        this.S0 = i >= 0 ? i : 0;
        int i2 = this.T0;
        if (i2 == -1) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.T0 = i2;
    }

    public final lee1 J1() {
        lee1 lee1Var = this.U0;
        if (lee1Var != null) {
            return lee1Var;
        }
        throw kaa0.g("Resolved style is not set.");
    }

    public final void T() {
        this.U0 = z6p1.F(this.O0, oap1.B(this).a1);
        this.R0 = true;
        dio1.y(this);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        if (this.R0) {
            H1(ifh0Var, J1(), (f930) lcc.z(this, t4k.k));
            this.R0 = false;
        }
        int i = this.S0;
        int iP = i != -1 ? yoi1.p(i, hjl.j(j), hjl.h(j)) : hjl.j(j);
        int i2 = this.T0;
        q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, 0, iP, i2 != -1 ? yoi1.p(i2, hjl.j(j), hjl.h(j)) : hjl.h(j), 3));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 8));
    }

    public final void f0() {
        if (this.V0 != null) {
            p9p1.z(this, new d660(this, (byte) 1));
        }
        this.R0 = true;
        dio1.y(this);
    }

    public final void i() {
        this.R0 = true;
        dio1.y(this);
    }

    public final int s0(x5f0 x5f0Var, afh0 afh0Var, int i) {
        I1(x5f0Var);
        int i2 = this.S0;
        if (i2 == this.T0) {
            return i2;
        }
        int iN = afh0Var.n(i);
        int i3 = this.S0;
        int i4 = this.T0;
        if (iN < i3) {
            iN = i3;
        }
        return iN > i4 ? i4 : iN;
    }

    public final boolean w1() {
        return false;
    }

    public final int x(x5f0 x5f0Var, afh0 afh0Var, int i) {
        I1(x5f0Var);
        int i2 = this.S0;
        int i3 = this.T0;
        if (i2 == i3) {
            return i3;
        }
        int iD = afh0Var.d(i);
        int i4 = this.S0;
        int i5 = this.T0;
        if (iD < i4) {
            iD = i4;
        }
        return iD > i5 ? i5 : iD;
    }

    public final void z1() {
        g930 g930Var = (f930) lcc.z(this, t4k.k);
        this.U0 = z6p1.F(this.O0, oap1.B(this).a1);
        FontFamily fontFamily = J1().a.f;
        FontWeight fontWeight = J1().a.c;
        if (fontWeight == null) {
            fontWeight = FontWeight.t;
        }
        FontStyle fontStyle = J1().a.d;
        int i = fontStyle != null ? fontStyle.a : 0;
        FontSynthesis fontSynthesis = J1().a.e;
        this.V0 = g930Var.a(fontFamily, fontWeight, i, fontSynthesis != null ? fontSynthesis.a : 65535);
        p9p1.z(this, new d660(this, (byte) 0));
        this.R0 = true;
    }
}
