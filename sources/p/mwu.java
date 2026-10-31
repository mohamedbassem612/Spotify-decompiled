package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mwu implements fv50 {
    public final String a;
    public final pbp b;
    public final h9n0 c;
    public final uw0 d;
    public final yd91 e = new yd91(3, new ots(this, (byte) 28));
    public final boolean f;
    public final x010 g;
    public final o3r h;
    public final jut i;

    public mwu(String str, lik1 lik1Var, n6r0 n6r0Var, koc0 koc0Var, q5q q5qVar, c8c0 c8c0Var, ov20 ov20Var, pbp pbpVar, h9n0 h9n0Var) {
        this.a = str;
        this.b = pbpVar;
        this.c = h9n0Var;
        this.d = q5qVar.a(n6r0Var, lik1Var);
        this.f = c8c0Var == c8c0.c;
        this.g = new x010(((roc0) koc0Var).d(), ((bw20) ov20Var).a("offline", false), new ew0(this, (lnm) null, (byte) 20), (byte) 1);
        this.h = w3p1.n(new l4r(pwc0.b, 1, wvu.h, new j4r(new nit(this, (byte) 14)), wvu.i), new l4r(hvm.d, 2, wvu.f, new j4r(wvu.d), wvu.g), qlt.Z0);
        this.i = new jut(this);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.i;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.e;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.g;
    }
}
