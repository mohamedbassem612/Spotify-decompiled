package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y6y0 {
    public final cxc0 a;
    public final v6y0 b;

    public y6y0(cxc0 cxc0Var, v6y0 v6y0Var) {
        this.a = cxc0Var;
        this.b = v6y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6y0)) {
            return false;
        }
        y6y0 y6y0Var = (y6y0) obj;
        return this.a.equals(y6y0Var.a) && u890.j(this.b, y6y0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v6y0 v6y0Var = this.b;
        return iHashCode + (v6y0Var == null ? 0 : v6y0Var.hashCode());
    }
}
