package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vw9 {
    public final ub10 a;
    public final int b;

    public vw9(ub10 ub10Var, int i) {
        this.a = ub10Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw9)) {
            return false;
        }
        vw9 vw9Var = (vw9) obj;
        return this.a.equals(vw9Var.a) && this.b == vw9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
