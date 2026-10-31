package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fiq0 implements dwo {
    public static final bma1 d = bma1.b.u("one_trust_partner_id");
    public final kly0 a;
    public final kly0 b;
    public final llm c;

    public fiq0(eiq0 eiq0Var, kly0 kly0Var, kly0 kly0Var2, q8n q8nVar) {
        this.a = kly0Var;
        this.b = kly0Var2;
        llm llmVarE = smo1.e(q8nVar);
        this.c = llmVarE;
        if (eiq0Var.a.b()) {
            c921.y(llmVarE, (o8n) null, 0, new cto0(this, (lnm) null, (byte) 14), 3);
        }
    }

    public final void shutdown() {
        smo1.q(this.c);
    }
}
