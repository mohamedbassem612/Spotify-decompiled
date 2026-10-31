package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mp91 {
    public final Boolean a;
    public final Boolean b;

    public mp91(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp91)) {
            return false;
        }
        mp91 mp91Var = (mp91) obj;
        return u890.j(this.a, mp91Var.a) && u890.j(this.b, mp91Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
