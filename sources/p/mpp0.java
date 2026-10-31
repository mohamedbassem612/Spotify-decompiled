package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mpp0 implements hsw {
    public final umf0 a;
    public final lt20 b;
    public final yd91 c = new yd91(3, new pdp0(this, (byte) 10));

    public mpp0(koc0 koc0Var, umf0 umf0Var) {
        this.a = umf0Var;
        this.b = new lt20(new j5b0(((roc0) koc0Var).d(), (byte) 11), new i440(3, (lnm) null, (byte) 24), (byte) 0);
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.b;
    }

    @Override // p.anc0
    public final void b() {
    }
}
