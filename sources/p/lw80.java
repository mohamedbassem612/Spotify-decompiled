package p;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/lw80;", "Lp/uim0;", "Lp/mw80;", "src_main_java_com_spotify_encore_box-box"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class lw80 extends uim0 {
    public final hw61 a;
    public final pgx b;
    public final afx c;
    public final idn0 d;
    public final boolean e;

    public lw80(hw61 hw61Var, pgx pgxVar, afx afxVar, idn0 idn0Var, boolean z) {
        this.a = hw61Var;
        this.b = pgxVar;
        this.c = afxVar;
        this.d = idn0Var;
        this.e = z;
    }

    public final pim0 a() {
        return new mw80(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(pim0 pim0Var) {
        mw80 mw80Var = (mw80) pim0Var;
        hw61 hw61Var = mw80Var.Q0;
        hw61 hw61Var2 = this.a;
        boolean zJ = u890.j(hw61Var, hw61Var2);
        pgx pgxVar = mw80Var.R0;
        pgx pgxVar2 = this.b;
        boolean zJ2 = u890.j(pgxVar, pgxVar2);
        afx afxVar = this.c;
        boolean z = this.e;
        boolean z2 = (zJ2 && u890.j(mw80Var.S0, afxVar) && mw80Var.U0 == z) ? false : true;
        idn0 idn0Var = mw80Var.T0;
        idn0 idn0Var2 = this.d;
        boolean z3 = idn0Var != idn0Var2;
        mw80Var.Q0 = hw61Var2;
        mw80Var.R0 = pgxVar2;
        mw80Var.S0 = afxVar;
        mw80Var.U0 = z;
        if (z3) {
            mw80Var.T0 = idn0Var2;
            mw80Var.V0.clear();
            xab1 xab1Var = mw80Var.X0;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            mw80Var.X0 = fn31.T(mw80Var.v1(), (o8n) null, 0, new no70(mw80Var, (lnm) null, (byte) 5), 3);
        }
        if (z2 || z3) {
            mw80Var.K1();
        }
        if (zJ) {
            return;
        }
        mw80Var.W0.H1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw80)) {
            return false;
        }
        lw80 lw80Var = (lw80) obj;
        return u890.j(this.a, lw80Var.a) && this.b.equals(lw80Var.b) && u890.j(this.c, lw80Var.c) && u890.j(this.d, lw80Var.d) && this.e == lw80Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ab80.l(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }
}
