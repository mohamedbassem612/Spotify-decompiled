package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y5h1 {
    public final acn1 a;
    public final hn5 b;

    public y5h1(acn1 acn1Var, hn5 hn5Var) {
        this.a = acn1Var;
        this.b = hn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5h1)) {
            return false;
        }
        y5h1 y5h1Var = (y5h1) obj;
        return u890.j(this.a, y5h1Var.a) && u890.j(this.b, y5h1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hn5 hn5Var = this.b;
        return iHashCode + (hn5Var == null ? 0 : hn5Var.hashCode());
    }
}
