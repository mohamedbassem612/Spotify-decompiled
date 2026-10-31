package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ssn0 {
    public final lik1 a;
    public final iu30 b;
    public final iu30 c;

    public ssn0(lik1 lik1Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = lik1Var;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssn0)) {
            return false;
        }
        ssn0 ssn0Var = (ssn0) obj;
        return u890.j(this.a, ssn0Var.a) && this.b.equals(ssn0Var.b) && u890.j(this.c, ssn0Var.c);
    }

    public final int hashCode() {
        lik1 lik1Var = this.a;
        return this.c.hashCode() + ktd.g(this.b, (lik1Var == null ? 0 : lik1Var.a.hashCode()) * 31, 31);
    }
}
