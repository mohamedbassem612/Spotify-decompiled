package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pkg1 {
    public final qkg1 a;
    public final bdk0 b;

    public pkg1(qkg1 qkg1Var, bdk0 bdk0Var) {
        this.a = qkg1Var;
        this.b = bdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkg1)) {
            return false;
        }
        pkg1 pkg1Var = (pkg1) obj;
        return u890.j(this.a, pkg1Var.a) && u890.j(this.b, pkg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
