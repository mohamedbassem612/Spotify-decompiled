package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lvu0 extends g6p1 {
    public final String c;
    public final hvu0 d;

    public lvu0(String str, hvu0 hvu0Var) {
        this.c = str;
        this.d = hvu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvu0)) {
            return false;
        }
        lvu0 lvu0Var = (lvu0) obj;
        return u890.j(this.c, lvu0Var.c) && u890.j(this.d, lvu0Var.d);
    }

    public final hvu0 h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        hvu0 hvu0Var = this.d;
        return iHashCode + (hvu0Var == null ? 0 : hvu0Var.hashCode());
    }
}
