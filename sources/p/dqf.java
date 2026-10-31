package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dqf {
    public final n9d1 a;
    public final n9d1 b;

    public dqf(n9d1 n9d1Var, n9d1 n9d1Var2) {
        this.a = n9d1Var;
        this.b = n9d1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqf)) {
            return false;
        }
        dqf dqfVar = (dqf) obj;
        return u890.j(this.a, dqfVar.a) && u890.j(this.b, dqfVar.b);
    }

    public final int hashCode() {
        n9d1 n9d1Var = this.a;
        int iHashCode = (n9d1Var == null ? 0 : n9d1Var.hashCode()) * 31;
        n9d1 n9d1Var2 = this.b;
        return iHashCode + (n9d1Var2 != null ? n9d1Var2.hashCode() : 0);
    }
}
