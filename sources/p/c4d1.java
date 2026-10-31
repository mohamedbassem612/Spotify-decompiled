package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/c4d1;", "Lp/uim0;", "Lp/b4d1;", "glimmer"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c4d1 extends uim0 {
    public final boolean a;
    public final hw61 b;
    public final qqb c;
    public final idn0 d;

    public c4d1(boolean z, hw61 hw61Var, qqb qqbVar, idn0 idn0Var) {
        this.a = z;
        this.b = hw61Var;
        this.c = qqbVar;
        this.d = idn0Var;
    }

    public final pim0 a() {
        return new b4d1(this.a, this.b, this.c, this.d);
    }

    public final void b(pim0 pim0Var) {
        b4d1 b4d1Var = (b4d1) pim0Var;
        boolean z = b4d1Var.O0;
        boolean z2 = this.a;
        if (z != z2) {
            b4d1Var.O0 = z2;
            ha71.x(b4d1Var);
        }
        hw61 hw61Var = b4d1Var.P0;
        hw61 hw61Var2 = this.b;
        if (!u890.j(hw61Var, hw61Var2)) {
            b4d1Var.P0 = hw61Var2;
            ha71.x(b4d1Var);
        }
        qqb qqbVar = b4d1Var.Q0;
        qqb qqbVar2 = this.c;
        if (!u890.j(qqbVar, qqbVar2)) {
            b4d1Var.Q0 = qqbVar2;
            ha71.x(b4d1Var);
        }
        idn0 idn0Var = b4d1Var.R0;
        idn0 idn0Var2 = this.d;
        if (u890.j(idn0Var, idn0Var2)) {
            return;
        }
        b4d1Var.R0 = idn0Var2;
        b4d1Var.H1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4d1)) {
            return false;
        }
        c4d1 c4d1Var = (c4d1) obj;
        return this.a == c4d1Var.a && u890.j(this.b, c4d1Var.b) && u890.j(this.c, c4d1Var.c) && u890.j(this.d, c4d1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        qqb qqbVar = this.c;
        int iHashCode2 = (iHashCode + (qqbVar != null ? qqbVar.hashCode() : 0)) * 31;
        idn0 idn0Var = this.d;
        return iHashCode2 + (idn0Var != null ? idn0Var.hashCode() : 0);
    }
}
