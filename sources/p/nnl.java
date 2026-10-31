package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nnl extends x7e0 {
    public final lag d;
    public final gnl e;
    public final q8n f;
    public llm g;
    public lzh h;

    public nnl(lag lagVar, gnl gnlVar, q8n q8nVar) {
        this.d = lagVar;
        this.e = gnlVar;
        this.f = q8nVar;
    }

    public final void e() {
        if (d()) {
            return;
        }
        j();
        llm llmVarE = smo1.e(this.f);
        this.g = llmVarE;
        lag lagVar = this.d;
        d0r d0rVar = (d0r) lagVar.d;
        o3r o3rVar = (o3r) lagVar.e;
        gnl gnlVar = this.e;
        l4p1.u(llmVarE, new lt20(new fu20(new vd0(d3p1.F(d0rVar, o3rVar, gnlVar.a), lagVar, gnlVar, (byte) 24), new zti(this, (lnm) null, (byte) 22), (byte) 1), new mnl(this, (lnm) null, (byte) 0), (byte) 0));
    }

    public final void f() {
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.g = null;
    }
}
