package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class clm0 implements hsw {
    public final x010 a;
    public final dt71 b = mgo1.e(0, 1, 0, 5);
    public final yd91 c;

    public clm0(d0r d0rVar, String str, koc0 koc0Var, atp atpVar) {
        this.a = new x010(((roc0) koc0Var).d(), new p1e0(vxo1.l(d0rVar, str), (byte) 23), new npg(3, null, (byte) 4), (byte) 1);
        this.c = new yd91(3, new dt90((Object) atpVar, (Object) str, (Object) this, (byte) 24));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.a;
    }

    @Override // p.hsw
    public final sen0 j() {
        return this.b;
    }
}
