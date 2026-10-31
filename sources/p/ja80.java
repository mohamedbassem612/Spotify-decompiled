package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ja80 extends l5t implements j4k {
    public boolean Q0;
    public boolean R0;
    public idn0 S0;
    public float T0 = 2.0f;
    public float U0 = 1.0f;
    public boolean V0;
    public faa0 W0;
    public j4e1 X0;
    public o95 Y0;
    public hw61 Z0;
    public final o95 a1;
    public final cqc b1;

    public ja80(boolean z, boolean z2, idn0 idn0Var, j4e1 j4e1Var, hw61 hw61Var) {
        this.Q0 = z;
        this.R0 = z2;
        this.S0 = idn0Var;
        this.X0 = j4e1Var;
        this.Z0 = hw61Var;
        this.a1 = new o95(new p3v((this.V0 && z) ? 2.0f : 1.0f), rno1.c, null, 12);
        cqc cqcVarA = exd0.a(new gv20(this, (byte) 9));
        H1(cqcVarA);
        this.b1 = cqcVarA;
    }

    public final void K1() {
        c921.y(v1(), (o8n) null, 0, new ia80(this, (lnm) null, (byte) 0), 3);
        c921.y(v1(), (o8n) null, 0, new ia80(this, (lnm) null, (byte) 1), 3);
    }

    public final Object L1(a8d1 a8d1Var) {
        this.V0 = false;
        Object objCollect = this.S0.c().collect(new om70(new ArrayList(), this, (byte) 4), a8d1Var);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    @Override // p.pim0
    public final void z1() {
        this.W0 = c921.y(v1(), (o8n) null, 0, new ia80(this, (lnm) null, (byte) 2), 3);
        if (this.Y0 == null) {
            j4e1 j4e1VarM = this.X0;
            if (j4e1VarM == null) {
                j4e1VarM = i5x0.m((dah) lcc.z(this, eah.a), (rce1) lcc.z(this, sce1.a));
            }
            long jC = j4e1VarM.c(this.Q0, this.R0, this.V0);
            this.Y0 = new o95(new u7h(jC), (tzg1) m4h.Y0.invoke(u7h.e(jC)), null, 12);
        }
    }
}
