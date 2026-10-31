package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n0c1 {
    public final uqo a;
    public final o0c1 b;

    public n0c1(uqo uqoVar, o0c1 o0c1Var) {
        this.a = uqoVar;
        this.b = o0c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0c1)) {
            return false;
        }
        n0c1 n0c1Var = (n0c1) obj;
        return this.a.equals(n0c1Var.a) && u890.j(this.b, n0c1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o0c1 o0c1Var = this.b;
        return iHashCode + (o0c1Var == null ? 0 : o0c1Var.hashCode());
    }
}
