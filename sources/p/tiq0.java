package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tiq0 implements f961 {
    public final llm a;
    public final ny30 b;
    public final List c;

    public tiq0(q8n q8nVar, kly0 kly0Var) {
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("ObservationPlatformPublisher")));
        this.a = llmVarE;
        ny30 ny30Var = new ny30(kly0Var);
        this.b = ny30Var;
        this.c = f46.i0(new ny30[]{ny30Var, null});
        l4p1.u(llmVarE, f5p1.q(hhp0.a.a(), new e3p0(this, (lnm) null, (byte) 6)));
    }

    @Override // p.dwo
    public final void shutdown() {
        try {
            smo1.q(this.a);
        } catch (Exception unused) {
        }
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
