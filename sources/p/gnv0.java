package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gnv0 extends m1q0 {
    public c9n d;
    public vu30 e;
    public l1q0 f;
    public boolean g;

    public final void a() {
        l1q0 l1q0Var = this.f;
        if (l1q0Var != null) {
            l1q0Var.a();
        }
        l1q0 l1q0Var2 = this.f;
        if (l1q0Var2 != null) {
            l1q0Var2.a = false;
        }
        this.g = false;
    }

    public final void b() {
        l1q0 l1q0Var = this.f;
        if (l1q0Var != null && !l1q0Var.a) {
            l1q0Var.a();
            this.f = null;
            l1q0Var = null;
        }
        if (l1q0Var == null) {
            l1q0Var = new l1q0(this.d, false, this.e, this);
            this.f = l1q0Var;
        }
        ((bbc) l1q0Var.b).H((Throwable) null);
        l1q0 l1q0Var2 = this.f;
        if (l1q0Var2 != null) {
            l1q0Var2.a = false;
        }
        this.g = false;
    }

    public final void c(vt9 vt9Var) {
        l1q0 l1q0Var = this.f;
        if (l1q0Var != null) {
            ((bbc) l1q0Var.b).l(vt9Var);
        }
    }

    public final void d(vt9 vt9Var) {
        l1q0 l1q0Var = this.f;
        if (l1q0Var != null) {
            l1q0Var.a();
        }
        if (((m1q0) this).a) {
            this.f = new l1q0(this.d, true, this.e, this);
        }
        this.g = true;
    }
}
