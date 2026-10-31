package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g7f0 {
    public final l7f0 a;
    public final boolean b;

    public g7f0(l7f0 l7f0Var, boolean z) {
        this.a = l7f0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7f0)) {
            return false;
        }
        g7f0 g7f0Var = (g7f0) obj;
        return u890.j(this.a, g7f0Var.a) && this.b == g7f0Var.b;
    }

    public final int hashCode() {
        l7f0 l7f0Var = this.a;
        return Boolean.hashCode(this.b) + xcg1.g((l7f0Var == null ? 0 : l7f0Var.hashCode()) * 31, 31, true);
    }
}
