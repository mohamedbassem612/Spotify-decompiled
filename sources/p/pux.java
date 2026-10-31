package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pux implements qux {
    public final jmr0 a;
    public final jmr0 b;

    public pux(jmr0 jmr0Var, jmr0 jmr0Var2) {
        this.a = jmr0Var;
        this.b = jmr0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pux)) {
            return false;
        }
        pux puxVar = (pux) obj;
        return u890.j(this.a, puxVar.a) && u890.j(this.b, puxVar.b);
    }

    public final int hashCode() {
        jmr0 jmr0Var = this.a;
        int iHashCode = (jmr0Var == null ? 0 : jmr0Var.hashCode()) * 31;
        jmr0 jmr0Var2 = this.b;
        return iHashCode + (jmr0Var2 != null ? jmr0Var2.hashCode() : 0);
    }

    public /* synthetic */ pux(jmr0 jmr0Var) {
        this(jmr0Var, jmr0Var);
    }
}
