package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h3d0 implements h0r0 {
    public final zsu0 a;
    public final xrc0 b;
    public final los c;
    public final n3d0 d;
    public final l3d0 e;
    public final kly0 f;
    public final l141 g;
    public final cbr0 h;

    public h3d0(zsu0 zsu0Var, xrc0 xrc0Var, los losVar, p6r0 p6r0Var, String str, n3d0 n3d0Var, l3d0 l3d0Var, yha1 yha1Var, dlp dlpVar) {
        r6h1 r6h1Var = r6h1.c;
        this.a = zsu0Var;
        this.b = xrc0Var;
        this.c = losVar;
        this.d = n3d0Var;
        this.e = l3d0Var;
        this.f = dlpVar;
        this.g = yha1Var.a(str, p6r0Var, r6h1Var);
        this.h = new cbr0(new dbr0[]{new t1r0(true), new bn70(p6r0Var, new lik1("spotify:internal:playlist-sorting"), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b((hvj) this.f.get(), f610.e(new p6e0[0], new fpo(this, (lnm) null)), apo.j(514042803, new k2d0(this, (byte) 1), true));
    }
}
