package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sl0 {
    public final jt61 a;
    public final bl0 b;

    public sl0(jt61 jt61Var, bl0 bl0Var) {
        this.a = jt61Var;
        this.b = bl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl0)) {
            return false;
        }
        sl0 sl0Var = (sl0) obj;
        return u890.j(this.a, sl0Var.a) && this.b == sl0Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bl0 bl0Var = this.b;
        return iHashCode + (bl0Var == null ? 0 : bl0Var.hashCode());
    }
}
