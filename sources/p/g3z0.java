package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g3z0 implements o3z0 {
    public final x1z0 a;

    public g3z0(x1z0 x1z0Var) {
        this.a = x1z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3z0) && u890.j(this.a, ((g3z0) obj).a);
    }

    public final int hashCode() {
        x1z0 x1z0Var = this.a;
        if (x1z0Var == null) {
            return 0;
        }
        return x1z0Var.hashCode();
    }
}
