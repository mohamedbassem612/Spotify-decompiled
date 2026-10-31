package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lp20 {
    public final int a;
    public final qp20 b;

    public lp20(int i, qp20 qp20Var) {
        this.a = i;
        this.b = qp20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp20)) {
            return false;
        }
        lp20 lp20Var = (lp20) obj;
        return this.a == lp20Var.a && u890.j(this.b, lp20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
