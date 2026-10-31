package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dc10 {
    public final q37 a;

    public dc10(q37 q37Var) {
        this.a = q37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc10) && u890.j(this.a, ((dc10) obj).a);
    }

    public final int hashCode() {
        q37 q37Var = this.a;
        if (q37Var == null) {
            return 0;
        }
        return q37Var.hashCode();
    }
}
