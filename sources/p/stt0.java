package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class stt0 implements btt0 {
    public final q8n a;
    public final hut0 b;
    public final mr20 c;
    public llm d;
    public final bpb1 e = gio1.b(b7x.a);

    public stt0(q8n q8nVar, hut0 hut0Var, mr20 mr20Var) {
        this.a = q8nVar;
        this.b = hut0Var;
        this.c = mr20Var;
    }

    @Override // p.btt0
    public final g9i0 a(String str) {
        return new g9i0(this.e, str, (byte) 2);
    }

    @Override // p.btt0
    public final Object b(String str, onm onmVar) {
        llm llmVar = this.d;
        if (llmVar != null) {
            return d5p1.s(a(str), llmVar, onmVar);
        }
        eg.m("PlayabilityService is not started");
        return null;
    }

    public final void c() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        j0d1 j0d1VarB = guo1.B();
        q8n q8nVar = this.a;
        q8nVar.getClass();
        llm llmVarE = smo1.e(ilo1.B(q8nVar, j0d1VarB));
        this.d = llmVarE;
        c921.y(llmVarE, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 26), 3);
    }

    public final void d() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.d = null;
        this.e.m((Object) null, b7x.a);
    }
}
