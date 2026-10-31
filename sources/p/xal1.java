package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xal1 {
    public final tac0 a;
    public iac0 b;
    public final ek2 c = new ek2(this, (byte) 27);

    public xal1(wal1 wal1Var) {
        this.a = new tac0(wal1Var, true);
    }

    public final void a() {
        x8c0 lifecycle;
        iac0 iac0Var = this.b;
        if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
            lifecycle.d(this.c);
        }
        this.b = null;
        tac0 tac0Var = this.a;
        if (tac0Var.i == w8c0.b) {
            tac0Var.i(w8c0.c);
        }
        tac0Var.i(w8c0.a);
    }
}
