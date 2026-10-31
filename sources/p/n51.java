package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n51 extends x3p1 {
    public final String c;
    public final g2d1 d;
    public final bk8 e;

    public n51(String str, g2d1 g2d1Var, bk8 bk8Var) {
        this.c = str;
        this.d = g2d1Var;
        this.e = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n51)) {
            return false;
        }
        n51 n51Var = (n51) obj;
        return this.c.equals(n51Var.c) && u890.j(this.d, n51Var.d) && this.e == n51Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        bk8 bk8Var = this.e;
        return iHashCode + (bk8Var == null ? 0 : bk8Var.hashCode());
    }

    public final g2d1 x() {
        return this.d;
    }

    public final String y() {
        return this.c;
    }
}
