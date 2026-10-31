package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k7p0 {
    public final l7p0 a;
    public final j7p0 b;

    public k7p0(l7p0 l7p0Var, j7p0 j7p0Var) {
        this.a = l7p0Var;
        this.b = j7p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7p0)) {
            return false;
        }
        k7p0 k7p0Var = (k7p0) obj;
        return u890.j(this.a, k7p0Var.a) && this.b.equals(k7p0Var.b);
    }

    public final int hashCode() {
        l7p0 l7p0Var = this.a;
        return this.b.hashCode() + ((l7p0Var == null ? 0 : l7p0Var.hashCode()) * 31);
    }
}
