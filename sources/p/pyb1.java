package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pyb1 {
    public final rvb1 a;
    public final jo70 b;
    public final xkk1 c;

    public pyb1(rvb1 rvb1Var, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = rvb1Var;
        this.b = jo70Var;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyb1)) {
            return false;
        }
        pyb1 pyb1Var = (pyb1) obj;
        return u890.j(this.a, pyb1Var.a) && u890.j(this.b, pyb1Var.b) && u890.j(this.c, pyb1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
