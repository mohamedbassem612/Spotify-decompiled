package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hi31 {
    public final String a;
    public final gj31 b;

    public hi31(String str, gj31 gj31Var) {
        this.a = str;
        this.b = gj31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi31)) {
            return false;
        }
        hi31 hi31Var = (hi31) obj;
        return this.a.equals(hi31Var.a) && u890.j(this.b, hi31Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gj31 gj31Var = this.b;
        return iHashCode + (gj31Var == null ? 0 : gj31Var.hashCode());
    }
}
