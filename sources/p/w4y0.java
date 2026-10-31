package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w4y0 implements hsw {
    public final /* synthetic */ byte a;
    public final String b;
    public final mr20 c;
    public final o3r d;
    public final Object e;
    public final Object f;
    public final Object g;

    public w4y0(String str, uyp uypVar, koc0 koc0Var) {
        this.a = (byte) 0;
        this.b = str;
        this.e = uypVar;
        this.c = rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 23));
        this.d = w3p1.o(new l4r(pwc0.b, 1, g2y0.b1, new j4r(new hox0(this, (byte) 11)), g2y0.c1), g2y0.Z0);
        this.f = new xwr(this);
        this.g = new yd91(3, new h2y0(this, (byte) 6));
    }

    @Override // p.hsw, p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                return (xwr) this.f;
            default:
                return (nt21) this.g;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                return (yd91) this.g;
            default:
                return new yd91(3, new l451(this, (byte) 17));
        }
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public w4y0(dc61 dc61Var, m021 m021Var, koc0 koc0Var, String str) {
        this.a = (byte) 1;
        this.e = dc61Var;
        this.f = m021Var;
        this.b = str;
        this.c = rqt0.u(new zo51(((roc0) koc0Var).d(), this, (byte) 5));
        this.d = w3p1.o(new l4r(pwc0.b, 1, ec61.d, new j4r(new q961(this, (byte) 1)), ec61.e), ec61.b);
        this.g = new nt21(this);
    }
}
