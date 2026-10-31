package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class id1 implements r2g {
    public final String a;
    public final jwo b;
    public final boolean c;
    public final mr20 e;
    public final yd91 d = new yd91(3, new g3(this, (byte) 14));
    public final o3r f = w3p1.o(new l4r(pwc0.b, 1, gx0.V0, new j4r(new j2(this, (byte) 26)), gx0.W0), gx0.T0);
    public final gid g = new gid(this);

    public id1(koc0 koc0Var, String str, jwo jwoVar, bp4 bp4Var) {
        this.a = str;
        this.b = jwoVar;
        this.c = bp4Var.a();
        this.e = rqt0.u(new gk(((roc0) koc0Var).d(), this, (byte) 8));
    }

    @Override // p.xe91
    public final l381 c() {
        return this.g;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.d;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.e;
    }

    @Override // p.r2g
    public final Integer i() {
        return this.c ? 2 : null;
    }
}
