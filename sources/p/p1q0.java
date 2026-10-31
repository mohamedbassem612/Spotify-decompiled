package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p1q0 implements aac0, hhd {
    public final x8c0 a;
    public final m1q0 b;
    public q1q0 c;
    public final /* synthetic */ r1q0 d;

    public p1q0(r1q0 r1q0Var, x8c0 x8c0Var, m1q0 m1q0Var) {
        this.d = r1q0Var;
        this.a = x8c0Var;
        this.b = m1q0Var;
        x8c0Var.a(this);
    }

    @Override // p.hhd
    public final void cancel() {
        this.a.d(this);
        this.b.b.remove(this);
        q1q0 q1q0Var = this.c;
        if (q1q0Var != null) {
            q1q0Var.cancel();
        }
        this.c = null;
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        if (k8c0Var == k8c0.ON_START) {
            this.c = this.d.b(this.b);
            return;
        }
        if (k8c0Var != k8c0.ON_STOP) {
            if (k8c0Var == k8c0.ON_DESTROY) {
                cancel();
            }
        } else {
            q1q0 q1q0Var = this.c;
            if (q1q0Var != null) {
                q1q0Var.cancel();
            }
        }
    }
}
