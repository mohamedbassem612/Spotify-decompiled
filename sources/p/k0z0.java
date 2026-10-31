package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k0z0 implements rdo0 {
    public final xm41 a;
    public final llm b;
    public final n8d1 c;

    public k0z0(xnn0 xnn0Var, xm41 xm41Var, q8n q8nVar) {
        this.a = xm41Var;
        llm llmVarH = us71.h(q8nVar);
        this.b = llmVarH;
        this.c = new n8d1(h0z0.a);
        fn31.T(llmVarH, (o8n) null, 0, new vse0(this, (lnm) null, (byte) 12), 3);
    }

    public final void dispose() {
        smo1.p(this.b, (CancellationException) null);
        this.c.getClass();
    }
}
