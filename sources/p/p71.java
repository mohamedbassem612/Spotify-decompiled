package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p71 {
    public final h9t0 a;
    public final String b;

    public p71(h9t0 h9t0Var, String str) {
        this.a = h9t0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p71)) {
            return false;
        }
        p71 p71Var = (p71) obj;
        return u890.j(this.a, p71Var.a) && u890.j(this.b, p71Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
