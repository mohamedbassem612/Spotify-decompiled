package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j2y0 implements r2g {
    public final /* synthetic */ byte a;
    public final String b;
    public final yd91 c;
    public final mr20 d;
    public final o3r e;
    public final jly0 f;
    public final l381 g;

    public j2y0(String str, pux0 pux0Var, uyp uypVar) {
        this.a = (byte) 2;
        this.b = str;
        this.f = uypVar;
        this.c = new yd91(3, new vwz0(this, (byte) 14));
        this.d = rqt0.u(new x010(((roc0) ((koc0) pux0Var.b)).d(), ((ov20) pux0Var.c).a("is-euterpe", false), new h4b(3, null, (byte) 1), (byte) 1));
        this.e = w3p1.n(new l4r(pwc0.b, 1, a411.T0, new j4r(new ak01(this, (byte) 11)), a411.U0), new l4r(hvm.d, 2, a411.R0, new j4r(a411.P0), a411.S0), h211.e);
        this.g = new jsm(this);
    }

    @Override // p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                return (r2n0) this.g;
            case 1:
                return (aa3) this.g;
            case 2:
                return (jsm) this.g;
            default:
                return (b7y0) this.g;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.d;
    }

    public j2y0(String str, uyp uypVar, koc0 koc0Var) {
        this.a = (byte) 0;
        this.b = str;
        this.f = uypVar;
        this.c = new yd91(3, new h2y0(this, (byte) 0));
        this.d = rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 20));
        this.e = w3p1.o(new l4r(pwc0.b, 1, g2y0.d, new j4r(new hox0(this, (byte) 7)), g2y0.e), g2y0.b);
        this.g = new r2n0(this);
    }

    public j2y0(koc0 koc0Var, String str, uyp uypVar, byte b) {
        this.a = (byte) 1;
        this.b = str;
        this.f = uypVar;
        this.c = new yd91(3, new h2y0(this, (byte) 4));
        this.d = rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 21));
        this.e = w3p1.o(new l4r(pwc0.b, 1, g2y0.V0, new j4r(new hox0(this, (byte) 10)), g2y0.W0), g2y0.T0);
        this.g = new aa3(this);
    }

    public j2y0(koc0 koc0Var, String str, bpq bpqVar) {
        this.a = (byte) 3;
        this.b = str;
        this.f = bpqVar;
        this.c = new yd91(3, new l451(this, (byte) 19));
        this.d = rqt0.u(new kr41(((roc0) koc0Var).d(), (byte) 7));
        this.e = w3p1.o(new l4r(pwc0.b, 1, ec61.V0, new j4r(new q961(this, (byte) 7)), ec61.W0), ec61.T0);
        this.g = new b7y0(this);
    }
}
