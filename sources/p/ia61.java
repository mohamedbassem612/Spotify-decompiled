package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ia61 implements iac0 {
    public final tac0 a;
    public final tac0 b;
    public final androidx.car.app.k c;

    public ia61() {
        aa61 aa61Var = new aa61(this);
        tac0 tac0Var = new tac0(this, true);
        this.a = tac0Var;
        this.b = new tac0(this, true);
        tac0Var.a(aa61Var);
        this.c = new androidx.car.app.k(tac0Var, new androidx.car.app.l());
    }

    public final void a(k8c0 k8c0Var) {
        this.a.g(k8c0Var);
    }

    public final x8c0 getLifecycle() {
        return this.b;
    }
}
