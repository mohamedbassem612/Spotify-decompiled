package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dfv implements r2g {
    public final /* synthetic */ byte a;
    public final String b;
    public final d2f1 c;
    public final me30 d;
    public final yd91 e;
    public final mr20 f;
    public final o3r g;
    public final jly0 h;
    public final l381 i;

    public dfv(z6k0 z6k0Var, String str, d2f1 d2f1Var, r4h1 r4h1Var, hsq hsqVar, me30 me30Var) {
        this.a = (byte) 1;
        this.b = str;
        this.c = d2f1Var;
        this.h = hsqVar;
        this.d = me30Var;
        this.e = new yd91(3, new mah1(this, z6k0Var, (byte) 22));
        this.f = rqt0.u(hu20.e(new x010(rqt0.u(new a1b1(((ov20) r4h1Var.c).a, r4h1Var, (byte) 28)), rqt0.u(new a1b1(((koc0) r4h1Var.b).d(), r4h1Var, (byte) 29)), new irp0(3, (lnm) null, (byte) 25), (byte) 1), new afb1((lnm) null, r4h1Var, (byte) 12)));
        this.g = w3p1.o(new l4r(pwc0.b, 1, egj1.Q0, new j4r(new xaj1(this, (byte) 10)), egj1.R0), egj1.P0);
        this.i = new ptf1(this);
    }

    public final l381 c() {
        switch (this.a) {
            case 0:
                return (otu) this.i;
            default:
                return this.i;
        }
    }

    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public dfv(koc0 koc0Var, String str, d2f1 d2f1Var, j7p j7pVar, me30 me30Var) {
        this.a = (byte) 0;
        this.b = str;
        this.c = d2f1Var;
        this.h = j7pVar;
        this.d = me30Var;
        this.e = new yd91(3, new v7v(this, (byte) 2));
        this.f = rqt0.u(new pzs(((roc0) koc0Var).d(), this, (byte) 13));
        this.g = w3p1.o(new l4r(pwc0.b, 1, o6v.N0, new j4r(new nit(this, (byte) 20)), o6v.O0), o6v.Y);
        this.i = new otu(this);
    }
}
