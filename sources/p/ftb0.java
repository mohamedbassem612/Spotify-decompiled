package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ftb0 extends pim0 implements t161 {
    public Function0 O0;
    public ysb0 P0;
    public qqq0 Q0;
    public boolean R0;
    public boolean S0;
    public pq41 T0;
    public final dtb0 U0 = new dtb0(this, (byte) 0);
    public dtb0 V0;

    public ftb0(Function0 function0, ysb0 ysb0Var, qqq0 qqq0Var, boolean z, boolean z2) {
        this.O0 = function0;
        this.P0 = ysb0Var;
        this.Q0 = qqq0Var;
        this.R0 = z;
        this.S0 = z2;
        H1();
    }

    public final void H1() {
        this.T0 = new pq41(new etb0(this, (byte) 0), new etb0(this, (byte) 1), this.S0);
        this.V0 = this.R0 ? new dtb0(this, (byte) 1) : null;
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        b261.F(e261Var, true);
        e261Var.b(z161.P, this.U0);
        qqq0 qqq0Var = this.Q0;
        pq41 pq41Var = this.T0;
        if (qqq0Var == qqq0.a) {
            if (pq41Var == null) {
                u890.C("scrollAxisRange");
                throw null;
            }
            d261 d261Var = z161.w;
            mma0 mma0Var = b261.a[13];
            d261Var.getClass();
            e261Var.b(d261Var, pq41Var);
        } else {
            if (pq41Var == null) {
                u890.C("scrollAxisRange");
                throw null;
            }
            d261 d261Var2 = z161.v;
            mma0 mma0Var2 = b261.a[12];
            d261Var2.getClass();
            e261Var.b(d261Var2, pq41Var);
        }
        dtb0 dtb0Var = this.V0;
        if (dtb0Var != null) {
            e261Var.b(m161.f, new we(null, dtb0Var));
        }
        e261Var.b(m161.C, new we(null, new waq0(new etb0(this, (byte) 2), (byte) 17)));
        b261.k(e261Var, this.P0.d());
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }
}
