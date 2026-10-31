package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class le31 {
    public final zc8 a;
    public final jo70 b;
    public final xkk1 c;

    public le31(zc8 zc8Var, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = zc8Var;
        this.b = jo70Var;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le31)) {
            return false;
        }
        le31 le31Var = (le31) obj;
        return this.a.equals(le31Var.a) && u890.j(this.b, le31Var.b) && u890.j(this.c, le31Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
