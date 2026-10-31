package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ii41 extends ji41 {
    public final qdg1 b;
    public final lae1 c;

    public ii41(qdg1 qdg1Var, lae1 lae1Var) {
        super(4);
        this.b = qdg1Var;
        this.c = lae1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii41)) {
            return false;
        }
        ii41 ii41Var = (ii41) obj;
        return this.b.equals(ii41Var.b) && u890.j(this.c, ii41Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        lae1 lae1Var = this.c;
        return iHashCode + (lae1Var == null ? 0 : lae1Var.hashCode());
    }
}
