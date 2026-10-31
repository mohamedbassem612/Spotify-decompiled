package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wmd0 extends xmd0 implements aac0 {
    public final iac0 e;
    public final /* synthetic */ ymd0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmd0(ymd0 ymd0Var, iac0 iac0Var, rjp0 rjp0Var) {
        super(ymd0Var, rjp0Var);
        this.f = ymd0Var;
        this.e = iac0Var;
    }

    @Override // p.xmd0
    public final void b() {
        this.e.getLifecycle().d(this);
    }

    @Override // p.xmd0
    public final boolean c(iac0 iac0Var) {
        return this.e == iac0Var;
    }

    @Override // p.xmd0
    public final boolean d() {
        return this.e.getLifecycle().b().a(w8c0.d);
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        iac0 iac0Var2 = this.e;
        w8c0 w8c0VarB = iac0Var2.getLifecycle().b();
        if (w8c0VarB == w8c0.a) {
            this.f.k(this.a);
            return;
        }
        w8c0 w8c0Var = null;
        while (w8c0Var != w8c0VarB) {
            a(d());
            w8c0Var = w8c0VarB;
            w8c0VarB = iac0Var2.getLifecycle().b();
        }
    }
}
