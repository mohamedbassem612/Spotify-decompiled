package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d2l {
    public final l0l a;
    public final Boolean b;

    public d2l(l0l l0lVar, Boolean bool) {
        this.a = l0lVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2l)) {
            return false;
        }
        d2l d2lVar = (d2l) obj;
        return u890.j(this.a, d2lVar.a) && u890.j(this.b, d2lVar.b);
    }

    public final int hashCode() {
        l0l l0lVar = this.a;
        int iHashCode = (l0lVar == null ? 0 : l0lVar.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
