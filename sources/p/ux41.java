package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ux41 extends xyn1 {
    public final String b;
    public final tv80 c;

    public ux41(String str, tv80 tv80Var) {
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux41)) {
            return false;
        }
        ux41 ux41Var = (ux41) obj;
        return u890.j(this.b, ux41Var.b) && u890.j(this.c, ux41Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
