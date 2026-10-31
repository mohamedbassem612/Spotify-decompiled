package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qzr {
    public final yqg a;
    public final gw70 b;
    public final tvb0 c;
    public final p40 d;
    public final ejs e;
    public final k9r f;

    public qzr(yqg yqgVar, gw70 gw70Var, tvb0 tvb0Var, p40 p40Var, ejs ejsVar, k9r k9rVar) {
        this.a = yqgVar;
        this.b = gw70Var;
        this.c = tvb0Var;
        this.d = p40Var;
        this.e = ejsVar;
        this.f = k9rVar;
    }

    public final void a(h230 h230Var, upb0 upb0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2070931958);
        int i2 = (x340Var.i(h230Var) ? 4 : 2) | i | (x340Var.g(upb0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mod.b(oi7.a.a(this.b), apo.r(700455242, new pzr(h230Var, this, iu30Var, qim0Var, upb0Var, (byte) 2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pzr(this, h230Var, upb0Var, iu30Var, qim0Var, i);
        }
    }
}
