package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m2i implements hqg0 {
    public final void a(qm70 qm70Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2097333809);
        int i2 = (x340Var.i(qm70Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ebp1.b(qm70Var.getId(), oyl.a, apo.r(825723742, new qff(this, qm70Var), x340Var), x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(this, qm70Var, i, (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2i)) {
            return false;
        }
        j2i j2iVar = api.a;
        return true;
    }

    public final int hashCode() {
        return oyl.a.hashCode() + (api.e.hashCode() * 31);
    }
}
