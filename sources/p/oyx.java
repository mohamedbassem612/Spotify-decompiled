package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oyx implements s4j0 {
    public final xky0 a;
    public final bpb1 b;
    public final bpb1 c;

    public oyx(xky0 xky0Var) {
        this.a = xky0Var;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
    }

    public final void a(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(72371318);
        int i2 = (x340Var.i(j2iVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(this.a.a(this), apo.r(-1238200010, new pu2(j2iVar, (byte) 12), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l04(this, j2iVar, i, (byte) 2);
        }
    }

    public final mr20 c() {
        return this.c;
    }
}
