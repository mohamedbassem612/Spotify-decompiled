package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qpg implements hsw {
    public final /* synthetic */ byte a = 0;
    public final yd91 b;
    public final mr20 c;

    public qpg(koc0 koc0Var, bct bctVar, xwo xwoVar) {
        this.c = new lt20(new ve1(new x010(((roc0) koc0Var).d(), new te1(d3p1.F(bctVar.b, lvx.m(), rih1.a), (byte) 0), qe1.h, (byte) 1), (byte) 0), new re1(3, (lnm) null, (byte) 0), (byte) 0);
        this.b = new yd91(3, new g3(xwoVar, (byte) 15));
    }

    @Override // p.xe91
    public final yd91 d() {
        byte b = this.a;
        return this.b;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        byte b = this.a;
        lt20 lt20Var = this.c;
        switch (b) {
            case 0:
                return (x010) lt20Var;
            case 1:
                return (x010) lt20Var;
            default:
                return lt20Var;
        }
    }

    public qpg(d0r d0rVar, koc0 koc0Var, String str, fyo fyoVar) {
        te1 te1Var = new te1(vxo1.l(d0rVar, str), (byte) 17);
        this.b = new yd91(3, new opg(this, (byte) 0));
        this.c = new x010(((roc0) koc0Var).d(), te1Var, new npg(3, null, (byte) 0), (byte) 1);
    }

    public qpg(d0r d0rVar, koc0 koc0Var, String str, lop lopVar) {
        vvu vvuVar = new vvu(vxo1.l(d0rVar, str), (byte) 22);
        this.b = new yd91(3, new nzb0(lopVar, (byte) 8));
        this.c = new x010(((roc0) koc0Var).d(), vvuVar, new npg(3, null, (byte) 1), (byte) 1);
    }
}
