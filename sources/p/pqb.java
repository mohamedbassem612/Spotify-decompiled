package p;

import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/pqb;", "Lp/uim0;", "Lp/oqb;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class pqb extends uim0 {
    public final float a;
    public final Brush b;
    public final hw61 c;

    public pqb(float f, Brush brush, hw61 hw61Var) {
        this.a = f;
        this.b = brush;
        this.c = hw61Var;
    }

    public final pim0 a() {
        return new oqb(this.a, this.b, this.c);
    }

    public final void b(pim0 pim0Var) {
        oqb oqbVar = (oqb) pim0Var;
        float f = oqbVar.R0;
        cqc cqcVar = oqbVar.U0;
        float f2 = this.a;
        if (!p3v.c(f, f2)) {
            oqbVar.R0 = f2;
            cqcVar.H1();
        }
        Brush brush = oqbVar.S0;
        Brush brush2 = this.b;
        if (!u890.j(brush, brush2)) {
            oqbVar.S0 = brush2;
            cqcVar.H1();
        }
        hw61 hw61Var = oqbVar.T0;
        hw61 hw61Var2 = this.c;
        if (u890.j(hw61Var, hw61Var2)) {
            return;
        }
        oqbVar.T0 = hw61Var2;
        cqcVar.H1();
        nko1.C(oqbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqb)) {
            return false;
        }
        pqb pqbVar = (pqb) obj;
        return p3v.c(this.a, pqbVar.a) && u890.j(this.b, pqbVar.b) && u890.j(this.c, pqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + p3v.d(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }
}
