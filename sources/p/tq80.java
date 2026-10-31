package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tq80 {
    public final Object a;
    public final tqw b;

    public tq80(Object obj, tqw tqwVar) {
        this.a = obj;
        this.b = tqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq80)) {
            return false;
        }
        tq80 tq80Var = (tq80) obj;
        return u890.j(this.a, tq80Var.a) && u890.j(this.b, tq80Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        tqw tqwVar = this.b;
        return iHashCode + (tqwVar != null ? tqwVar.hashCode() : 0);
    }
}
