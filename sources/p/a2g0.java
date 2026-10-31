package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a2g0 {
    public final c7p0 a;

    public a2g0(c7p0 c7p0Var) {
        this.a = c7p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2g0) && this.a == ((a2g0) obj).a;
    }

    public final int hashCode() {
        c7p0 c7p0Var = this.a;
        if (c7p0Var == null) {
            return 0;
        }
        return c7p0Var.hashCode();
    }
}
