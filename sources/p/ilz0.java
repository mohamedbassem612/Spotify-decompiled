package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ilz0 {
    public final ra90 a;
    public final uyy0 b;
    public final wp31 c;
    public final f631 d;

    public ilz0(ra90 ra90Var, uyy0 uyy0Var, wp31 wp31Var, f631 f631Var) {
        this.a = ra90Var;
        this.b = uyy0Var;
        this.c = wp31Var;
        this.d = f631Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilz0)) {
            return false;
        }
        ilz0 ilz0Var = (ilz0) obj;
        return this.a.equals(ilz0Var.a) && this.b.equals(ilz0Var.b) && this.c.equals(ilz0Var.c) && this.d.equals(ilz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
