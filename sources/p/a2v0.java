package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a2v0 implements f961 {
    public final y1v0 a;
    public final y1v0 b;
    public final llm c;
    public final dt71 d;
    public final n5f0 e;
    public final xab1 f;

    public a2v0(y1v0 y1v0Var, y1v0 y1v0Var2, q8n q8nVar) {
        this.a = y1v0Var;
        this.b = y1v0Var2;
        llm llmVarE = smo1.e(q8nVar);
        this.c = llmVarE;
        this.d = mgo1.e(1, 0, 0, 6);
        this.e = yoi1.R(5000L, 60000L);
        this.f = fn31.T(llmVarE, (o8n) null, 0, new z1v0(this, null), 3);
    }

    public final void shutdown() {
        this.f.d((CancellationException) null);
        smo1.p(this.c, (CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
