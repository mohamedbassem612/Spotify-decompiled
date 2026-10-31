package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c5g1 {
    public final x5g1 a;
    public final e5g1 b;

    public c5g1(x5g1 x5g1Var, e5g1 e5g1Var) {
        this.a = x5g1Var;
        this.b = e5g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5g1)) {
            return false;
        }
        c5g1 c5g1Var = (c5g1) obj;
        return u890.j(this.a, c5g1Var.a) && u890.j(this.b, c5g1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e5g1 e5g1Var = this.b;
        return iHashCode + (e5g1Var == null ? 0 : e5g1Var.hashCode());
    }
}
