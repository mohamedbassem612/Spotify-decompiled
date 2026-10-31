package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qyb implements o5s {
    public final mwn0 a;
    public final vkg b;
    public final lik1 c;
    public final p6r0 d;
    public final ou80 e;

    public qyb(mwn0 mwn0Var, vkg vkgVar, lik1 lik1Var, p6r0 p6r0Var, ou80 ou80Var) {
        this.a = mwn0Var;
        this.b = vkgVar;
        this.c = lik1Var;
        this.d = p6r0Var;
        this.e = ou80Var;
    }

    public final void onCreate(iac0 iac0Var) {
        lik1 lik1Var = this.c;
        lsn0 lsn0Var = new lsn0(lik1Var.a, this.e);
        mwn0 mwn0Var = this.a;
        mwn0Var.e(lsn0Var);
        mwn0Var.f(lsn0Var);
        this.b.U(this.d, lik1Var.a());
    }

    public final void onDestroy(iac0 iac0Var) {
        yrn0 yrn0Var = new yrn0((ou80) null);
        mwn0 mwn0Var = this.a;
        mwn0Var.e(yrn0Var);
        mwn0Var.f(yrn0Var);
        this.b.h(this.d, this.c.a());
    }
}
