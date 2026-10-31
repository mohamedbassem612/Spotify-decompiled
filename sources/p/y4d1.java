package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y4d1 implements g5d1 {
    public final g7d1 a;
    public final int b;

    public y4d1(g7d1 g7d1Var, int i) {
        this.a = g7d1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4d1)) {
            return false;
        }
        y4d1 y4d1Var = (y4d1) obj;
        return this.a.equals(y4d1Var.a) && this.b == y4d1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
