package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ez71 extends l5t {
    public hw61 R0;
    public long S0;
    public xab1 U0;
    public final cqc V0;
    public float Q0 = 1.0f;
    public final o95 T0 = c97.b(0.0f);

    public ez71(long j, hw61 hw61Var) {
        this.R0 = hw61Var;
        this.S0 = j;
        cqc cqcVarA = exd0.a(new q961(this, (byte) 26));
        H1(cqcVarA);
        this.V0 = cqcVarA;
    }

    public final void A1() {
        xab1 xab1Var = this.U0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.U0 = null;
    }

    public final void z1() {
        this.U0 = fn31.T(v1(), (o8n) null, 0, new i7u0(this, null, (byte) 7), 3);
    }
}
