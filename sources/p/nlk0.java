package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nlk0 {
    public final mlk0 a;
    public final jo70 b;
    public final xkk1 c;

    public nlk0(mlk0 mlk0Var, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = mlk0Var;
        this.b = jo70Var;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlk0)) {
            return false;
        }
        nlk0 nlk0Var = (nlk0) obj;
        return this.a.equals(nlk0Var.a) && u890.j(this.b, nlk0Var.b) && u890.j(this.c, nlk0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
