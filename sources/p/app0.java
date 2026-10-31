package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class app0 implements r2g {
    public final String a;
    public final dlp b;
    public final lt20 d;
    public final yd91 c = new yd91(3, new pdp0(this, (byte) 9));
    public final avm e = new avm(this);

    public app0(koc0 koc0Var, String str, dlp dlpVar) {
        this.a = str;
        this.b = dlpVar;
        this.d = new lt20(rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 9)), new i440(3, (lnm) null, (byte) 22), (byte) 0);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.e;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.d;
    }

    @Override // p.r2g
    public final Integer i() {
        return 1;
    }
}
