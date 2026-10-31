package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i08 {
    public final String a;
    public final h08 b;

    public i08(String str, h08 h08Var) {
        this.a = str;
        this.b = h08Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i08)) {
            return false;
        }
        i08 i08Var = (i08) obj;
        return u890.j(this.a, i08Var.a) && u890.j(this.b, i08Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        h08 h08Var = this.b;
        return iHashCode + (h08Var == null ? 0 : h08Var.hashCode());
    }
}
