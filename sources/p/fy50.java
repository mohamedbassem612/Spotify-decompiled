package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fy50 implements hy50 {
    public final boolean a;
    public final Integer b;
    public final Double c;
    public final Long d;
    public final Boolean e;

    public /* synthetic */ fy50(Double d, Long l, Boolean bool, int i) {
        this(false, null, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : l, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy50)) {
            return false;
        }
        fy50 fy50Var = (fy50) obj;
        return this.a == fy50Var.a && u890.j(this.b, fy50Var.b) && u890.j(this.c, fy50Var.c) && u890.j(this.d, fy50Var.d) && u890.j(this.e, fy50Var.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public fy50(boolean z, Integer num, Double d, Long l, Boolean bool) {
        this.a = z;
        this.b = num;
        this.c = d;
        this.d = l;
        this.e = bool;
    }
}
