package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h991 {
    public final ks50 a;
    public final ks50 b;
    public final ua91 c;

    public h991(ks50 ks50Var, ks50 ks50Var2, ua91 ua91Var) {
        this.a = ks50Var;
        this.b = ks50Var2;
        this.c = ua91Var;
    }

    public final void a() {
        if (this.c.D()) {
            ks50 ks50Var = this.a;
            if (ks50Var.d()) {
                ks50Var.b();
                return;
            }
            ks50 ks50Var2 = this.b;
            if (ks50Var2.d()) {
                ks50Var2.b();
            }
        }
    }

    public final boolean b() {
        return this.b.d() || this.a.d();
    }
}
