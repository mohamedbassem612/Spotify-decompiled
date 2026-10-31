package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q3b1 {
    public final gw70 a;
    public final pe b;

    public q3b1(gw70 gw70Var, pe peVar) {
        this.a = gw70Var;
        this.b = peVar;
    }

    public final void a(int i, j2i j2iVar, b0k b0kVar) {
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1640366394);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            j2iVar2 = j2iVar;
            nyx.a(2, (wux) null, j2iVar2, x340Var, 3078, 6);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p3b1(this, j2iVar2, i, (byte) 0);
        }
    }

    public final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-76609794);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            a((i2 & 112) | 6, apo.r(678088098, new q081(this, j2iVar, (byte) 29), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p3b1(this, j2iVar, i, (byte) 1);
        }
    }
}
