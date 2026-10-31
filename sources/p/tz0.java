package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tz0 implements dwo, o5s {
    public final eyh0 a;
    public final y2g0 b;
    public final llm c;

    public tz0(eyh0 eyh0Var, y2g0 y2g0Var, q8n q8nVar) {
        this.a = eyh0Var;
        this.b = y2g0Var;
        llm llmVarK = i3a.k(q8nVar);
        this.c = llmVarK;
        l4p1.u(llmVarK, !((c05) ((kly0) eyh0Var.d).get()).a() ? new huz(Boolean.FALSE, (byte) 10) : new evz(new gk(rqt0.u(new wz0(((krh) eyh0Var.b).c(ql10.a), (byte) 0)), eyh0Var, (byte) 7), new yz0(4, null, (byte) 0), (byte) 11));
        y2g0Var.a(new sz0(this, (byte) 0));
    }

    public final void onStart(iac0 iac0Var) {
        fn31.T(this.c, (o8n) null, 0, new qm(this, null, (byte) 5), 3);
    }

    public final void shutdown() {
        this.b.b("removeAdUnlockEligibilityObserver", new sz0(this, (byte) 1));
        smo1.p(this.c, (CancellationException) null);
    }
}
