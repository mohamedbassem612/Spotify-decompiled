package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bwc1 {
    public final iys0 a;
    public final tv80 b;

    public bwc1(iys0 iys0Var, tv80 tv80Var) {
        this.a = iys0Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwc1)) {
            return false;
        }
        bwc1 bwc1Var = (bwc1) obj;
        return this.a.equals(bwc1Var.a) && u890.j(this.b, bwc1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
