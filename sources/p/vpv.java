package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vpv {
    public final f1n0 a;
    public final gmt b;
    public final px4 c;
    public final mnk0 d;
    public final zpv e;
    public final r6h1 f;
    public final kcp g;
    public final c9c h;

    public vpv(f1n0 f1n0Var, z6k0 z6k0Var, gmt gmtVar, px4 px4Var, mnk0 mnk0Var, aqv aqvVar, zpv zpvVar, r6h1 r6h1Var, kcp kcpVar, c9c c9cVar) {
        this.a = f1n0Var;
        this.b = gmtVar;
        this.c = px4Var;
        this.d = mnk0Var;
        this.e = zpvVar;
        this.f = r6h1Var;
        this.g = kcpVar;
        this.h = c9cVar;
    }

    public final void a(jwq jwqVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-286218512);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jwqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            irn1.u((qim0) null, wki.a, (vu30) null, cev0.E(x340Var), apo.r(-71262057, new e6j(this, jwqVar, (byte) 25), x340Var), x340Var, 24624, 5);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(this, jwqVar, i, (byte) 22);
        }
    }

    public final void b(jwq jwqVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(545446580);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jwqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfx.b(1, apo.r(-1922874273, new won(this, vzq0Var, jwqVar, (byte) 27), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, jwqVar, vzq0Var, i, (byte) 12);
        }
    }
}
