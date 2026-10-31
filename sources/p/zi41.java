package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zi41 implements aj41 {
    public final qdg1 a;
    public final lae1 b;

    public zi41(qdg1 qdg1Var, lae1 lae1Var) {
        this.a = qdg1Var;
        this.b = lae1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi41)) {
            return false;
        }
        zi41 zi41Var = (zi41) obj;
        return this.a.equals(zi41Var.a) && u890.j(this.b, zi41Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lae1 lae1Var = this.b;
        return iHashCode + (lae1Var == null ? 0 : lae1Var.hashCode());
    }
}
