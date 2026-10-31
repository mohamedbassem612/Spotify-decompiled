package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ox41 extends xyn1 {
    public final z951 b;
    public final tv80 c;

    public ox41(z951 z951Var, tv80 tv80Var) {
        this.b = z951Var;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox41)) {
            return false;
        }
        ox41 ox41Var = (ox41) obj;
        return this.b.equals(ox41Var.b) && u890.j(this.c, ox41Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
