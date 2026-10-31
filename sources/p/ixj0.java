package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ixj0 implements r2g {
    public final String a;
    public final rxj0 b;
    public final jbk0 c;
    public final xrp d;
    public final me30 e;
    public final yd91 f = new yd91(3, new z8i0(this, (byte) 23));
    public final mr20 g;
    public final o3r h;
    public final yge0 i;

    public ixj0(String str, z6k0 z6k0Var, kqi0 kqi0Var, rxj0 rxj0Var, jbk0 jbk0Var, xrp xrpVar, me30 me30Var) {
        this.a = str;
        this.b = rxj0Var;
        this.c = jbk0Var;
        this.d = xrpVar;
        this.e = me30Var;
        this.g = rqt0.u(new x010(((roc0) ((koc0) kqi0Var.b)).d(), ((mnk0) kqi0Var.c).a, new dwf0(kqi0Var, null, (byte) 4), (byte) 1));
        l4r l4rVar = new l4r(pwc0.b, 1, hxj0.c, new j4r(new gxj0(this, (byte) 0)), hxj0.d);
        hvm hvmVar = hvm.d;
        this.h = w3p1.m(l4rVar, new l4r(hvmVar, 2, ktj0.c1, new j4r(ktj0.a1), ktj0.d1), new l4r(hvmVar, 2, ktj0.e1, new j4r(ktj0.b1), hxj0.b), gce0.Q0);
        this.i = new yge0(this);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.i;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.f;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.g;
    }
}
