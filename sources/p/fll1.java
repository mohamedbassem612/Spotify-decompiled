package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fll1 {
    public final cwn0 a;

    public fll1(bwn0 bwn0Var) {
        this.a = bwn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fll1) && u890.j(this.a, ((fll1) obj).a);
    }

    public final int hashCode() {
        cwn0 cwn0Var = this.a;
        if (cwn0Var == null) {
            return 0;
        }
        return cwn0Var.hashCode();
    }
}
