package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u9c0 implements aac0, c9n {
    public final x8c0 a;
    public final o8n b;

    public u9c0(x8c0 x8c0Var, o8n o8nVar) {
        this.a = x8c0Var;
        this.b = o8nVar;
        if (x8c0Var.b() == w8c0.a) {
            op71.n(o8nVar);
        }
    }

    public final o8n J() {
        return this.b;
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        x8c0 x8c0Var = this.a;
        if (x8c0Var.b().compareTo(w8c0.a) <= 0) {
            x8c0Var.d(this);
            op71.n(this.b);
        }
    }
}
