package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wr60 implements yt90 {
    public final g0l a;
    public final c9c0 b;
    public final g2z c;
    public final llm d;
    public xab1 e;

    public wr60(g0l g0lVar, c9c0 c9c0Var, g2z g2zVar, q8n q8nVar) {
        this.a = g0lVar;
        this.b = c9c0Var;
        this.c = g2zVar;
        this.d = us71.h(q8nVar);
    }

    public final void start() {
        this.e = fn31.T(this.d, (o8n) null, 0, new bu(this, (lnm) null, (byte) 18), 3);
    }

    public final void stop() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
