package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1b {
    public final int a;
    public final xjf1 b;

    public n1b(int i, xjf1 xjf1Var) {
        this.a = i;
        this.b = xjf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1b)) {
            return false;
        }
        n1b n1bVar = (n1b) obj;
        return this.a == n1bVar.a && u890.j(this.b, n1bVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        xjf1 xjf1Var = this.b;
        return iHashCode + (xjf1Var == null ? 0 : xjf1Var.hashCode());
    }
}
