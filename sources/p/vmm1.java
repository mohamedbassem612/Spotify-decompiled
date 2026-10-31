package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vmm1 implements f961 {
    public final gaa0 a;
    public final zob1 b;

    public vmm1(nbc nbcVar, ttq ttqVar, ttq ttqVar2, q8n q8nVar, f95 f95Var) {
        zob1 zob1VarB;
        gaa0 gaa0VarF = op71.f();
        this.a = gaa0VarF;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, gaa0VarF));
        boolean zB = f95Var.b();
        rmm1 rmm1Var = rmm1.a;
        if (zB && nbc.p()) {
            skx0 skx0Var = (skx0) ttqVar.get();
            zob1VarB = d5p1.t(new rpk1(skx0Var.b, skx0Var, (ykx0) ttqVar2.get(), (byte) 2), llmVarE, ey71.a, rmm1Var);
        } else {
            zob1VarB = gio1.b(rmm1Var);
        }
        this.b = zob1VarB;
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.d(null);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
