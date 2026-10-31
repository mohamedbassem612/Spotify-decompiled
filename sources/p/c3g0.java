package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c3g0 implements awh0 {
    public final apr a;
    public final j0l b;
    public final cp31 c;
    public final l7s d;
    public final g3e e;
    public final q8n f;
    public llm g;

    public c3g0(apr aprVar, j0l j0lVar, cp31 cp31Var, l7s l7sVar, g3e g3eVar, q8n q8nVar) {
        this.a = aprVar;
        this.b = j0lVar;
        this.c = cp31Var;
        this.d = l7sVar;
        this.e = g3eVar;
        this.f = q8nVar;
        this.g = i3a.k(q8nVar);
    }

    public final void a() {
        smo1.p(this.g, (CancellationException) null);
    }

    public final void b() {
        llm llmVarK = i3a.k(this.f);
        this.g = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new p6d0(this, (lnm) null, (byte) 25), 3);
    }
}
