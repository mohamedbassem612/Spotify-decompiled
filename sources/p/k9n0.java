package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k9n0 {
    public final qxc0 a;
    public final boolean b;

    public k9n0(qxc0 qxc0Var, boolean z) {
        this.a = qxc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9n0)) {
            return false;
        }
        k9n0 k9n0Var = (k9n0) obj;
        return this.a.equals(k9n0Var.a) && this.b == k9n0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
