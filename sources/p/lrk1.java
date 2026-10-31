package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lrk1 implements rrk1 {
    public final xl61 a;
    public final Double b;

    public lrk1(xl61 xl61Var, Double d) {
        this.a = xl61Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrk1)) {
            return false;
        }
        lrk1 lrk1Var = (lrk1) obj;
        return this.a.equals(lrk1Var.a) && u890.j(this.b, lrk1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
