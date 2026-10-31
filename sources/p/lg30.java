package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lg30 implements o5s {
    public final z11 a;
    public war0 b;
    public final /* synthetic */ j3m c;
    public final /* synthetic */ zf30 d;

    public lg30(j3m j3mVar, zf30 zf30Var) {
        this.c = j3mVar;
        this.d = zf30Var;
        this.a = new z11(j3mVar, (byte) 19);
    }

    public final void onDestroy(iac0 iac0Var) {
        this.c.invoke();
        war0 war0Var = this.b;
        if (war0Var != null) {
            war0Var.c(this.a);
        }
        iac0Var.getLifecycle().d(this);
    }

    public final void onResume(iac0 iac0Var) {
        bbr0 bbr0Var = this.d;
        bbr0 bbr0Var2 = bbr0Var instanceof bbr0 ? bbr0Var : null;
        war0 war0VarB0 = bbr0Var2 != null ? bbr0Var2.b0(q6b.class) : null;
        this.b = war0VarB0;
        if (war0VarB0 != null) {
            war0VarB0.d(this.a);
        }
    }
}
