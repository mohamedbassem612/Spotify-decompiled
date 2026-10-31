package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yzs {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final fpr e;
    public final dt8 f;
    public final llm g;
    public faa0 h;
    public faa0 i;
    public nqs j;

    public yzs(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, fpr fprVar, q8n q8nVar, dt8 dt8Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
        this.e = fprVar;
        this.f = dt8Var;
        this.g = smo1.e(ha71.A(op71.f(), q8nVar));
    }

    public final void a(bbr0 bbr0Var, gj5 gj5Var, a8l a8lVar) {
        this.e.c(true, a8lVar);
        n5s n5sVar = new n5s(this, a8lVar, (lnm) null, (byte) 15);
        llm llmVar = this.g;
        this.h = c921.y(llmVar, (o8n) null, 0, n5sVar, 3);
        this.i = c921.y(llmVar, (o8n) null, 0, new swn(this, gj5Var, bbr0Var, a8lVar, (lnm) null, (byte) 18), 3);
    }

    public final void b(a8l a8lVar) {
        this.e.c(false, a8lVar);
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        faa0 faa0Var2 = this.i;
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
        }
        this.h = null;
        this.i = null;
        nqs nqsVar = this.j;
        if (nqsVar != null) {
            nqsVar.a();
        }
        this.j = null;
    }
}
