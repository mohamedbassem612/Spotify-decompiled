package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class clu implements ldv0 {
    public final /* synthetic */ l811 a;
    public final /* synthetic */ brw b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ kwf d;

    public clu(l811 l811Var, brw brwVar, p811 p811Var, kwf kwfVar) {
        this.a = l811Var;
        this.b = brwVar;
        this.c = p811Var;
        this.d = kwfVar;
    }

    public final void a() {
        x8c0 lifecycle;
        l811 l811Var = this.a;
        if (l811Var.a) {
            l811Var.a = false;
            this.b.stop();
        }
        p811 p811Var = this.c;
        iac0 iac0Var = (iac0) p811Var.a;
        if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
            lifecycle.d(this.d);
        }
        p811Var.a = null;
    }
}
