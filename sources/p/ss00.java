package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ss00 {
    public final jo70 a;
    public final xkk1 b;

    public ss00(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss00)) {
            return false;
        }
        ss00 ss00Var = (ss00) obj;
        return u890.j(this.a, ss00Var.a) && u890.j(this.b, ss00Var.b);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
