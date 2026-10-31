package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class se50 {
    public final ub10 a;
    public final int b;

    public se50(ub10 ub10Var, int i) {
        this.a = ub10Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se50)) {
            return false;
        }
        se50 se50Var = (se50) obj;
        return this.a.equals(se50Var.a) && this.b == se50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
