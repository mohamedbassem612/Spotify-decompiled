package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x6y0 {
    public final v6y0 a;

    public x6y0(v6y0 v6y0Var) {
        this.a = v6y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6y0) && u890.j(this.a, ((x6y0) obj).a);
    }

    public final int hashCode() {
        v6y0 v6y0Var = this.a;
        if (v6y0Var == null) {
            return 0;
        }
        return v6y0Var.hashCode();
    }
}
