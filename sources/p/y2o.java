package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y2o extends x7e0 {
    public final wzn d;
    public final l1o e;
    public final q8n f;
    public llm g;
    public fv21 h;

    public y2o(wzn wznVar, l1o l1oVar, q8n q8nVar) {
        this.d = wznVar;
        this.e = l1oVar;
        this.f = q8nVar;
    }

    public final void e() {
        if (d()) {
            return;
        }
        j();
        llm llmVarE = smo1.e(this.f);
        this.g = llmVarE;
        wzn wznVar = this.d;
        d0r d0rVar = (d0r) wznVar.c;
        o3r o3rVar = (o3r) wznVar.d;
        l1o l1oVar = this.e;
        l4p1.u(llmVarE, new lt20(new fu20(new vd0(d3p1.F(d0rVar, o3rVar, l1oVar.a), wznVar, l1oVar, (byte) 27), new eum(this, (lnm) null, (byte) 8), (byte) 1), new mnl(this, (lnm) null, (byte) 3), (byte) 0));
    }

    public final void f() {
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.g = null;
    }
}
