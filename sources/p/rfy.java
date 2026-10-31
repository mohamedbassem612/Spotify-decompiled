package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rfy implements xfy {
    public final g1d0 a;

    public rfy(g1d0 g1d0Var) {
        this.a = g1d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfy) && u890.j(this.a, ((rfy) obj).a);
    }

    public final int hashCode() {
        g1d0 g1d0Var = this.a;
        if (g1d0Var == null) {
            return 0;
        }
        return g1d0Var.hashCode();
    }
}
