package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gst0 implements zrt0 {
    public final est0 a;
    public final q8n b;
    public final mr20 c;
    public llm d;
    public final bpb1 e = gio1.b(b7x.a);

    public gst0(est0 est0Var, q8n q8nVar, mr20 mr20Var) {
        this.a = est0Var;
        this.b = q8nVar;
        this.c = mr20Var;
    }

    public final mr20 a(String str) {
        return new g9i0(this.e, str, (byte) 1);
    }

    public final void b() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        j0d1 j0d1VarB = guo1.B();
        q8n q8nVar = this.b;
        q8nVar.getClass();
        llm llmVarE = smo1.e(flo1.l(q8nVar, j0d1VarB));
        this.d = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 25), 3);
    }

    public final void c() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.e.m((Object) null, b7x.a);
    }
}
