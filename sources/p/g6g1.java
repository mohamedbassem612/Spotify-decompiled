package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g6g1 {
    public final xkk1 a;
    public final pjw0 b;

    public g6g1(xkk1 xkk1Var, pjw0 pjw0Var) {
        this.a = xkk1Var;
        this.b = pjw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6g1)) {
            return false;
        }
        g6g1 g6g1Var = (g6g1) obj;
        return this.a.equals(g6g1Var.a) && this.b.equals(g6g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
