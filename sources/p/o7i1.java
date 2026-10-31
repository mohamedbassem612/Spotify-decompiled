package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o7i1 {
    public final voo1 a;
    public final too1 b;

    public o7i1(voo1 voo1Var, too1 too1Var) {
        this.a = voo1Var;
        this.b = too1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7i1)) {
            return false;
        }
        o7i1 o7i1Var = (o7i1) obj;
        return u890.j(this.a, o7i1Var.a) && u890.j(this.b, o7i1Var.b);
    }

    public final int hashCode() {
        voo1 voo1Var = this.a;
        int iHashCode = (voo1Var == null ? 0 : voo1Var.hashCode()) * 31;
        too1 too1Var = this.b;
        return iHashCode + (too1Var != null ? too1Var.hashCode() : 0);
    }
}
