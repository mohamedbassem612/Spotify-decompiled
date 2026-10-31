package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y0a1 {
    public final Boolean a;
    public final Boolean b;

    public y0a1(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0a1)) {
            return false;
        }
        y0a1 y0a1Var = (y0a1) obj;
        return u890.j(this.a, y0a1Var.a) && u890.j(this.b, y0a1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
