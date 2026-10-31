package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lat implements h0r0 {
    public final hvj a;
    public final nat b;
    public final dv9 c;
    public final lzn0 d;
    public final cbr0 e;

    public lat(hvj hvjVar, nat natVar, dv9 dv9Var, lzn0 lzn0Var) {
        this.a = hvjVar;
        this.b = natVar;
        this.c = dv9Var;
        this.d = lzn0Var;
        this.e = new cbr0(new dbr0[]{new bn70((n6r0) new awz0("sku_selection"), nik1.X1.b("spotify:account-management:denomination-selection:" + natVar.a() + ":" + natVar.b()), (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new pbg(this, (lnm) null, (byte) 12)), apo.j(-1363761600, new b1s(this, (byte) 29), true));
    }
}
