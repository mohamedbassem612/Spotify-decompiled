package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pqg1 {
    public final pux0 a;
    public final acz0 b;

    public pqg1(pux0 pux0Var, acz0 acz0Var) {
        this.a = pux0Var;
        this.b = acz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqg1)) {
            return false;
        }
        pqg1 pqg1Var = (pqg1) obj;
        return this.a == pqg1Var.a && this.b == pqg1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
