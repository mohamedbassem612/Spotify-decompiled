package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mpa implements ppa {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ l811 b;

    public mpa(ssw0 ssw0Var, l811 l811Var) {
        this.a = ssw0Var;
        this.b = l811Var;
    }

    @Override // p.ppa
    public final void c(long j, int i, String str) {
        ssw0 ssw0Var = this.a;
        if (i == 3) {
            ssw0Var.l(new eha(j));
        }
        if (i == 4) {
            if (!this.b.a) {
                ssw0Var.l(new aha(new hha(j)));
            }
            ssw0Var.H((Throwable) null);
        }
    }

    @Override // p.ppa
    public final void d(hha hhaVar) {
        this.b.a = true;
        this.a.l(new aha(hhaVar));
    }

    @Override // p.ppa
    public final void e(int i, int i2) {
        this.a.l(new dha(i, i2));
    }

    @Override // p.ppa
    public final void h(int i, w7g1 w7g1Var) {
        this.a.l(new cha(i, w7g1Var));
    }

    @Override // p.ppa
    public final void i(cga cgaVar) {
        this.a.l(new bha(cgaVar));
    }
}
