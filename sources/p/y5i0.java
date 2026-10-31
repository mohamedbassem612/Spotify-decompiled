package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5i0 {
    public final d7u0 a;
    public final xkk1 b;
    public final prl c;
    public final hll d;
    public final be60 e;

    public y5i0(d7u0 d7u0Var, xkk1 xkk1Var, prl prlVar, hll hllVar, be60 be60Var) {
        this.a = d7u0Var;
        this.b = xkk1Var;
        this.c = prlVar;
        this.d = hllVar;
        this.e = be60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5i0)) {
            return false;
        }
        y5i0 y5i0Var = (y5i0) obj;
        return u890.j(this.a, y5i0Var.a) && u890.j(this.b, y5i0Var.b) && this.c.equals(y5i0Var.c) && this.d.equals(y5i0Var.d) && this.e.equals(y5i0Var.e);
    }

    public final int hashCode() {
        d7u0 d7u0Var = this.a;
        int iHashCode = (d7u0Var == null ? 0 : d7u0Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
