package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rsl implements hsw {
    public final boolean a;
    public final mr20 b;
    public final yd91 c;

    public rsl(koc0 koc0Var, j8p j8pVar, bp4 bp4Var) {
        this.a = bp4Var.a();
        this.b = rqt0.u(new qbk(((roc0) koc0Var).d(), this, (byte) 12));
        this.c = new yd91(3, new vjh(j8pVar, (byte) 26));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.b;
    }
}
