package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pgx0 {
    public final iix0 a;
    public final hll b;

    public pgx0(iix0 iix0Var, hll hllVar) {
        this.a = iix0Var;
        this.b = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgx0)) {
            return false;
        }
        pgx0 pgx0Var = (pgx0) obj;
        return u890.j(this.a, pgx0Var.a) && u890.j(this.b, pgx0Var.b);
    }

    public final int hashCode() {
        iix0 iix0Var = this.a;
        int iHashCode = (iix0Var == null ? 0 : iix0Var.hashCode()) * 31;
        hll hllVar = this.b;
        return iHashCode + (hllVar != null ? hllVar.hashCode() : 0);
    }
}
