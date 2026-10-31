package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pyo0 implements p2p0 {
    public final dg30 a;
    public final g2z b;

    public pyo0(dg30 dg30Var) {
        this.a = dg30Var;
        pqq0 pqq0Var = dg30Var.getResources().getConfiguration().orientation == 1 ? pqq0.a : pqq0.b;
        g2z g2zVar = new g2z();
        g2zVar.a = dg30Var;
        g2zVar.b = pqq0Var;
        hce1 hce1Var = new hce1(dg30Var.o(), dg30Var.N(), n9p1.s(dg30Var));
        tka0 tka0VarB = rc11.a.b(r4p0.class);
        String strO = tka0VarB.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        g2zVar.c = (r4p0) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        g2zVar.d = new k561(dg30Var.getApplicationContext());
        g2zVar.e = new rku();
        ((f0i) dg30Var).a.a(new e72(g2zVar, (byte) 5));
        this.b = g2zVar;
    }

    @Override // p.p2p0
    public final void a() {
        this.a.finish();
    }

    @Override // p.p2p0
    public final void c(yqq0 yqq0Var, boolean z) {
        this.b.E(yqq0Var, z);
    }

    @Override // p.p2p0
    public final void close() {
        this.a.finish();
    }

    @Override // p.p2p0
    public final void d(t2u t2uVar, String str) {
        th30 th30VarE0 = this.a.e0();
        if (th30VarE0.U()) {
            return;
        }
        t2uVar.g1(th30VarE0, str);
    }

    @Override // p.p2p0
    public final void b(ou80 ou80Var) {
    }
}
