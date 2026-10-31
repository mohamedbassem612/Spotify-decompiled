package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bun0 implements dwo {
    public final lmy0 a;
    public final g0l b;
    public final dcs c;
    public final llm d;
    public final faa0 e;

    public bun0(lmy0 lmy0Var, g0l g0lVar, oc4 oc4Var, dcs dcsVar, q8n q8nVar) {
        this.a = lmy0Var;
        this.b = g0lVar;
        this.c = dcsVar;
        llm llmVarX = l1d.x(q8nVar);
        this.d = llmVarX;
        if (!oc4Var.d()) {
            Logger.g("[NAV_CMD] Feature disabled — skipping subscription", new Object[0]);
        } else {
            this.e = c921.y(llmVarX, (o8n) null, 0, new uug0(this, (lnm) null, (byte) 21), 3);
            Logger.g("[NAV_CMD] Subscribed to hm://device-proxy/v1/navigation", new Object[0]);
        }
    }

    public final void shutdown() {
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        smo1.q(this.d);
    }
}
