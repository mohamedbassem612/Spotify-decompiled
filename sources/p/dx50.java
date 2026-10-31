package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dx50 {
    public final ey50 a;
    public final vu30 b;

    public dx50(ey50 ey50Var, jjk jjkVar) {
        this.a = ey50Var;
        this.b = jjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx50)) {
            return false;
        }
        dx50 dx50Var = (dx50) obj;
        return u890.j(this.a, dx50Var.a) && u890.j(this.b, dx50Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vu30 vu30Var = this.b;
        return iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode());
    }
}
