package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ca3 implements lz50 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final yd91 c;
    public final Object d;
    public final l381 e;

    public ca3(String str, hyo hyoVar) {
        this.a = (byte) 0;
        this.b = str;
        ppa0 ppa0Var = fxc0.a;
        this.d = w3p1.n(new l4r(pwc0.b, 1, q83.V0, new j4r(new ba3(this, (byte) 0)), q83.W0), new l4r(new wlu(rc11.a.b(jo70.class)), 2, q83.T0, new k4r(new ba3(this, (byte) 1), ppa0Var), q83.U0), p83.R0);
        this.e = new aa3(this);
        this.c = new yd91(3, new g82(hyoVar, (byte) 8));
    }

    public final l381 c() {
        switch (this.a) {
            case 0:
                return (aa3) this.e;
            case 1:
                return (u7r) this.e;
            case 2:
                return this.e;
            default:
                return this.e;
        }
    }

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

    public ca3(qlb qlbVar, ags0 ags0Var) {
        this.a = (byte) 2;
        this.b = qlbVar;
        this.d = ags0Var;
        this.e = o381.a;
        this.c = new yd91(3, new h2y0(this, (byte) 8));
    }

    public ca3(String str, j7p j7pVar) {
        this.a = (byte) 1;
        this.b = str;
        this.d = j7pVar;
        this.e = new u7r(this);
        this.c = new yd91(3, new v7v(this, (byte) 10));
    }

    public ca3(z6k0 z6k0Var, n0o n0oVar, me30 me30Var) {
        this.a = (byte) 3;
        this.b = n0oVar;
        this.d = me30Var;
        this.e = o381.a;
        this.c = new yd91(3, new gga1(this, (byte) 12));
    }
}
