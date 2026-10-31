package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pdn {
    public final tob1 a;
    public final tob1 b;

    public pdn(ven0 ven0Var, ven0 ven0Var2) {
        this.a = ven0Var;
        this.b = ven0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdn)) {
            return false;
        }
        pdn pdnVar = (pdn) obj;
        return this.a.equals(pdnVar.a) && u890.j(this.b, pdnVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tob1 tob1Var = this.b;
        return iHashCode + (tob1Var == null ? 0 : tob1Var.hashCode());
    }
}
