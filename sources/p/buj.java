package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class buj implements hqg0 {
    public final xzq a;
    public final cjc1 b;
    public final cjc1 c;

    public buj(xzq xzqVar, cjc1 cjc1Var, cjc1 cjc1Var2) {
        this.a = xzqVar;
        this.b = cjc1Var;
        this.c = cjc1Var2;
    }

    public final void a(qm70 qm70Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1022888258);
        int i2 = (x340Var.i(qm70Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String id = qm70Var.getId();
            int i3 = i2 << 6;
            int i4 = i3 & 896;
            xzq xzqVar = this.a;
            boolean zG = x340Var.g(xzqVar) | x340Var.g(id);
            if ((((i3 & 896) ^ 384) <= 256 || !x340Var.g(qm70Var)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z2 = zG | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new fuj(xzqVar, id, qm70Var);
                x340Var.s0(objT);
            }
            fq7.q((fuj) objT, bzn1.v(this.c, qm70Var.getId(), qm70Var, x340Var, i4), bzn1.v(this.b, qm70Var.getId(), qm70Var, x340Var, i4), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(this, qm70Var, i, (byte) 23);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof buj) {
            buj bujVar = (buj) obj;
            if (this.a == bujVar.a && this.b.equals(bujVar.b) && this.c.equals(bujVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return oyl.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
