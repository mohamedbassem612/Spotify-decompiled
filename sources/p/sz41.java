package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sz41 extends q151 {
    public final xo20 a;
    public final tv80 b;

    public sz41(xo20 xo20Var, tv80 tv80Var) {
        this.a = xo20Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz41)) {
            return false;
        }
        sz41 sz41Var = (sz41) obj;
        return u890.j(this.a, sz41Var.a) && u890.j(this.b, sz41Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
