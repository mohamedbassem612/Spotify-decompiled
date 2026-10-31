package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wk50 {
    public final double a;
    public final Integer b;

    public wk50(double d, Integer num) {
        this.a = d;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk50)) {
            return false;
        }
        wk50 wk50Var = (wk50) obj;
        return Double.compare(this.a, wk50Var.a) == 0 && u890.j(this.b, wk50Var.b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
