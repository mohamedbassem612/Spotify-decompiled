package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ord0 implements dwo {
    public final yqd0 a;
    public boolean b;
    public final llm c;

    public ord0(yqd0 yqd0Var, n350 n350Var, hq90 hq90Var, q8n q8nVar) {
        this.a = yqd0Var;
        llm llmVarH = us71.h(q8nVar);
        this.c = llmVarH;
        if (n350Var.a()) {
            fn31.T(llmVarH, (o8n) null, 0, new q4d0(hq90Var, this, (lnm) null, (byte) 15), 3);
        } else {
            yqd0Var.stop();
        }
    }

    public final synchronized void shutdown() {
        if (this.b) {
            return;
        }
        this.b = true;
        smo1.p(this.c, (CancellationException) null);
        this.a.stop();
    }
}
