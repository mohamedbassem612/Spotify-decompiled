package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class chw implements diw {
    public final h3b1 a;

    public chw(h3b1 h3b1Var) {
        this.a = h3b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chw) && this.a == ((chw) obj).a;
    }

    public final int hashCode() {
        h3b1 h3b1Var = this.a;
        if (h3b1Var == null) {
            return 0;
        }
        return h3b1Var.hashCode();
    }
}
