package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g1p0 {
    public final d1p0 a;
    public final Integer b;

    public g1p0(d1p0 d1p0Var, Integer num) {
        this.a = d1p0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1p0)) {
            return false;
        }
        g1p0 g1p0Var = (g1p0) obj;
        return this.a.equals(g1p0Var.a) && u890.j(this.b, g1p0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
