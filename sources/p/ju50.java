package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ju50 {
    public final hux a;
    public final iu50 b;

    public ju50(hux huxVar, iu50 iu50Var) {
        this.a = huxVar;
        this.b = iu50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju50)) {
            return false;
        }
        ju50 ju50Var = (ju50) obj;
        return u890.j(this.a, ju50Var.a) && u890.j(this.b, ju50Var.b);
    }

    public final int hashCode() {
        hux huxVar = this.a;
        int iHashCode = (huxVar == null ? 0 : huxVar.hashCode()) * 31;
        iu50 iu50Var = this.b;
        return iHashCode + (iu50Var != null ? iu50Var.hashCode() : 0);
    }
}
