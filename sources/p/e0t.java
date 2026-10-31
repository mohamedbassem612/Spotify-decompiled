package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e0t implements p260 {
    public static final y6l1 g = new y6l1(new e7l1("", 1), new x6l1("", ""));
    public final /* synthetic */ byte a;
    public final String b;
    public final yd91 c;
    public final o3r d;
    public final Object e;
    public final l381 f;

    public e0t(String str, bzo bzoVar) {
        this.a = (byte) 0;
        this.b = str;
        this.e = bzoVar;
        this.c = new yd91(3, new ots(this, (byte) 11));
        jd11 jd11Var = rc11.a;
        this.d = w3p1.n(new l4r(new xv00(jd11Var.b(f7l1.class)), 2, mls.e1, new j4r(new c0t(this, (byte) 0)), d0t.b), new l4r(new xv00(jd11Var.b(bbl1.class)), 2, d0t.c, new j4r(new c0t(this, (byte) 1)), d0t.d), szr.V0);
        this.f = new jsm(this);
    }

    public final l381 c() {
        switch (this.a) {
            case 0:
                return (jsm) this.f;
            case 1:
                return (t0b) this.f;
            default:
                return this.f;
        }
    }

    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public e0t(String str, u2p u2pVar, lfb lfbVar) {
        this.a = (byte) 1;
        this.b = str;
        this.e = u2pVar;
        this.c = new yd91(3, new vv8(this, (byte) 14));
        this.d = w3p1.o(new l4r(pwc0.b, 1, rza.S0, new j4r(new tla(this, (byte) 9)), rza.T0), rza.R0);
        this.f = new t0b(this);
    }

    public e0t(String str, xyl1 xyl1Var) {
        this.a = (byte) 2;
        this.b = str;
        this.e = xyl1Var;
        this.c = new yd91(3, w3l1.Y0);
        this.d = w3p1.n(new l4r(pwc0.b, 1, owl1.i, new j4r(new qyl1(this, (byte) 0)), owl1.t), new l4r(v061.f, 1, owl1.X, new j4r(new qyl1(this, (byte) 1)), owl1.Y), u5l1.W0);
        this.f = new qpj1(this);
    }
}
