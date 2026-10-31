package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tqb1 {
    public final boolean a;
    public final g1d0 b;

    public tqb1(boolean z, g1d0 g1d0Var) {
        this.a = z;
        this.b = g1d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqb1)) {
            return false;
        }
        tqb1 tqb1Var = (tqb1) obj;
        return this.a == tqb1Var.a && u890.j(this.b, tqb1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        g1d0 g1d0Var = this.b;
        return iHashCode + (g1d0Var == null ? 0 : g1d0Var.hashCode());
    }
}
