package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class its {
    public final i8h1 a;
    public final l6h1 b;
    public final gw70 c;

    public its(i8h1 i8h1Var, l6h1 l6h1Var, gw70 gw70Var) {
        this.a = i8h1Var;
        this.b = l6h1Var;
        this.c = gw70Var;
    }

    public final void a(j2i j2iVar, iu30 iu30Var, op80 op80Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1579775718);
        int i2 = i | (x340Var.g(op80Var) ? 256 : 128) | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xfo1.j(j2iVar, iu30Var, this.a, this.b, this.c, op80Var, x340Var, ((i2 << 9) & 458752) | 1572918);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, this, j2iVar, iu30Var, op80Var, (byte) 16);
        }
    }
}
