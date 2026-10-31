package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2y0 implements rv50 {
    public final /* synthetic */ byte a;
    public final String b;
    public final qpj1 c;
    public final o3r d;
    public final yd91 e;
    public final Object f;
    public final l381 g;

    public z2y0(String str, qpj1 qpj1Var, evq evqVar) {
        this.a = (byte) 1;
        this.b = str;
        this.c = qpj1Var;
        this.f = evqVar;
        this.d = w3p1.o(new l4r(pwc0.b, 1, owl1.g, new j4r(new tak1(this, (byte) 25)), owl1.h), owl1.e);
        this.g = new zxl1(this);
        this.e = new yd91(3, new bkk1(this, (byte) 17));
    }

    public final l381 c() {
        switch (this.a) {
            case 0:
                return (yqu0) this.g;
            default:
                return this.g;
        }
    }

    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public z2y0(String str, qpj1 qpj1Var, zkq zkqVar) {
        this.a = (byte) 0;
        this.b = str;
        this.c = qpj1Var;
        this.f = zkqVar;
        this.d = w3p1.o(new l4r(pwc0.b, 1, g2y0.Z, new j4r(new hox0(this, (byte) 8)), g2y0.N0), g2y0.X);
        this.g = new yqu0(this);
        this.e = new yd91(3, new h2y0(this, (byte) 2));
    }
}
