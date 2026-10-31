package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y161 {
    public final hmb0 a;
    public final u7x b;
    public final or80 c;
    public final wdn0 d = new wdn0(2);

    public y161(hmb0 hmb0Var, u7x u7xVar, fdn0 fdn0Var) {
        this.a = hmb0Var;
        this.b = u7xVar;
        this.c = fdn0Var;
    }

    public final v161 a() {
        return new v161(this.b, false, this.a, new o161());
    }

    public final void b(hmb0 hmb0Var, o161 o161Var) {
        af5 af5Var;
        af5 af5Var2;
        wdn0 wdn0Var = this.d;
        Object[] objArr = wdn0Var.a;
        int i = wdn0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            m74 m74Var = (m74) ((p161) objArr[i2]);
            m74Var.getClass();
            o161 o161VarX = hmb0Var.x();
            int i3 = hmb0Var.b;
            pct0 pct0Var = m74Var.a;
            ha4 ha4Var = m74Var.c;
            pb4 pb4Var = o161Var != null ? (pb4) eko1.v(o161Var, z161.s) : null;
            pb4 pb4Var2 = o161VarX != null ? (pb4) eko1.v(o161VarX, z161.s) : null;
            pb4 pb4Var3 = m9h.T0;
            if (!u890.j(pb4Var2, pb4Var3)) {
                if (u890.j(pb4Var, pb4Var3) && !u890.j(pb4Var2, pb4Var3)) {
                    pct0Var.f(ha4Var, i3, true);
                }
                String str = (o161Var == null || (af5Var2 = (af5) eko1.v(o161Var, z161.F)) == null) ? null : af5Var2.b;
                String str2 = (o161VarX == null || (af5Var = (af5) eko1.v(o161VarX, z161.F)) == null) ? null : af5Var.b;
                if (str != str2) {
                    if (str == null) {
                        pct0Var.f(ha4Var, i3, true);
                    } else if (str2 == null) {
                        pct0Var.f(ha4Var, i3, false);
                    } else if (u890.j(pb4Var2, m9h.U0)) {
                        pct0Var.c(ha4Var, i3, no80.t(str2));
                    }
                }
                rze1 rze1Var = o161Var != null ? (rze1) eko1.v(o161Var, z161.L) : null;
                rze1 rze1Var2 = o161VarX != null ? (rze1) eko1.v(o161VarX, z161.L) : null;
                if (rze1Var != rze1Var2) {
                    if (rze1Var == null) {
                        pct0Var.f(ha4Var, i3, true);
                    } else if (rze1Var2 == null) {
                        pct0Var.f(ha4Var, i3, false);
                    } else if (u890.j(pb4Var2, m9h.V0)) {
                        int iOrdinal = rze1Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            pct0Var.c(ha4Var, i3, no80.u(bool.booleanValue()));
                        }
                    }
                }
                f620 f620Var = o161Var != null ? (f620) eko1.v(o161Var, z161.t) : null;
                f620 f620Var2 = o161VarX != null ? (f620) eko1.v(o161VarX, z161.t) : null;
                if (!u890.j(f620Var, f620Var2)) {
                    if (f620Var == null) {
                        pct0Var.f(ha4Var, i3, true);
                    } else if (f620Var2 == null) {
                        pct0Var.f(ha4Var, i3, false);
                    } else {
                        pct0Var.c(ha4Var, i3, ((ej4) f620Var2).a);
                    }
                }
            } else if (!u890.j(pb4Var, pb4Var3)) {
                pct0Var.f(ha4Var, i3, false);
            }
            boolean z = o161Var != null && i541.k(o161Var);
            boolean z2 = o161VarX != null && i541.k(o161VarX);
            if (z != z2) {
                gdn0 gdn0Var = m74Var.h;
                if (z2) {
                    gdn0Var.a(i3);
                } else {
                    gdn0Var.g(i3);
                }
            }
        }
    }
}
