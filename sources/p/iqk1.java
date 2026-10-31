package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iqk1 extends x7e0 {
    public final utw0 d;
    public final q8n e;
    public llm f;
    public jqk1 g = new jqk1(z6x.a);

    public iqk1(utw0 utw0Var, q8n q8nVar) {
        this.d = utw0Var;
        this.e = q8nVar;
    }

    public final void e() {
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarK = i3a.k(this.e);
        this.f = llmVarK;
        j();
        fn31.T(llmVarK, (o8n) null, 0, new i7u0(this, null, (byte) 15), 3);
    }

    public final void f() {
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
    }

    public final void l(jqk1 jqk1Var) {
        this.g = jqk1Var;
    }
}
