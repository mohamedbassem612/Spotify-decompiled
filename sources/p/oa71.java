package p;

import com.spotify.betamax.player.exception.BetamaxException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oa71 extends q5u0 {
    public final yqg N0;
    public final mr20 O0;
    public final llm P0;
    public xab1 Q0;
    public long R0;
    public final jt41 X;
    public final fh61 Y;
    public final fh61 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa71(m0u0 m0u0Var, oot0 oot0Var, jt41 jt41Var, fh61 fh61Var, fh61 fh61Var2, yqg yqgVar, q8n q8nVar, q8n q8nVar2) {
        super(m0u0Var, oot0Var);
        mr20 mr20VarR = o4p1.r(new m441(new y2k(2, (lnm) null, (byte) 7)), q8nVar);
        this.X = jt41Var;
        this.Y = fh61Var;
        this.Z = fh61Var2;
        this.N0 = yqgVar;
        this.O0 = mr20VarR;
        this.P0 = i3a.k(q8nVar2);
    }

    public final void J(long j, long j2) {
        super.J(j, j2);
        if (T()) {
            V();
        }
    }

    public final void K(long j, long j2) {
        super.K(j, j2);
        W();
        U(j);
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        super.L(betamaxException, j, j2);
        W();
        U(j);
    }

    public final void O(long j, long j2) {
        super.O(j, j2);
        W();
        U(j);
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        W();
        this.Y.invoke();
    }

    public final boolean T() {
        k5u0 k5u0VarA = a();
        return (k5u0VarA == null || k5u0VarA.g || k5u0VarA.e) ? false : true;
    }

    public final void U(long j) {
        this.X.invoke(Long.valueOf(j), Long.valueOf(this.R0));
    }

    public final void V() {
        xab1 xab1Var = this.Q0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Q0 = fn31.T(this.P0, (o8n) null, 0, new b751(this, (lnm) null, (byte) 13), 3);
    }

    public final void W() {
        xab1 xab1Var = this.Q0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Q0 = null;
    }

    public final void d(long j, long j2, boolean z) {
        super.d(j, j2, z);
        if (z) {
            W();
            U(j);
        } else {
            U(j);
            if (T()) {
                V();
            }
        }
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        super.i(betamaxException, j, j2);
        W();
        U(j);
    }

    public final void k(long j, long j2) {
        super.k(j, j2);
        this.R0 = j;
    }

    public final void m(long j, long j2) {
        super.m(j, j2);
        U(j);
        if (T()) {
            V();
        }
    }

    public final void p(long j, long j2, long j3, boolean z) {
        super.p(j, j2, j3, z);
        U(j2);
    }

    public final void v(yhg0 yhg0Var, long j) {
        super.v(yhg0Var, j);
        this.Z.invoke();
    }
}
