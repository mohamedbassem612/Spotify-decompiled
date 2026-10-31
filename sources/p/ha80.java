package p;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ha80;", "Lp/uim0;", "Lp/ja80;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ha80 extends uim0 {
    public final boolean a;
    public final boolean b;
    public final idn0 c;
    public final j4e1 d;
    public final hw61 e;

    public ha80(boolean z, boolean z2, idn0 idn0Var, j4e1 j4e1Var, hw61 hw61Var) {
        this.a = z;
        this.b = z2;
        this.c = idn0Var;
        this.d = j4e1Var;
        this.e = hw61Var;
    }

    public final pim0 a() {
        return new ja80(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(pim0 pim0Var) {
        boolean z;
        ja80 ja80Var = (ja80) pim0Var;
        boolean z2 = ja80Var.Q0;
        boolean z3 = this.a;
        boolean z4 = true;
        if (z2 != z3) {
            ja80Var.Q0 = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = ja80Var.R0;
        boolean z6 = this.b;
        if (z5 != z6) {
            ja80Var.R0 = z6;
            z = true;
        }
        idn0 idn0Var = ja80Var.S0;
        idn0 idn0Var2 = this.c;
        if (idn0Var != idn0Var2) {
            ja80Var.S0 = idn0Var2;
            faa0 faa0Var = ja80Var.W0;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            ja80Var.W0 = fn31.T(ja80Var.v1(), null, 0, new ia80(ja80Var, null, (byte) 3), 3);
        }
        j4e1 j4e1Var = ja80Var.X0;
        j4e1 j4e1Var2 = this.d;
        if (!u890.j(j4e1Var, j4e1Var2)) {
            ja80Var.X0 = j4e1Var2;
            z = true;
        }
        hw61 hw61Var = ja80Var.Z0;
        hw61 hw61Var2 = this.e;
        if (!u890.j(hw61Var, hw61Var2)) {
            if (!u890.j(ja80Var.Z0, hw61Var2)) {
                ja80Var.Z0 = hw61Var2;
                ja80Var.b1.H1();
            }
            z = true;
        }
        if (!p3v.c(ja80Var.T0, 2.0f)) {
            ja80Var.T0 = 2.0f;
            z = true;
        }
        if (p3v.c(ja80Var.U0, 1.0f)) {
            z4 = z;
        } else {
            ja80Var.U0 = 1.0f;
        }
        if (z4) {
            ja80Var.K1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha80)) {
            return false;
        }
        ha80 ha80Var = (ha80) obj;
        return this.a == ha80Var.a && this.b == ha80Var.b && u890.j(this.c, ha80Var.c) && this.d.equals(ha80Var.d) && u890.j(this.e, ha80Var.e) && p3v.c(2.0f, 2.0f) && p3v.c(1.0f, 1.0f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        hw61 hw61Var = this.e;
        return Float.hashCode(1.0f) + x0d.f((iHashCode + (hw61Var == null ? 0 : hw61Var.hashCode())) * 31, 31, 2.0f);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.a + ", isError=" + this.b + ", interactionSource=" + this.c + ", colors=" + this.d + ", textFieldShape=" + this.e + ", focusedIndicatorLineThickness=" + ((Object) p3v.d(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) p3v.d(1.0f)) + ')';
    }
}
