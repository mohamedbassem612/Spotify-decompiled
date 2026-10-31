package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wx90 implements yt90 {
    public final neh0 a;
    public final c9c0 b;
    public final q8n c;
    public llm d;

    public wx90(neh0 neh0Var, c9c0 c9c0Var, q8n q8nVar) {
        this.a = neh0Var;
        this.b = c9c0Var;
        this.c = q8nVar;
    }

    public final void start() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarE = smo1.e(flo1.l(guo1.B(), this.c));
        fn31.T(llmVarE, (o8n) null, 0, new bu(this, (lnm) null, (byte) 21), 3);
        this.d = llmVarE;
    }

    public final void stop() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.d = null;
    }
}
