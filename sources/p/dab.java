package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dab extends v46 {
    public final u46 d;
    public final frh1 e;
    public final q8n f;
    public llm g;
    public hm41 h;

    public dab(u46 u46Var, frh1 frh1Var, q8n q8nVar) {
        this.d = u46Var;
        this.e = frh1Var;
        this.f = q8nVar;
    }

    public final void e() {
        u46 u46Var = this.d;
        String str = u46Var.a;
        if (u46Var.d != psk.c || str == null) {
            i();
            return;
        }
        j();
        j0d1 j0d1VarB = guo1.B();
        q8n q8nVar = this.f;
        q8nVar.getClass();
        llm llmVarE = smo1.e(flo1.l(q8nVar, j0d1VarB));
        this.g = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new w7a(this, str, (lnm) null, (byte) 15), 3);
    }

    public final void f() {
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.g = null;
    }
}
