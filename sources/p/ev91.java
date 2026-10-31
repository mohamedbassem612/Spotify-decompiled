package p;

import androidx.compose.ui.geometry.Offset;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ev91 extends l5t implements zlb0 {
    public f8n Q0;
    public iu30 R0;
    public g8n S0;
    public n8b1 T0;
    public final o95 U0;
    public boolean V0;
    public xab1 W0;

    public ev91(f8n f8nVar, iu30 iu30Var, g8n g8nVar, n8b1 n8b1Var) {
        this.Q0 = f8nVar;
        this.R0 = iu30Var;
        this.S0 = g8nVar;
        this.T0 = n8b1Var;
        this.U0 = new o95(new Offset(g8nVar.b(f8nVar)), rno1.f, new Offset((((long) Float.floatToRawIntBits(1.0f)) & 4294967295L) | (Float.floatToRawIntBits(1.0f) << 32)), 8);
        H1(f8d1.a(new ae4(this, (byte) 8)));
    }

    public final void A1() {
        xab1 xab1Var = this.W0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.W0 = null;
    }

    public final void K1(boolean z) {
        long jB = this.S0.b(this.Q0);
        xab1 xab1Var = this.W0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.W0 = null;
        this.W0 = fn31.T(v1(), null, 0, new j75(z, this, jB, null, (byte) 1), 3);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new iv81(q5t0VarH, this, (byte) 7));
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        this.V0 = false;
        fe81 fe81Var = new fe81(this, (byte) 24);
        wdn0 wdn0Var = oap1.C(this).Q1;
        if (wdn0Var.h(fe81Var) >= 0) {
            return;
        }
        wdn0Var.b(fe81Var);
    }
}
