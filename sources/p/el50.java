package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class el50 {
    public final String a;
    public final yk50 b;

    public el50(String str, yk50 yk50Var) {
        this.a = str;
        this.b = yk50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el50)) {
            return false;
        }
        el50 el50Var = (el50) obj;
        return u890.j(this.a, el50Var.a) && u890.j(this.b, el50Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yk50 yk50Var = this.b;
        return iHashCode + (yk50Var == null ? 0 : yk50Var.hashCode());
    }
}
