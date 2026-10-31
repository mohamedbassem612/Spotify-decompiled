package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fx50 {
    public final yw50 a;
    public final dx50 b;
    public final vu30 c;

    public fx50(yw50 yw50Var, dx50 dx50Var, vu30 vu30Var) {
        this.a = yw50Var;
        this.b = dx50Var;
        this.c = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx50)) {
            return false;
        }
        fx50 fx50Var = (fx50) obj;
        return this.a.equals(fx50Var.a) && u890.j(this.b, fx50Var.b) && u890.j(this.c, fx50Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dx50 dx50Var = this.b;
        int iHashCode2 = (iHashCode + (dx50Var == null ? 0 : dx50Var.hashCode())) * 31;
        vu30 vu30Var = this.c;
        return iHashCode2 + (vu30Var != null ? vu30Var.hashCode() : 0);
    }
}
