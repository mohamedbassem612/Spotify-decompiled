package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ixb1 {
    public final rvb1 a;
    public final jo70 b;
    public final xkk1 c;

    public ixb1(rvb1 rvb1Var, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = rvb1Var;
        this.b = jo70Var;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixb1)) {
            return false;
        }
        ixb1 ixb1Var = (ixb1) obj;
        return u890.j(this.a, ixb1Var.a) && u890.j(this.b, ixb1Var.b) && u890.j(this.c, ixb1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
