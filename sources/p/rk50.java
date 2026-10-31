package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rk50 {
    public final double a;
    public final Integer b;

    public rk50(double d, Integer num) {
        this.a = d;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk50)) {
            return false;
        }
        rk50 rk50Var = (rk50) obj;
        return Double.compare(this.a, rk50Var.a) == 0 && u890.j(this.b, rk50Var.b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
