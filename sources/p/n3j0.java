package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n3j0 {
    public final q4j0 a;
    public final d3j0 b;

    public n3j0(q4j0 q4j0Var, d3j0 d3j0Var) {
        this.a = q4j0Var;
        this.b = d3j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3j0)) {
            return false;
        }
        n3j0 n3j0Var = (n3j0) obj;
        return u890.j(this.a, n3j0Var.a) && u890.j(this.b, n3j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
