package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u3u0 {
    public final Boolean a;
    public final Boolean b;

    public u3u0(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3u0)) {
            return false;
        }
        u3u0 u3u0Var = (u3u0) obj;
        return u890.j(this.a, u3u0Var.a) && u890.j(this.b, u3u0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
