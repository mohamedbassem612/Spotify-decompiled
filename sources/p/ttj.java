package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ttj {
    public final bpb1 a;
    public int b;
    public final bpb1 c;

    public ttj() {
        bpb1 bpb1VarB = gio1.b(null);
        this.a = bpb1VarB;
        this.c = bpb1VarB;
    }

    public final void a(qxl qxlVar, dp5 dp5Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-375784561);
        int i2 = (x340Var.g(qxlVar) ? 4 : 2) | i | 16 | (x340Var.g((Object) null) ? 256 : 128) | 3072 | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                dp5Var = new dp5((byte) 15);
            } else {
                x340Var.b0();
            }
            x340Var.s();
            mod.b(bsl.a.a(false), apo.r(-26890161, new swc(rwq.h(this.c, x340Var, 0), qxlVar, dp5Var, (byte) 24), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        dp5 dp5Var2 = dp5Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(this, qxlVar, dp5Var2, i, (byte) 25);
        }
    }
}
