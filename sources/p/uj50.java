package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uj50 {
    public final vj50 a;
    public final tqw b;

    public uj50(vj50 vj50Var, tqw tqwVar) {
        this.a = vj50Var;
        this.b = tqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj50)) {
            return false;
        }
        uj50 uj50Var = (uj50) obj;
        return this.a.equals(uj50Var.a) && u890.j(this.b, uj50Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tqw tqwVar = this.b;
        return iHashCode + (tqwVar == null ? 0 : tqwVar.hashCode());
    }
}
