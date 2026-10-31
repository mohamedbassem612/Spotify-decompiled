package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ucb1 {
    public final qxc0 a;
    public final boolean b;

    public ucb1(qxc0 qxc0Var, boolean z) {
        this.a = qxc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucb1)) {
            return false;
        }
        ucb1 ucb1Var = (ucb1) obj;
        return this.a.equals(ucb1Var.a) && this.b == ucb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
