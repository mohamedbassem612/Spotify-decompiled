package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v7e1 extends pim0 implements j4k, zlb0 {
    public final lee1 O0;
    public f2h1 P0;
    public my30 Q0;

    public v7e1(lee1 lee1Var) {
        this.O0 = lee1Var;
    }

    public final void A1() {
        this.P0 = null;
        this.Q0 = null;
    }

    public final void H1(lee1 lee1Var, f930 f930Var) {
        zma1 zma1Var = lee1Var.a;
        FontFamily fontFamily = zma1Var.f;
        FontWeight fontWeight = zma1Var.c;
        if (fontWeight == null) {
            fontWeight = FontWeight.t;
        }
        FontStyle fontStyle = zma1Var.d;
        int i = fontStyle != null ? fontStyle.a : 0;
        FontSynthesis fontSynthesis = zma1Var.e;
        this.P0 = ((g930) f930Var).a(fontFamily, fontWeight, i, fontSynthesis != null ? fontSynthesis.a : 65535);
        dio1.y(this);
    }

    public final void T() {
        my30 my30Var = this.Q0;
        if (my30Var != null) {
            my30.b(my30Var, oap1.B(this).a1, (wat) null, (lee1) null, 30);
        }
        dio1.y(this);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        my30 my30Var = this.Q0;
        if (my30Var == null) {
            throw kaa0.g("Min size state is not set.");
        }
        hrr0 hrr0Var = (hrr0) my30Var.g;
        f2h1 f2h1Var = this.P0;
        if (f2h1Var == null) {
            throw kaa0.g("Font resolution state is not set.");
        }
        Object value = f2h1Var.getValue();
        if (!u890.j(value, my30Var.f)) {
            my30Var.f = value;
            hrr0Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) hrr0Var.getValue()).booleanValue()) {
            my30Var.a = e5e1.a((lee1) my30Var.e, (wat) my30Var.c, (f930) my30Var.d);
            hrr0Var.setValue(Boolean.FALSE);
        }
        long j2 = my30Var.a;
        q5t0 q5t0VarH = afh0Var.H(jjl.e(j, jjl.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 18));
    }

    public final void i() {
        my30 my30Var = this.Q0;
        if (my30Var != null) {
            my30.b(my30Var, (flb0) null, oap1.B(this).Z0, (lee1) null, 29);
        }
        dio1.y(this);
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        lee1 lee1VarF = z6p1.F(this.O0, oap1.B(this).a1);
        f930 f930Var = (f930) lcc.z(this, t4k.k);
        H1(lee1VarF, f930Var);
        flb0 flb0Var = oap1.B(this).a1;
        wat watVar = oap1.B(this).Z0;
        f2h1 f2h1Var = this.P0;
        if (f2h1Var == null) {
            throw kaa0.g("Font resolution state is not set.");
        }
        this.Q0 = new my30(flb0Var, watVar, f930Var, lee1VarF, f2h1Var.getValue());
    }
}
