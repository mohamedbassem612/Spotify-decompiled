package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jhl implements iac0 {
    public final x8c0 a;
    public final x8c0 b;
    public final tac0 c = new tac0(this, true);
    public final ek2 d;

    public jhl(x8c0 x8c0Var, x8c0 x8c0Var2) {
        this.a = x8c0Var;
        this.b = x8c0Var2;
        ek2 ek2Var = new ek2(this, (byte) 5);
        this.d = ek2Var;
        x8c0Var.a(ek2Var);
        x8c0Var2.a(ek2Var);
    }

    public final x8c0 getLifecycle() {
        return this.c;
    }
}
