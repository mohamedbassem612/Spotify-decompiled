package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nz41 extends q151 {
    public final z951 a;
    public final tv80 b;

    public nz41(z951 z951Var, tv80 tv80Var) {
        this.a = z951Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz41)) {
            return false;
        }
        nz41 nz41Var = (nz41) obj;
        return this.a.equals(nz41Var.a) && u890.j(this.b, nz41Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
