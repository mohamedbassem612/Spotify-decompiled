package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tj20 {
    public final xgn0 a;
    public ghn b = null;

    public tj20(xgn0 xgn0Var) {
        this.a = xgn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tj20) {
            tj20 tj20Var = (tj20) obj;
            if (this.a == tj20Var.a && u890.j(this.b, tj20Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ghn ghnVar = this.b;
        return iHashCode + (ghnVar == null ? 0 : ghnVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
