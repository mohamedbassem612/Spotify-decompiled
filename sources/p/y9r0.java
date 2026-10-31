package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y9r0 implements car0 {
    public final lik1 a;

    public y9r0(lik1 lik1Var) {
        this.a = lik1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9r0) && u890.j(this.a, ((y9r0) obj).a);
    }

    public final int hashCode() {
        lik1 lik1Var = this.a;
        if (lik1Var == null) {
            return 0;
        }
        return lik1Var.a.hashCode();
    }
}
