package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mzl1 implements prj0 {
    public final String a;
    public final sua b;
    public final qpj1 c;
    public final vbe1 d;
    public final mr20 e;
    public final mr20 h;
    public final o3r f = w3p1.o(new l4r(pwc0.b, 1, owl1.O0, new j4r(new tak1(this, 27)), owl1.P0), owl1.Z);
    public final frl1 g = new frl1(this);
    public final yd91 i = new yd91(3, new bkk1(this, 19));

    public mzl1(String str, koc0 koc0Var, sua suaVar, qpj1 qpj1Var, vbe1 vbe1Var) {
        this.a = str;
        this.b = suaVar;
        this.c = qpj1Var;
        this.d = vbe1Var;
        roc0 roc0Var = (roc0) koc0Var;
        this.e = rqt0.u(new kzl1(roc0Var.d(), this, (byte) 0));
        this.h = rqt0.u(new kzl1(roc0Var.c(), this, (byte) 1));
    }

    @Override // p.prj0, p.xe91
    public final l381 c() {
        return this.g;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.i;
    }

    @Override // p.prj0, p.xe91
    public final mr20 getShow() {
        return this.e;
    }

    @Override // p.prj0
    public final mr20 x() {
        return this.h;
    }
}
