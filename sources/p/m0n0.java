package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m0n0 {
    public final e4j0 a;
    public final oyx b;

    public m0n0(e4j0 e4j0Var, oyx oyxVar) {
        this.a = e4j0Var;
        this.b = oyxVar;
    }

    public final void a(oyx[] oyxVarArr, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1420796915);
        x340Var.f0(-413762947, Integer.valueOf(oyxVarArr.length));
        int i2 = (x340Var.e(oyxVarArr.length) ? 4 : 0) | i;
        for (oyx oyxVar : oyxVarArr) {
            i2 |= x340Var.i(oyxVar) ? 4 : 0;
        }
        x340Var.r(false);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(-413759423);
            j2i j2iVarR = j2iVar;
            for (oyx oyxVar2 : oyxVarArr) {
                j2iVarR = apo.r(-2040275505, new loi0(oyxVar2, j2iVarR, (byte) 16), x340Var);
            }
            x340Var.r(false);
            j2iVarR.invoke(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(this, oyxVarArr, j2iVar, i, (byte) 29);
        }
    }

    public final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2029436980);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(sfe0.a.a(this.a), apo.r(-1514375948, new l04(this, j2iVar, (byte) 5), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(this, j2iVar, i, (byte) 17);
        }
    }
}
