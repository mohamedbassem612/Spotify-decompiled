package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l030 extends l5t implements t161, mv40, j4k, sjp0, dpg1 {
    public static final ejb W0 = new ejb((byte) 11);
    public idn0 Q0;
    public final iu30 R0;
    public ry20 S0;
    public nsb0 T0;
    public ndo0 U0;
    public final d030 V0;

    public l030(idn0 idn0Var, int i, iu30 iu30Var) {
        this.Q0 = idn0Var;
        this.R0 = iu30Var;
        d030 d030VarB = l6p1.b(i, new c4z(this));
        H1(d030VarB);
        this.V0 = d030VarB;
    }

    @Override // p.pim0
    public final void B1() {
        nsb0 nsb0Var = this.T0;
        if (nsb0Var != null) {
            nsb0Var.b();
        }
        this.T0 = null;
    }

    @Override // p.mv40
    public final void E(elb0 elb0Var) {
        ndo0 ndo0Var = (ndo0) elb0Var;
        this.U0 = ndo0Var;
        if (this.V0.L1().b()) {
            if (!ndo0Var.f1().N0) {
                if (this.N0) {
                    don1.s(this);
                }
            } else {
                ndo0 ndo0Var2 = this.U0;
                if (ndo0Var2 != null && ndo0Var2.f1().N0 && this.N0) {
                    don1.s(this);
                }
            }
        }
    }

    public final void K1(idn0 idn0Var, ty20 ty20Var) {
        if (!this.N0) {
            idn0Var.a(ty20Var);
        } else {
            faa0 faa0VarA = v1().a.A(fkj0.W0);
            c921.y(v1(), (o8n) null, 0, new l2w(idn0Var, ty20Var, faa0VarA != null ? faa0VarA.L(new b6(idn0Var, ty20Var, (byte) 22)) : null, (lnm) null, (byte) 29), 3);
        }
    }

    public final void L1(idn0 idn0Var) {
        ry20 ry20Var;
        if (u890.j(this.Q0, idn0Var)) {
            return;
        }
        idn0 idn0Var2 = this.Q0;
        if (idn0Var2 != null && (ry20Var = this.S0) != null) {
            idn0Var2.a(new sy20(ry20Var));
        }
        this.S0 = null;
        this.Q0 = idn0Var;
    }

    @Override // p.sjp0
    public final void f0() {
        p811 p811Var = new p811();
        p9p1.z(this, new og(p811Var, this, (byte) 24));
        nsb0 nsb0Var = (nsb0) p811Var.a;
        if (this.V0.L1().b()) {
            nsb0 nsb0Var2 = this.T0;
            if (nsb0Var2 != null) {
                nsb0Var2.b();
            }
            if (nsb0Var != null) {
                nsb0Var.a();
            } else {
                nsb0Var = null;
            }
            this.T0 = nsb0Var;
        }
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        b261.s(e261Var, this.V0.L1().b());
        b261.j(e261Var, new y0u(this));
    }

    @Override // p.dpg1
    public final Object n() {
        return W0;
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    public /* synthetic */ l030(idn0 idn0Var, t4e1 t4e1Var, int i) {
        this(idn0Var, 1, (iu30) ((i & 4) != 0 ? null : t4e1Var));
    }
}
