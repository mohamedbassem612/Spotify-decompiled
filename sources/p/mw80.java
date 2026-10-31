package p;

import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mw80 extends l5t implements sjp0 {
    public hw61 Q0;
    public pgx R0;
    public afx S0;
    public idn0 T0;
    public boolean U0;
    public final LinkedHashSet V0 = new LinkedHashSet();
    public final cqc W0;
    public xab1 X0;
    public o95 Y0;

    public mw80(hw61 hw61Var, pgx pgxVar, afx afxVar, idn0 idn0Var, boolean z) {
        this.Q0 = hw61Var;
        this.R0 = pgxVar;
        this.S0 = afxVar;
        this.T0 = idn0Var;
        this.U0 = z;
        cqc cqcVarA = exd0.a(new ux70(this, (byte) 12));
        H1(cqcVarA);
        this.W0 = cqcVarA;
    }

    public final void A1() {
        xab1 xab1Var = this.X0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X0 = null;
        this.V0.clear();
        this.Y0 = null;
    }

    public final void K1() {
        o811 o811Var = new o811();
        o811Var.a = u7h.k;
        p9p1.z(this, new x680(o811Var, this, (byte) 6));
        fn31.T(v1(), (o8n) null, 0, new kv2(this, o811Var.a, (lnm) null, (byte) 9), 3);
    }

    public final void f0() {
        K1();
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        o811 o811Var = new o811();
        o811Var.a = u7h.k;
        p9p1.z(this, new x680(o811Var, this, (byte) 6));
        this.Y0 = new o95(new u7h(o811Var.a), new tzg1(m4h.X0, new syf(u7h.e(this.S0.a.c), (byte) 20)), (Object) null, 12);
        xab1 xab1Var = this.X0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X0 = fn31.T(v1(), (o8n) null, 0, new no70(this, (lnm) null, (byte) 5), 3);
    }
}
