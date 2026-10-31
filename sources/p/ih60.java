package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ih60 implements r2g {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final mr20 c;
    public final o3r d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final l381 h;

    public ih60(String str, zb91 zb91Var, jly0 jly0Var, koc0 koc0Var, dlg1 dlg1Var, xvo xvoVar, iu30 iu30Var) {
        this.a = (byte) 1;
        this.e = zb91Var;
        this.f = dlg1Var;
        this.g = iu30Var;
        this.b = new yd91(3, new g1x0(jly0Var, this, (byte) 16));
        this.c = rqt0.u(new x010(((roc0) koc0Var).d(), yoi1.g(xvoVar.a(true)), new dwf0(this, null, (byte) 15), (byte) 1));
        this.d = w3p1.n(new l4r(pwc0.b, 1, xox0.d1, new j4r(new zqu0(str, (byte) 23)), xox0.e1), new l4r(hvm.d, 2, xox0.b1, new j4r(xox0.a1), xox0.c1), gbw0.Z0);
        this.h = new pux0(this);
    }

    @Override // p.xe91
    public final l381 c() {
        switch (this.a) {
            case 0:
                return (dh30) this.h;
            default:
                return this.h;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public ih60(koc0 koc0Var, String str, wmu0 wmu0Var, xep xepVar) {
        this.a = (byte) 0;
        this.e = str;
        this.f = wmu0Var;
        this.g = xepVar;
        this.b = new yd91(3, new g050(this, (byte) 17));
        this.c = rqt0.u(new evz(((roc0) koc0Var).d(), this, (byte) 26));
        this.d = w3p1.o(new l4r(pwc0.b, 1, hh60.b, new j4r(new zi50(this, (byte) 15)), hh60.c), z860.d1);
        this.h = new dh30(this);
    }
}
