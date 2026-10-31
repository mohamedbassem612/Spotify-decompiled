package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t120 {
    public final Double a;
    public final Double b;
    public final Double c;

    public t120(Double d, Double d2, Double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t120)) {
            return false;
        }
        t120 t120Var = (t120) obj;
        return u890.j(this.a, t120Var.a) && u890.j(this.b, t120Var.b) && u890.j(this.c, t120Var.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        return iHashCode2 + (d3 != null ? d3.hashCode() : 0);
    }
}
