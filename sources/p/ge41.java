package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ge41 implements aac0, AutoCloseable {
    public final String a;
    public final fe41 b;
    public boolean c;

    public ge41(String str, fe41 fe41Var) {
        this.a = str;
        this.b = fe41Var;
    }

    public final void a(x8c0 x8c0Var, oe41 oe41Var) {
        if (this.c) {
            eg.m("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        x8c0Var.a(this);
        oe41Var.c(this.a, (tku) this.b.b.f);
    }

    public final fe41 c() {
        return this.b;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        if (k8c0Var == k8c0.ON_DESTROY) {
            this.c = false;
            iac0Var.getLifecycle().d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
