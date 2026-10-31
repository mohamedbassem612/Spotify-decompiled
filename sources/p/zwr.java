package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zwr implements fv50 {
    public final /* synthetic */ byte a;
    public final String b;
    public final yd91 c;
    public final mr20 d;
    public final o3r e;
    public final Object f;
    public final l381 g;

    public zwr(koc0 koc0Var, String str, bzo bzoVar) {
        this.a = (byte) 0;
        this.b = str;
        this.f = bzoVar;
        this.c = new yd91(3, new dor(this, (byte) 9));
        this.d = rqt0.u(new x72(((roc0) koc0Var).d(), (byte) 14));
        this.e = w3p1.o(new l4r(new xv00(rc11.a.b(f7l1.class)), 2, nvr.N0, new j4r(new m4r(this, (byte) 18)), nvr.O0), nvr.Z);
        this.g = new xwr(this);
    }

    @Override // p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                return (xwr) this.g;
            default:
                return (b82) this.g;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public zwr(koc0 koc0Var, String str, bpq bpqVar) {
        this.a = (byte) 1;
        this.b = str;
        this.f = bpqVar;
        this.c = new yd91(3, new l451(this, (byte) 23));
        this.d = rqt0.u(new kr41(((roc0) koc0Var).d(), (byte) 8));
        this.e = w3p1.o(new l4r(pwc0.b, 1, rq61.b, new j4r(new q961(this, (byte) 9)), rq61.c), ec61.d1);
        this.g = new b82(this);
    }
}
