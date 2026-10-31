package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hha1 {
    public final g3d0 a;

    public hha1(g3d0 g3d0Var) {
        this.a = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hha1) && u890.j(this.a, ((hha1) obj).a);
    }

    public final int hashCode() {
        g3d0 g3d0Var = this.a;
        if (g3d0Var == null) {
            return 0;
        }
        return g3d0Var.hashCode();
    }
}
