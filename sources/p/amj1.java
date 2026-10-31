package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class amj1 implements anc0 {
    public final d0r a;
    public final String b;
    public final koc0 c;
    public final ov20 d;
    public final d2f1 e;
    public final me30 f;
    public final q8n g;
    public final o3r h;
    public llm i;

    public amj1(d0r d0rVar, String str, z6k0 z6k0Var, koc0 koc0Var, ov20 ov20Var, d2f1 d2f1Var, cua cuaVar, me30 me30Var, q8n q8nVar) {
        this.a = d0rVar;
        this.b = str;
        this.c = koc0Var;
        this.d = ov20Var;
        this.e = d2f1Var;
        this.f = me30Var;
        this.g = q8nVar;
        this.h = x2p1.t(str);
    }

    public final void a() {
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
    }

    public final void b() {
        llm llmVarK = i3a.k(this.g);
        this.i = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 1), 3);
    }
}
