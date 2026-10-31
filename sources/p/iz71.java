package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iz71 extends l5t {
    public long Q0;
    public hw61 R0;
    public int S0;
    public int T0;
    public final o95 U0 = c97.b(-2.0f);
    public faa0 V0;
    public final cqc W0;

    public iz71(long j, hw61 hw61Var, int i, int i2) {
        this.Q0 = j;
        this.R0 = hw61Var;
        this.S0 = i;
        this.T0 = i2;
        cqc cqcVarA = exd0.a(new hbz0(this, (byte) 18));
        H1(cqcVarA);
        this.W0 = cqcVarA;
    }

    @Override // p.pim0
    public final void A1() {
        faa0 faa0Var = this.V0;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.V0 = null;
    }

    @Override // p.pim0
    public final void z1() {
        this.V0 = c921.y(v1(), (o8n) null, 0, new b751(this, (lnm) null, (byte) 17), 3);
    }
}
