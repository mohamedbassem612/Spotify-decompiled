package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mer {
    public final alt0 a;
    public final y3p0 b;

    public mer(alt0 alt0Var, y3p0 y3p0Var) {
        this.a = alt0Var;
        this.b = y3p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mer)) {
            return false;
        }
        mer merVar = (mer) obj;
        return this.a.equals(merVar.a) && u890.j(this.b, merVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        y3p0 y3p0Var = this.b;
        return iHashCode + (y3p0Var == null ? 0 : y3p0Var.hashCode());
    }
}
