package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lcb1 {
    public final cxc0 a;
    public final ly50 b;
    public final boolean c;

    public lcb1(cxc0 cxc0Var, ly50 ly50Var, boolean z) {
        this.a = cxc0Var;
        this.b = ly50Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcb1)) {
            return false;
        }
        lcb1 lcb1Var = (lcb1) obj;
        return u890.j(this.a, lcb1Var.a) && u890.j(this.b, lcb1Var.b) && this.c == lcb1Var.c;
    }

    public final int hashCode() {
        cxc0 cxc0Var = this.a;
        int iHashCode = cxc0Var == null ? 0 : cxc0Var.hashCode();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
