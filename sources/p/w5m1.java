package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w5m1 implements r2g {
    public final String a;
    public final hsq b;
    public final xyl1 c;
    public final mr20 e;
    public final yd91 d = new yd91(3, new bkk1(this, 23));
    public final o3r f = w3p1.o(new l4r(pwc0.b, 1, m5m1.f, new j4r(new c4m1(this, (byte) 5)), m5m1.g), m5m1.d);
    public final zxl1 g = new zxl1(this);

    public w5m1(String str, koc0 koc0Var, hsq hsqVar, xyl1 xyl1Var) {
        this.a = str;
        this.b = hsqVar;
        this.c = xyl1Var;
        this.e = rqt0.u(new vlj1(((roc0) koc0Var).d(), this, (byte) 15));
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
        return 1;
    }
}
