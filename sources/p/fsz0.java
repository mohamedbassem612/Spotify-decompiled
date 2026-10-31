package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fsz0 {
    public final Double a;
    public final Long b;
    public final Boolean c;

    public fsz0(Double d, Long l, Boolean bool) {
        this.a = d;
        this.b = l;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsz0)) {
            return false;
        }
        fsz0 fsz0Var = (fsz0) obj;
        return u890.j(this.a, fsz0Var.a) && u890.j(this.b, fsz0Var.b) && u890.j(this.c, fsz0Var.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
