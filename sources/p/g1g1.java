package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g1g1 {
    public final jo70 a;
    public final xkk1 b;

    public g1g1(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1g1)) {
            return false;
        }
        g1g1 g1g1Var = (g1g1) obj;
        return u890.j(this.a, g1g1Var.a) && u890.j(this.b, g1g1Var.b);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
