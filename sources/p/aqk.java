package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqk {
    public final j6k a;
    public final lhe0 b;

    public aqk(j6k j6kVar, lhe0 lhe0Var) {
        this.a = j6kVar;
        this.b = lhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqk)) {
            return false;
        }
        aqk aqkVar = (aqk) obj;
        return u890.j(this.a, aqkVar.a) && u890.j(this.b, aqkVar.b);
    }

    public final int hashCode() {
        j6k j6kVar = this.a;
        int iHashCode = (j6kVar == null ? 0 : j6kVar.hashCode()) * 31;
        lhe0 lhe0Var = this.b;
        return iHashCode + (lhe0Var != null ? lhe0Var.hashCode() : 0);
    }
}
