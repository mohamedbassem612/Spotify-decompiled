package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ly2 {
    public final i8h1 a;
    public final yok0 b;
    public final ycc1 c;

    public ly2(jly0 jly0Var, jly0 jly0Var2, lan1 lan1Var, i8h1 i8h1Var) {
        this.a = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new yok0((byte) 4);
        this.c = new ycc1((d0r) lan1Var.b, (fcq) jly0Var2.get(), (byte) 21);
    }

    public final void a(jy2 jy2Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1468530194);
        b(jy2Var, x340Var, 48);
        x340Var.r(false);
    }

    public final void b(jy2 jy2Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1808227509);
        int i2 = (x340Var.g(jy2Var) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(904227394, new n2(this, jy2Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ky2(this, jy2Var, i);
        }
    }
}
