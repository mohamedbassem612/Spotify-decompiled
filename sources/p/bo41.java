package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bo41 implements iac0 {
    public final iac0 a;
    public final tac0 b;
    public final ek2 c;

    public bo41(iac0 iac0Var) {
        this.a = iac0Var;
        tac0 tac0Var = new tac0(this, true);
        this.b = tac0Var;
        ek2 ek2Var = new ek2(this, (byte) 18);
        this.c = ek2Var;
        tac0Var.i(iac0Var.getLifecycle().b());
        iac0Var.getLifecycle().a(ek2Var);
    }

    public final x8c0 getLifecycle() {
        return this.b;
    }
}
